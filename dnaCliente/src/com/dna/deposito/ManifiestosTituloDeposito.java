
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for manifiestosTituloDeposito complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manifiestosTituloDeposito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aduanaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aduanaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aduanaDestinoDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMedio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMedioDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaArribo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPresentacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indDesglosado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indFraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indTransito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiestoMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiestoMadreConsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiestoMadreDesglose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiestoPrimeraFraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreBuque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origenViaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisProcedenciaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisTransportista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisTransportistaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoMadreConsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonAgente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucAgente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloMadreConsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "manifiestosTituloDeposito", propOrder = {
    "aduana",
    "aduanaDescripcion",
    "aduanaDestino",
    "aduanaDestinoDescripcion",
    "codigoMedio",
    "codigoMedioDescripcion",
    "comentario",
    "consolidado",
    "estado",
    "estadoDescripcion",
    "fechaArribo",
    "fechaPresentacion",
    "fechaRegistro",
    "indDesglosado",
    "indFraccionado",
    "indTransito",
    "manifiesto",
    "manifiestoMadre",
    "manifiestoMadreConsol",
    "manifiestoMadreDesglose",
    "manifiestoPrimeraFraccion",
    "nombreBuque",
    "origenViaje",
    "paisProcedencia",
    "paisProcedenciaDescripcion",
    "paisTransportista",
    "paisTransportistaDescripcion",
    "prefijoMadre",
    "prefijoMadreConsol",
    "razonAgente",
    "rucAgente",
    "tituloMadre",
    "tituloMadreConsol",
    "transportista"
})
public class ManifiestosTituloDeposito {

    protected String aduana;
    protected String aduanaDescripcion;
    protected String aduanaDestino;
    protected String aduanaDestinoDescripcion;
    protected String codigoMedio;
    protected String codigoMedioDescripcion;
    protected String comentario;
    protected String consolidado;
    protected String estado;
    protected String estadoDescripcion;
    protected String fechaArribo;
    protected String fechaPresentacion;
    protected String fechaRegistro;
    protected String indDesglosado;
    protected String indFraccionado;
    protected String indTransito;
    protected String manifiesto;
    protected String manifiestoMadre;
    protected String manifiestoMadreConsol;
    protected String manifiestoMadreDesglose;
    protected String manifiestoPrimeraFraccion;
    protected String nombreBuque;
    protected String origenViaje;
    protected String paisProcedencia;
    protected String paisProcedenciaDescripcion;
    protected String paisTransportista;
    protected String paisTransportistaDescripcion;
    protected String prefijoMadre;
    protected String prefijoMadreConsol;
    protected String razonAgente;
    protected String rucAgente;
    protected String tituloMadre;
    protected String tituloMadreConsol;
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
     * Gets the value of the aduanaDestinoDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduanaDestinoDescripcion() {
        return aduanaDestinoDescripcion;
    }

    /**
     * Sets the value of the aduanaDestinoDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduanaDestinoDescripcion(String value) {
        this.aduanaDestinoDescripcion = value;
    }

    /**
     * Gets the value of the codigoMedio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMedio() {
        return codigoMedio;
    }

    /**
     * Sets the value of the codigoMedio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMedio(String value) {
        this.codigoMedio = value;
    }

    /**
     * Gets the value of the codigoMedioDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMedioDescripcion() {
        return codigoMedioDescripcion;
    }

    /**
     * Sets the value of the codigoMedioDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMedioDescripcion(String value) {
        this.codigoMedioDescripcion = value;
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
     * Gets the value of the indTransito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndTransito() {
        return indTransito;
    }

    /**
     * Sets the value of the indTransito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndTransito(String value) {
        this.indTransito = value;
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
     * Gets the value of the manifiestoMadreConsol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifiestoMadreConsol() {
        return manifiestoMadreConsol;
    }

    /**
     * Sets the value of the manifiestoMadreConsol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifiestoMadreConsol(String value) {
        this.manifiestoMadreConsol = value;
    }

    /**
     * Gets the value of the manifiestoMadreDesglose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifiestoMadreDesglose() {
        return manifiestoMadreDesglose;
    }

    /**
     * Sets the value of the manifiestoMadreDesglose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifiestoMadreDesglose(String value) {
        this.manifiestoMadreDesglose = value;
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
     * Gets the value of the nombreBuque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBuque() {
        return nombreBuque;
    }

    /**
     * Sets the value of the nombreBuque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBuque(String value) {
        this.nombreBuque = value;
    }

    /**
     * Gets the value of the origenViaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenViaje() {
        return origenViaje;
    }

    /**
     * Sets the value of the origenViaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenViaje(String value) {
        this.origenViaje = value;
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
     * Gets the value of the prefijoMadreConsol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoMadreConsol() {
        return prefijoMadreConsol;
    }

    /**
     * Sets the value of the prefijoMadreConsol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoMadreConsol(String value) {
        this.prefijoMadreConsol = value;
    }

    /**
     * Gets the value of the razonAgente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonAgente() {
        return razonAgente;
    }

    /**
     * Sets the value of the razonAgente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonAgente(String value) {
        this.razonAgente = value;
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
     * Gets the value of the tituloMadreConsol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloMadreConsol() {
        return tituloMadreConsol;
    }

    /**
     * Sets the value of the tituloMadreConsol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloMadreConsol(String value) {
        this.tituloMadreConsol = value;
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
