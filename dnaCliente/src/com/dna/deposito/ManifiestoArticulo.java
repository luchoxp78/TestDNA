
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for manifiestoArticulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manifiestoArticulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadEgresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadParcial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="embalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="embalajeDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturaleza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroBultos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroLinea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pendienteSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoParcial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEmbalajeDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trnLds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadMedidaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manifiestoArticulo", propOrder = {
    "cantidadDeposito",
    "cantidadEgresada",
    "cantidadParcial",
    "cantidadSalida",
    "cantidadTotal",
    "embalaje",
    "embalajeDescripcion",
    "naturaleza",
    "numeroBultos",
    "numeroLinea",
    "pendienteSalida",
    "pesoDeposito",
    "pesoParcial",
    "pesoTotal",
    "tipoEmbalaje",
    "tipoEmbalajeDescripcion",
    "trnLds",
    "unidadMedida",
    "unidadMedidaDescripcion"
})
public class ManifiestoArticulo {

    protected String cantidadDeposito;
    protected String cantidadEgresada;
    protected String cantidadParcial;
    protected String cantidadSalida;
    protected String cantidadTotal;
    protected String embalaje;
    protected String embalajeDescripcion;
    protected String naturaleza;
    protected String numeroBultos;
    protected String numeroLinea;
    protected String pendienteSalida;
    protected String pesoDeposito;
    protected String pesoParcial;
    protected String pesoTotal;
    protected String tipoEmbalaje;
    protected String tipoEmbalajeDescripcion;
    protected String trnLds;
    protected String unidadMedida;
    protected String unidadMedidaDescripcion;

    /**
     * Gets the value of the cantidadDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadDeposito() {
        return cantidadDeposito;
    }

    /**
     * Sets the value of the cantidadDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadDeposito(String value) {
        this.cantidadDeposito = value;
    }

    /**
     * Gets the value of the cantidadEgresada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadEgresada() {
        return cantidadEgresada;
    }

    /**
     * Sets the value of the cantidadEgresada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadEgresada(String value) {
        this.cantidadEgresada = value;
    }

    /**
     * Gets the value of the cantidadParcial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadParcial() {
        return cantidadParcial;
    }

    /**
     * Sets the value of the cantidadParcial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadParcial(String value) {
        this.cantidadParcial = value;
    }

    /**
     * Gets the value of the cantidadSalida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadSalida() {
        return cantidadSalida;
    }

    /**
     * Sets the value of the cantidadSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadSalida(String value) {
        this.cantidadSalida = value;
    }

    /**
     * Gets the value of the cantidadTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadTotal() {
        return cantidadTotal;
    }

    /**
     * Sets the value of the cantidadTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadTotal(String value) {
        this.cantidadTotal = value;
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
     * Gets the value of the embalajeDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbalajeDescripcion() {
        return embalajeDescripcion;
    }

    /**
     * Sets the value of the embalajeDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbalajeDescripcion(String value) {
        this.embalajeDescripcion = value;
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
     * Gets the value of the numeroBultos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBultos() {
        return numeroBultos;
    }

    /**
     * Sets the value of the numeroBultos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBultos(String value) {
        this.numeroBultos = value;
    }

    /**
     * Gets the value of the numeroLinea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLinea() {
        return numeroLinea;
    }

    /**
     * Sets the value of the numeroLinea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLinea(String value) {
        this.numeroLinea = value;
    }

    /**
     * Gets the value of the pendienteSalida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendienteSalida() {
        return pendienteSalida;
    }

    /**
     * Sets the value of the pendienteSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendienteSalida(String value) {
        this.pendienteSalida = value;
    }

    /**
     * Gets the value of the pesoDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoDeposito() {
        return pesoDeposito;
    }

    /**
     * Sets the value of the pesoDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoDeposito(String value) {
        this.pesoDeposito = value;
    }

    /**
     * Gets the value of the pesoParcial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoParcial() {
        return pesoParcial;
    }

    /**
     * Sets the value of the pesoParcial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoParcial(String value) {
        this.pesoParcial = value;
    }

    /**
     * Gets the value of the pesoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoTotal() {
        return pesoTotal;
    }

    /**
     * Sets the value of the pesoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoTotal(String value) {
        this.pesoTotal = value;
    }

    /**
     * Gets the value of the tipoEmbalaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    /**
     * Sets the value of the tipoEmbalaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmbalaje(String value) {
        this.tipoEmbalaje = value;
    }

    /**
     * Gets the value of the tipoEmbalajeDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmbalajeDescripcion() {
        return tipoEmbalajeDescripcion;
    }

    /**
     * Sets the value of the tipoEmbalajeDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmbalajeDescripcion(String value) {
        this.tipoEmbalajeDescripcion = value;
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

    /**
     * Gets the value of the unidadMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * Sets the value of the unidadMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadMedida(String value) {
        this.unidadMedida = value;
    }

    /**
     * Gets the value of the unidadMedidaDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadMedidaDescripcion() {
        return unidadMedidaDescripcion;
    }

    /**
     * Sets the value of the unidadMedidaDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadMedidaDescripcion(String value) {
        this.unidadMedidaDescripcion = value;
    }

}
