
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sgtBur complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sgtBur">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cbur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lbur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sgtBur", propOrder = {
    "cbur",
    "id",
    "lbur"
})
public class SgtBur {

    protected String cbur;
    protected Long id;
    protected String lbur;

    /**
     * Gets the value of the cbur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbur() {
        return cbur;
    }

    /**
     * Sets the value of the cbur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbur(String value) {
        this.cbur = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the lbur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbur() {
        return lbur;
    }

    /**
     * Sets the value of the lbur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbur(String value) {
        this.lbur = value;
    }

}
