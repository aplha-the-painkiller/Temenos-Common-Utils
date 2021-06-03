package com.kcbgroup.common.processors;

import static com.kcbgroup.common.constants.VaultClientConstants.ENVIRONMENT_HEADER;
import static com.kcbgroup.common.constants.HTTPCommonHeadersEnum.ACCEPT;
import static com.kcbgroup.common.constants.PayloadFormatsEnum.JSON;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Vault Call Preparation Processor
 * @author fosorio | Bring Global
 * @version 1.0.0
 */
@Component
public class VaultRequestPreparationProcessor implements Processor {
	private static String HTTP_URI;
	
	@Value("${vault.service.endpoint.scheme}")
	private String vaultServiceEndpointScheme;
	
	@Value("${vault.service.endpoint.host}")
	private String vaultServiceEndpointHost;
	
	@Value("${vault.service.endpoint.port}")
	private String vaultServiceEndpointPort;
	
	@Value("${vault.service.endpoint.path}")
	private String vaultServiceEndpointPath;
	
	@Value("${vault.service.endpoint.method}")
	private String vaultServiceEndpointMethod;
	
	@Value("${vault.service.environment}")
	private String vaultServiceEndpointEnvironment;

	public void process(Exchange exchange) throws Exception {
		if (null == HTTP_URI) {
			HTTP_URI = new StringBuilder(vaultServiceEndpointScheme)
					.append("://").append(vaultServiceEndpointHost)
					.append(":").append(vaultServiceEndpointPort)
					.append(vaultServiceEndpointPath).toString();
		}
		
		// Set proper body and headers
		exchange.getIn().setBody(null);
		exchange.getIn().removeHeaders("Camel*");
		exchange.getIn().setHeader(ENVIRONMENT_HEADER, vaultServiceEndpointEnvironment);
        exchange.getIn().setHeader(Exchange.HTTP_URI, HTTP_URI);
        exchange.getIn().setHeader(Exchange.HTTP_METHOD, vaultServiceEndpointMethod);
        exchange.getIn().setHeader(ACCEPT.getName(), JSON.getContentType());
	}
		
}
