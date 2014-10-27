package com.travelport.service.hotel_v29_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:09:41.037-06:00
 * Generated source version: 2.7.12
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/hotel_v29_0", name = "HotelSearchServicePortType")
@XmlSeeAlso({com.travelport.schema.hotel_v29_0.ObjectFactory.class, com.travelport.schema.common_v29_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HotelSearchServicePortType {

    @WebResult(name = "HotelSearchAvailabilityRsp", targetNamespace = "http://www.travelport.com/schema/hotel_v29_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/HotelService")
    public com.travelport.schema.hotel_v29_0.BaseHotelSearchRsp service(
        @WebParam(partName = "parameters", name = "HotelSearchAvailabilityReq", targetNamespace = "http://www.travelport.com/schema/hotel_v29_0")
        com.travelport.schema.hotel_v29_0.HotelSearchAvailabilityReq parameters
    ) throws HotelFaultMessage;
}
