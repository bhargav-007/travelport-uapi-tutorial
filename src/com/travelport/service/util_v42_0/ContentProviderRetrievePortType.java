package com.travelport.service.util_v42_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T16:06:30.742-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/util_v42_0", name = "ContentProviderRetrievePortType")
@XmlSeeAlso({com.travelport.schema.util_v42_0.ObjectFactory.class, com.travelport.schema.common_v42_0.ObjectFactory.class, com.travelport.schema.air_v42_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ContentProviderRetrievePortType {

    @WebResult(name = "ContentProviderRetrieveRsp", targetNamespace = "http://www.travelport.com/schema/util_v42_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/UtilService")
    public com.travelport.schema.util_v42_0.ContentProviderRetrieveRsp service(
        @WebParam(partName = "parameters", name = "ContentProviderRetrieveReq", targetNamespace = "http://www.travelport.com/schema/util_v42_0")
        com.travelport.schema.util_v42_0.ContentProviderRetrieveReq parameters
    ) throws UtilFaultMessage;
}
