
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.universal_v29_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:08:09.835-06:00
 * Generated source version: 2.7.12
 * 
 */

@javax.jws.WebService(
                      serviceName = "SavedTripRetrieveService",
                      portName = "SavedTripRetrieveServicePort",
                      targetNamespace = "http://www.travelport.com/service/universal_v29_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/Wsdl/universal_v29_0/UniversalRecord.wsdl",
                      endpointInterface = "com.travelport.service.universal_v29_0.SavedTripRetrieveServicePortType")
                      
public class SavedTripRetrieveServicePortTypeImpl implements SavedTripRetrieveServicePortType {

    private static final Logger LOG = Logger.getLogger(SavedTripRetrieveServicePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.universal_v29_0.SavedTripRetrieveServicePortType#service(com.travelport.schema.universal_v29_0.SavedTripRetrieveReq  parameters ,)com.travelport.schema.universal_v29_0.SupportedVersions  supportedVersions )*
     */
    public com.travelport.schema.universal_v29_0.SavedTripRetrieveRsp service(com.travelport.schema.universal_v29_0.SavedTripRetrieveReq parameters,com.travelport.schema.universal_v29_0.SupportedVersions supportedVersions) throws UniversalRecordFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        System.out.println(supportedVersions);
        try {
            com.travelport.schema.universal_v29_0.SavedTripRetrieveRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UniversalRecordFaultMessage("UniversalRecordFaultMessage...");
    }

}
