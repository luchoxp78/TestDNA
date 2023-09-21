
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for manifiestosTitulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manifiestosTitulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desUsuarioMani" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desglosado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hijosDesconsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorCierreDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="justificacionFaltante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maniDesconsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiestoPrimeraFraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marcaBulto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificarA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoDesconsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoDesglose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloDesconsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transitoTrasbordo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioMani" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manifiestosTitulo", propOrder = {
    "comentario",
    "consolidado",
    "desUsuarioMani",
    "desglosado",
    "destinatario",
    "estado",
    "fechaRegistro",
    "fraccionado",
    "hijosDesconsol",
    "indicadorCierreDeposito",
    "justificacionFaltante",
    "maniDesconsol",
    "manifiesto",
    "manifiestoPrimeraFraccion",
    "marcaBulto",
    "notificarA",
    "numeroTitulo",
    "prefijoDesconsol",
    "prefijoDesglose",
    "prefijoTitulo",
    "tituloDesconsol",
    "transitoTrasbordo",
    "usuarioMani"
})
public class ManifiestosTitulo {

    protected String comentario;
    protected String consolidado;
    protected String desUsuarioMani;
    protected String desglosado;
    protected String destinatario;
    protected String estado;
    protected String fechaRegistro;
    protected String fraccionado;
    protected String hijosDesconsol;
    protected String indicadorCierreDeposito;
    protected String justificacionFaltante;
    protected String maniDesconsol;
    protected String manifiesto;
    protected String manifiestoPrimeraFraccion;
    protected String marcaBulto;
    protected String notificarA;
    protected String numeroTitulo;
    protected String prefijoDesconsol;
    protected String prefijoDesglose;
    protected String prefijoTitulo;
    protected String tituloDesconsol;
    protected String transitoTrasbordo;
    protected String usuarioMani;

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
     * Gets the value of the desUsuarioMani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesUsuarioMani() {
        return desUsuarioMani;
    }

    /**
     * Sets the value of the desUsuarioMani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesUsuarioMani(String value) {
        this.desUsuarioMani = value;
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
     * Gets the value of the maniDesconsol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManiDesconsol() {
        return maniDesconsol;
    }

    /**
     * Sets the value of the maniDesconsol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManiDesconsol(String value) {
        this.maniDesconsol = value;
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
     * Gets the value of the prefijoDesconsol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoDesconsol() {
        return prefijoDesconsol;
    }

    /**
     * Sets the value of the prefijoDesconsol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoDesconsol(String value) {
        this.prefijoDesconsol = value;
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
     * Gets the value of the tituloDesconsol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloDesconsol() {
        return tituloDesconsol;
    }

    /**
     * Sets the value of the tituloDesconsol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloDesconsol(String value) {
        this.tituloDesconsol = value;
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

    /**
     * Gets the value of the usuarioMani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioMani() {
        return usuarioMani;
    }

    /**
     * Sets the value of the usuarioMani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioMani(String value) {
        this.usuarioMani = value;
    }

}
