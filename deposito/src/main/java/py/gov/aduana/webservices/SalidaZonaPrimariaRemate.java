
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salidaZonaPrimariaRemate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salidaZonaPrimariaRemate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabeceraSalida" type="{http://aduana.gov.py/webservices}cabeceraSalida" minOccurs="0"/>
 *         &lt;element name="idTransaccionDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "salidaZonaPrimariaRemate", propOrder = {
    "cabeceraSalida",
    "idTransaccionDeposito",
    "autenticacion"
})
public class SalidaZonaPrimariaRemate {

    protected CabeceraSalida cabeceraSalida;
    protected String idTransaccionDeposito;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the cabeceraSalida property.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraSalida }
     *     
     */
    public CabeceraSalida getCabeceraSalida() {
        return cabeceraSalida;
    }

    /**
     * Sets the value of the cabeceraSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraSalida }
     *     
     */
    public void setCabeceraSalida(CabeceraSalida value) {
        this.cabeceraSalida = value;
    }

    /**
     * Gets the value of the idTransaccionDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransaccionDeposito() {
        return idTransaccionDeposito;
    }

    /**
     * Sets the value of the idTransaccionDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransaccionDeposito(String value) {
        this.idTransaccionDeposito = value;
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
