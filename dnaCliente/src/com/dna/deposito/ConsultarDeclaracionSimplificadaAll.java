
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarDeclaracionSimplificadaAll complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarDeclaracionSimplificadaAll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDeclaracionSimplificada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "consultarDeclaracionSimplificadaAll", propOrder = {
    "idDeclaracionSimplificada",
    "autenticacion"
})
public class ConsultarDeclaracionSimplificadaAll {

    protected String idDeclaracionSimplificada;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the idDeclaracionSimplificada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDeclaracionSimplificada() {
        return idDeclaracionSimplificada;
    }

    /**
     * Sets the value of the idDeclaracionSimplificada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDeclaracionSimplificada(String value) {
        this.idDeclaracionSimplificada = value;
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
