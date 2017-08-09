
package com.travelport.schema.common_v42_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.vehicle_v42_0.BaseVehicleSearchAvailabilityRsp;
import com.travelport.schema.vehicle_v42_0.VehicleRulesRsp;
import com.travelport.schema.hotel_v42_0.BaseHotelSearchRsp;
import com.travelport.schema.hotel_v42_0.HotelSuperShopperRsp;
import com.travelport.schema.air_v42_0.BaseAvailabilitySearchRsp;
import com.travelport.schema.air_v42_0.FlightTimeTableRsp;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for BaseSearchRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseSearchRsp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v42_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v42_0}NextResultReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseSearchRsp", propOrder = {
    "nextResultReference"
})
//@XmlSeeAlso({
//    VehicleRulesRsp.class,
//    BaseVehicleSearchAvailabilityRsp.class
//})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public class BaseSearchRsp
    extends BaseRsp
{

    @XmlElement(name = "NextResultReference")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected List<NextResultReference> nextResultReference;

    /**
     * Gets the value of the nextResultReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextResultReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextResultReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NextResultReference }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public List<NextResultReference> getNextResultReference() {
        if (nextResultReference == null) {
            nextResultReference = new ArrayList<NextResultReference>();
        }
        return this.nextResultReference;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
