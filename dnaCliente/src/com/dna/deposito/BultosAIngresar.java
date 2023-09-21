
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bultosAIngresar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bultosAIngresar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadAIngresar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="embalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoAIngresar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trnLds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bultosAIngresar", propOrder = {
    "cantidadAIngresar",
    "embalaje",
    "observacion",
    "pesoAIngresar",
    "trnLds"
})
public class BultosAIngresar {

    protected String cantidadAIngresar;
    protected String embalaje;
    protected String observacion;
    protected String pesoAIngresar;
    protected String trnLds;

    /**
     * Gets the value of the cantidadAIngresar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadAIngresar() {
        return cantidadAIngresar;
    }

    /**
     * Sets the value of the cantidadAIngresar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadAIngresar(String value) {
        this.cantidadAIngresar = value;
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
     * Gets the value of the observacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Sets the value of the observacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Gets the value of the pesoAIngresar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoAIngresar() {
        return pesoAIngresar;
    }

    /**
     * Sets the value of the pesoAIngresar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoAIngresar(String value) {
        this.pesoAIngresar = value;
    }

    /**
     * Gets the value of the trnLds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnLds() {
        return trnLds;
    }

    /**
     * Sets the value of the trnLds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnLds(String value) {
        this.trnLds = value;
    }

}
