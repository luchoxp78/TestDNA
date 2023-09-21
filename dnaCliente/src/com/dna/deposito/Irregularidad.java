
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for irregularidad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="irregularidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="embalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idIrregularidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "irregularidad", propOrder = {
    "cantidad",
    "embalaje",
    "idIrregularidad",
    "peso"
})
public class Irregularidad {

    protected String cantidad;
    protected String embalaje;
    protected String idIrregularidad;
    protected String peso;

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
     * Gets the value of the idIrregularidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdIrregularidad() {
        return idIrregularidad;
    }

    /**
     * Sets the value of the idIrregularidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdIrregularidad(String value) {
        this.idIrregularidad = value;
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

}
