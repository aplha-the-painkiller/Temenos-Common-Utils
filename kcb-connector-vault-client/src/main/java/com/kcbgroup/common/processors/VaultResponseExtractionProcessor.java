package com.kcbgroup.common.processors;

import static com.kcbgroup.common.constants.VaultClientConstants.VAULT_USER_HEADER;
import static com.kcbgroup.common.constants.VaultClientConstants.VAULT_PASSWORD_HEADER;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.http.auth.AuthenticationException;
import org.springframework.stereotype.Component;

import com.kcbgroup.common.models.vault.ResponsePayload;

/**
 * T24 Credentials Extraction Processor
 * @author Francisco Osorio | Bring Global
 * @version 1.0.0
 */
@Component
public class VaultResponseExtractionProcessor implements Processor { 
	
	@Override
	public void process(Exchange exchange) 
	throws Exception {
		String userName = null;
		String password = null;
		
		ResponsePayload vaultResponsePayload = exchange.getIn().getBody(ResponsePayload.class);
		
		if ("1".equals(vaultResponsePayload.getStatus().getCode())) {
			throw new AuthenticationException();
		}
		
		userName = vaultResponsePayload.getUser().keySet().stream().findFirst().get();
		password = vaultResponsePayload.getUser().get(userName);
		 
		exchange.getIn().setHeader(VAULT_USER_HEADER, userName);
		exchange.getIn().setHeader(VAULT_PASSWORD_HEADER, password);
	} 
}
