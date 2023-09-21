
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarListaDecSimplLight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarListaDecSimplLight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaIni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autenticacion" type="{http://aduana.gov.py/webservices}autenticacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarListaDecSimplLight", propOrder = {
    "fechaIni",
    "fechaFin",
    "ruc",
    "autenticacion"
})
public class ConsultarListaDecSimplLight {

    protected String fechaIni;
    protected String fechaFin;
    protected String ruc;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the fechaIni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIni() {
        return fechaIni;
    }

    /**
     * Sets the value of the fechaIni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIni(String value) {
        this.fechaIni = value;
    }

    /**
     * Gets the value of the fechaFin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * Sets the value of the fechaFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFin(String value) {
        this.fechaFin = value;
    }

    /**
     * Gets the value of the ruc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Sets the value of the ruc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuc(String value) {
        this.ruc = value;
    }

    /**
     * Gets the value of the autenticacion property.
     * 
     * @return
     *     possible object is
     *     {@link Autenticacion }
     *     
     */
    public Autenticacion getAutenticacion() {
        return autenticacion;
    }

    /**
     * Sets the value of the autenticacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Autenticacion }
     *     
     */
    public void setAutenticacion(Autenticacion value) {
        this.autenticacion = value;
    }

}
