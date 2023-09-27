
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bultoEfc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bultoEfc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="embalajeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEmbalajeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bultoEfc", propOrder = {
    "cantidad",
    "codEmbalaje",
    "codUnidad",
    "embalajeDesc",
    "item",
    "peso",
    "tipoEmbalaje",
    "tipoEmbalajeDesc",
    "unidadDesc"
})
public class BultoEfc {

    protected String cantidad;
    protected String codEmbalaje;
    protected String codUnidad;
    protected String embalajeDesc;
    protected String item;
    protected String peso;
    protected String tipoEmbalaje;
    protected String tipoEmbalajeDesc;
    protected String unidadDesc;

    /**
     * Gets the value of the cantidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the codEmbalaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEmbalaje() {
        return codEmbalaje;
    }

    /**
     * Sets the value of the codEmbalaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEmbalaje(String value) {
        this.codEmbalaje = value;
    }

    /**
     * Gets the value of the codUnidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUnidad() {
        return codUnidad;
    }

    /**
     * Sets the value of the codUnidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUnidad(String value) {
        this.codUnidad = value;
    }

    /**
     * Gets the value of the embalajeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbalajeDesc() {
        return embalajeDesc;
    }

    /**
     * Sets the value of the embalajeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbalajeDesc(String value) {
        this.embalajeDesc = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItem(String value) {
        this.item = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeso(String value) {
        this.peso = value;
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

    /**
     * Gets the value of the tipoEmbalajeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmbalajeDesc() {
        return tipoEmbalajeDesc;
    }

    /**
     * Sets the value of the tipoEmbalajeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmbalajeDesc(String value) {
        this.tipoEmbalajeDesc = value;
    }

    /**
     * Gets the value of the unidadDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadDesc() {
        return unidadDesc;
    }

    /**
     * Sets the value of the unidadDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadDesc(String value) {
        this.unidadDesc = value;
    }

}
