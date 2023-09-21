
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarManifiestosPreviosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarManifiestosPreviosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://aduana.gov.py/webservices}manifiestosPreviosRespuestaConsulta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarManifiestosPreviosResponse", propOrder = {
    "_return"
})
public class ConsultarManifiestosPreviosResponse {

    @XmlElement(name = "return")
    protected ManifiestosPreviosRespuestaConsulta _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ManifiestosPreviosRespuestaConsulta }
     *     
     */
    public ManifiestosPreviosRespuestaConsulta getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifiestosPreviosRespuestaConsulta }
     *     
     */
    public void setReturn(ManifiestosPreviosRespuestaConsulta value) {
        this._return = value;
    }

}
