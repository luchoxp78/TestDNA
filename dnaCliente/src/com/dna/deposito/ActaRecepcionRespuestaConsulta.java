
package com.dna.deposito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actaRecepcionRespuestaConsulta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actaRecepcionRespuestaConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errores" type="{http://aduana.gov.py/webservices}retorno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recepcion" type="{http://aduana.gov.py/webservices}dsoActa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actaRecepcionRespuestaConsulta", propOrder = {
    "errores",
    "recepcion"
})
public class ActaRecepcionRespuestaConsulta {

    @XmlElement(nillable = true)
    protected List<Retorno> errores;
    protected DsoActa recepcion;

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
     * Gets the value of the recepcion property.
     * 
     * @return
     *     possible object is
     *     {@link DsoActa }
     *     
     */
    public DsoActa getRecepcion() {
        return recepcion;
    }

    /**
     * Sets the value of the recepcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsoActa }
     *     
     */
    public void setRecepcion(DsoActa value) {
        this.recepcion = value;
    }

}
