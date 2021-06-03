package com.kcbgroup.common.configurations;

import org.apache.activemq.jms.pool.PooledConnectionFactory;
import org.apache.camel.component.amqp.AMQPComponent;
import org.apache.camel.component.jms.JmsConfiguration;
import org.apache.qpid.jms.JmsConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ActiveMQ Configuration Class
 * 
 * @author Francisco Osorio | Bring Global
 * @version 0.0.1
 * @implNote Values from application.yaml and overridden using env variables on
 *           Openshift.
 */
@Configuration
public class AMQPConfiguration {
	/** Accept Messages While Stopping (Consumer) */
	@Value("${amqp.accept-messages-while-stopping}")
	private Boolean acceptMessagesWhileStopping;
	
	/** Acknowledgment Mode Name (Consumer) */
	@Value("${amqp.acknowledgement-mode-name}")
    private String acknowledgementModeName;
    
    /** Allow Null Body (Producer) */
	@Value("${amqp.allow-null-body}")
    private Boolean allowNullBody;
    
    /** Always Copy Message (Producer) */
	@Value("${amqp.always-copy-message}")
    private Boolean alwaysCopyMessage;
    
    /** Async Consumer (Consumer) */
	@Value("${amqp.async-consumer}")
    private Boolean asyncConsumer;
    
    /** Async Start Listener (Consumer) */
	@Value("${amqp.async-start-listener}")
    private Boolean asyncStartListener;
    
    /** Async Stop Listener (COnsumer) */
	@Value("${amqp.async-stop-listener}")
    private Boolean asyncStopListener;
    
    /** Auto Startup (Consumer) */
	@Value("${amqp.auto-startup}")
    private Boolean autoStartup;
    
    /** Concurrent Consumers (Consumer) */
	@Value("${amqp.concurrent-consumers}")
    private Integer concurrentConsumers;
    
    /** Delivery Mode (Producer) */
	@Value("${amqp.delivery-mode}")
    private Integer deliveryMode;
    
    /** Allow Delivery Persistent (Producer) */
	@Value("${amqp.delivery-persistent}")
    private Boolean deliveryPersistent;
    
    /** Disable Reply To (Consumer) */
	@Value("${amqp.disable-reply-to}")
    private Boolean disableReplyTo;
	
	/** Disable Time To Live (Producer) */
	@Value("${amqp.disable-time-to-live}")
    private Boolean disableTimeToLive;
    
    /** Explicit QOS Enabled (Producer) */
	@Value("${amqp.explicit-qos-enabled}")
    private Boolean explicitQosEnabled;
	
	/** Iddle Timeout (Common) */
	@Value("${amqp.iddle-timeout}")
	private Integer iddleTimeout;
    
    /** Max Concurrent Consumers (Consumer) */
	@Value("${amqp.max-concurrent-consumers}")
    private Integer maxConcurrentConsumers;
    
    /** Max Messages per Task (Consumer) */
	@Value("${amqp.max-messages-per-task}")
    private Integer maxMessagesPerTask;
    
    /** Password (Common) */
	@Value("${amqp.password}")
    private String password;
    
    /** Preserve Message QOS (Producer) */
	@Value("${amqp.preserve-message-qos}")
    private Boolean preserveMessageQos;
    
    /** Priority (Producer) */
	@Value("${amqp.priority}")
    private Integer priority;
    
    /** Receive Timeout (Consumer) */
	@Value("${amqp.receive-timeout}")
    private Integer receiveTimeout;
    
    /** Time to Live (Producer) */
	@Value("${amqp.time-to-live}")
    private Long timeToLive;
    
    /** Username (Common) */
	@Value("${amqp.username}")
    private String username;
    
    /** Host (Common) */
	@Value("${amqp.host}")
    private String host;
    
    /** Port (Common) */
	@Value("${amqp.port}")
    private Integer port;
    
    /** Protocol (Common) */
	@Value("${amqp.protocol}")
    private String protocol;
    
    /** Parameters (Common) */
	@Value("${amqp.parameters}")
    private String parameters;
    
    /** Max Connections (Common) */
    @Value("${amqp.max-connections}")
    private Integer maxConnections;
    
    /** Max Active Sessions (Common) */
	@Value("${amqp.max-active-sessions}")
    private Integer maxActiveSessions;
	
	/** Force Async Send (Producer) */
	@Value("${amqp.force-async-send}")
	private Boolean forceAsyncSend;

