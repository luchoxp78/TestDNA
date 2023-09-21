
package com.dna.deposito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarCodigoBarra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarCodigoBarra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="burSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="burTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroctd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trsp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "consultarCodigoBarra", propOrder = {
    "burSource",
    "burTarget",
    "state",
    "nroctd",
    "operType",
    "idso",
    "mic",
    "boleta",
    "trsp",
    "dBegin",
    "dEnd",
    "autenticacion"
})
public class ConsultarCodigoBarra {

    protected String burSource;
    protected String burTarget;
    protected String state;
    protected String nroctd;
    protected String operType;
    protected String idso;
    protected String mic;
    protected String boleta;
    protected String trsp;
    protected String dBegin;
    protected String dEnd;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the burSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBurSource() {
        return burSource;
    }

    /**
     * Sets the value of the burSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBurSource(String value) {
        this.burSource = value;
    }

    /**
     * Gets the value of the burTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBurTarget() {
        return burTarget;
    }

    /**
     * Sets the value of the burTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBurTarget(String value) {
        this.burTarget = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the nroctd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroctd() {
        return nroctd;
    }

    /**
     * Sets the value of the nroctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroctd(String value) {
        this.nroctd = value;
    }

    /**
     * Gets the value of the operType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperType() {
        return operType;
    }

    /**
     * Sets the value of the operType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperType(String value) {
        this.operType = value;
    }

    /**
     * Gets the value of the idso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdso() {
        return idso;
    }

    /**
     * Sets the value of the idso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdso(String value) {
        this.idso = value;
    }

    /**
     * Gets the value of the mic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMic() {
        return mic;
    }

    /**
     * Sets the value of the mic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMic(String value) {
        this.mic = value;
    }

    /**
     * Gets the value of the boleta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoleta() {
        return boleta;
    }

    /**
     * Sets the value of the boleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoleta(String value) {
        this.boleta = value;
    }

    /**
     * Gets the value of the trsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrsp() {
        return trsp;
    }

    /**
     * Sets the value of the trsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrsp(String value) {
        this.trsp = value;
    }

    /**
     * Gets the value of the dBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBegin() {
        return dBegin;
    }

    /**
     * Sets the value of the dBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBegin(String value) {
        this.dBegin = value;
    }

    /**
     * Gets the value of the dEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEnd() {
        return dEnd;
    }

    /**
     * Sets the value of the dEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEnd(String value) {
        this.dEnd = value;
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
