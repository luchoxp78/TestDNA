
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for declaracion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="declaracion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despachante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despachanteDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despachoIdal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaOficia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fracciones" type="{http://aduana.gov.py/webservices}fraccion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="iddtinte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importadorDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indFraccionadoIFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="items" type="{http://aduana.gov.py/webservices}declaracionItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maniItems" type="{http://aduana.gov.py/webservices}manifiestoArticulo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisDesDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoImportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOperacionDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulosCancelados" type="{http://aduana.gov.py/webservices}manifiestoTituloCancelado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valorCotiz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorFlete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorFob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorFobLcom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorImpLcom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorImponible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "declaracion", propOrder = {
    "canal",
    "despachante",
    "despachanteDescripcion",
    "despacho",
    "despachoIdal",
    "estado",
    "fechaOficia",
    "fracciones",
    "iddtinte",
    "importador",
    "importadorDescripcion",
    "indFraccionadoIFC",
    "items",
    "maniItems",
    "manifiesto",
    "nroDoc",
    "paisDesDoc",
    "paisDoc",
    "prefijo",
    "tipDoc",
    "tipoImportador",
    "tipoOperacion",
    "tipoOperacionDescripcion",
    "titulo",
    "titulosCancelados",
    "valorCotiz",
    "valorFlete",
    "valorFob",
    "valorFobLcom",
    "valorImpLcom",
    "valorImponible",
    "valorSeguro"
})
@XmlSeeAlso({
    DeclaracionEfc.class
})
public class Declaracion {

    protected String canal;
    protected String despachante;
    protected String despachanteDescripcion;
    protected String despacho;
    @XmlElement(nillable = true)
    protected List<String> despachoIdal;
    protected String estado;
    protected String fechaOficia;
    @XmlElement(nillable = true)
    protected List<Fraccion> fracciones;
    protected String iddtinte;
    protected String importador;
    protected String importadorDescripcion;
    protected String indFraccionadoIFC;
    @XmlElement(nillable = true)
    protected List<DeclaracionItem> items;
    @XmlElement(nillable = true)
    protected List<ManifiestoArticulo> maniItems;
    protected String manifiesto;
    protected String nroDoc;
    protected String paisDesDoc;
    protected String paisDoc;
    protected String prefijo;
    protected String tipDoc;
    protected String tipoImportador;
    protected String tipoOperacion;
    protected String tipoOperacionDescripcion;
    protected String titulo;
    @XmlElement(nillable = true)
    protected List<ManifiestoTituloCancelado> titulosCancelados;
    protected String valorCotiz;
    protected String valorFlete;
    protected String valorFob;
    protected String valorFobLcom;
    protected String valorImpLcom;
    protected String valorImponible;
    protected String valorSeguro;

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
     * Gets the value of the despachante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespachante() {
        return despachante;
    }

    /**
     * Sets the value of the despachante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespachante(String value) {
        this.despachante = value;
    }

    /**
     * Gets the value of the despachanteDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespachanteDescripcion() {
        return despachanteDescripcion;
    }

    /**
     * Sets the value of the despachanteDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespachanteDescripcion(String value) {
        this.despachanteDescripcion = value;
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
     * Gets the value of the despachoIdal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despachoIdal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespachoIdal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDespachoIdal() {
        if (despachoIdal == null) {
            despachoIdal = new ArrayList<String>();
        }
        return this.despachoIdal;
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
     * Gets the value of the iddtinte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIddtinte() {
        return iddtinte;
    }

    /**
     * Sets the value of the iddtinte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIddtinte(String value) {
        this.iddtinte = value;
    }

    /**
     * Gets the value of the importador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportador() {
        return importador;
    }

    /**
     * Sets the value of the importador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportador(String value) {
        this.importador = value;
    }

    /**
     * Gets the value of the importadorDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportadorDescripcion() {
        return importadorDescripcion;
    }

    /**
     * Sets the value of the importadorDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportadorDescripcion(String value) {
        this.importadorDescripcion = value;
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
     * {@link DeclaracionItem }
     * 
     * 
     */
    public List<DeclaracionItem> getItems() {
        if (items == null) {
            items = new ArrayList<DeclaracionItem>();
        }
        return this.items;
    }

    /**
     * Gets the value of the maniItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maniItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManiItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManifiestoArticulo }
     * 
     * 
     */
    public List<ManifiestoArticulo> getManiItems() {
        if (maniItems == null) {
            maniItems = new ArrayList<ManifiestoArticulo>();
        }
        return this.maniItems;
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
     * Gets the value of the nroDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDoc() {
        return nroDoc;
    }

    /**
     * Sets the value of the nroDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDoc(String value) {
        this.nroDoc = value;
    }

    /**
     * Gets the value of the paisDesDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDesDoc() {
        return paisDesDoc;
    }

    /**
     * Sets the value of the paisDesDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDesDoc(String value) {
        this.paisDesDoc = value;
    }

    /**
     * Gets the value of the paisDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDoc() {
        return paisDoc;
    }

    /**
     * Sets the value of the paisDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDoc(String value) {
        this.paisDoc = value;
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
     * Gets the value of the tipDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipDoc() {
        return tipDoc;
    }

    /**
     * Sets the value of the tipDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipDoc(String value) {
        this.tipDoc = value;
    }

    /**
     * Gets the value of the tipoImportador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImportador() {
        return tipoImportador;
    }

    /**
     * Sets the value of the tipoImportador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImportador(String value) {
        this.tipoImportador = value;
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
     * Gets the value of the tipoOperacionDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacionDescripcion() {
        return tipoOperacionDescripcion;
    }

    /**
     * Sets the value of the tipoOperacionDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacionDescripcion(String value) {
        this.tipoOperacionDescripcion = value;
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
     * Gets the value of the titulosCancelados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titulosCancelados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitulosCancelados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManifiestoTituloCancelado }
     * 
     * 
     */
    public List<ManifiestoTituloCancelado> getTitulosCancelados() {
        if (titulosCancelados == null) {
            titulosCancelados = new ArrayList<ManifiestoTituloCancelado>();
        }
        return this.titulosCancelados;
    }

    /**
     * Gets the value of the valorCotiz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorCotiz() {
        return valorCotiz;
    }

    /**
     * Sets the value of the valorCotiz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorCotiz(String value) {
        this.valorCotiz = value;
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
     * Gets the value of the valorFobLcom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorFobLcom() {
        return valorFobLcom;
    }

    /**
     * Sets the value of the valorFobLcom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorFobLcom(String value) {
        this.valorFobLcom = value;
    }

    /**
     * Gets the value of the valorImpLcom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorImpLcom() {
        return valorImpLcom;
    }

    /**
     * Sets the value of the valorImpLcom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorImpLcom(String value) {
        this.valorImpLcom = value;
    }

    /**
     * Gets the value of the valorImponible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorImponible() {
        return valorImponible;
    }

    /**
     * Sets the value of the valorImponible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorImponible(String value) {
        this.valorImponible = value;
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
