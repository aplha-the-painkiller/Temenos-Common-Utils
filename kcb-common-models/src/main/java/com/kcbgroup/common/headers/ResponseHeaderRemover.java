package com.kcbgroup.common.headers;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * @author Oscar Castillo oscar.castillo@bringglobal.com
 * @version 1.0.0
 * @sice 2021-03-02
 * @see org.apache.camel.Processor
 */
public class ResponseHeaderRemover implements Processor {

    /**
     *
     * @param exchange The final exchange before send it as REST response.
     * @throws Exception
     */
    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().removeHeaders("*",
                Exchange.CONTENT_TYPE,
                Exchange.HTTP_RESPONSE_CODE,
                "resultCode",
                "messageID",
                "channelCode"
                );
    }
}