	/** Public default constructor */
	public AMQPConfiguration() {
	}

	public Boolean getAcceptMessagesWhileStopping() {
		return acceptMessagesWhileStopping;
	}

	public void setAcceptMessagesWhileStopping(Boolean acceptMessagesWhileStopping) {
		this.acceptMessagesWhileStopping = acceptMessagesWhileStopping;
	}

	public String getAcknowledgementModeName() {
		return acknowledgementModeName;
	}

	public void setAcknowledgementModeName(String acknowledgementModeName) {
		this.acknowledgementModeName = acknowledgementModeName;
	}

	public Boolean getAllowNullBody() {
		return allowNullBody;
	}

	public void setAllowNullBody(Boolean allowNullBody) {
		this.allowNullBody = allowNullBody;
	}

	public Boolean getAlwaysCopyMessage() {
		return alwaysCopyMessage;
	}

	public void setAlwaysCopyMessage(Boolean alwaysCopyMessage) {
		this.alwaysCopyMessage = alwaysCopyMessage;
	}

	public Boolean getAsyncConsumer() {
		return asyncConsumer;
	}

	public void setAsyncConsumer(Boolean asyncConsumer) {
		this.asyncConsumer = asyncConsumer;
	}

	public Boolean getAsyncStartListener() {
		return asyncStartListener;
	}

	public void setAsyncStartListener(Boolean asyncStartListener) {
		this.asyncStartListener = asyncStartListener;
	}

	public Boolean getAsyncStopListener() {
		return asyncStopListener;
	}

	public void setAsyncStopListener(Boolean asyncStopListener) {
		this.asyncStopListener = asyncStopListener;
	}

	public Boolean getAutoStartup() {
		return autoStartup;
	}

	public void setAutoStartup(Boolean autoStartup) {
		this.autoStartup = autoStartup;
	}

	public Integer getConcurrentConsumers() {
		return concurrentConsumers;
	}

	public void setConcurrentConsumers(Integer concurrentConsumers) {
		this.concurrentConsumers = concurrentConsumers;
	}

