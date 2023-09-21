
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guiaManifiestoPrevio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guiaManifiestoPrevio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignatarioEnviado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mercaderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucEnviado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guiaManifiestoPrevio", propOrder = {
    "cantidad",
    "consignatarioEnviado",
    "fraccionado",
    "guia",
    "mercaderia",
    "peso",
    "rucEnviado"
})
public class GuiaManifiestoPrevio {

    protected String cantidad;
    protected String consignatarioEnviado;
    protected String fraccionado;
    protected String guia;
    protected String mercaderia;
    protected String peso;
    protected String rucEnviado;

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
     * Gets the value of the consignatarioEnviado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignatarioEnviado() {
        return consignatarioEnviado;
    }

    /**
     * Sets the value of the consignatarioEnviado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignatarioEnviado(String value) {
        this.consignatarioEnviado = value;
    }

    /**
     * Gets the value of the fraccionado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraccionado() {
        return fraccionado;
    }

    /**
     * Sets the value of the fraccionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraccionado(String value) {
        this.fraccionado = value;
    }

    /**
     * Gets the value of the guia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuia() {
        return guia;
    }

    /**
     * Sets the value of the guia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuia(String value) {
        this.guia = value;
    }

    /**
     * Gets the value of the mercaderia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercaderia() {
        return mercaderia;
    }

    /**
     * Sets the value of the mercaderia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercaderia(String value) {
        this.mercaderia = value;
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
     * Gets the value of the rucEnviado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEnviado() {
        return rucEnviado;
    }

    /**
     * Sets the value of the rucEnviado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEnviado(String value) {
        this.rucEnviado = value;
    }

}
