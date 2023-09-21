
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiInfoBascula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiInfoBascula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chapa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoTara" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioBascula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taiInfoBascula", propOrder = {
    "chapa",
    "nroInterno",
    "pesoBruto",
    "pesoTara",
    "responsable",
    "tipoCarga",
    "usuarioBascula"
})
public class TaiInfoBascula {

    protected String chapa;
    protected String nroInterno;
    protected String pesoBruto;
    protected String pesoTara;
    protected String responsable;
    protected String tipoCarga;
    protected String usuarioBascula;

    /**
     * Gets the value of the chapa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChapa() {
        return chapa;
    }

    /**
     * Sets the value of the chapa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapa(String value) {
        this.chapa = value;
    }

    /**
     * Gets the value of the nroInterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroInterno() {
        return nroInterno;
    }

    /**
     * Sets the value of the nroInterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroInterno(String value) {
        this.nroInterno = value;
    }

    /**
     * Gets the value of the pesoBruto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBruto() {
        return pesoBruto;
    }

    /**
     * Sets the value of the pesoBruto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBruto(String value) {
        this.pesoBruto = value;
    }

    /**
     * Gets the value of the pesoTara property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoTara() {
        return pesoTara;
    }

    /**
     * Sets the value of the pesoTara property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoTara(String value) {
        this.pesoTara = value;
    }

    /**
     * Gets the value of the responsable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsable() {
        return responsable;
    }

    /**
     * Sets the value of the responsable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsable(String value) {
        this.responsable = value;
    }

    /**
     * Gets the value of the tipoCarga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCarga() {
        return tipoCarga;
    }

    /**
     * Sets the value of the tipoCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCarga(String value) {
        this.tipoCarga = value;
    }

    /**
     * Gets the value of the usuarioBascula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioBascula() {
        return usuarioBascula;
    }

    /**
     * Sets the value of the usuarioBascula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioBascula(String value) {
        this.usuarioBascula = value;
    }

}
