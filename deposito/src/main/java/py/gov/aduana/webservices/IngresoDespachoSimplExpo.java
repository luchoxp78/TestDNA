
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ingresoDespachoSimplExpo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ingresoDespachoSimplExpo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="declaracion" type="{http://aduana.gov.py/webservices}declaracionSimplificada" minOccurs="0"/>
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
@XmlType(name = "ingresoDespachoSimplExpo", propOrder = {
    "declaracion",
    "autenticacion"
})
public class IngresoDespachoSimplExpo {

    protected DeclaracionSimplificada declaracion;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the declaracion property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaracionSimplificada }
     *     
     */
    public DeclaracionSimplificada getDeclaracion() {
        return declaracion;
    }

    /**
     * Sets the value of the declaracion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaracionSimplificada }
     *     
     */
    public void setDeclaracion(DeclaracionSimplificada value) {
        this.declaracion = value;
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
