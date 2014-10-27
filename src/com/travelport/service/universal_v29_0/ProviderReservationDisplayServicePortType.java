package com.travelport.service.universal_v29_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:08:10.005-06:00
 * Generated source version: 2.7.12
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/universal_v29_0", name = "ProviderReservationDisplayServicePortType")
@XmlSeeAlso({com.travelport.schema.cruise_v29_0.ObjectFactory.class, com.travelport.schema.hotel_v29_0.ObjectFactory.class, com.travelport.schema.rail_v29_0.ObjectFactory.class, com.travelport.schema.universal_v29_0.ObjectFactory.class, com.travelport.schema.common_v29_0.ObjectFactory.class, com.travelport.schema.air_v29_0.ObjectFactory.class, com.travelport.schema.passive_v29_0.ObjectFactory.class, com.travelport.schema.vehicle_v29_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ProviderReservationDisplayServicePortType {

    @WebResult(name = "ProviderReservationDisplayDetailsRsp", targetNamespace = "http://www.travelport.com/schema/universal_v29_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/ProviderReservationDisplayService")
    public com.travelport.schema.universal_v29_0.ProviderReservationDisplayDetailsRsp service(
        @WebParam(partName = "parameters", name = "ProviderReservationDisplayDetailsReq", targetNamespace = "http://www.travelport.com/schema/universal_v29_0")
        com.travelport.schema.universal_v29_0.ProviderReservationDisplayDetailsReq parameters
    ) throws UniversalRecordFaultMessage;
}
