package com.travelport.service.vehicle_v42_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:56:34.231-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "VehicleService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/vehicle_v42_0/Vehicle.wsdl",
                  targetNamespace = "http://www.travelport.com/service/vehicle_v42_0") 
public class VehicleService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/vehicle_v42_0", "VehicleService");
    public final static QName VehicleLocationDetailServicePort = new QName("http://www.travelport.com/service/vehicle_v42_0", "VehicleLocationDetailServicePort");
    public final static QName VehicleUpsellSearchServicePort = new QName("http://www.travelport.com/service/vehicle_v42_0", "VehicleUpsellSearchServicePort");
    public final static QName VehicleLocationServicePort = new QName("http://www.travelport.com/service/vehicle_v42_0", "VehicleLocationServicePort");
    public final static QName VehicleRetrieveServicePort = new QName("http://www.travelport.com/service/vehicle_v42_0", "VehicleRetrieveServicePort");
    public final static QName VehicleKeywordsServicePort = new QName("http://www.travelport.com/service/vehicle_v42_0", "VehicleKeywordsServicePort");
    public final static QName VehicleRulesServicePort = new QName("http://www.travelport.com/service/vehicle_v42_0", "VehicleRulesServicePort");
    public final static QName VehicleSearchServicePort = new QName("http://www.travelport.com/service/vehicle_v42_0", "VehicleSearchServicePort");
    public final static QName VehicleMediaLinksServicePort = new QName("http://www.travelport.com/service/vehicle_v42_0", "VehicleMediaLinksServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/vehicle_v42_0/Vehicle.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(VehicleService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/vehicle_v42_0/Vehicle.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public VehicleService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public VehicleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VehicleService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public VehicleService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public VehicleService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public VehicleService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns VehicleLocationDetailServicePortType
     */
    @WebEndpoint(name = "VehicleLocationDetailServicePort")
    public VehicleLocationDetailServicePortType getVehicleLocationDetailServicePort() {
        return super.getPort(VehicleLocationDetailServicePort, VehicleLocationDetailServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleLocationDetailServicePortType
     */
    @WebEndpoint(name = "VehicleLocationDetailServicePort")
    public VehicleLocationDetailServicePortType getVehicleLocationDetailServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleLocationDetailServicePort, VehicleLocationDetailServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns VehicleUpsellSearchServicePortType
     */
    @WebEndpoint(name = "VehicleUpsellSearchServicePort")
    public VehicleUpsellSearchServicePortType getVehicleUpsellSearchServicePort() {
        return super.getPort(VehicleUpsellSearchServicePort, VehicleUpsellSearchServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleUpsellSearchServicePortType
     */
    @WebEndpoint(name = "VehicleUpsellSearchServicePort")
    public VehicleUpsellSearchServicePortType getVehicleUpsellSearchServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleUpsellSearchServicePort, VehicleUpsellSearchServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns VehicleLocationServicePortType
     */
    @WebEndpoint(name = "VehicleLocationServicePort")
    public VehicleLocationServicePortType getVehicleLocationServicePort() {
        return super.getPort(VehicleLocationServicePort, VehicleLocationServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleLocationServicePortType
     */
    @WebEndpoint(name = "VehicleLocationServicePort")
    public VehicleLocationServicePortType getVehicleLocationServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleLocationServicePort, VehicleLocationServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns VehicleRetrieveServicePortType
     */
    @WebEndpoint(name = "VehicleRetrieveServicePort")
    public VehicleRetrieveServicePortType getVehicleRetrieveServicePort() {
        return super.getPort(VehicleRetrieveServicePort, VehicleRetrieveServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleRetrieveServicePortType
     */
    @WebEndpoint(name = "VehicleRetrieveServicePort")
    public VehicleRetrieveServicePortType getVehicleRetrieveServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleRetrieveServicePort, VehicleRetrieveServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns VehicleKeywordsServicePortType
     */
    @WebEndpoint(name = "VehicleKeywordsServicePort")
    public VehicleKeywordsServicePortType getVehicleKeywordsServicePort() {
        return super.getPort(VehicleKeywordsServicePort, VehicleKeywordsServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleKeywordsServicePortType
     */
    @WebEndpoint(name = "VehicleKeywordsServicePort")
    public VehicleKeywordsServicePortType getVehicleKeywordsServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleKeywordsServicePort, VehicleKeywordsServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns VehicleRulesServicePortType
     */
    @WebEndpoint(name = "VehicleRulesServicePort")
    public VehicleRulesServicePortType getVehicleRulesServicePort() {
        return super.getPort(VehicleRulesServicePort, VehicleRulesServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleRulesServicePortType
     */
    @WebEndpoint(name = "VehicleRulesServicePort")
    public VehicleRulesServicePortType getVehicleRulesServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleRulesServicePort, VehicleRulesServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns VehicleSearchServicePortType
     */
    @WebEndpoint(name = "VehicleSearchServicePort")
    public VehicleSearchServicePortType getVehicleSearchServicePort() {
        return super.getPort(VehicleSearchServicePort, VehicleSearchServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleSearchServicePortType
     */
    @WebEndpoint(name = "VehicleSearchServicePort")
    public VehicleSearchServicePortType getVehicleSearchServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleSearchServicePort, VehicleSearchServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns VehicleMediaLinksServicePortType
     */
    @WebEndpoint(name = "VehicleMediaLinksServicePort")
    public VehicleMediaLinksServicePortType getVehicleMediaLinksServicePort() {
        return super.getPort(VehicleMediaLinksServicePort, VehicleMediaLinksServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleMediaLinksServicePortType
     */
    @WebEndpoint(name = "VehicleMediaLinksServicePort")
    public VehicleMediaLinksServicePortType getVehicleMediaLinksServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleMediaLinksServicePort, VehicleMediaLinksServicePortType.class, features);
    }

}
