
package com.dna.deposito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiViaje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiViaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bascula" type="{http://aduana.gov.py/webservices}taiInfoBascula" minOccurs="0"/>
 *         &lt;element name="contenedores" type="{http://aduana.gov.py/webservices}taiContenedor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="empresaTransporte" type="{http://aduana.gov.py/webservices}taiPersona" minOccurs="0"/>
 *         &lt;element name="estadoViaje" type="{http://aduana.gov.py/webservices}infoRefOpc" minOccurs="0"/>
 *         &lt;element name="fechaAlta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroViaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rutaInformatica" type="{http://aduana.gov.py/webservices}taiRutaInfor" minOccurs="0"/>
 *         &lt;element name="terrestre" type="{http://aduana.gov.py/webservices}taiDtaTerrestre" minOccurs="0"/>
 *         &lt;element name="titulos" type="{http://aduana.gov.py/webservices}taiTitTrans" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="validarEscaneo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="webService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taiViaje", propOrder = {
    "bascula",
    "contenedores",
    "empresaTransporte",
    "estadoViaje",
    "fechaAlta",
    "nroViaje",
    "rutaInformatica",
    "terrestre",
    "titulos",
    "validarEscaneo",
    "webService"
})
public class TaiViaje {

    protected TaiInfoBascula bascula;
    @XmlElement(nillable = true)
    protected List<TaiContenedor> contenedores;
    protected TaiPersona empresaTransporte;
    protected InfoRefOpc estadoViaje;
    protected String fechaAlta;
    protected String nroViaje;
    protected TaiRutaInfor rutaInformatica;
    protected TaiDtaTerrestre terrestre;
    @XmlElement(nillable = true)
    protected List<TaiTitTrans> titulos;
    protected Boolean validarEscaneo;
    protected Boolean webService;

    /**
     * Gets the value of the bascula property.
     * 
     * @return
     *     possible object is
     *     {@link TaiInfoBascula }
     *     
     */
    public TaiInfoBascula getBascula() {
        return bascula;
    }

    /**
     * Sets the value of the bascula property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaiInfoBascula }
     *     
     */
    public void setBascula(TaiInfoBascula value) {
        this.bascula = value;
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
     * {@link TaiContenedor }
     * 
     * 
     */
    public List<TaiContenedor> getContenedores() {
        if (contenedores == null) {
            contenedores = new ArrayList<TaiContenedor>();
        }
        return this.contenedores;
    }

    /**
     * Gets the value of the empresaTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link TaiPersona }
     *     
     */
    public TaiPersona getEmpresaTransporte() {
        return empresaTransporte;
    }

    /**
     * Sets the value of the empresaTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaiPersona }
     *     
     */
    public void setEmpresaTransporte(TaiPersona value) {
        this.empresaTransporte = value;
    }

    /**
     * Gets the value of the estadoViaje property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRefOpc }
     *     
     */
    public InfoRefOpc getEstadoViaje() {
        return estadoViaje;
    }

    /**
     * Sets the value of the estadoViaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRefOpc }
     *     
     */
    public void setEstadoViaje(InfoRefOpc value) {
        this.estadoViaje = value;
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
     * Gets the value of the nroViaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroViaje() {
        return nroViaje;
    }

    /**
     * Sets the value of the nroViaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroViaje(String value) {
        this.nroViaje = value;
    }

    /**
     * Gets the value of the rutaInformatica property.
     * 
     * @return
     *     possible object is
     *     {@link TaiRutaInfor }
     *     
     */
    public TaiRutaInfor getRutaInformatica() {
        return rutaInformatica;
    }

    /**
     * Sets the value of the rutaInformatica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaiRutaInfor }
     *     
     */
    public void setRutaInformatica(TaiRutaInfor value) {
        this.rutaInformatica = value;
    }

    /**
     * Gets the value of the terrestre property.
     * 
     * @return
     *     possible object is
     *     {@link TaiDtaTerrestre }
     *     
     */
    public TaiDtaTerrestre getTerrestre() {
        return terrestre;
    }

    /**
     * Sets the value of the terrestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaiDtaTerrestre }
     *     
     */
    public void setTerrestre(TaiDtaTerrestre value) {
        this.terrestre = value;
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
     * {@link TaiTitTrans }
     * 
     * 
     */
    public List<TaiTitTrans> getTitulos() {
        if (titulos == null) {
            titulos = new ArrayList<TaiTitTrans>();
        }
        return this.titulos;
    }

    /**
     * Gets the value of the validarEscaneo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidarEscaneo() {
        return validarEscaneo;
    }

    /**
     * Sets the value of the validarEscaneo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidarEscaneo(Boolean value) {
        this.validarEscaneo = value;
    }

    /**
     * Gets the value of the webService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWebService() {
        return webService;
    }

    /**
     * Sets the value of the webService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebService(Boolean value) {
        this.webService = value;
    }

}
