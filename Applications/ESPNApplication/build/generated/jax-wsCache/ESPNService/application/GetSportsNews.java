
package application;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSportsNews complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSportsNews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSportsNews", propOrder = {
    "sportName"
})
public class GetSportsNews {

    protected String sportName;

    /**
     * Gets the value of the sportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportName() {
        return sportName;
    }

    /**
     * Sets the value of the sportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportName(String value) {
        this.sportName = value;
    }

}
