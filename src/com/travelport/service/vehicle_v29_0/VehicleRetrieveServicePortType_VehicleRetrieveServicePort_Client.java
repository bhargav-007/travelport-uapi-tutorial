
package com.travelport.service.vehicle_v29_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:09:00.485-06:00
 * Generated source version: 2.7.12
 * 
 */
public final class VehicleRetrieveServicePortType_VehicleRetrieveServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/vehicle_v29_0", "VehicleService");

    private VehicleRetrieveServicePortType_VehicleRetrieveServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = VehicleService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        VehicleService ss = new VehicleService(wsdlURL, SERVICE_NAME);
        VehicleRetrieveServicePortType port = ss.getVehicleRetrieveServicePort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.vehicle_v29_0.VehicleRetrieveReq _service_parameters = null;
        try {
            com.travelport.schema.vehicle_v29_0.VehicleRetrieveRsp _service__return = port.service(_service_parameters);
            System.out.println("service.result=" + _service__return);

        } catch (VehicleFaultMessage e) { 
            System.out.println("Expected exception: VehicleFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
