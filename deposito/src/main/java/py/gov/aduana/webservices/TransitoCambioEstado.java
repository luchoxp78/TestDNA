
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transitoCambioEstado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transitoCambioEstado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sgtDta" type="{http://aduana.gov.py/webservices}sgtDta" minOccurs="0"/>
 *         &lt;element name="autenticacion" type="{http://aduana.gov.py/webservices}autenticacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transitoCambioEstado", propOrder = {
    "sgtDta",
    "autenticacion"
})
public class TransitoCambioEstado {

    protected SgtDta sgtDta;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the sgtDta property.
     * 
     * @return
     *     possible object is
     *     {@link SgtDta }
     *     
     */
    public SgtDta getSgtDta() {
        return sgtDta;
    }

    /**
     * Sets the value of the sgtDta property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtDta }
     *     
     */
    public void setSgtDta(SgtDta value) {
        this.sgtDta = value;
    }

    /**
     * Gets the value of the autenticacion property.
     * 
     * @return
     *     possible object is
     *     {@link Autenticacion }
     *     
     */
    public Autenticacion getAutenticacion() {
        return autenticacion;
    }

    /**
     * Sets the value of the autenticacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Autenticacion }
     *     
     */
    public void setAutenticacion(Autenticacion value) {
        this.autenticacion = value;
    }

}
