
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sgtVehiculo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sgtVehiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="persona" type="{http://aduana.gov.py/webservices}sgtPersona" minOccurs="0"/>
 *         &lt;element name="terrestre" type="{http://aduana.gov.py/webservices}sgtModoTerrestre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sgtVehiculo", propOrder = {
    "persona",
    "terrestre"
})
public class SgtVehiculo {

    protected SgtPersona persona;
    protected SgtModoTerrestre terrestre;

    /**
     * Gets the value of the persona property.
     * 
     * @return
     *     possible object is
     *     {@link SgtPersona }
     *     
     */
    public SgtPersona getPersona() {
        return persona;
    }

    /**
     * Sets the value of the persona property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtPersona }
     *     
     */
    public void setPersona(SgtPersona value) {
        this.persona = value;
    }

    /**
     * Gets the value of the terrestre property.
     * 
     * @return
     *     possible object is
     *     {@link SgtModoTerrestre }
     *     
     */
    public SgtModoTerrestre getTerrestre() {
        return terrestre;
    }

    /**
     * Sets the value of the terrestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtModoTerrestre }
     *     
     */
    public void setTerrestre(SgtModoTerrestre value) {
        this.terrestre = value;
    }

}
