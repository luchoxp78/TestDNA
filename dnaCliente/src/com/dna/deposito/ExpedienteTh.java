
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for expedienteTh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="expedienteTh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "expedienteTh", propOrder = {
    "expediente",
    "autenticacion"
})
public class ExpedienteTh {

    protected String expediente;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the expediente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpediente() {
        return expediente;
    }

    /**
     * Sets the value of the expediente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpediente(String value) {
        this.expediente = value;
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
