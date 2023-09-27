
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiPersona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="barrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreRazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroDocIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroViaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipDocIdentMercosur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAgente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoViaTransp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taiPersona", propOrder = {
    "barrio",
    "ciudad",
    "codigoPostal",
    "delegacion",
    "estado",
    "identificadorFiscal",
    "nombreCalle",
    "nombreRazonSocial",
    "nroDocIdentidad",
    "nroTelefono",
    "nroViaje",
    "tipDocIdentMercosur",
    "tipTrans",
    "tipoAgente",
    "tipoViaTransp"
})
public class TaiPersona {

    protected String barrio;
    protected String ciudad;
    protected String codigoPostal;
    protected String delegacion;
    protected String estado;
    protected String identificadorFiscal;
    protected String nombreCalle;
    protected String nombreRazonSocial;
    protected String nroDocIdentidad;
    protected String nroTelefono;
    protected String nroViaje;
    protected String tipDocIdentMercosur;
    protected String tipTrans;
    protected String tipoAgente;
    protected String tipoViaTransp;

    /**
     * Gets the value of the barrio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * Sets the value of the barrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarrio(String value) {
        this.barrio = value;
    }

    /**
     * Gets the value of the ciudad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Sets the value of the ciudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Gets the value of the codigoPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Sets the value of the codigoPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Gets the value of the delegacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegacion() {
        return delegacion;
    }

    /**
     * Sets the value of the delegacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegacion(String value) {
        this.delegacion = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the identificadorFiscal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorFiscal() {
        return identificadorFiscal;
    }

    /**
     * Sets the value of the identificadorFiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorFiscal(String value) {
        this.identificadorFiscal = value;
    }

    /**
     * Gets the value of the nombreCalle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCalle() {
        return nombreCalle;
    }

    /**
     * Sets the value of the nombreCalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCalle(String value) {
        this.nombreCalle = value;
    }

    /**
     * Gets the value of the nombreRazonSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRazonSocial() {
        return nombreRazonSocial;
    }

    /**
     * Sets the value of the nombreRazonSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRazonSocial(String value) {
        this.nombreRazonSocial = value;
    }

    /**
     * Gets the value of the nroDocIdentidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDocIdentidad() {
        return nroDocIdentidad;
    }

    /**
     * Sets the value of the nroDocIdentidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDocIdentidad(String value) {
        this.nroDocIdentidad = value;
    }

    /**
     * Gets the value of the nroTelefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroTelefono() {
        return nroTelefono;
    }

    /**
     * Sets the value of the nroTelefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroTelefono(String value) {
        this.nroTelefono = value;
    }

    /**
     * Gets the value of the nroViaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroViaje() {
        return nroViaje;
    }

    /**
     * Sets the value of the nroViaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroViaje(String value) {
        this.nroViaje = value;
    }

    /**
     * Gets the value of the tipDocIdentMercosur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipDocIdentMercosur() {
        return tipDocIdentMercosur;
    }

    /**
     * Sets the value of the tipDocIdentMercosur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipDocIdentMercosur(String value) {
        this.tipDocIdentMercosur = value;
    }

    /**
     * Gets the value of the tipTrans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipTrans() {
        return tipTrans;
    }

    /**
     * Sets the value of the tipTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipTrans(String value) {
        this.tipTrans = value;
    }

    /**
     * Gets the value of the tipoAgente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAgente() {
        return tipoAgente;
    }

    /**
     * Sets the value of the tipoAgente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAgente(String value) {
        this.tipoAgente = value;
    }

    /**
     * Gets the value of the tipoViaTransp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoViaTransp() {
        return tipoViaTransp;
    }

    /**
     * Sets the value of the tipoViaTransp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoViaTransp(String value) {
        this.tipoViaTransp = value;
    }

}
