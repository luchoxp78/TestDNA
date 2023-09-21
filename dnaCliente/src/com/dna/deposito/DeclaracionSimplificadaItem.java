
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for declaracionSimplificadaItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="declaracionSimplificadaItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantIng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docExportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingresoDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kiloBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreConsig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroDocConsig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroManifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonExportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salidaDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocConsig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorImpNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "declaracionSimplificadaItem", propOrder = {
    "canal",
    "cantIng",
    "docExportador",
    "estado",
    "fechaIngreso",
    "fechaSalida",
    "ingresoDeposito",
    "kiloBruto",
    "moneda",
    "monedaDescripcion",
    "montoMoneda",
    "nombreConsig",
    "nroDocConsig",
    "nroGuia",
    "nroManifiesto",
    "numeroItem",
    "prefijoGuia",
    "razonExportador",
    "salidaDeposito",
    "tipoCambio",
    "tipoDocConsig",
    "valorImp",
    "valorImpNew"
})
public class DeclaracionSimplificadaItem {

    protected String canal;
    protected String cantIng;
    protected String docExportador;
    protected String estado;
    protected String fechaIngreso;
    protected String fechaSalida;
    protected String ingresoDeposito;
    protected String kiloBruto;
    protected String moneda;
    protected String monedaDescripcion;
    protected String montoMoneda;
    protected String nombreConsig;
    protected String nroDocConsig;
    protected String nroGuia;
    protected String nroManifiesto;
    protected String numeroItem;
    protected String prefijoGuia;
    protected String razonExportador;
    protected String salidaDeposito;
    protected String tipoCambio;
    protected String tipoDocConsig;
    protected String valorImp;
    protected String valorImpNew;

    /**
     * Gets the value of the canal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the cantIng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantIng() {
        return cantIng;
    }

    /**
     * Sets the value of the cantIng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantIng(String value) {
        this.cantIng = value;
    }

    /**
     * Gets the value of the docExportador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocExportador() {
        return docExportador;
    }

    /**
     * Sets the value of the docExportador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocExportador(String value) {
        this.docExportador = value;
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
     * Gets the value of the fechaIngreso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Sets the value of the fechaIngreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIngreso(String value) {
        this.fechaIngreso = value;
    }

    /**
     * Gets the value of the fechaSalida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Sets the value of the fechaSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSalida(String value) {
        this.fechaSalida = value;
    }

    /**
     * Gets the value of the ingresoDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngresoDeposito() {
        return ingresoDeposito;
    }

    /**
     * Sets the value of the ingresoDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngresoDeposito(String value) {
        this.ingresoDeposito = value;
    }

    /**
     * Gets the value of the kiloBruto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKiloBruto() {
        return kiloBruto;
    }

    /**
     * Sets the value of the kiloBruto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKiloBruto(String value) {
        this.kiloBruto = value;
    }

    /**
     * Gets the value of the moneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Gets the value of the monedaDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaDescripcion() {
        return monedaDescripcion;
    }

    /**
     * Sets the value of the monedaDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaDescripcion(String value) {
        this.monedaDescripcion = value;
    }

    /**
     * Gets the value of the montoMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoMoneda() {
        return montoMoneda;
    }

    /**
     * Sets the value of the montoMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoMoneda(String value) {
        this.montoMoneda = value;
    }

    /**
     * Gets the value of the nombreConsig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreConsig() {
        return nombreConsig;
    }

    /**
     * Sets the value of the nombreConsig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreConsig(String value) {
        this.nombreConsig = value;
    }

    /**
     * Gets the value of the nroDocConsig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDocConsig() {
        return nroDocConsig;
    }

    /**
     * Sets the value of the nroDocConsig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDocConsig(String value) {
        this.nroDocConsig = value;
    }

    /**
     * Gets the value of the nroGuia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroGuia() {
        return nroGuia;
    }

    /**
     * Sets the value of the nroGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroGuia(String value) {
        this.nroGuia = value;
    }

    /**
     * Gets the value of the nroManifiesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroManifiesto() {
        return nroManifiesto;
    }

    /**
     * Sets the value of the nroManifiesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroManifiesto(String value) {
        this.nroManifiesto = value;
    }

    /**
     * Gets the value of the numeroItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroItem() {
        return numeroItem;
    }

    /**
     * Sets the value of the numeroItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroItem(String value) {
        this.numeroItem = value;
    }

    /**
     * Gets the value of the prefijoGuia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoGuia() {
        return prefijoGuia;
    }

    /**
     * Sets the value of the prefijoGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoGuia(String value) {
        this.prefijoGuia = value;
    }

    /**
     * Gets the value of the razonExportador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonExportador() {
        return razonExportador;
    }

    /**
     * Sets the value of the razonExportador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonExportador(String value) {
        this.razonExportador = value;
    }

    /**
     * Gets the value of the salidaDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalidaDeposito() {
        return salidaDeposito;
    }

    /**
     * Sets the value of the salidaDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalidaDeposito(String value) {
        this.salidaDeposito = value;
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
     * Gets the value of the tipoDocConsig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocConsig() {
        return tipoDocConsig;
    }

    /**
     * Sets the value of the tipoDocConsig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocConsig(String value) {
        this.tipoDocConsig = value;
    }

    /**
     * Gets the value of the valorImp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorImp() {
        return valorImp;
    }

    /**
     * Sets the value of the valorImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorImp(String value) {
        this.valorImp = value;
    }

    /**
     * Gets the value of the valorImpNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorImpNew() {
        return valorImpNew;
    }

    /**
     * Sets the value of the valorImpNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorImpNew(String value) {
        this.valorImpNew = value;
    }

}
