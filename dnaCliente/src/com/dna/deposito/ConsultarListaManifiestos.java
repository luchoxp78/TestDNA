
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarListaManifiestos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarListaManifiestos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autenticacion" type="{http://aduana.gov.py/webservices}autenticacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarListaManifiestos", propOrder = {
    "numeroTitulo",
    "prefijoTitulo",
    "fechaDesde",
    "fechaHasta",
    "autenticacion"
})
public class ConsultarListaManifiestos {

    protected String numeroTitulo;
    protected String prefijoTitulo;
    protected String fechaDesde;
    protected String fechaHasta;
    protected Autenticacion autenticacion;

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
     * Gets the value of the fechaDesde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Sets the value of the fechaDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesde(String value) {
        this.fechaDesde = value;
    }

    /**
     * Gets the value of the fechaHasta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Sets the value of the fechaHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHasta(String value) {
        this.fechaHasta = value;
    }

    /**
     * Gets the value of the autenticacion property.
     * 
     * @return
     *     possible object is
     *     {@link Autenticacion }
     *     
     */
    public Autenticacion getAutenticacion() {
        return autenticacion;
    }

    /**
     * Sets the value of the autenticacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Autenticacion }
     *     
     */
    public void setAutenticacion(Autenticacion value) {
        this.autenticacion = value;
    }

}
