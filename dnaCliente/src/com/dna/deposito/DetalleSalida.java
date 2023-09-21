
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detalleSalida complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detalleSalida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadAegresar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoAegresar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleSalida", propOrder = {
    "cantidadAegresar",
    "codigoEmbalaje",
    "pesoAegresar"
})
public class DetalleSalida {

    protected String cantidadAegresar;
    protected String codigoEmbalaje;
    protected String pesoAegresar;

    /**
     * Gets the value of the cantidadAegresar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadAegresar() {
        return cantidadAegresar;
    }

    /**
     * Sets the value of the cantidadAegresar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadAegresar(String value) {
        this.cantidadAegresar = value;
    }

    /**
     * Gets the value of the codigoEmbalaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEmbalaje() {
        return codigoEmbalaje;
    }

    /**
     * Sets the value of the codigoEmbalaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEmbalaje(String value) {
        this.codigoEmbalaje = value;
    }

    /**
     * Gets the value of the pesoAegresar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoAegresar() {
        return pesoAegresar;
    }

    /**
     * Sets the value of the pesoAegresar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoAegresar(String value) {
        this.pesoAegresar = value;
    }

}
