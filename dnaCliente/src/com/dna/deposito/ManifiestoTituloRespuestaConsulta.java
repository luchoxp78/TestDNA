
package com.dna.deposito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for manifiestoTituloRespuestaConsulta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manifiestoTituloRespuestaConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contenedores" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="despacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despachoAutomatico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinacionManual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errores" type="{http://aduana.gov.py/webservices}retorno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="items" type="{http://aduana.gov.py/webservices}manifiestoArticulo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nroExpedienteManual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manifiestoTituloRespuestaConsulta", propOrder = {
    "contenedores",
    "despacho",
    "despachoAutomatico",
    "destinacionManual",
    "errores",
    "items",
    "nroExpedienteManual"
})
public class ManifiestoTituloRespuestaConsulta {

    @XmlElement(nillable = true)
    protected List<String> contenedores;
    protected String despacho;
    protected String despachoAutomatico;
    protected String destinacionManual;
    @XmlElement(nillable = true)
    protected List<Retorno> errores;
    @XmlElement(nillable = true)
    protected List<ManifiestoArticulo> items;
    protected String nroExpedienteManual;

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
     * {@link String }
     * 
     * 
     */
    public List<String> getContenedores() {
        if (contenedores == null) {
            contenedores = new ArrayList<String>();
        }
        return this.contenedores;
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
     * Gets the value of the errores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Retorno }
     * 
     * 
     */
    public List<Retorno> getErrores() {
        if (errores == null) {
            errores = new ArrayList<Retorno>();
        }
        return this.errores;
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
     * {@link ManifiestoArticulo }
     * 
     * 
     */
    public List<ManifiestoArticulo> getItems() {
        if (items == null) {
            items = new ArrayList<ManifiestoArticulo>();
        }
        return this.items;
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

}
