
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for manifiesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manifiesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aduanaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aduanaDescripcionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aduanaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="advertencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agenteDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contenedoresVacios" type="{http://aduana.gov.py/webservices}manifiestoContenedor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="desconsolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaArribo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPresentacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indDesconsolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indDesglosado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indFraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiestoMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medioTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medioTransporteDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroMani1raFrac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroManiMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroTransito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTituloMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisProcedenciaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisTransportista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisTransportistaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoMadesDesg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoTituloMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucAgente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipRgd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulos" type="{http://aduana.gov.py/webservices}manifiestoTitulo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manifiesto", propOrder = {
    "aduana",
    "aduanaDescripcion",
    "aduanaDescripcionDestino",
    "aduanaDestino",
    "advertencia",
    "agenteDescripcion",
    "buque",
    "contenedoresVacios",
    "desconsolidado",
    "estado",
    "estadoDescripcion",
    "fechaArribo",
    "fechaPresentacion",
    "fechaRegistro",
    "indDesconsolidado",
    "indDesglosado",
    "indFraccionado",
    "manifiesto",
    "manifiestoMadre",
    "medioTransporte",
    "medioTransporteDescripcion",
    "nroMani1RaFrac",
    "nroManiMadre",
    "nroTransito",
    "numeroTituloMadre",
    "observacion",
    "paisProcedencia",
    "paisProcedenciaDescripcion",
    "paisTransportista",
    "paisTransportistaDescripcion",
    "prefijoMadesDesg",
    "prefijoMadre",
    "prefijoTituloMadre",
    "rucAgente",
    "tipRgd",
    "tituloMadre",
    "titulos",
    "transito",
    "transportista"
})
public class Manifiesto {

    protected String aduana;
    protected String aduanaDescripcion;
    protected String aduanaDescripcionDestino;
    protected String aduanaDestino;
    protected String advertencia;
    protected String agenteDescripcion;
    protected String buque;
    @XmlElement(nillable = true)
    protected List<ManifiestoContenedor> contenedoresVacios;
    protected String desconsolidado;
    protected String estado;
    protected String estadoDescripcion;
    protected String fechaArribo;
    protected String fechaPresentacion;
    protected String fechaRegistro;
    protected String indDesconsolidado;
    protected String indDesglosado;
    protected String indFraccionado;
    protected String manifiesto;
    protected String manifiestoMadre;
    protected String medioTransporte;
    protected String medioTransporteDescripcion;
    @XmlElement(name = "nroMani1raFrac")
    protected String nroMani1RaFrac;
    protected String nroManiMadre;
    protected String nroTransito;
    protected String numeroTituloMadre;
    protected String observacion;
    protected String paisProcedencia;
    protected String paisProcedenciaDescripcion;
    protected String paisTransportista;
    protected String paisTransportistaDescripcion;
    protected String prefijoMadesDesg;
    protected String prefijoMadre;
    protected String prefijoTituloMadre;
    protected String rucAgente;
    protected String tipRgd;
    protected String tituloMadre;
    @XmlElement(nillable = true)
    protected List<ManifiestoTitulo> titulos;
    protected String transito;
    protected String transportista;

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
     * Gets the value of the aduanaDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduanaDescripcion() {
        return aduanaDescripcion;
    }

    /**
     * Sets the value of the aduanaDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduanaDescripcion(String value) {
        this.aduanaDescripcion = value;
    }

    /**
     * Gets the value of the aduanaDescripcionDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduanaDescripcionDestino() {
        return aduanaDescripcionDestino;
    }

    /**
     * Sets the value of the aduanaDescripcionDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduanaDescripcionDestino(String value) {
        this.aduanaDescripcionDestino = value;
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
     * Gets the value of the advertencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertencia() {
        return advertencia;
    }

    /**
     * Sets the value of the advertencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertencia(String value) {
        this.advertencia = value;
    }

    /**
     * Gets the value of the agenteDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenteDescripcion() {
        return agenteDescripcion;
    }

    /**
     * Sets the value of the agenteDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenteDescripcion(String value) {
        this.agenteDescripcion = value;
    }

    /**
     * Gets the value of the buque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuque() {
        return buque;
    }

    /**
     * Sets the value of the buque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuque(String value) {
        this.buque = value;
    }

    /**
     * Gets the value of the contenedoresVacios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenedoresVacios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenedoresVacios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManifiestoContenedor }
     * 
     * 
     */
    public List<ManifiestoContenedor> getContenedoresVacios() {
        if (contenedoresVacios == null) {
            contenedoresVacios = new ArrayList<ManifiestoContenedor>();
        }
        return this.contenedoresVacios;
    }

