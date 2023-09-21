
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaIntervenciones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaIntervenciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filtroInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filtroFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filtroPuerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filtroAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filtroMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filtroPlaca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filtroIntervencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filtroConocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "consultaIntervenciones", propOrder = {
    "filtroInicio",
    "filtroFin",
    "filtroPuerto",
    "filtroAduana",
    "filtroMatricula",
    "filtroPlaca",
    "filtroIntervencion",
    "filtroConocimiento",
    "autenticacion"
})
public class ConsultaIntervenciones {

    protected String filtroInicio;
    protected String filtroFin;
    protected String filtroPuerto;
    protected String filtroAduana;
    protected String filtroMatricula;
    protected String filtroPlaca;
    protected String filtroIntervencion;
    protected String filtroConocimiento;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the filtroInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroInicio() {
        return filtroInicio;
    }

    /**
     * Sets the value of the filtroInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroInicio(String value) {
        this.filtroInicio = value;
    }

    /**
     * Gets the value of the filtroFin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroFin() {
        return filtroFin;
    }

    /**
     * Sets the value of the filtroFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroFin(String value) {
        this.filtroFin = value;
    }

    /**
     * Gets the value of the filtroPuerto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroPuerto() {
        return filtroPuerto;
    }

    /**
     * Sets the value of the filtroPuerto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroPuerto(String value) {
        this.filtroPuerto = value;
    }

    /**
     * Gets the value of the filtroAduana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroAduana() {
        return filtroAduana;
    }

    /**
     * Sets the value of the filtroAduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroAduana(String value) {
        this.filtroAduana = value;
    }

    /**
     * Gets the value of the filtroMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroMatricula() {
        return filtroMatricula;
    }

    /**
     * Sets the value of the filtroMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroMatricula(String value) {
        this.filtroMatricula = value;
    }

    /**
     * Gets the value of the filtroPlaca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroPlaca() {
        return filtroPlaca;
    }

    /**
     * Sets the value of the filtroPlaca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroPlaca(String value) {
        this.filtroPlaca = value;
    }

    /**
     * Gets the value of the filtroIntervencion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroIntervencion() {
        return filtroIntervencion;
    }

    /**
     * Sets the value of the filtroIntervencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroIntervencion(String value) {
        this.filtroIntervencion = value;
    }

    /**
     * Gets the value of the filtroConocimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroConocimiento() {
        return filtroConocimiento;
    }

    /**
     * Sets the value of the filtroConocimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroConocimiento(String value) {
        this.filtroConocimiento = value;
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
