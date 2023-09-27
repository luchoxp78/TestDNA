
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiBulto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiBulto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantBultos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMercaderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taiBulto", propOrder = {
    "cantBultos",
    "descMercaderia",
    "pesoBruto",
    "tipoEmbalaje"
})
public class TaiBulto {

    protected String cantBultos;
    protected String descMercaderia;
    protected String pesoBruto;
    protected String tipoEmbalaje;

    /**
     * Gets the value of the cantBultos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantBultos() {
        return cantBultos;
    }

    /**
     * Sets the value of the cantBultos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantBultos(String value) {
        this.cantBultos = value;
    }

    /**
     * Gets the value of the descMercaderia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMercaderia() {
        return descMercaderia;
    }

    /**
     * Sets the value of the descMercaderia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMercaderia(String value) {
        this.descMercaderia = value;
    }

    /**
     * Gets the value of the pesoBruto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBruto() {
        return pesoBruto;
    }

    /**
     * Sets the value of the pesoBruto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBruto(String value) {
        this.pesoBruto = value;
    }

    /**
     * Gets the value of the tipoEmbalaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    /**
     * Sets the value of the tipoEmbalaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmbalaje(String value) {
        this.tipoEmbalaje = value;
    }

}
