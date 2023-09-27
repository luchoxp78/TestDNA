
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ingresoEfc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ingresoEfc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="traslado" type="{http://aduana.gov.py/webservices}taiViaje" minOccurs="0"/>
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
@XmlType(name = "ingresoEfc", propOrder = {
    "traslado",
    "autenticacion"
})
public class IngresoEfc {

    protected TaiViaje traslado;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the traslado property.
     * 
     * @return
     *     possible object is
     *     {@link TaiViaje }
     *     
     */
    public TaiViaje getTraslado() {
        return traslado;
    }

    /**
     * Sets the value of the traslado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaiViaje }
     *     
     */
    public void setTraslado(TaiViaje value) {
        this.traslado = value;
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
