
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarTransitosSqfResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarTransitosSqfResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://aduana.gov.py/webservices}transitoRespuestaConsultaSqf" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarTransitosSqfResponse", propOrder = {
    "_return"
})
public class ConsultarTransitosSqfResponse {

    @XmlElement(name = "return")
    protected TransitoRespuestaConsultaSqf _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link TransitoRespuestaConsultaSqf }
     *     
     */
    public TransitoRespuestaConsultaSqf getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitoRespuestaConsultaSqf }
     *     
     */
    public void setReturn(TransitoRespuestaConsultaSqf value) {
        this._return = value;
    }

}
