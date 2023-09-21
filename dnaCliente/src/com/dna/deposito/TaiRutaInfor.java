
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiRutaInfor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiRutaInfor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descRutaItinerario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalle" type="{http://aduana.gov.py/webservices}taiRutaInforDet" minOccurs="0"/>
 *         &lt;element name="nroViaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taiRutaInfor", propOrder = {
    "descRutaItinerario",
    "detalle",
    "nroViaje",
    "plazo"
})
public class TaiRutaInfor {

    protected String descRutaItinerario;
    protected TaiRutaInforDet detalle;
    protected String nroViaje;
    protected String plazo;

    /**
     * Gets the value of the descRutaItinerario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRutaItinerario() {
        return descRutaItinerario;
    }

    /**
     * Sets the value of the descRutaItinerario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRutaItinerario(String value) {
        this.descRutaItinerario = value;
    }

    /**
     * Gets the value of the detalle property.
     * 
     * @return
     *     possible object is
     *     {@link TaiRutaInforDet }
     *     
     */
    public TaiRutaInforDet getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaiRutaInforDet }
     *     
     */
    public void setDetalle(TaiRutaInforDet value) {
        this.detalle = value;
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
     * Gets the value of the plazo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazo() {
        return plazo;
    }

    /**
     * Sets the value of the plazo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazo(String value) {
        this.plazo = value;
    }

}
