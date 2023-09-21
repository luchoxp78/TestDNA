
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for manifiestoPrevio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manifiestoPrevio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadGuiaDec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadGuiaEnv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCompania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desCompania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaArribo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaArriboReal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEnvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idVuelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tieneErrores" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vuelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manifiestoPrevio", propOrder = {
    "cantidadGuiaDec",
    "cantidadGuiaEnv",
    "codCompania",
    "desCompania",
    "estado",
    "fechaArribo",
    "fechaArriboReal",
    "fechaEnvio",
    "id",
    "idVuelo",
    "paisProcedencia",
    "tema",
    "tieneErrores",
    "vuelo"
})
public class ManifiestoPrevio {

    protected String cantidadGuiaDec;
    protected String cantidadGuiaEnv;
    protected String codCompania;
    protected String desCompania;
    protected String estado;
    protected String fechaArribo;
    protected String fechaArriboReal;
    protected String fechaEnvio;
    protected String id;
    protected String idVuelo;
    protected String paisProcedencia;
    protected String tema;
    protected String tieneErrores;
    protected String vuelo;

    /**
     * Gets the value of the cantidadGuiaDec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadGuiaDec() {
        return cantidadGuiaDec;
    }

    /**
     * Sets the value of the cantidadGuiaDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadGuiaDec(String value) {
        this.cantidadGuiaDec = value;
    }

    /**
     * Gets the value of the cantidadGuiaEnv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadGuiaEnv() {
        return cantidadGuiaEnv;
    }

    /**
     * Sets the value of the cantidadGuiaEnv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadGuiaEnv(String value) {
        this.cantidadGuiaEnv = value;
    }

    /**
     * Gets the value of the codCompania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCompania() {
        return codCompania;
    }

    /**
     * Sets the value of the codCompania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCompania(String value) {
        this.codCompania = value;
    }

    /**
     * Gets the value of the desCompania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesCompania() {
        return desCompania;
    }

    /**
     * Sets the value of the desCompania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesCompania(String value) {
        this.desCompania = value;
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
     * Gets the value of the fechaArribo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaArribo() {
        return fechaArribo;
    }

    /**
     * Sets the value of the fechaArribo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaArribo(String value) {
        this.fechaArribo = value;
    }

    /**
     * Gets the value of the fechaArriboReal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaArriboReal() {
        return fechaArriboReal;
    }

    /**
     * Sets the value of the fechaArriboReal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaArriboReal(String value) {
        this.fechaArriboReal = value;
    }

    /**
     * Gets the value of the fechaEnvio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * Sets the value of the fechaEnvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEnvio(String value) {
        this.fechaEnvio = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idVuelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdVuelo() {
        return idVuelo;
    }

    /**
     * Sets the value of the idVuelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdVuelo(String value) {
        this.idVuelo = value;
    }

    /**
     * Gets the value of the paisProcedencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    /**
     * Sets the value of the paisProcedencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisProcedencia(String value) {
        this.paisProcedencia = value;
    }

    /**
     * Gets the value of the tema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTema() {
        return tema;
    }

    /**
     * Sets the value of the tema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTema(String value) {
        this.tema = value;
    }

    /**
     * Gets the value of the tieneErrores property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieneErrores() {
        return tieneErrores;
    }

    /**
     * Sets the value of the tieneErrores property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieneErrores(String value) {
        this.tieneErrores = value;
    }

    /**
     * Gets the value of the vuelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVuelo() {
        return vuelo;
    }

    /**
     * Sets the value of the vuelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVuelo(String value) {
        this.vuelo = value;
    }

}
