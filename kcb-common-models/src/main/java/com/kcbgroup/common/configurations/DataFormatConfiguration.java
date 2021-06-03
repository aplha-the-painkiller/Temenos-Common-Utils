package com.kcbgroup.common.configurations;

import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Data Format Configuration (for All Requests and Responses)
 *
 * @author Francisco Osorio | Bring Global
 * @version 1.0.0
 */
@Configuration
public class DataFormatConfiguration {
	private static final ObjectMapper payloadObjectMapper = new ObjectMapper();

	static {
		// Add some extra configuration as needed
		payloadObjectMapper.disable(SerializationFeature.INDENT_OUTPUT);
		payloadObjectMapper.setSerializationInclusion(Include.NON_NULL);
	}
	/* Mini Statement */

	@Bean(name = "miniStatementRequestDataFormat")
	JacksonDataFormat configureMiniStatementRequestDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.ministatement.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "miniStatementResponseDataFormat")
	JacksonDataFormat configureMiniStatementResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.ministatement.ResponseWrapper.class);

		return jacksonDataFormat;
	}
	/* Balance Inquiry */

	@Bean(name = "balanceInquiryRequestDataFormat")
	JacksonDataFormat configureBalanceInquiryRequestDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.balanceinquiry.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "balanceInquiryResponseDataFormat")
	JacksonDataFormat configureBalanceInquiryResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.balanceinquiry.ResponseWrapper.class);

		return jacksonDataFormat;
	}

	/* Funds Transfer */
	@Bean(name = "fundsTransferRequestDataFormat")
	JacksonDataFormat configureFundsTransferRequestDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.fundstransfer.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "fundsTransferResponseDataFormat")
	JacksonDataFormat configureFundsTransferResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.fundstransfer.ResponseWrapper.class);

		return jacksonDataFormat;
	}

	/* Vault DataFormat */
	@Bean(name = "vaultRequestDataFormat")
	JacksonDataFormat configureVaultRequestDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.vault.RequestPayload.class);

		return jacksonDataFormat;
	}

	@Bean(name = "vaultResponseDataFormat")
	JacksonDataFormat configureVaultResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.vault.ResponsePayload.class);

		return jacksonDataFormat;
	}

	/* Account Info */

	@Bean(name = "accountInfoRequestDataFormat")
	JacksonDataFormat configureAccountInfoRequestDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.accountinfo.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "accountInfoResponseDataFormat")
	JacksonDataFormat configureAccountInfoResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.accountinfo.ResponseWrapper.class);

		return jacksonDataFormat;
	}

	/* Reversal */
	@Bean(name = "reversalRequestDataFormat")
	JacksonDataFormat configureReversalRequestDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.reversal.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "reversalResponseDataFormat")
	JacksonDataFormat configureReversalResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.reversal.ResponseWrapper.class);

		return jacksonDataFormat;
	}
	
        /*** Resident info ***/
        @Bean(name = "residentInfoRequestDataFormat")
	JacksonDataFormat configureResidentInfoRequestDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.iprsresidentinfo.RequestWrapper.class);

		return jacksonDataFormat;
	}
        
        @Bean(name = "residentInfoResponseDataFormat")
	JacksonDataFormat configureResidentInfoResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.iprsresidentinfo.ResponseWrapper.class);

		return jacksonDataFormat;
	}
	
	/* Transaction-info */
	@Bean(name = "transactionInfoRequestDataFormat")
	JacksonDataFormat configureTransactionInfoRequestDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.transactioninfo.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "transactionInfoResponseDataFormat")
	JacksonDataFormat configureTransactionInfoResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.transactioninfo.ResponseWrapper.class);

		return jacksonDataFormat;
	}

	/* Create customer */
	@Bean(name = "customerRequestDataFormat")
	JacksonDataFormat configureCustomerRequestDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.customer.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "customerResponseDataFormat")
	JacksonDataFormat configureCustomerResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.customer.ResponseWrapper.class);

		return jacksonDataFormat;
	}
	
	/* Error Handler */
	@Bean(name = "redeliveryPolicyDataFormat")
	JacksonDataFormat configureRedeliveryPolicyDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.errorhandler.RedeliveryPolicy.class);

		return jacksonDataFormat;
	}
	
	@Bean(name = "redeliveryConfigurationDataFormat")
	JacksonDataFormat configureRedeliveryConfigurationDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.errorhandler.RedeliveryConfiguration.class);

		return jacksonDataFormat;
	}
	
	
	/*query-biller*/	
	@Bean(name = "queryBillerRequestDataFormat")
	JacksonDataFormat configureQueryBillerRequestDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.queryBiller.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "queryBillerResponseDataFormat")
	JacksonDataFormat configureQueryBillerResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.queryBiller.ResponseWrapper.class);

		return jacksonDataFormat;
	}
	/*notify-biller*/	
	@Bean(name = "notifyBillerRequestDataFormat")
	JacksonDataFormat configureNotifyBillerRequestDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.notifybiller.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "notifyBillerResponseDataFormat")
	JacksonDataFormat configureNotifyBillerResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.notifybiller.ResponseWrapper.class);

		return jacksonDataFormat;
	}
	/* Validate biller */
	@Bean(name = "validateBillerRequestDataFormat")
	JacksonDataFormat configureValidateBillerRequestDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.validatebiller.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "validateBillerResponseDataFormat")
	JacksonDataFormat configureValidateBillerResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.validatebiller.ResponseWrapper.class);

		return jacksonDataFormat;
	}
	
	/* Business Transfer */
	@Bean(name = "businessTransferRequestDataFormat")
	JacksonDataFormat configureBusinessTransferRequestDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.businesstransfer.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "businessTransferResponseDataFormat")
	JacksonDataFormat configureBusinessTransferResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.businesstransfer.ResponseWrapper.class);

		return jacksonDataFormat;
	}
	
	//Review
	@Bean(name = "businessTransferCallBackDataFormat")
	JacksonDataFormat configureBusinessTransferCallBackDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.businesstransfer.CallBack.class);

		return jacksonDataFormat;
	}
	
	/* Redis Connector */
	@Bean(name = "redisApiRequestDataFormat")
	JacksonDataFormat configureRedisApiRequestDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.redis.RequestPayload.class);

		return jacksonDataFormat;
	}
	
	@Bean(name = "redisApiAllDataResponseDataFormat")
	JacksonDataFormat configureRedisApiDataBillersResponseDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.redis.ResponsePayload.class);
		return jacksonDataFormat;
	}
	
	@Bean(name = "redisApiOneDataResponseDataFormat")
	JacksonDataFormat configureRedisApiDataOneResponseDataFormat() {
		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.redis.RegisteredData.class);

		return jacksonDataFormat;
	}

	/* iprs-resident-info-atomic */
    @Bean(name = "iprsResidentInfoRequestDataFormat")
    JacksonDataFormat configureIprsResidentInfoRequestDataFormat() {
        JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
                com.kcbgroup.common.models.iprsresidentinfo.RequestWrapper.class);

        return jacksonDataFormat;
    }

    @Bean(name = "iprsResidentInfoResponseDataFormat")
    JacksonDataFormat configureIprsResidentInfoResponseDataFormat() {

        JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
                com.kcbgroup.common.models.iprsresidentinfo.ResponseWrapper.class);

        return jacksonDataFormat;
    }
    
	/* T24 LockUnlock DataFormat */
	@Bean(name = "t24LockUnlockRequestDataFormat")
	JacksonDataFormat configuret24LockUnlockRequestDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.t24.lockfunds.RequestPayload.class);

		return jacksonDataFormat;
	}
	
	@Bean(name = "t24LockUnlockResponseDataFormat")
	JacksonDataFormat configuret24LockUnlockResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.t24.lockfunds.ResponsePayload.class);

		return jacksonDataFormat;
	}

}
