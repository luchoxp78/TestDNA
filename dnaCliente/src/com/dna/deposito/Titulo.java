
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for titulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="titulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bultos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kilos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mercaderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "titulo", propOrder = {
    "bultos",
    "conocimiento",
    "consignatario",
    "imut",
    "kilos",
    "mercaderia",
    "moneda",
    "valorFactura"
})
public class Titulo {

    protected String bultos;
    protected String conocimiento;
    protected String consignatario;
    protected String imut;
    protected String kilos;
    protected String mercaderia;
    protected String moneda;
    protected String valorFactura;

    /**
     * Gets the value of the bultos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBultos() {
        return bultos;
    }

    /**
     * Sets the value of the bultos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBultos(String value) {
        this.bultos = value;
    }

    /**
     * Gets the value of the conocimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConocimiento() {
        return conocimiento;
    }

    /**
     * Sets the value of the conocimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConocimiento(String value) {
        this.conocimiento = value;
    }

    /**
     * Gets the value of the consignatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignatario() {
        return consignatario;
    }

    /**
     * Sets the value of the consignatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignatario(String value) {
        this.consignatario = value;
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
     * Gets the value of the kilos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKilos() {
        return kilos;
    }

    /**
     * Sets the value of the kilos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKilos(String value) {
        this.kilos = value;
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
     * Gets the value of the moneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Gets the value of the valorFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorFactura() {
        return valorFactura;
    }

    /**
     * Sets the value of the valorFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorFactura(String value) {
        this.valorFactura = value;
    }

}
