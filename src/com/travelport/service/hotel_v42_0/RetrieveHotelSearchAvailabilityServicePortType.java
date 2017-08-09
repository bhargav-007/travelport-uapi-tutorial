package com.travelport.service.hotel_v42_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:54:12.106-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/hotel_v42_0", name = "RetrieveHotelSearchAvailabilityServicePortType")
@XmlSeeAlso({com.travelport.schema.common_v42_0.ObjectFactory.class, com.travelport.schema.hotel_v42_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RetrieveHotelSearchAvailabilityServicePortType {

    @WebResult(name = "RetrieveHotelSearchAvailabilityRsp", targetNamespace = "http://www.travelport.com/schema/hotel_v42_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/HotelService")
    public com.travelport.schema.hotel_v42_0.RetrieveHotelSearchAvailabilityRsp service(
        @WebParam(partName = "parameters", name = "RetrieveHotelSearchAvailabilityReq", targetNamespace = "http://www.travelport.com/schema/hotel_v42_0")
        com.travelport.schema.hotel_v42_0.RetrieveHotelSearchAvailabilityReq parameters
    ) throws HotelFaultMessage;
}
