
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarListaDeclaracionSimplResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarListaDeclaracionSimplResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://aduana.gov.py/webservices}declaracionSimplificadaListaRespuestaConsulta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarListaDeclaracionSimplResponse", propOrder = {
    "_return"
})
public class ConsultarListaDeclaracionSimplResponse {

    @XmlElement(name = "return")
    protected DeclaracionSimplificadaListaRespuestaConsulta _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaracionSimplificadaListaRespuestaConsulta }
     *     
     */
    public DeclaracionSimplificadaListaRespuestaConsulta getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaracionSimplificadaListaRespuestaConsulta }
     *     
     */
    public void setReturn(DeclaracionSimplificadaListaRespuestaConsulta value) {
        this._return = value;
    }

}
