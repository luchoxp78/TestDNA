
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiContenedor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiContenedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accesorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadBultos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capacidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="condicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idRutDtaModo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroContenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taiContenedor", propOrder = {
    "accesorio",
    "cantidadBultos",
    "capacidad",
    "condicion",
    "idRutDtaModo",
    "idTipoContenedor",
    "medida",
    "nroContenedor"
})
public class TaiContenedor {

    protected String accesorio;
    protected String cantidadBultos;
    protected String capacidad;
    protected String condicion;
    protected String idRutDtaModo;
    protected String idTipoContenedor;
    protected String medida;
    protected String nroContenedor;

    /**
     * Gets the value of the accesorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccesorio() {
        return accesorio;
    }

    /**
     * Sets the value of the accesorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccesorio(String value) {
        this.accesorio = value;
    }

    /**
     * Gets the value of the cantidadBultos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadBultos() {
        return cantidadBultos;
    }

    /**
     * Sets the value of the cantidadBultos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadBultos(String value) {
        this.cantidadBultos = value;
    }

    /**
     * Gets the value of the capacidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapacidad() {
        return capacidad;
    }

    /**
     * Sets the value of the capacidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapacidad(String value) {
        this.capacidad = value;
    }

    /**
     * Gets the value of the condicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicion() {
        return condicion;
    }

    /**
     * Sets the value of the condicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicion(String value) {
        this.condicion = value;
    }

    /**
     * Gets the value of the idRutDtaModo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRutDtaModo() {
        return idRutDtaModo;
    }

    /**
     * Sets the value of the idRutDtaModo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRutDtaModo(String value) {
        this.idRutDtaModo = value;
    }

    /**
     * Gets the value of the idTipoContenedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTipoContenedor() {
        return idTipoContenedor;
    }

    /**
     * Sets the value of the idTipoContenedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTipoContenedor(String value) {
        this.idTipoContenedor = value;
    }

    /**
     * Gets the value of the medida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedida() {
        return medida;
    }

    /**
     * Sets the value of the medida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedida(String value) {
        this.medida = value;
    }

    /**
     * Gets the value of the nroContenedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroContenedor() {
        return nroContenedor;
    }

    /**
     * Sets the value of the nroContenedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroContenedor(String value) {
        this.nroContenedor = value;
    }

}
