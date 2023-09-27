
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for declaracionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="declaracionItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionMercaderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisOrigenDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partidaArancelaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMercaderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMercaderiaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadMedidaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "declaracionItem", propOrder = {
    "cantidad",
    "descripcionMercaderia",
    "numeroItem",
    "paisOrigen",
    "paisOrigenDescripcion",
    "partidaArancelaria",
    "peso",
    "tipoMercaderia",
    "tipoMercaderiaDescripcion",
    "unidadMedida",
    "unidadMedidaDescripcion"
})
public class DeclaracionItem {

    protected String cantidad;
    protected String descripcionMercaderia;
    protected String numeroItem;
    protected String paisOrigen;
    protected String paisOrigenDescripcion;
    protected String partidaArancelaria;
    protected String peso;
    protected String tipoMercaderia;
    protected String tipoMercaderiaDescripcion;
    protected String unidadMedida;
    protected String unidadMedidaDescripcion;

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
     * Gets the value of the descripcionMercaderia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMercaderia() {
        return descripcionMercaderia;
    }

    /**
     * Sets the value of the descripcionMercaderia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMercaderia(String value) {
        this.descripcionMercaderia = value;
    }

    /**
     * Gets the value of the numeroItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroItem() {
        return numeroItem;
    }

    /**
     * Sets the value of the numeroItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroItem(String value) {
        this.numeroItem = value;
    }

    /**
     * Gets the value of the paisOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Sets the value of the paisOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigen(String value) {
        this.paisOrigen = value;
    }

    /**
     * Gets the value of the paisOrigenDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigenDescripcion() {
        return paisOrigenDescripcion;
    }

    /**
     * Sets the value of the paisOrigenDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigenDescripcion(String value) {
        this.paisOrigenDescripcion = value;
    }

    /**
     * Gets the value of the partidaArancelaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartidaArancelaria() {
        return partidaArancelaria;
    }

    /**
     * Sets the value of the partidaArancelaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartidaArancelaria(String value) {
        this.partidaArancelaria = value;
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
     * Gets the value of the tipoMercaderia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMercaderia() {
        return tipoMercaderia;
    }

    /**
     * Sets the value of the tipoMercaderia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMercaderia(String value) {
        this.tipoMercaderia = value;
    }

    /**
     * Gets the value of the tipoMercaderiaDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMercaderiaDescripcion() {
        return tipoMercaderiaDescripcion;
    }

    /**
     * Sets the value of the tipoMercaderiaDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMercaderiaDescripcion(String value) {
        this.tipoMercaderiaDescripcion = value;
    }

    /**
     * Gets the value of the unidadMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * Sets the value of the unidadMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadMedida(String value) {
        this.unidadMedida = value;
    }

    /**
     * Gets the value of the unidadMedidaDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadMedidaDescripcion() {
        return unidadMedidaDescripcion;
    }

    /**
     * Sets the value of the unidadMedidaDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadMedidaDescripcion(String value) {
        this.unidadMedidaDescripcion = value;
    }

}
