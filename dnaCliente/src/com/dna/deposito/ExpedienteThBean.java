
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for expedienteThBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="expedienteThBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expedienteThBean", propOrder = {
    "clave",
    "estado",
    "nroExpediente",
    "valorTexto"
})
public class ExpedienteThBean {

    protected String clave;
    protected String estado;
    protected String nroExpediente;
    protected String valorTexto;

    /**
     * Gets the value of the clave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
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
     * Gets the value of the nroExpediente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroExpediente() {
        return nroExpediente;
    }

    /**
     * Sets the value of the nroExpediente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroExpediente(String value) {
        this.nroExpediente = value;
    }

    /**
     * Gets the value of the valorTexto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorTexto() {
        return valorTexto;
    }

    /**
     * Sets the value of the valorTexto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorTexto(String value) {
        this.valorTexto = value;
    }

}