    /**
     * Gets the value of the desconsolidado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesconsolidado() {
        return desconsolidado;
    }

    /**
     * Sets the value of the desconsolidado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesconsolidado(String value) {
        this.desconsolidado = value;
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
     * Gets the value of the fechaPresentacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPresentacion() {
        return fechaPresentacion;
    }

    /**
     * Sets the value of the fechaPresentacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPresentacion(String value) {
        this.fechaPresentacion = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegistro(String value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the indDesconsolidado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndDesconsolidado() {
        return indDesconsolidado;
    }

    /**
     * Sets the value of the indDesconsolidado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndDesconsolidado(String value) {
        this.indDesconsolidado = value;
    }

    /**
     * Gets the value of the indDesglosado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndDesglosado() {
        return indDesglosado;
    }

    /**
     * Sets the value of the indDesglosado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndDesglosado(String value) {
        this.indDesglosado = value;
    }

    /**
     * Gets the value of the indFraccionado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndFraccionado() {
        return indFraccionado;
    }

    /**
     * Sets the value of the indFraccionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndFraccionado(String value) {
        this.indFraccionado = value;
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
     * Gets the value of the manifiestoMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifiestoMadre() {
        return manifiestoMadre;
    }

    /**
     * Sets the value of the manifiestoMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifiestoMadre(String value) {
        this.manifiestoMadre = value;
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
     * Gets the value of the medioTransporteDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioTransporteDescripcion() {
        return medioTransporteDescripcion;
    }

    /**
     * Sets the value of the medioTransporteDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioTransporteDescripcion(String value) {
        this.medioTransporteDescripcion = value;
    }

    /**
     * Gets the value of the nroMani1RaFrac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroMani1RaFrac() {
        return nroMani1RaFrac;
    }

    /**
     * Sets the value of the nroMani1RaFrac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroMani1RaFrac(String value) {
        this.nroMani1RaFrac = value;
    }

    /**
     * Gets the value of the nroManiMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroManiMadre() {
        return nroManiMadre;
    }

    /**
     * Sets the value of the nroManiMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroManiMadre(String value) {
        this.nroManiMadre = value;
    }

    /**
     * Gets the value of the nroTransito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroTransito() {
        return nroTransito;
    }

    /**
     * Sets the value of the nroTransito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroTransito(String value) {
        this.nroTransito = value;
    }

    /**
     * Gets the value of the numeroTituloMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTituloMadre() {
        return numeroTituloMadre;
    }

    /**
     * Sets the value of the numeroTituloMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTituloMadre(String value) {
        this.numeroTituloMadre = value;
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
     * Gets the value of the paisProcedencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    /**
     * Sets the value of the paisProcedencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisProcedencia(String value) {
        this.paisProcedencia = value;
    }

    /**
     * Gets the value of the paisProcedenciaDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisProcedenciaDescripcion() {
        return paisProcedenciaDescripcion;
    }

    /**
     * Sets the value of the paisProcedenciaDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisProcedenciaDescripcion(String value) {
        this.paisProcedenciaDescripcion = value;
    }

    /**
     * Gets the value of the paisTransportista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisTransportista() {
        return paisTransportista;
    }

    /**
     * Sets the value of the paisTransportista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisTransportista(String value) {
        this.paisTransportista = value;
    }

    /**
     * Gets the value of the paisTransportistaDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisTransportistaDescripcion() {
        return paisTransportistaDescripcion;
    }

    /**
     * Sets the value of the paisTransportistaDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisTransportistaDescripcion(String value) {
        this.paisTransportistaDescripcion = value;
    }

    /**
     * Gets the value of the prefijoMadesDesg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoMadesDesg() {
        return prefijoMadesDesg;
    }

    /**
     * Sets the value of the prefijoMadesDesg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoMadesDesg(String value) {
        this.prefijoMadesDesg = value;
    }

    /**
     * Gets the value of the prefijoMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoMadre() {
        return prefijoMadre;
    }

    /**
     * Sets the value of the prefijoMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoMadre(String value) {
        this.prefijoMadre = value;
    }

    /**
     * Gets the value of the prefijoTituloMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoTituloMadre() {
        return prefijoTituloMadre;
    }

    /**
     * Sets the value of the prefijoTituloMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoTituloMadre(String value) {
        this.prefijoTituloMadre = value;
    }

    /**
     * Gets the value of the rucAgente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucAgente() {
        return rucAgente;
    }

    /**
     * Sets the value of the rucAgente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucAgente(String value) {
        this.rucAgente = value;
    }

    /**
     * Gets the value of the tipRgd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipRgd() {
        return tipRgd;
    }

    /**
     * Sets the value of the tipRgd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipRgd(String value) {
        this.tipRgd = value;
    }

    /**
     * Gets the value of the tituloMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloMadre() {
        return tituloMadre;
    }

    /**
     * Sets the value of the tituloMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloMadre(String value) {
        this.tituloMadre = value;
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
     * {@link ManifiestoTitulo }
     * 
     * 
     */
    public List<ManifiestoTitulo> getTitulos() {
        if (titulos == null) {
            titulos = new ArrayList<ManifiestoTitulo>();
        }
        return this.titulos;
    }

    /**
     * Gets the value of the transito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransito() {
        return transito;
    }

    /**
     * Sets the value of the transito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransito(String value) {
        this.transito = value;
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

}
