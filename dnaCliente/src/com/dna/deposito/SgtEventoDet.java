
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sgtEventoDet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sgtEventoDet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUsuarioCreacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEvento" type="{http://aduana.gov.py/webservices}infoRefOpc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sgtEventoDet", propOrder = {
    "descripcion",
    "fechaHora",
    "idUsuarioCreacion",
    "tipoEvento"
})
public class SgtEventoDet {

    protected String descripcion;
    protected String fechaHora;
    protected String idUsuarioCreacion;
    protected InfoRefOpc tipoEvento;

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the fechaHora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHora() {
        return fechaHora;
    }

    /**
     * Sets the value of the fechaHora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHora(String value) {
        this.fechaHora = value;
    }

    /**
     * Gets the value of the idUsuarioCreacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuarioCreacion() {
        return idUsuarioCreacion;
    }

    /**
     * Sets the value of the idUsuarioCreacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuarioCreacion(String value) {
        this.idUsuarioCreacion = value;
    }

    /**
     * Gets the value of the tipoEvento property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRefOpc }
     *     
     */
    public InfoRefOpc getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Sets the value of the tipoEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRefOpc }
     *     
     */
    public void setTipoEvento(InfoRefOpc value) {
        this.tipoEvento = value;
    }

}
