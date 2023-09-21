
package com.dna.deposito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ingresoRemiEfcRegistrar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ingresoRemiEfcRegistrar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nroTimbrado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notaRemision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucExportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="declaracionnes" type="{http://aduana.gov.py/webservices}declaracionEfc" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ingresoRemiEfcRegistrar", propOrder = {
    "nroTimbrado",
    "notaRemision",
    "fechaIngreso",
    "rucExportador",
    "declaracionnes",
    "autenticacion"
})
public class IngresoRemiEfcRegistrar {

    protected String nroTimbrado;
    protected String notaRemision;
    protected String fechaIngreso;
    protected String rucExportador;
    protected List<DeclaracionEfc> declaracionnes;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the nroTimbrado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroTimbrado() {
        return nroTimbrado;
    }

    /**
     * Sets the value of the nroTimbrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroTimbrado(String value) {
        this.nroTimbrado = value;
    }

    /**
     * Gets the value of the notaRemision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaRemision() {
        return notaRemision;
    }

    /**
     * Sets the value of the notaRemision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaRemision(String value) {
        this.notaRemision = value;
    }

    /**
     * Gets the value of the fechaIngreso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Sets the value of the fechaIngreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIngreso(String value) {
        this.fechaIngreso = value;
    }

    /**
     * Gets the value of the rucExportador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucExportador() {
        return rucExportador;
    }

    /**
     * Sets the value of the rucExportador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucExportador(String value) {
        this.rucExportador = value;
    }

    /**
     * Gets the value of the declaracionnes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declaracionnes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclaracionnes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeclaracionEfc }
     * 
     * 
     */
    public List<DeclaracionEfc> getDeclaracionnes() {
        if (declaracionnes == null) {
            declaracionnes = new ArrayList<DeclaracionEfc>();
        }
        return this.declaracionnes;
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
