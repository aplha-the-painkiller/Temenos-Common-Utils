package com.kcbgroup.common.utils;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Redis Utility Class
 * 
 * @author fosorio
 * @version 0.0.1
 * @implNote Using Jedis Client
 */
@Component
public class RedisUtil {
	/** Logger for this class */
	private static final Logger logger = LoggerFactory.getLogger(RedisUtil.class);
	
	/** Redis Service Name (Host) */
	@Value("${redis.expireSeconds}")
	private Integer expireSeconds;
	
	@Autowired
	private JedisPool jedisPool;
	
	public Integer getExpireSeconds() {
		return expireSeconds;
	}

	public void setExpireSeconds(Integer expireSeconds) {
		this.expireSeconds = expireSeconds;
	}

	/**
	 * Set an Object to Redis with the Given Key
	 * @param key {@link String}. The key to identify the object in redis
	 * @param value {@link String}. The value object (could be json)
	 */
	public void set(String key, String value) {
		if (logger.isDebugEnabled())
			logger.debug("Set Redis: {};;{}", key, value);
		
		try(Jedis jedis = jedisPool.getResource()) {
			jedis.setex(key, expireSeconds, value);
		} catch (Exception e) {
			logger.error("Redis Could Not Set Entry Key: " + key + " Value: " + value, e);
		}
	}
	
	/**
	 * Set an Object to Redis with the Given Key Without TTL
	 * @param key {@link String}. The key to identify the object in redis
	 * @param value {@link String}. The value object (could be json)
	 */
	public void setWithoutTTL(String key, String value) {
		if (logger.isDebugEnabled())
			logger.debug("Set Redis Without TTL: {};;{}", key, value);
		
		try(Jedis jedis = jedisPool.getResource()) {
			jedis.set(key, value);
		} catch (Exception e) {
			logger.error("Redis Could Not Set Entry Key: " + key + " Value: " + value, e);
		}
	}
	
	/**
	 * Set an Object to Redis with the Given Key if Not Exists
	 * @param key {@link String}. The key to identify the object in redis
	 * @param value {@link String}. The value object (could be json)
	 * @return Long (1 if setted, 0 if already exists)
	 */
	public Long setNX(String key, String value) {
		if (logger.isDebugEnabled())
			logger.debug("SetNX Redis: {};;{}", key, value);
		
		try(Jedis jedis = jedisPool.getResource()) {
			Long result = jedis.setnx(key, value);
			
			// We set the expire time (only if created)
			if (1 == result.intValue()) {
				jedis.expire(key, expireSeconds);
			}
			
			return result;
		} catch (Exception e) {
			logger.error("Redis Could Not Set Entry Key: " + key + " Value: " + value, e);
			return 0L;
		}
	}
	
	/**
	 * Get an Object from Redis with the Given Key
	 * @param key {@link String}. The key to get the object from redis
	 * @return String
	 */
	public String get(String key) {
		String jsonValue = null;
		
		if (logger.isDebugEnabled())
			logger.debug("Get Redis Value: {}", key);
		
		try(Jedis jedis = jedisPool.getResource()) {
			jsonValue =  jedis.get(key);
		} catch (Exception e) {
			logger.error("Redis Could Not Get Entry Key: " + key, e);
		}
		
		return jsonValue;
	}
	
	/**
	 * Delete an Object from Redis with the Given Key
	 * @param key {@link String}. The key to delete the object from redis
	 */
	public void delete(String key) {
		if (logger.isDebugEnabled())
			logger.debug("Delete Redis Entry: {}", key);
		
		try(Jedis jedis = jedisPool.getResource()) {
			jedis.del(key);
		} catch (Exception e) {
			logger.error("Redis Could Not Get Entry Key: " + key, e);
		}
	}
	
	/**
	 * Add the given key to a redis set
	 * @param setName {@link String}. The name of the redis set
	 * @param key {@link String}. The key to add
	 * @return Long The result code
	 */
	public Long add2Set(String setName, String key) {
		Long result = 0L;
		
		if (logger.isDebugEnabled())
			logger.debug("Add Key: {} to Redis Set: {}", key, setName);
		
		try(Jedis jedis = jedisPool.getResource()) {
			result =  jedis.sadd(setName, key);
		} catch (Exception e) {
			logger.error("Redis Could Not Add Entry Key: {} to Set: {}" + key, setName, e);
		}
		
		return result;
	}
	
	/**
	 * Get a random key from a redis set
	 * @param setName {@link String}. The name of the redis set
	 * @return String The random key
	 */
	public String popFromSet(String setName) {
		String key = null;
		
		if (logger.isDebugEnabled())
			logger.debug("Get Key from Redis Set: {}", setName);
		
		try(Jedis jedis = jedisPool.getResource()) {
			key =  jedis.spop(setName);
		} catch (Exception e) {
			logger.error("Redis Could Not Get Key from Set: {}" + setName, e);
		}
		
		return key;
	}
	
	/**
	 * Get a random key from a redis set
	 * @param setName {@link String}. The name of the redis set
	 * @param keys {@link List<String>}. The keys to remove
	 * @return String The random key
	 */
	public void removeFromSet(String setName, String ...keys) {
		if (logger.isDebugEnabled())
			logger.debug("Remove All Memebers from Redis Set: {}", setName);
		
		try(Jedis jedis = jedisPool.getResource()) {
			jedis.srem(setName, keys);
		} catch (Exception e) {
			logger.error("Redis Could Not Remove All Memebers from Set: {}" + setName, e);
		}
	}
	
	/**
	 * Appends the provided value at the end
	 * of the string. If the key does not exist it is created and set as an empty string, so APPEND
	 * will be very similar to SET in this special case.
	 * <p>
	 * @param key
	 * @param value
   	 * @return Integer reply, specifically the total length of the string after the append operation.
	 */
	public Long append(String key, String value) {
		if (logger.isDebugEnabled())
			logger.debug("Append Redis: {};;{}", key, value);
		
		try(Jedis jedis = jedisPool.getResource()) {
			Long result = jedis.append(key, value);
			return result;
		} catch (Exception e) {
			logger.error("Redis Could Not Append to Entry Key: " + key + " Value: " + value, e);
			return 0L;
		}
	}
	
	/**
	 * Return all the members (elements) of the set value stored at key.
	 * @param key
	 * @return Multi bulk reply
	 */
	public Set<String> smembers(String key) {
		if (logger.isDebugEnabled())
			logger.debug("Set members for key: {}", key);
		
		try(Jedis jedis = jedisPool.getResource()) {
			Set<String> members  = jedis.smembers(key);
			return members;
		} catch (Exception e) {
			logger.error("Redis Could Not Get members from set Key: " + key , e);
			return null;
		}
	}
}

