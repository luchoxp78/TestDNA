
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldsActa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ldsActa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadParcial" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cantidadTotal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="descripcionBultos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="embalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="embalajeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lin1EraFraccHecho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturalezaMercaderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoParcial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ldsActa", propOrder = {
    "cantidadParcial",
    "cantidadTotal",
    "descripcionBultos",
    "embalaje",
    "embalajeDesc",
    "lin1EraFraccHecho",
    "naturalezaMercaderia",
    "nroTitulo",
    "observaciones",
    "pesoParcial",
    "pesoTotal"
})
public class LdsActa {

    protected Long cantidadParcial;
    protected Long cantidadTotal;
    protected String descripcionBultos;
    protected String embalaje;
    protected String embalajeDesc;
    protected String lin1EraFraccHecho;
    protected String naturalezaMercaderia;
    protected String nroTitulo;
    protected String observaciones;
    protected String pesoParcial;
    protected String pesoTotal;

    /**
     * Gets the value of the cantidadParcial property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCantidadParcial() {
        return cantidadParcial;
    }

    /**
     * Sets the value of the cantidadParcial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCantidadParcial(Long value) {
        this.cantidadParcial = value;
    }

    /**
     * Gets the value of the cantidadTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCantidadTotal() {
        return cantidadTotal;
    }

    /**
     * Sets the value of the cantidadTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCantidadTotal(Long value) {
        this.cantidadTotal = value;
    }

    /**
     * Gets the value of the descripcionBultos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionBultos() {
        return descripcionBultos;
    }

    /**
     * Sets the value of the descripcionBultos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionBultos(String value) {
        this.descripcionBultos = value;
    }

    /**
     * Gets the value of the embalaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbalaje() {
        return embalaje;
    }

    /**
     * Sets the value of the embalaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbalaje(String value) {
        this.embalaje = value;
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
     * Gets the value of the lin1EraFraccHecho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLin1EraFraccHecho() {
        return lin1EraFraccHecho;
    }

    /**
     * Sets the value of the lin1EraFraccHecho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLin1EraFraccHecho(String value) {
        this.lin1EraFraccHecho = value;
    }

    /**
     * Gets the value of the naturalezaMercaderia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalezaMercaderia() {
        return naturalezaMercaderia;
    }

    /**
     * Sets the value of the naturalezaMercaderia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalezaMercaderia(String value) {
        this.naturalezaMercaderia = value;
    }

    /**
     * Gets the value of the nroTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroTitulo() {
        return nroTitulo;
    }

    /**
     * Sets the value of the nroTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroTitulo(String value) {
        this.nroTitulo = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Gets the value of the pesoParcial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoParcial() {
        return pesoParcial;
    }

    /**
     * Sets the value of the pesoParcial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoParcial(String value) {
        this.pesoParcial = value;
    }

    /**
     * Gets the value of the pesoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoTotal() {
        return pesoTotal;
    }

    /**
     * Sets the value of the pesoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoTotal(String value) {
        this.pesoTotal = value;
    }

}