	public Integer getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(Integer deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public Boolean getDeliveryPersistent() {
		return deliveryPersistent;
	}

	public void setDeliveryPersistent(Boolean deliveryPersistent) {
		this.deliveryPersistent = deliveryPersistent;
	}

	public Boolean getDisableReplyTo() {
		return disableReplyTo;
	}

	public void setDisableReplyTo(Boolean disableReplyTo) {
		this.disableReplyTo = disableReplyTo;
	}

	public Boolean getDisableTimeToLive() {
		return disableTimeToLive;
	}

	public void setDisableTimeToLive(Boolean disableTimeToLive) {
		this.disableTimeToLive = disableTimeToLive;
	}

	public Boolean getExplicitQosEnabled() {
		return explicitQosEnabled;
	}

	public void setExplicitQosEnabled(Boolean explicitQosEnabled) {
		this.explicitQosEnabled = explicitQosEnabled;
	}

	public Integer getIddleTimeout() {
		return iddleTimeout;
	}

	public void setIddleTimeout(Integer iddleTimeout) {
		this.iddleTimeout = iddleTimeout;
	}

	public Integer getMaxConcurrentConsumers() {
		return maxConcurrentConsumers;
	}

	public void setMaxConcurrentConsumers(Integer maxConcurrentConsumers) {
		this.maxConcurrentConsumers = maxConcurrentConsumers;
	}

	public Integer getMaxMessagesPerTask() {
		return maxMessagesPerTask;
	}

	public void setMaxMessagesPerTask(Integer maxMessagesPerTask) {
		this.maxMessagesPerTask = maxMessagesPerTask;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getPreserveMessageQos() {
		return preserveMessageQos;
	}

	public void setPreserveMessageQos(Boolean preserveMessageQos) {
		this.preserveMessageQos = preserveMessageQos;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getReceiveTimeout() {
		return receiveTimeout;
	}

	public void setReceiveTimeout(Integer receiveTimeout) {
		this.receiveTimeout = receiveTimeout;
	}

	public Long getTimeToLive() {
		return timeToLive;
	}

	public void setTimeToLive(Long timeToLive) {
		this.timeToLive = timeToLive;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public Integer getMaxConnections() {
		return maxConnections;
	}

	public void setMaxConnections(Integer maxConnections) {
		this.maxConnections = maxConnections;
	}

	public Integer getMaxActiveSessions() {
		return maxActiveSessions;
	}

	public void setMaxActiveSessions(Integer maxActiveSessions) {
		this.maxActiveSessions = maxActiveSessions;
	}
	
	public Boolean getForceAsyncSend() {
		return forceAsyncSend;
	}

	public void setForceAsyncSend(Boolean forceAsyncSend) {
		this.forceAsyncSend = forceAsyncSend;
	}

	@Bean(name = "amqpProducer")
	AMQPComponent configureProducer(AMQPConfiguration config) {
		String remoteURI = String.format("%s://%s:%s?%s", config.getProtocol(), config.getHost(),
				config.getPort(), config.getParameters());

		JmsConnectionFactory jmsCF = new JmsConnectionFactory(config.getUsername(), config.getPassword(), remoteURI);
		jmsCF.setForceAsyncSend(config.getForceAsyncSend());
		jmsCF.setForceAsyncAcks(true);
		
		PooledConnectionFactory pCF = new PooledConnectionFactory();
		pCF.setConnectionFactory(jmsCF);
		pCF.setCreateConnectionOnStartup(config.getAutoStartup());
		pCF.setMaxConnections(config.getMaxConnections());
		pCF.setMaximumActiveSessionPerConnection(config.getMaxActiveSessions());
		pCF.setIdleTimeout(config.getIddleTimeout());
		
		JmsConfiguration jmsConfiguration = new JmsConfiguration(pCF);
		jmsConfiguration.setAllowNullBody(config.getAllowNullBody());
		jmsConfiguration.setAlwaysCopyMessage(config.getAlwaysCopyMessage());
		jmsConfiguration.setDeliveryMode(config.getDeliveryMode());
		jmsConfiguration.setDeliveryPersistent(config.getDeliveryPersistent());
		jmsConfiguration.setDisableTimeToLive(config.getDisableTimeToLive());
		jmsConfiguration.setExplicitQosEnabled(config.getExplicitQosEnabled());
		jmsConfiguration.setPreserveMessageQos(config.getPreserveMessageQos());
		jmsConfiguration.setPriority(config.getPriority());
		jmsConfiguration.setTimeToLive(config.getTimeToLive());
		
		AMQPComponent amqpProducer = new AMQPComponent(pCF);
		amqpProducer.setConfiguration(jmsConfiguration);

		return amqpProducer;
	}

	@Bean(name = "amqpConsumer")
	AMQPComponent configureConsumer(AMQPConfiguration config) {
		String remoteURI = String.format("%s://%s:%s?%s", config.getProtocol(), config.getHost(),
				config.getPort(), config.getParameters());

		JmsConnectionFactory jmsCF = new JmsConnectionFactory(config.getUsername(), config.getPassword(), remoteURI);
		
		PooledConnectionFactory pCF = new PooledConnectionFactory();
		pCF.setConnectionFactory(jmsCF);
		pCF.setCreateConnectionOnStartup(config.getAutoStartup());
		pCF.setMaxConnections(config.getMaxConnections());
		pCF.setMaximumActiveSessionPerConnection(config.getMaxActiveSessions());
		pCF.setIdleTimeout(config.getIddleTimeout());
		
		JmsConfiguration jmsConfiguration = new JmsConfiguration(pCF);
		jmsConfiguration.setAcceptMessagesWhileStopping(config.getAcceptMessagesWhileStopping());
		jmsConfiguration.setAcknowledgementModeName(config.getAcknowledgementModeName());
		jmsConfiguration.setAsyncConsumer(config.getAsyncConsumer());
		jmsConfiguration.setAsyncStartListener(config.getAsyncStartListener());
		jmsConfiguration.setAsyncStopListener(config.getAsyncStopListener());
		jmsConfiguration.setAutoStartup(config.getAutoStartup());
		jmsConfiguration.setConcurrentConsumers(config.getConcurrentConsumers());
		jmsConfiguration.setDisableReplyTo(config.getDisableReplyTo());
		jmsConfiguration.setMaxConcurrentConsumers(config.getMaxConcurrentConsumers());
		jmsConfiguration.setMaxMessagesPerTask(config.getMaxMessagesPerTask());
		jmsConfiguration.setReceiveTimeout(config.getReceiveTimeout());
		
		AMQPComponent amqpConsumer = new AMQPComponent(pCF);
		amqpConsumer.setConfiguration(jmsConfiguration);

		return amqpConsumer;
	}
	
	
}
