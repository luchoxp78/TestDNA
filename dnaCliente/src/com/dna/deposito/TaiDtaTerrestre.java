
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiDtaTerrestre complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiDtaTerrestre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="camion" type="{http://aduana.gov.py/webservices}taiModoTerrestre" minOccurs="0"/>
 *         &lt;element name="fechaAlta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroViaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propietario" type="{http://aduana.gov.py/webservices}taiPersona" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taiDtaTerrestre", propOrder = {
    "camion",
    "fechaAlta",
    "nroViaje",
    "propietario",
    "rut"
})
public class TaiDtaTerrestre {

    protected TaiModoTerrestre camion;
    protected String fechaAlta;
    protected String nroViaje;
    protected TaiPersona propietario;
    protected String rut;

    /**
     * Gets the value of the camion property.
     * 
     * @return
     *     possible object is
     *     {@link TaiModoTerrestre }
     *     
     */
    public TaiModoTerrestre getCamion() {
        return camion;
    }

    /**
     * Sets the value of the camion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaiModoTerrestre }
     *     
     */
    public void setCamion(TaiModoTerrestre value) {
        this.camion = value;
    }

    /**
     * Gets the value of the fechaAlta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAlta() {
        return fechaAlta;
    }

    /**
     * Sets the value of the fechaAlta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAlta(String value) {
        this.fechaAlta = value;
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
     * Gets the value of the propietario property.
     * 
     * @return
     *     possible object is
     *     {@link TaiPersona }
     *     
     */
    public TaiPersona getPropietario() {
        return propietario;
    }

    /**
     * Sets the value of the propietario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaiPersona }
     *     
     */
    public void setPropietario(TaiPersona value) {
        this.propietario = value;
    }

    /**
     * Gets the value of the rut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRut() {
        return rut;
    }

    /**
     * Sets the value of the rut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRut(String value) {
        this.rut = value;
    }

}
