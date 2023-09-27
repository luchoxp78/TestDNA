
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for indicadores complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indicadores">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cierreIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmarIrrDescFracc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingresoContenedoresVacios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingresoGlobal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soloCierreIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indicadores", propOrder = {
    "cierreIngreso",
    "confirmarIrrDescFracc",
    "ingresoContenedoresVacios",
    "ingresoGlobal",
    "soloCierreIngreso"
})
public class Indicadores {

    protected String cierreIngreso;
    protected String confirmarIrrDescFracc;
    protected String ingresoContenedoresVacios;
    protected String ingresoGlobal;
    protected String soloCierreIngreso;

    /**
     * Gets the value of the cierreIngreso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCierreIngreso() {
        return cierreIngreso;
    }

    /**
     * Sets the value of the cierreIngreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCierreIngreso(String value) {
        this.cierreIngreso = value;
    }

    /**
     * Gets the value of the confirmarIrrDescFracc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmarIrrDescFracc() {
        return confirmarIrrDescFracc;
    }

    /**
     * Sets the value of the confirmarIrrDescFracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmarIrrDescFracc(String value) {
        this.confirmarIrrDescFracc = value;
    }

    /**
     * Gets the value of the ingresoContenedoresVacios property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngresoContenedoresVacios() {
        return ingresoContenedoresVacios;
    }

    /**
     * Sets the value of the ingresoContenedoresVacios property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngresoContenedoresVacios(String value) {
        this.ingresoContenedoresVacios = value;
    }

    /**
     * Gets the value of the ingresoGlobal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngresoGlobal() {
        return ingresoGlobal;
    }

    /**
     * Sets the value of the ingresoGlobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngresoGlobal(String value) {
        this.ingresoGlobal = value;
    }

    /**
     * Gets the value of the soloCierreIngreso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoloCierreIngreso() {
        return soloCierreIngreso;
    }

    /**
     * Sets the value of the soloCierreIngreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoloCierreIngreso(String value) {
        this.soloCierreIngreso = value;
    }

}
