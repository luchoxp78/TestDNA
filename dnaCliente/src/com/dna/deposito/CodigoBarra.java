
package com.dna.deposito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for codigoBarra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="codigoBarra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bultos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carreta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contenedores" type="{http://aduana.gov.py/webservices}contenedor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cubitaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventos" type="{http://aduana.gov.py/webservices}evento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fechaEstado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kilos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medidaContenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mercaderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="micDta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroContenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroPrecinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulos" type="{http://aduana.gov.py/webservices}titulo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transportista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codigoBarra", propOrder = {
    "aduana",
    "bultos",
    "carreta",
    "codEstado",
    "codUsuario",
    "conocimiento",
    "consignatario",
    "contenedores",
    "cubitaje",
    "despacho",
    "eventos",
    "fechaEstado",
    "fechaOperacion",
    "imut",
    "kilos",
    "manifiesto",
    "matricula",
    "medidaContenedor",
    "mercaderia",
    "micDta",
    "moneda",
    "nroContenedor",
    "nroPrecinto",
    "origen",
    "patente",
    "tipoOperacion",
    "titulos",
    "transportista",
    "valorFactura"
})
public class CodigoBarra {

    protected String aduana;
    protected String bultos;
    protected String carreta;
    protected String codEstado;
    protected String codUsuario;
    protected String conocimiento;
    protected String consignatario;
    @XmlElement(nillable = true)
    protected List<Contenedor> contenedores;
    protected String cubitaje;
    protected String despacho;
    @XmlElement(nillable = true)
    protected List<Evento> eventos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEstado;
    protected String fechaOperacion;
    protected String imut;
    protected String kilos;
    protected String manifiesto;
    protected String matricula;
    protected String medidaContenedor;
    protected String mercaderia;
    protected String micDta;
    protected String moneda;
    protected String nroContenedor;
    protected String nroPrecinto;
    protected String origen;
    protected String patente;
    protected String tipoOperacion;
    @XmlElement(nillable = true)
    protected List<Titulo> titulos;
    protected String transportista;
    protected String valorFactura;

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
     * Gets the value of the bultos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBultos() {
        return bultos;
    }

    /**
     * Sets the value of the bultos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBultos(String value) {
        this.bultos = value;
    }

    /**
     * Gets the value of the carreta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarreta() {
        return carreta;
    }

    /**
     * Sets the value of the carreta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarreta(String value) {
        this.carreta = value;
    }

    /**
     * Gets the value of the codEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstado() {
        return codEstado;
    }

    /**
     * Sets the value of the codEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstado(String value) {
        this.codEstado = value;
    }

    /**
     * Gets the value of the codUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsuario() {
        return codUsuario;
    }

    /**
     * Sets the value of the codUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsuario(String value) {
        this.codUsuario = value;
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
     * Gets the value of the contenedores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenedores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenedores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contenedor }
     * 
     * 
     */
    public List<Contenedor> getContenedores() {
        if (contenedores == null) {
            contenedores = new ArrayList<Contenedor>();
        }
        return this.contenedores;
    }

    /**
     * Gets the value of the cubitaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubitaje() {
        return cubitaje;
    }

    /**
     * Sets the value of the cubitaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubitaje(String value) {
        this.cubitaje = value;
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
     * Gets the value of the eventos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Evento }
     * 
     * 
     */
    public List<Evento> getEventos() {
        if (eventos == null) {
            eventos = new ArrayList<Evento>();
        }
        return this.eventos;
    }

    /**
     * Gets the value of the fechaEstado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEstado() {
        return fechaEstado;
    }

    /**
     * Sets the value of the fechaEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEstado(XMLGregorianCalendar value) {
        this.fechaEstado = value;
    }

    /**
     * Gets the value of the fechaOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Sets the value of the fechaOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOperacion(String value) {
        this.fechaOperacion = value;
    }

    /**
     * Gets the value of the imut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImut() {
        return imut;
    }

    /**
     * Sets the value of the imut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImut(String value) {
        this.imut = value;
    }

    /**
     * Gets the value of the kilos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKilos() {
        return kilos;
    }

    /**
     * Sets the value of the kilos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKilos(String value) {
        this.kilos = value;
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
     * Gets the value of the medidaContenedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedidaContenedor() {
        return medidaContenedor;
    }

    /**
     * Sets the value of the medidaContenedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedidaContenedor(String value) {
        this.medidaContenedor = value;
    }

    /**
     * Gets the value of the mercaderia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercaderia() {
        return mercaderia;
    }

    /**
     * Sets the value of the mercaderia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercaderia(String value) {
        this.mercaderia = value;
    }

    /**
     * Gets the value of the micDta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicDta() {
        return micDta;
    }

    /**
     * Sets the value of the micDta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicDta(String value) {
        this.micDta = value;
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

    /**
     * Gets the value of the nroPrecinto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroPrecinto() {
        return nroPrecinto;
    }

    /**
     * Sets the value of the nroPrecinto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroPrecinto(String value) {
        this.nroPrecinto = value;
    }

    /**
     * Gets the value of the origen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the patente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Sets the value of the patente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatente(String value) {
        this.patente = value;
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
     * Gets the value of the titulos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titulos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitulos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Titulo }
     * 
     * 
     */
    public List<Titulo> getTitulos() {
        if (titulos == null) {
            titulos = new ArrayList<Titulo>();
        }
        return this.titulos;
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
     * Gets the value of the valorFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorFactura() {
        return valorFactura;
    }

    /**
     * Sets the value of the valorFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorFactura(String value) {
        this.valorFactura = value;
    }

}
