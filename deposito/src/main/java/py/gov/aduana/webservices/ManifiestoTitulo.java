
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for manifiestoTitulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manifiestoTitulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="articulos" type="{http://aduana.gov.py/webservices}manifiestoArticulo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contenedores" type="{http://aduana.gov.py/webservices}manifiestoContenedor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="desglosado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despachoAutomatico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinacionManual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCierreIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hijosDesconsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorCierreDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="justificacionFaltante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiestoPrimeraFraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marcaBulto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculas" type="{http://aduana.gov.py/webservices}manifiestoMICDTA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notificarA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroExpedienteManual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoDesglose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucImpor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transitoTrasbordo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manifiestoTitulo", propOrder = {
    "articulos",
    "comentario",
    "consolidado",
    "contenedores",
    "desglosado",
    "despacho",
    "despachoAutomatico",
    "destinacionManual",
    "destinatario",
    "estado",
    "fechaCierreIngreso",
    "fraccionado",
    "hijosDesconsol",
    "indicadorCierreDeposito",
    "justificacionFaltante",
    "manifiestoPrimeraFraccion",
    "marcaBulto",
    "matriculas",
    "notificarA",
    "nroExpedienteManual",
    "numeroTitulo",
    "prefijoDesglose",
    "prefijoTitulo",
    "rucImpor",
    "transitoTrasbordo"
})
public class ManifiestoTitulo {

    @XmlElement(nillable = true)
    protected List<ManifiestoArticulo> articulos;
    protected String comentario;
    protected String consolidado;
    @XmlElement(nillable = true)
    protected List<ManifiestoContenedor> contenedores;
    protected String desglosado;
    protected String despacho;
    protected String despachoAutomatico;
    protected String destinacionManual;
    protected String destinatario;
    protected String estado;
    protected String fechaCierreIngreso;
    protected String fraccionado;
    protected String hijosDesconsol;
    protected String indicadorCierreDeposito;
    protected String justificacionFaltante;
    protected String manifiestoPrimeraFraccion;
    protected String marcaBulto;
    @XmlElement(nillable = true)
    protected List<ManifiestoMICDTA> matriculas;
    protected String notificarA;
    protected String nroExpedienteManual;
    protected String numeroTitulo;
    protected String prefijoDesglose;
    protected String prefijoTitulo;
    protected String rucImpor;
    protected String transitoTrasbordo;

    /**
     * Gets the value of the articulos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articulos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticulos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManifiestoArticulo }
     * 
     * 
     */
    public List<ManifiestoArticulo> getArticulos() {
        if (articulos == null) {
            articulos = new ArrayList<ManifiestoArticulo>();
        }
        return this.articulos;
    }

    /**
     * Gets the value of the comentario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Sets the value of the comentario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

    /**
     * Gets the value of the consolidado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsolidado() {
        return consolidado;
    }

    /**
     * Sets the value of the consolidado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsolidado(String value) {
        this.consolidado = value;
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
     * {@link ManifiestoContenedor }
     * 
     * 
     */
    public List<ManifiestoContenedor> getContenedores() {
        if (contenedores == null) {
            contenedores = new ArrayList<ManifiestoContenedor>();
        }
        return this.contenedores;
    }

    /**
     * Gets the value of the desglosado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesglosado() {
        return desglosado;
    }

    /**
     * Sets the value of the desglosado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesglosado(String value) {
        this.desglosado = value;
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
     * Gets the value of the despachoAutomatico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespachoAutomatico() {
        return despachoAutomatico;
    }

    /**
     * Sets the value of the despachoAutomatico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespachoAutomatico(String value) {
        this.despachoAutomatico = value;
    }

    /**
     * Gets the value of the destinacionManual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinacionManual() {
        return destinacionManual;
    }

    /**
     * Sets the value of the destinacionManual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinacionManual(String value) {
        this.destinacionManual = value;
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
     * Gets the value of the fechaCierreIngreso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCierreIngreso() {
        return fechaCierreIngreso;
    }

    /**
     * Sets the value of the fechaCierreIngreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCierreIngreso(String value) {
        this.fechaCierreIngreso = value;
    }

    /**
     * Gets the value of the fraccionado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraccionado() {
        return fraccionado;
    }

    /**
     * Sets the value of the fraccionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraccionado(String value) {
        this.fraccionado = value;
    }

    /**
     * Gets the value of the hijosDesconsol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHijosDesconsol() {
        return hijosDesconsol;
    }

    /**
     * Sets the value of the hijosDesconsol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHijosDesconsol(String value) {
        this.hijosDesconsol = value;
    }

    /**
     * Gets the value of the indicadorCierreDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorCierreDeposito() {
        return indicadorCierreDeposito;
    }

    /**
     * Sets the value of the indicadorCierreDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorCierreDeposito(String value) {
        this.indicadorCierreDeposito = value;
    }

    /**
     * Gets the value of the justificacionFaltante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificacionFaltante() {
        return justificacionFaltante;
    }

    /**
     * Sets the value of the justificacionFaltante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificacionFaltante(String value) {
        this.justificacionFaltante = value;
    }

    /**
     * Gets the value of the manifiestoPrimeraFraccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifiestoPrimeraFraccion() {
        return manifiestoPrimeraFraccion;
    }

    /**
     * Sets the value of the manifiestoPrimeraFraccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifiestoPrimeraFraccion(String value) {
        this.manifiestoPrimeraFraccion = value;
    }

    /**
     * Gets the value of the marcaBulto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaBulto() {
        return marcaBulto;
    }

    /**
     * Sets the value of the marcaBulto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaBulto(String value) {
        this.marcaBulto = value;
    }

    /**
     * Gets the value of the matriculas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matriculas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatriculas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManifiestoMICDTA }
     * 
     * 
     */
    public List<ManifiestoMICDTA> getMatriculas() {
        if (matriculas == null) {
            matriculas = new ArrayList<ManifiestoMICDTA>();
        }
        return this.matriculas;
    }

    /**
     * Gets the value of the notificarA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificarA() {
        return notificarA;
    }

    /**
     * Sets the value of the notificarA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificarA(String value) {
        this.notificarA = value;
    }

    /**
     * Gets the value of the nroExpedienteManual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroExpedienteManual() {
        return nroExpedienteManual;
    }

    /**
     * Sets the value of the nroExpedienteManual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroExpedienteManual(String value) {
        this.nroExpedienteManual = value;
    }

    /**
     * Gets the value of the numeroTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTitulo() {
        return numeroTitulo;
    }

    /**
     * Sets the value of the numeroTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTitulo(String value) {
        this.numeroTitulo = value;
    }

    /**
     * Gets the value of the prefijoDesglose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoDesglose() {
        return prefijoDesglose;
    }

    /**
     * Sets the value of the prefijoDesglose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoDesglose(String value) {
        this.prefijoDesglose = value;
    }

    /**
     * Gets the value of the prefijoTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoTitulo() {
        return prefijoTitulo;
    }

    /**
     * Sets the value of the prefijoTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoTitulo(String value) {
        this.prefijoTitulo = value;
    }

    /**
     * Gets the value of the rucImpor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucImpor() {
        return rucImpor;
    }

    /**
     * Sets the value of the rucImpor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucImpor(String value) {
        this.rucImpor = value;
    }

    /**
     * Gets the value of the transitoTrasbordo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitoTrasbordo() {
        return transitoTrasbordo;
    }

    /**
     * Sets the value of the transitoTrasbordo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitoTrasbordo(String value) {
        this.transitoTrasbordo = value;
    }

}
