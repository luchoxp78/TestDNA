
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for intervenciones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intervenciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aduanaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buqueFerrocarril" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadParcial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codNaturaleza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desNaturaleza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaArribo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medidaCont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturalezaMerc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoParcial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioHabilitado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intervenciones", propOrder = {
    "aduana",
    "aduanaDestino",
    "buqueFerrocarril",
    "cantidadParcial",
    "cantidadTotal",
    "codNaturaleza",
    "conocimiento",
    "consignatario",
    "delegacion",
    "desNaturaleza",
    "despacho",
    "destinatario",
    "fecha",
    "fechaArribo",
    "manifiesto",
    "matricula",
    "medidaCont",
    "medio",
    "naturalezaMerc",
    "numeroCont",
    "pesoParcial",
    "pesoTotal",
    "placa",
    "precinto",
    "prefijo",
    "tipoCont",
    "transportadora",
    "transportista",
    "usuarioHabilitado"
})
public class Intervenciones {

    protected String aduana;
    protected String aduanaDestino;
    protected String buqueFerrocarril;
    protected String cantidadParcial;
    protected String cantidadTotal;
    protected String codNaturaleza;
    protected String conocimiento;
    protected String consignatario;
    protected String delegacion;
    protected String desNaturaleza;
    protected String despacho;
    protected String destinatario;
    protected String fecha;
    protected String fechaArribo;
    protected String manifiesto;
    protected String matricula;
    protected String medidaCont;
    protected String medio;
    protected String naturalezaMerc;
    protected String numeroCont;
    protected String pesoParcial;
    protected String pesoTotal;
    protected String placa;
    protected String precinto;
    protected String prefijo;
    protected String tipoCont;
    protected String transportadora;
    protected String transportista;
    protected String usuarioHabilitado;

    /**
     * Gets the value of the aduana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduana() {
        return aduana;
    }

    /**
     * Sets the value of the aduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduana(String value) {
        this.aduana = value;
    }

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
     * Gets the value of the buqueFerrocarril property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuqueFerrocarril() {
        return buqueFerrocarril;
    }

    /**
     * Sets the value of the buqueFerrocarril property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuqueFerrocarril(String value) {
        this.buqueFerrocarril = value;
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
     * Gets the value of the codNaturaleza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodNaturaleza() {
        return codNaturaleza;
    }

    /**
     * Sets the value of the codNaturaleza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodNaturaleza(String value) {
        this.codNaturaleza = value;
    }

    /**
     * Gets the value of the conocimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConocimiento() {
        return conocimiento;
    }

    /**
     * Sets the value of the conocimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConocimiento(String value) {
        this.conocimiento = value;
    }

    /**
     * Gets the value of the consignatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignatario() {
        return consignatario;
    }

    /**
     * Sets the value of the consignatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignatario(String value) {
        this.consignatario = value;
    }

    /**
     * Gets the value of the delegacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegacion() {
        return delegacion;
    }

    /**
     * Sets the value of the delegacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegacion(String value) {
        this.delegacion = value;
    }

    /**
     * Gets the value of the desNaturaleza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesNaturaleza() {
        return desNaturaleza;
    }

    /**
     * Sets the value of the desNaturaleza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesNaturaleza(String value) {
        this.desNaturaleza = value;
    }

    /**
     * Gets the value of the despacho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespacho() {
        return despacho;
    }

    /**
     * Sets the value of the despacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespacho(String value) {
        this.despacho = value;
    }

    /**
     * Gets the value of the destinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * Sets the value of the destinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatario(String value) {
        this.destinatario = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
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
     * Gets the value of the matricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Gets the value of the medidaCont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedidaCont() {
        return medidaCont;
    }

    /**
     * Sets the value of the medidaCont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedidaCont(String value) {
        this.medidaCont = value;
    }

    /**
     * Gets the value of the medio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedio() {
        return medio;
    }

    /**
     * Sets the value of the medio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedio(String value) {
        this.medio = value;
    }

    /**
     * Gets the value of the naturalezaMerc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalezaMerc() {
        return naturalezaMerc;
    }

    /**
     * Sets the value of the naturalezaMerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalezaMerc(String value) {
        this.naturalezaMerc = value;
    }

    /**
     * Gets the value of the numeroCont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCont() {
        return numeroCont;
    }

    /**
     * Sets the value of the numeroCont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCont(String value) {
        this.numeroCont = value;
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
     * Gets the value of the placa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Sets the value of the placa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Gets the value of the precinto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecinto() {
        return precinto;
    }

    /**
     * Sets the value of the precinto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecinto(String value) {
        this.precinto = value;
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
     * Gets the value of the tipoCont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCont() {
        return tipoCont;
    }

    /**
     * Sets the value of the tipoCont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCont(String value) {
        this.tipoCont = value;
    }

    /**
     * Gets the value of the transportadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportadora() {
        return transportadora;
    }

    /**
     * Sets the value of the transportadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportadora(String value) {
        this.transportadora = value;
    }

    /**
     * Gets the value of the transportista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportista() {
        return transportista;
    }

    /**
     * Sets the value of the transportista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportista(String value) {
        this.transportista = value;
    }

    /**
     * Gets the value of the usuarioHabilitado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioHabilitado() {
        return usuarioHabilitado;
    }

    /**
     * Sets the value of the usuarioHabilitado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioHabilitado(String value) {
        this.usuarioHabilitado = value;
    }

}
