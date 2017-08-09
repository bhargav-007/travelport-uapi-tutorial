package com.travelport.service.universal_v42_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:56:05.084-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/universal_v42_0", name = "HotelCancelServicePortType")
@XmlSeeAlso({com.travelport.schema.passive_v42_0.ObjectFactory.class, com.travelport.schema.common_v42_0.ObjectFactory.class, com.travelport.schema.hotel_v42_0.ObjectFactory.class, com.travelport.schema.cruise_v42_0.ObjectFactory.class, com.travelport.schema.air_v42_0.ObjectFactory.class, com.travelport.schema.universal_v42_0.ObjectFactory.class, com.travelport.schema.rail_v42_0.ObjectFactory.class, com.travelport.schema.vehicle_v42_0.ObjectFactory.class, com.travelport.soa.common.security.sessioncontext_v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HotelCancelServicePortType {

    @WebResult(name = "HotelCancelRsp", targetNamespace = "http://www.travelport.com/schema/universal_v42_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/HotelService")
    public com.travelport.schema.universal_v42_0.HotelCancelRsp service(
        @WebParam(partName = "parameters", name = "HotelCancelReq", targetNamespace = "http://www.travelport.com/schema/universal_v42_0")
        com.travelport.schema.universal_v42_0.HotelCancelReq parameters,
        @WebParam(partName = "supportedVersions", name = "SupportedVersions", targetNamespace = "http://www.travelport.com/schema/universal_v42_0", header = true)
        com.travelport.schema.universal_v42_0.SupportedVersions supportedVersions
    ) throws HotelFaultMessage;
}
