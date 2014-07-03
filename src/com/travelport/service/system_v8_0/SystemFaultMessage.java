
package com.travelport.service.system_v8_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T10:54:07.614-06:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ErrorInfo", targetNamespace = "http://www.travelport.com/schema/common_v12_0")
public class SystemFaultMessage extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.travelport.schema.common_v12_0.ErrorInfo errorInfo;

    public SystemFaultMessage() {
        super();
    }
    
    public SystemFaultMessage(String message) {
        super(message);
    }
    
    public SystemFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemFaultMessage(String message, com.travelport.schema.common_v12_0.ErrorInfo errorInfo) {
        super(message);
        this.errorInfo = errorInfo;
    }

    public SystemFaultMessage(String message, com.travelport.schema.common_v12_0.ErrorInfo errorInfo, Throwable cause) {
        super(message, cause);
        this.errorInfo = errorInfo;
    }

    public com.travelport.schema.common_v12_0.ErrorInfo getFaultInfo() {
        return this.errorInfo;
    }
}