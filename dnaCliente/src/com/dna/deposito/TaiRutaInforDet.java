
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiRutaInforDet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiRutaInforDet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aduanaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aduanaEntrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aduanaPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aduanaPaso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPrevistaLlegada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPaisPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPaisPaso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taiRutaInforDet", propOrder = {
    "aduanaDestino",
    "aduanaEntrada",
    "aduanaPartida",
    "aduanaPaso",
    "fechaPrevistaLlegada",
    "idPaisDestino",
    "idPaisPartida",
    "idPaisPaso"
})
public class TaiRutaInforDet {

    protected String aduanaDestino;
    protected String aduanaEntrada;
    protected String aduanaPartida;
    protected String aduanaPaso;
    protected String fechaPrevistaLlegada;
    protected String idPaisDestino;
    protected String idPaisPartida;
    protected String idPaisPaso;

    /**
     * Gets the value of the aduanaDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduanaDestino() {
        return aduanaDestino;
    }

    /**
     * Sets the value of the aduanaDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduanaDestino(String value) {
        this.aduanaDestino = value;
    }

    /**
     * Gets the value of the aduanaEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduanaEntrada() {
        return aduanaEntrada;
    }

    /**
     * Sets the value of the aduanaEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduanaEntrada(String value) {
        this.aduanaEntrada = value;
    }

    /**
     * Gets the value of the aduanaPartida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduanaPartida() {
        return aduanaPartida;
    }

    /**
     * Sets the value of the aduanaPartida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduanaPartida(String value) {
        this.aduanaPartida = value;
    }

    /**
     * Gets the value of the aduanaPaso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduanaPaso() {
        return aduanaPaso;
    }

    /**
     * Sets the value of the aduanaPaso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduanaPaso(String value) {
        this.aduanaPaso = value;
    }

    /**
     * Gets the value of the fechaPrevistaLlegada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPrevistaLlegada() {
        return fechaPrevistaLlegada;
    }

    /**
     * Sets the value of the fechaPrevistaLlegada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPrevistaLlegada(String value) {
        this.fechaPrevistaLlegada = value;
    }

    /**
     * Gets the value of the idPaisDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaisDestino() {
        return idPaisDestino;
    }

    /**
     * Sets the value of the idPaisDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaisDestino(String value) {
        this.idPaisDestino = value;
    }

    /**
     * Gets the value of the idPaisPartida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaisPartida() {
        return idPaisPartida;
    }

    /**
     * Sets the value of the idPaisPartida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaisPartida(String value) {
        this.idPaisPartida = value;
    }

    /**
     * Gets the value of the idPaisPaso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaisPaso() {
        return idPaisPaso;
    }

    /**
     * Sets the value of the idPaisPaso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaisPaso(String value) {
        this.idPaisPaso = value;
    }

}
