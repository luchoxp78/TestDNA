
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for despacho complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="despacho">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecOficializado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaArribo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firmaDigital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fracciones" type="{http://aduana.gov.py/webservices}fraccion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="iddt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indFraccionadoIFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indImpExp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoList" type="{http://aduana.gov.py/webservices}despachoDatos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medioTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomImpoExpo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucDespachante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucImpoExpo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMaquila" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorFlete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorFob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorFobDol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorSeguro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "despacho", propOrder = {
    "bi",
    "despacho",
    "estado",
    "fecCancelacion",
    "fecOficializado",
    "fechaArribo",
    "firmaDigital",
    "fracciones",
    "iddt",
    "indFraccionadoIFC",
    "indImpExp",
    "infoList",
    "manifiesto",
    "medioTransporte",
    "nomImpoExpo",
    "prefijo",
    "rucDespachante",
    "rucImpoExpo",
    "tipoMaquila",
    "titulo",
    "valorFlete",
    "valorFob",
    "valorFobDol",
    "valorSeguro"
})
public class Despacho {

    protected String bi;
    protected String despacho;
    protected String estado;
    protected String fecCancelacion;
    protected String fecOficializado;
    protected String fechaArribo;
    protected String firmaDigital;
    @XmlElement(nillable = true)
    protected List<Fraccion> fracciones;
    protected String iddt;
    protected String indFraccionadoIFC;
    protected String indImpExp;
    @XmlElement(nillable = true)
    protected List<DespachoDatos> infoList;
    protected String manifiesto;
    protected String medioTransporte;
    protected String nomImpoExpo;
    protected String prefijo;
    protected String rucDespachante;
    protected String rucImpoExpo;
    protected String tipoMaquila;
    protected String titulo;
    protected String valorFlete;
    protected String valorFob;
    protected String valorFobDol;
    protected String valorSeguro;

    /**
     * Gets the value of the bi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBi() {
        return bi;
    }

    /**
     * Sets the value of the bi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBi(String value) {
        this.bi = value;
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
     * Gets the value of the fecCancelacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecCancelacion() {
        return fecCancelacion;
    }

    /**
     * Sets the value of the fecCancelacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecCancelacion(String value) {
        this.fecCancelacion = value;
    }

    /**
     * Gets the value of the fecOficializado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecOficializado() {
        return fecOficializado;
    }

    /**
     * Sets the value of the fecOficializado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecOficializado(String value) {
        this.fecOficializado = value;
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
     * Gets the value of the firmaDigital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmaDigital() {
        return firmaDigital;
    }

    /**
     * Sets the value of the firmaDigital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmaDigital(String value) {
        this.firmaDigital = value;
    }

    /**
     * Gets the value of the fracciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fracciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFracciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fraccion }
     * 
     * 
     */
    public List<Fraccion> getFracciones() {
        if (fracciones == null) {
            fracciones = new ArrayList<Fraccion>();
        }
        return this.fracciones;
    }

    /**
     * Gets the value of the iddt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIddt() {
        return iddt;
    }

    /**
     * Sets the value of the iddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIddt(String value) {
        this.iddt = value;
    }

    /**
     * Gets the value of the indFraccionadoIFC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndFraccionadoIFC() {
        return indFraccionadoIFC;
    }

    /**
     * Sets the value of the indFraccionadoIFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndFraccionadoIFC(String value) {
        this.indFraccionadoIFC = value;
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
     * Gets the value of the infoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DespachoDatos }
     * 
     * 
     */
    public List<DespachoDatos> getInfoList() {
        if (infoList == null) {
            infoList = new ArrayList<DespachoDatos>();
        }
        return this.infoList;
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
     * Gets the value of the medioTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioTransporte() {
        return medioTransporte;
    }

    /**
     * Sets the value of the medioTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioTransporte(String value) {
        this.medioTransporte = value;
    }

    /**
     * Gets the value of the nomImpoExpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomImpoExpo() {
        return nomImpoExpo;
    }

    /**
     * Sets the value of the nomImpoExpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomImpoExpo(String value) {
        this.nomImpoExpo = value;
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
     * Gets the value of the rucDespachante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucDespachante() {
        return rucDespachante;
    }

    /**
     * Sets the value of the rucDespachante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucDespachante(String value) {
        this.rucDespachante = value;
    }

    /**
     * Gets the value of the rucImpoExpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucImpoExpo() {
        return rucImpoExpo;
    }

    /**
     * Sets the value of the rucImpoExpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucImpoExpo(String value) {
        this.rucImpoExpo = value;
    }

    /**
     * Gets the value of the tipoMaquila property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMaquila() {
        return tipoMaquila;
    }

    /**
     * Sets the value of the tipoMaquila property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMaquila(String value) {
        this.tipoMaquila = value;
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
     * Gets the value of the valorFlete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorFlete() {
        return valorFlete;
    }

    /**
     * Sets the value of the valorFlete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorFlete(String value) {
        this.valorFlete = value;
    }

    /**
     * Gets the value of the valorFob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorFob() {
        return valorFob;
    }

    /**
     * Sets the value of the valorFob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorFob(String value) {
        this.valorFob = value;
    }

    /**
     * Gets the value of the valorFobDol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorFobDol() {
        return valorFobDol;
    }

    /**
     * Sets the value of the valorFobDol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorFobDol(String value) {
        this.valorFobDol = value;
    }

    /**
     * Gets the value of the valorSeguro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorSeguro() {
        return valorSeguro;
    }

    /**
     * Sets the value of the valorSeguro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorSeguro(String value) {
        this.valorSeguro = value;
    }

}
