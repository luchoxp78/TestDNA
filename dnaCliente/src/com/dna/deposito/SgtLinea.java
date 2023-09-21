
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sgtLinea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sgtLinea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantParcial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMercaderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "sgtLinea", propOrder = {
    "cantParcial",
    "cantTotal",
    "descMercaderia",
    "pesoParcial",
    "pesoTotal"
})
public class SgtLinea {

    protected String cantParcial;
    protected String cantTotal;
    protected String descMercaderia;
    protected String pesoParcial;
    protected String pesoTotal;

    /**
     * Gets the value of the cantParcial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantParcial() {
        return cantParcial;
    }

    /**
     * Sets the value of the cantParcial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantParcial(String value) {
        this.cantParcial = value;
    }

    /**
     * Gets the value of the cantTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantTotal() {
        return cantTotal;
    }

    /**
     * Sets the value of the cantTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantTotal(String value) {
        this.cantTotal = value;
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
