package com.kcbgroup.common.configurations;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Redis COnfiguration Class
 * 
 * @author Francisco Osorio | Bring Global
 * @version 0.0.1 
 */
@Configuration
public class RedisConfiguration {
	/** Redis Service Name (Host) */
	@Value("${redis.serviceName}")
	private String serviceName;
	
	/** Redis Service Port) */
	@Value("${redis.servicePort}")
	private Integer servicePort;
	
	/** Redis Maximum Number of Connections) */
	@Value("${redis.maxActive}")
	private Integer maxActive;
	
	/** Redis Maximum Number of Iddle Connections) */
	@Value("${redis.maxIdle}")
	private Integer maxIdle;
	
	/** Redis Minium Number of Iddle Connections) */
	@Value("${redis.minIdle}")
	private Integer minIdle;

	/** Redis Block When Exhausted (No Connections) Flag) */
	@Value("${redis.blockWhenExhausted}")
	private Boolean blockWhenExhausted;
	
	/** Time to Wait for a Connection Once It's Blocked */
	@Value("${redis.maxWaitSeconds}")
	private Integer maxWaitSeconds;
	
	/** Redis Min Evictable Idle Time in Seconds */
	@Value("${redis.minEvictableIdleTimeSeconds}")
	private Integer minEvictableIdleTimeSeconds;
	
	/** Redis Time Between Eviction Runs in Seconds */
	@Value("${redis.timeBetweenEvictionRunsSeconds}")
	private Integer timeBetweenEvictionRunsSeconds;
	
	/** Redis Test on Borrow Flag */
	@Value("${redis.testOnBorrow}")
	private Boolean testOnBorrow;
	
	/** Redis Test for Iddle Conections Flag */
	@Value("${redis.testWhileIdle}")
	private Boolean testWhileIdle;
	
	/** Redis Password) */
	@Value("${redis.password}")
	private String password;
	
	/** Redis Password) */
	@Value("${redis.timeOutSeconds}")
	private Integer timeOutSeconds;
	
	public Integer getTimeOutSeconds() {
		return timeOutSeconds;
	}

	public void setTimeOutSeconds(Integer timeOutSeconds) {
		this.timeOutSeconds = timeOutSeconds;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RedisConfiguration() {
	}
	
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	public Integer getServicePort() {
		return servicePort;
	}

	public void setServicePort(Integer servicePort) {
		this.servicePort = servicePort;
	}

	public Integer getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(Integer maxActive) {
		this.maxActive = maxActive;
	}

	public Integer getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(Integer maxIdle) {
		this.maxIdle = maxIdle;
	}

	public Boolean getBlockWhenExhausted() {
		return blockWhenExhausted;
	}

	public void setBlockWhenExhausted(Boolean blockWhenExhausted) {
		this.blockWhenExhausted = blockWhenExhausted;
	}

	public Integer getMinEvictableIdleTimeSeconds() {
		return minEvictableIdleTimeSeconds;
	}

	public void setMinEvictableIdleTimeSeconds(Integer minEvictableIdleTimeSeconds) {
		this.minEvictableIdleTimeSeconds = minEvictableIdleTimeSeconds;
	}

	public Integer getTimeBetweenEvictionRunsSeconds() {
		return timeBetweenEvictionRunsSeconds;
	}

	public void setTimeBetweenEvictionRunsSeconds(Integer timeBetweenEvictionRunsSeconds) {
		this.timeBetweenEvictionRunsSeconds = timeBetweenEvictionRunsSeconds;
	}

	public Boolean getTestOnBorrow() {
		return testOnBorrow;
	}

	public void setTestOnBorrow(Boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	public Integer getMaxWaitSeconds() {
		return maxWaitSeconds;
	}

	public void setMaxWaitSeconds(Integer maxWaitSeconds) {
		this.maxWaitSeconds = maxWaitSeconds;
	}

	public Boolean getTestWhileIdle() {
		return testWhileIdle;
	}

	public void setTestWhileIdle(Boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}
	
	public Integer getMinIdle() {
		return minIdle;
	}

	public void setMinIdle(Integer minIdle) {
		this.minIdle = minIdle;
	}

	@Bean(name = "jedisPool")
	JedisPool configure(RedisConfiguration redisConfiguration) {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		
		jedisPoolConfig.setMaxTotal(redisConfiguration.getMaxActive());
		jedisPoolConfig.setMaxIdle(redisConfiguration.getMaxIdle());
		jedisPoolConfig.setMinIdle(redisConfiguration.getMinIdle());
		jedisPoolConfig.setBlockWhenExhausted(redisConfiguration.getBlockWhenExhausted());
		jedisPoolConfig.setMaxWaitMillis(
				Duration.ofSeconds(redisConfiguration.getMaxWaitSeconds()).toMillis());
		jedisPoolConfig.setMinEvictableIdleTimeMillis(
				Duration.ofSeconds(redisConfiguration.getMinEvictableIdleTimeSeconds()).toMillis());
		jedisPoolConfig.setTimeBetweenEvictionRunsMillis(
				Duration.ofSeconds(redisConfiguration.getTimeBetweenEvictionRunsSeconds()).toMillis());
		jedisPoolConfig.setTestOnBorrow(redisConfiguration.getTestOnBorrow());
		jedisPoolConfig.setTestWhileIdle(redisConfiguration.getTestWhileIdle());
	    
		JedisPool jedisPool = null;
		if (null == redisConfiguration.getPassword() || redisConfiguration.getPassword().isEmpty()) {
			jedisPool = new JedisPool(
				jedisPoolConfig,
				redisConfiguration.serviceName,
				redisConfiguration.servicePort);
		} else {
			jedisPool = new JedisPool(
					jedisPoolConfig,
					redisConfiguration.serviceName,
					redisConfiguration.servicePort,
					redisConfiguration.getTimeOutSeconds()*1000,
					redisConfiguration.getPassword());
		}
		
		return jedisPool;
	}
}
