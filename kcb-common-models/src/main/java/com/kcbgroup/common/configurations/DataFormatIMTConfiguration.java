package com.kcbgroup.common.configurations;

import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Data Format Configuration (for All Requests and Responses IMT)
 *
 * @author Andrés Vázquez | Bring Global
 * @version 1.0.0
 */
@Configuration
public class DataFormatIMTConfiguration {
	private static final ObjectMapper payloadObjectMapper = new ObjectMapper();

	static {
		// Add some extra configuration as needed
		payloadObjectMapper.disable(SerializationFeature.INDENT_OUTPUT);
		payloadObjectMapper.setSerializationInclusion(Include.NON_NULL);
	}
	/* ria-international-money-transfer */

	@Bean(name = "riaIMTRequestDataFormat")
	JacksonDataFormat configureMiniStatementRequestDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatIMTConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.imt.ria.RequestWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "riaIMTResponseDataFormat")
	JacksonDataFormat configureMiniStatementResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatIMTConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.imt.ria.ResponseWrapper.class);

		return jacksonDataFormat;
	}
	/* ria-international-money-transfer - Gateway */

	@Bean(name = "riaIMTGatewayRequestDataFormat")
	JacksonDataFormat configureBalanceInquiryRequestDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatIMTConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.imt.ria.mg.RequestGatewayWrapper.class);

		return jacksonDataFormat;
	}

	@Bean(name = "riaIMTGatewayResponseDataFormat")
	JacksonDataFormat configureBalanceInquiryResponseDataFormat() {

		JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(DataFormatIMTConfiguration.payloadObjectMapper,
				com.kcbgroup.common.models.imt.ria.mg.ResponseGatewayWrapper.class);

		return jacksonDataFormat;
	}



}
