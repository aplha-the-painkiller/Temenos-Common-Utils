package com.kcbgroup.common.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kcbgroup.common.processors.VaultRequestPreparationProcessor;
import com.kcbgroup.common.processors.VaultResponseExtractionProcessor;

/**
 * Vault Client Route
 * @author Francisco Osorio | Bring Global 
 * @version 1.1.0
 */
@Component
public class VaultRoute extends RouteBuilder {
	@Autowired
	private VaultRequestPreparationProcessor vaultRequestPreparationProcessor;
	
	@Autowired
	private VaultResponseExtractionProcessor vaultResponseExtractionProcessor;
	
	@Autowired
	private JacksonDataFormat vaultResponseDataFormat;

	@Override
	public void configure() throws Exception {
		errorHandler(noErrorHandler());
		
		from("direct:vaultAuthentication").routeId("com.kcbgroup.common.vaultAuthentication").logMask()
			.process(vaultRequestPreparationProcessor)
     		.log(LoggingLevel.INFO, "Connector Vault Client::MessageID [${headers.messageID}]::ConversationID [${headers.conversationID}]::Payload [${headers}]")
			.to("http4://vaultServiceEndpoint?throwExceptionOnFailure=false&socketTimeout={{vault.service.endpoint.timeout}}")
			.convertBodyTo(String.class)
			.log(LoggingLevel.INFO, "Connector Vault Client::MessageID [${headers.messageID}]::ConversationID [${headers.conversationID}]::Payload [${body}]")
			.unmarshal(vaultResponseDataFormat)
			.process(vaultResponseExtractionProcessor);
	}
}
