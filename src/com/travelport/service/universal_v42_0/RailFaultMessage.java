
package com.travelport.service.universal_v42_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:56:04.562-06:00
 * Generated source version: 3.1.5
 */

@WebFault(name = "ErrorInfo", targetNamespace = "http://www.travelport.com/schema/common_v42_0")
public class RailFaultMessage extends Exception {
    
    private com.travelport.schema.common_v42_0.ErrorInfo errorInfo;

    public RailFaultMessage() {
        super();
    }
    
    public RailFaultMessage(String message) {
        super(message);
    }
    
    public RailFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public RailFaultMessage(String message, com.travelport.schema.common_v42_0.ErrorInfo errorInfo) {
        super(message);
        this.errorInfo = errorInfo;
    }

    public RailFaultMessage(String message, com.travelport.schema.common_v42_0.ErrorInfo errorInfo, Throwable cause) {
        super(message, cause);
        this.errorInfo = errorInfo;
    }

    public com.travelport.schema.common_v42_0.ErrorInfo getFaultInfo() {
        return this.errorInfo;
    }
}
