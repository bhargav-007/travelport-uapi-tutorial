
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.system_v9_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:09:22.841-06:00
 * Generated source version: 2.7.12
 * 
 */

@javax.jws.WebService(
                      serviceName = "ExternalCacheAccessService",
                      portName = "ExternalCacheAccessPort",
                      targetNamespace = "http://www.travelport.com/service/system_v9_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/Wsdl/system_v9_0/System.wsdl",
                      endpointInterface = "com.travelport.service.system_v9_0.ExternalCacheAccessPortType")
                      
public class ExternalCacheAccessPortTypeImpl implements ExternalCacheAccessPortType {

    private static final Logger LOG = Logger.getLogger(ExternalCacheAccessPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.system_v9_0.ExternalCacheAccessPortType#service(com.travelport.schema.system_v9_0.ExternalCacheAccessReq  parameters )*
     */
    public com.travelport.schema.system_v9_0.ExternalCacheAccessRsp service(com.travelport.schema.system_v9_0.ExternalCacheAccessReq parameters) throws SystemFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.system_v9_0.ExternalCacheAccessRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new SystemFaultMessage("SystemFaultMessage...");
    }

}
