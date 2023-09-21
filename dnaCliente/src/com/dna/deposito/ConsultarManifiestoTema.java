
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarManifiestoTema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarManifiestoTema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idManifiesto" type="{http://aduana.gov.py/webservices}idManifiesto" minOccurs="0"/>
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
@XmlType(name = "consultarManifiestoTema", propOrder = {
    "idManifiesto",
    "autenticacion"
})
public class ConsultarManifiestoTema {

    protected IdManifiesto idManifiesto;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the idManifiesto property.
     * 
     * @return
     *     possible object is
     *     {@link IdManifiesto }
     *     
     */
    public IdManifiesto getIdManifiesto() {
        return idManifiesto;
    }

    /**
     * Sets the value of the idManifiesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdManifiesto }
     *     
     */
    public void setIdManifiesto(IdManifiesto value) {
        this.idManifiesto = value;
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
