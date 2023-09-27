
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contenedor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contenedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cubitaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medidaContenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroContenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroPrecinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contenedor", propOrder = {
    "cubitaje",
    "imut",
    "medidaContenedor",
    "nroContenedor",
    "nroPrecinto"
})
public class Contenedor {

    protected String cubitaje;
    protected String imut;
    protected String medidaContenedor;
    protected String nroContenedor;
    protected String nroPrecinto;

    /**
     * Gets the value of the cubitaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubitaje() {
        return cubitaje;
    }

    /**
     * Sets the value of the cubitaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubitaje(String value) {
        this.cubitaje = value;
    }

    /**
     * Gets the value of the imut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImut() {
        return imut;
    }

    /**
     * Sets the value of the imut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImut(String value) {
        this.imut = value;
    }

    /**
     * Gets the value of the medidaContenedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedidaContenedor() {
        return medidaContenedor;
    }

    /**
     * Sets the value of the medidaContenedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedidaContenedor(String value) {
        this.medidaContenedor = value;
    }

    /**
     * Gets the value of the nroContenedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroContenedor() {
        return nroContenedor;
    }

    /**
     * Sets the value of the nroContenedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroContenedor(String value) {
        this.nroContenedor = value;
    }

    /**
     * Gets the value of the nroPrecinto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroPrecinto() {
        return nroPrecinto;
    }

    /**
     * Sets the value of the nroPrecinto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroPrecinto(String value) {
        this.nroPrecinto = value;
    }

}
