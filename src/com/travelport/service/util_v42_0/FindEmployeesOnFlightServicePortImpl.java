
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.util_v42_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T16:06:30.692-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "FindEmployeesOnFlightService",
                      portName = "FindEmployeesOnFlightServicePort",
                      targetNamespace = "http://www.travelport.com/service/util_v42_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/util_v42_0/Util.wsdl",
                      endpointInterface = "com.travelport.service.util_v42_0.FindEmployeesOnFlightServicePortType")
                      
public class FindEmployeesOnFlightServicePortImpl implements FindEmployeesOnFlightServicePortType {

    private static final Logger LOG = Logger.getLogger(FindEmployeesOnFlightServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.util_v42_0.FindEmployeesOnFlightServicePortType#service(com.travelport.schema.util_v42_0.FindEmployeesOnFlightReq  parameters )*
     */
    public com.travelport.schema.util_v42_0.FindEmployeesOnFlightRsp service(com.travelport.schema.util_v42_0.FindEmployeesOnFlightReq parameters) throws UtilFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.util_v42_0.FindEmployeesOnFlightRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UtilFaultMessage("UtilFaultMessage...");
    }

}
