
package com.dna.deposito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guiasSinDespachoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guiasSinDespachoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://aduana.gov.py/webservices}retorno" minOccurs="0"/>
 *         &lt;element name="guias" type="{http://aduana.gov.py/webservices}tituloCouSinDespacho" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guiasSinDespachoResponse", propOrder = {
    "error",
    "guias"
})
public class GuiasSinDespachoResponse {

    protected Retorno error;
    @XmlElement(nillable = true)
    protected List<TituloCouSinDespacho> guias;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Retorno }
     *     
     */
    public Retorno getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Retorno }
     *     
     */
    public void setError(Retorno value) {
        this.error = value;
    }

    /**
     * Gets the value of the guias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TituloCouSinDespacho }
     * 
     * 
     */
    public List<TituloCouSinDespacho> getGuias() {
        if (guias == null) {
            guias = new ArrayList<TituloCouSinDespacho>();
        }
        return this.guias;
    }

}
