
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bultoDeclarado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bultoDeclarado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantDecParcial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantDecTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantIngDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantSBFA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="embalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaArribo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indConsolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indDesglosado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indFraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indImpExp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insCierreDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturaleza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoDecParcial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoDecTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoIngDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoSBFA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bultoDeclarado", propOrder = {
    "cantDecParcial",
    "cantDecTotal",
    "cantIngDep",
    "cantSBFA",
    "embalaje",
    "estadoTitulo",
    "fechaArribo",
    "indConsolidado",
    "indDesglosado",
    "indFraccionado",
    "indImpExp",
    "insCierreDep",
    "manifiesto",
    "naturaleza",
    "pesoDecParcial",
    "pesoDecTotal",
    "pesoIngDep",
    "pesoSBFA"
})
public class BultoDeclarado {

    protected String cantDecParcial;
    protected String cantDecTotal;
    protected String cantIngDep;
    protected String cantSBFA;
    protected String embalaje;
    protected String estadoTitulo;
    protected String fechaArribo;
    protected String indConsolidado;
    protected String indDesglosado;
    protected String indFraccionado;
    protected String indImpExp;
    protected String insCierreDep;
    protected String manifiesto;
    protected String naturaleza;
    protected String pesoDecParcial;
    protected String pesoDecTotal;
    protected String pesoIngDep;
    protected String pesoSBFA;

    /**
     * Gets the value of the cantDecParcial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantDecParcial() {
        return cantDecParcial;
    }

    /**
     * Sets the value of the cantDecParcial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantDecParcial(String value) {
        this.cantDecParcial = value;
    }

    /**
     * Gets the value of the cantDecTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantDecTotal() {
        return cantDecTotal;
    }

    /**
     * Sets the value of the cantDecTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantDecTotal(String value) {
        this.cantDecTotal = value;
    }

    /**
     * Gets the value of the cantIngDep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantIngDep() {
        return cantIngDep;
    }

    /**
     * Sets the value of the cantIngDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantIngDep(String value) {
        this.cantIngDep = value;
    }

    /**
     * Gets the value of the cantSBFA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantSBFA() {
        return cantSBFA;
    }

    /**
     * Sets the value of the cantSBFA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantSBFA(String value) {
        this.cantSBFA = value;
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
     * Gets the value of the estadoTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoTitulo() {
        return estadoTitulo;
    }

    /**
     * Sets the value of the estadoTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoTitulo(String value) {
        this.estadoTitulo = value;
    }

    /**
     * Gets the value of the fechaArribo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaArribo() {
        return fechaArribo;
    }

    /**
     * Sets the value of the fechaArribo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaArribo(String value) {
        this.fechaArribo = value;
    }

    /**
     * Gets the value of the indConsolidado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndConsolidado() {
        return indConsolidado;
    }

    /**
     * Sets the value of the indConsolidado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndConsolidado(String value) {
        this.indConsolidado = value;
    }

    /**
     * Gets the value of the indDesglosado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndDesglosado() {
        return indDesglosado;
    }

    /**
     * Sets the value of the indDesglosado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndDesglosado(String value) {
        this.indDesglosado = value;
    }

    /**
     * Gets the value of the indFraccionado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndFraccionado() {
        return indFraccionado;
    }

    /**
     * Sets the value of the indFraccionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndFraccionado(String value) {
        this.indFraccionado = value;
    }

    /**
     * Gets the value of the indImpExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndImpExp() {
        return indImpExp;
    }

    /**
     * Sets the value of the indImpExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndImpExp(String value) {
        this.indImpExp = value;
    }

    /**
     * Gets the value of the insCierreDep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsCierreDep() {
        return insCierreDep;
    }

    /**
     * Sets the value of the insCierreDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsCierreDep(String value) {
        this.insCierreDep = value;
    }

    /**
     * Gets the value of the manifiesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifiesto() {
        return manifiesto;
    }

    /**
     * Sets the value of the manifiesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifiesto(String value) {
        this.manifiesto = value;
    }

    /**
     * Gets the value of the naturaleza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturaleza() {
        return naturaleza;
    }

    /**
     * Sets the value of the naturaleza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturaleza(String value) {
        this.naturaleza = value;
    }

    /**
     * Gets the value of the pesoDecParcial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoDecParcial() {
        return pesoDecParcial;
    }

    /**
     * Sets the value of the pesoDecParcial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoDecParcial(String value) {
        this.pesoDecParcial = value;
    }

    /**
     * Gets the value of the pesoDecTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoDecTotal() {
        return pesoDecTotal;
    }

    /**
     * Sets the value of the pesoDecTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoDecTotal(String value) {
        this.pesoDecTotal = value;
    }

    /**
     * Gets the value of the pesoIngDep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoIngDep() {
        return pesoIngDep;
    }

    /**
     * Sets the value of the pesoIngDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoIngDep(String value) {
        this.pesoIngDep = value;
    }

    /**
     * Gets the value of the pesoSBFA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoSBFA() {
        return pesoSBFA;
    }

    /**
     * Sets the value of the pesoSBFA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoSBFA(String value) {
        this.pesoSBFA = value;
    }

}
