
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarDeclaracion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarDeclaracion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDeclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noRequiereIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "consultarDeclaracion", propOrder = {
    "idDeclaracion",
    "noRequiereIngreso",
    "autenticacion"
})
public class ConsultarDeclaracion {

    protected String idDeclaracion;
    protected String noRequiereIngreso;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the idDeclaracion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDeclaracion() {
        return idDeclaracion;
    }

    /**
     * Sets the value of the idDeclaracion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDeclaracion(String value) {
        this.idDeclaracion = value;
    }

    /**
     * Gets the value of the noRequiereIngreso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoRequiereIngreso() {
        return noRequiereIngreso;
    }

    /**
     * Sets the value of the noRequiereIngreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoRequiereIngreso(String value) {
        this.noRequiereIngreso = value;
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
