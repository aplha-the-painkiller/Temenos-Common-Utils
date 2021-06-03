/**
 *
 */
package com.kcbgroup.common.models.iprsresidentinfo;

import java.io.Serializable;

import com.kcbgroup.common.models.RequestHeader;

public class RequestWrapper implements Serializable {


    private static final long serialVersionUID = 8864903968440189419L;

    private RequestHeader header;
    private ResidentInfoRequestPayload requestPayload;

    public RequestWrapper() {

    }

    public RequestHeader getHeader() {
        return header;
    }

    public void setHeader(RequestHeader header) {
        this.header = header;
    }

    public ResidentInfoRequestPayload getRequestPayload() {
        return requestPayload;
    }

    public void setRequestPayload(ResidentInfoRequestPayload requestPayload) {
        this.requestPayload = requestPayload;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RequestWrapper [header=");
        builder.append(header);
        builder.append(", requestPayload=");
        builder.append(requestPayload);
        builder.append("]");
        return builder.toString();
    }

}
