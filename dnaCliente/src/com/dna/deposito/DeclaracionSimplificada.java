
package com.dna.deposito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for declaracionSimplificada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="declaracionSimplificada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="despachoSimplificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaOficia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="items" type="{http://aduana.gov.py/webservices}declaracionSimplificadaItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucRemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCantIng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalKiloBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPendientes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalSalItems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "declaracionSimplificada", propOrder = {
    "despachoSimplificado",
    "estado",
    "estadoDescripcion",
    "fechaOficia",
    "firma",
    "items",
    "manifiesto",
    "prefijo",
    "razonSocial",
    "rucRemesa",
    "tere",
    "tipoCambio",
    "tipoOperacion",
    "titulo",
    "totalCantIng",
    "totalKiloBruto",
    "totalPendientes",
    "totalSalItems"
})
public class DeclaracionSimplificada {

    protected String despachoSimplificado;
    protected String estado;
    protected String estadoDescripcion;
    protected String fechaOficia;
    protected String firma;
    @XmlElement(nillable = true)
    protected List<DeclaracionSimplificadaItem> items;
    protected String manifiesto;
    protected String prefijo;
    protected String razonSocial;
    protected String rucRemesa;
    protected String tere;
    protected String tipoCambio;
    protected String tipoOperacion;
    protected String titulo;
    protected String totalCantIng;
    protected String totalKiloBruto;
    protected String totalPendientes;
    protected String totalSalItems;

    /**
     * Gets the value of the despachoSimplificado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespachoSimplificado() {
        return despachoSimplificado;
    }

    /**
     * Sets the value of the despachoSimplificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespachoSimplificado(String value) {
        this.despachoSimplificado = value;
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
     * Gets the value of the estadoDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoDescripcion() {
        return estadoDescripcion;
    }

    /**
     * Sets the value of the estadoDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoDescripcion(String value) {
        this.estadoDescripcion = value;
    }

    /**
     * Gets the value of the fechaOficia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOficia() {
        return fechaOficia;
    }

    /**
     * Sets the value of the fechaOficia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOficia(String value) {
        this.fechaOficia = value;
    }

    /**
     * Gets the value of the firma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirma() {
        return firma;
    }

    /**
     * Sets the value of the firma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirma(String value) {
        this.firma = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeclaracionSimplificadaItem }
     * 
     * 
     */
    public List<DeclaracionSimplificadaItem> getItems() {
        if (items == null) {
            items = new ArrayList<DeclaracionSimplificadaItem>();
        }
        return this.items;
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
     * Gets the value of the prefijo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijo() {
        return prefijo;
    }

    /**
     * Sets the value of the prefijo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijo(String value) {
        this.prefijo = value;
    }

    /**
     * Gets the value of the razonSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the rucRemesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucRemesa() {
        return rucRemesa;
    }

    /**
     * Sets the value of the rucRemesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucRemesa(String value) {
        this.rucRemesa = value;
    }

    /**
     * Gets the value of the tere property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTere() {
        return tere;
    }

    /**
     * Sets the value of the tere property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTere(String value) {
        this.tere = value;
    }

    /**
     * Gets the value of the tipoCambio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Sets the value of the tipoCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCambio(String value) {
        this.tipoCambio = value;
    }

    /**
     * Gets the value of the tipoOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Sets the value of the tipoOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Gets the value of the titulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the totalCantIng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCantIng() {
        return totalCantIng;
    }

    /**
     * Sets the value of the totalCantIng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCantIng(String value) {
        this.totalCantIng = value;
    }

    /**
     * Gets the value of the totalKiloBruto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalKiloBruto() {
        return totalKiloBruto;
    }

    /**
     * Sets the value of the totalKiloBruto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalKiloBruto(String value) {
        this.totalKiloBruto = value;
    }

    /**
     * Gets the value of the totalPendientes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPendientes() {
        return totalPendientes;
    }

    /**
     * Sets the value of the totalPendientes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPendientes(String value) {
        this.totalPendientes = value;
    }

    /**
     * Gets the value of the totalSalItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalSalItems() {
        return totalSalItems;
    }

    /**
     * Sets the value of the totalSalItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalSalItems(String value) {
        this.totalSalItems = value;
    }

}
