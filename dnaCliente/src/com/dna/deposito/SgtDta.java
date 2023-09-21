
package com.dna.deposito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sgtDta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sgtDta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aduanaDestino" type="{http://aduana.gov.py/webservices}sgtBur" minOccurs="0"/>
 *         &lt;element name="aduanaInicio" type="{http://aduana.gov.py/webservices}sgtBur" minOccurs="0"/>
 *         &lt;element name="aduanaOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aduanaPartida" type="{http://aduana.gov.py/webservices}sgtBur" minOccurs="0"/>
 *         &lt;element name="camionOriginal" type="{http://aduana.gov.py/webservices}sgtVehiculo" minOccurs="0"/>
 *         &lt;element name="cartasPorte" type="{http://aduana.gov.py/webservices}sgtCrt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cartasPorteComboy" type="{http://aduana.gov.py/webservices}sgtCrt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contenedores" type="{http://aduana.gov.py/webservices}sgtContenedor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descRutaInformatica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinoAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encarpado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://aduana.gov.py/webservices}infoRefOpc" minOccurs="0"/>
 *         &lt;element name="evento" type="{http://aduana.gov.py/webservices}sgtEvento" minOccurs="0"/>
 *         &lt;element name="fechaAlta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idEstado" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idUltimoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUsuarioCreacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indAcompa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indPrecinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingresoDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iniAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marcaLastre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="micdta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisDestino" type="{http://aduana.gov.py/webservices}sgtPay" minOccurs="0"/>
 *         &lt;element name="paisPartida" type="{http://aduana.gov.py/webservices}sgtPay" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siguienteEstado" type="{http://aduana.gov.py/webservices}sgtCircuitoDet" minOccurs="0"/>
 *         &lt;element name="sintiaS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTransito" type="{http://aduana.gov.py/webservices}infoRefOpc" minOccurs="0"/>
 *         &lt;element name="transportista" type="{http://aduana.gov.py/webservices}sgtPersona" minOccurs="0"/>
 *         &lt;element name="ultimaFechaHora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sgtDta", propOrder = {
    "aduanaDestino",
    "aduanaInicio",
    "aduanaOperacion",
    "aduanaPartida",
    "camionOriginal",
    "cartasPorte",
    "cartasPorteComboy",
    "contenedores",
    "descRutaInformatica",
    "destinoAduana",
    "encarpado",
    "estado",
    "evento",
    "fechaAlta",
    "id",
    "idEstado",
    "idUltimoUsuario",
    "idUsuarioCreacion",
    "indAcompa",
    "indPrecinto",
    "ingresoDeposito",
    "iniAduana",
    "marcaLastre",
    "micdta",
    "observacion",
    "paisDestino",
    "paisPartida",
    "rut",
    "siguienteEstado",
    "sintiaS",
    "tipoTransito",
    "transportista",
    "ultimaFechaHora"
})
public class SgtDta {

    protected SgtBur aduanaDestino;
    protected SgtBur aduanaInicio;
    protected String aduanaOperacion;
    protected SgtBur aduanaPartida;
    protected SgtVehiculo camionOriginal;
    @XmlElement(nillable = true)
    protected List<SgtCrt> cartasPorte;
    @XmlElement(nillable = true)
    protected List<SgtCrt> cartasPorteComboy;
    @XmlElement(nillable = true)
    protected List<SgtContenedor> contenedores;
    protected String descRutaInformatica;
    protected String destinoAduana;
    protected String encarpado;
    protected InfoRefOpc estado;
    protected SgtEvento evento;
    protected String fechaAlta;
    protected Long id;
    protected Long idEstado;
    protected String idUltimoUsuario;
    protected String idUsuarioCreacion;
    protected String indAcompa;
    protected String indPrecinto;
    protected String ingresoDeposito;
    protected String iniAduana;
    protected String marcaLastre;
    protected String micdta;
    protected String observacion;
    protected SgtPay paisDestino;
    protected SgtPay paisPartida;
    protected String rut;
    protected SgtCircuitoDet siguienteEstado;
    protected String sintiaS;
    protected InfoRefOpc tipoTransito;
    protected SgtPersona transportista;
    protected String ultimaFechaHora;

    /**
     * Gets the value of the aduanaDestino property.
     * 
     * @return
     *     possible object is
     *     {@link SgtBur }
     *     
     */
    public SgtBur getAduanaDestino() {
        return aduanaDestino;
    }

    /**
     * Sets the value of the aduanaDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtBur }
     *     
     */
    public void setAduanaDestino(SgtBur value) {
        this.aduanaDestino = value;
    }

    /**
     * Gets the value of the aduanaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link SgtBur }
     *     
     */
    public SgtBur getAduanaInicio() {
        return aduanaInicio;
    }

    /**
     * Sets the value of the aduanaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtBur }
     *     
     */
    public void setAduanaInicio(SgtBur value) {
        this.aduanaInicio = value;
    }

    /**
     * Gets the value of the aduanaOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduanaOperacion() {
        return aduanaOperacion;
    }

    /**
     * Sets the value of the aduanaOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduanaOperacion(String value) {
        this.aduanaOperacion = value;
    }

    /**
     * Gets the value of the aduanaPartida property.
     * 
     * @return
     *     possible object is
     *     {@link SgtBur }
     *     
     */
    public SgtBur getAduanaPartida() {
        return aduanaPartida;
    }

    /**
     * Sets the value of the aduanaPartida property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtBur }
     *     
     */
    public void setAduanaPartida(SgtBur value) {
        this.aduanaPartida = value;
    }

    /**
     * Gets the value of the camionOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link SgtVehiculo }
     *     
     */
    public SgtVehiculo getCamionOriginal() {
        return camionOriginal;
    }

    /**
     * Sets the value of the camionOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtVehiculo }
     *     
     */
    public void setCamionOriginal(SgtVehiculo value) {
        this.camionOriginal = value;
    }

    /**
     * Gets the value of the cartasPorte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartasPorte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartasPorte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SgtCrt }
     * 
     * 
     */
    public List<SgtCrt> getCartasPorte() {
        if (cartasPorte == null) {
            cartasPorte = new ArrayList<SgtCrt>();
        }
        return this.cartasPorte;
    }

    /**
     * Gets the value of the cartasPorteComboy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartasPorteComboy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartasPorteComboy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SgtCrt }
     * 
     * 
     */
    public List<SgtCrt> getCartasPorteComboy() {
        if (cartasPorteComboy == null) {
            cartasPorteComboy = new ArrayList<SgtCrt>();
        }
        return this.cartasPorteComboy;
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
     * {@link SgtContenedor }
     * 
     * 
     */
    public List<SgtContenedor> getContenedores() {
        if (contenedores == null) {
            contenedores = new ArrayList<SgtContenedor>();
        }
        return this.contenedores;
    }

    /**
     * Gets the value of the descRutaInformatica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRutaInformatica() {
        return descRutaInformatica;
    }

    /**
     * Sets the value of the descRutaInformatica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRutaInformatica(String value) {
        this.descRutaInformatica = value;
    }

    /**
     * Gets the value of the destinoAduana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoAduana() {
        return destinoAduana;
    }

    /**
     * Sets the value of the destinoAduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoAduana(String value) {
        this.destinoAduana = value;
    }

    /**
     * Gets the value of the encarpado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncarpado() {
        return encarpado;
    }

    /**
     * Sets the value of the encarpado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncarpado(String value) {
        this.encarpado = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRefOpc }
     *     
     */
    public InfoRefOpc getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRefOpc }
     *     
     */
    public void setEstado(InfoRefOpc value) {
        this.estado = value;
    }

    /**
     * Gets the value of the evento property.
     * 
     * @return
     *     possible object is
     *     {@link SgtEvento }
     *     
     */
    public SgtEvento getEvento() {
        return evento;
    }

    /**
     * Sets the value of the evento property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtEvento }
     *     
     */
    public void setEvento(SgtEvento value) {
        this.evento = value;
    }

    /**
     * Gets the value of the fechaAlta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAlta() {
        return fechaAlta;
    }

    /**
     * Sets the value of the fechaAlta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAlta(String value) {
        this.fechaAlta = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the idEstado property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEstado() {
        return idEstado;
    }

    /**
     * Sets the value of the idEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEstado(Long value) {
        this.idEstado = value;
    }

    /**
     * Gets the value of the idUltimoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUltimoUsuario() {
        return idUltimoUsuario;
    }

    /**
     * Sets the value of the idUltimoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUltimoUsuario(String value) {
        this.idUltimoUsuario = value;
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
     * Gets the value of the indAcompa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAcompa() {
        return indAcompa;
    }

    /**
     * Sets the value of the indAcompa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAcompa(String value) {
        this.indAcompa = value;
    }

    /**
     * Gets the value of the indPrecinto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndPrecinto() {
        return indPrecinto;
    }

    /**
     * Sets the value of the indPrecinto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndPrecinto(String value) {
        this.indPrecinto = value;
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
     * Gets the value of the iniAduana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIniAduana() {
        return iniAduana;
    }

    /**
     * Sets the value of the iniAduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIniAduana(String value) {
        this.iniAduana = value;
    }

    /**
     * Gets the value of the marcaLastre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaLastre() {
        return marcaLastre;
    }

    /**
     * Sets the value of the marcaLastre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaLastre(String value) {
        this.marcaLastre = value;
    }

    /**
     * Gets the value of the micdta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicdta() {
        return micdta;
    }

    /**
     * Sets the value of the micdta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicdta(String value) {
        this.micdta = value;
    }

    /**
     * Gets the value of the observacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Sets the value of the observacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Gets the value of the paisDestino property.
     * 
     * @return
     *     possible object is
     *     {@link SgtPay }
     *     
     */
    public SgtPay getPaisDestino() {
        return paisDestino;
    }

    /**
     * Sets the value of the paisDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtPay }
     *     
     */
    public void setPaisDestino(SgtPay value) {
        this.paisDestino = value;
    }

    /**
     * Gets the value of the paisPartida property.
     * 
     * @return
     *     possible object is
     *     {@link SgtPay }
     *     
     */
    public SgtPay getPaisPartida() {
        return paisPartida;
    }

    /**
     * Sets the value of the paisPartida property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtPay }
     *     
     */
    public void setPaisPartida(SgtPay value) {
        this.paisPartida = value;
    }

    /**
     * Gets the value of the rut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRut() {
        return rut;
    }

    /**
     * Sets the value of the rut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRut(String value) {
        this.rut = value;
    }

    /**
     * Gets the value of the siguienteEstado property.
     * 
     * @return
     *     possible object is
     *     {@link SgtCircuitoDet }
     *     
     */
    public SgtCircuitoDet getSiguienteEstado() {
        return siguienteEstado;
    }

    /**
     * Sets the value of the siguienteEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtCircuitoDet }
     *     
     */
    public void setSiguienteEstado(SgtCircuitoDet value) {
        this.siguienteEstado = value;
    }

    /**
     * Gets the value of the sintiaS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSintiaS() {
        return sintiaS;
    }

    /**
     * Sets the value of the sintiaS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSintiaS(String value) {
        this.sintiaS = value;
    }

    /**
     * Gets the value of the tipoTransito property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRefOpc }
     *     
     */
    public InfoRefOpc getTipoTransito() {
        return tipoTransito;
    }

    /**
     * Sets the value of the tipoTransito property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRefOpc }
     *     
     */
    public void setTipoTransito(InfoRefOpc value) {
        this.tipoTransito = value;
    }

    /**
     * Gets the value of the transportista property.
     * 
     * @return
     *     possible object is
     *     {@link SgtPersona }
     *     
     */
    public SgtPersona getTransportista() {
        return transportista;
    }

    /**
     * Sets the value of the transportista property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtPersona }
     *     
     */
    public void setTransportista(SgtPersona value) {
        this.transportista = value;
    }

    /**
     * Gets the value of the ultimaFechaHora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimaFechaHora() {
        return ultimaFechaHora;
    }

    /**
     * Sets the value of the ultimaFechaHora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimaFechaHora(String value) {
        this.ultimaFechaHora = value;
    }

}
