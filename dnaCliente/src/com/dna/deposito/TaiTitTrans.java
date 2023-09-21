
package com.dna.deposito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiTitTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiTitTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bultos" type="{http://aduana.gov.py/webservices}taiBulto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cantBultosTipoEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignatario" type="{http://aduana.gov.py/webservices}taiPersona" minOccurs="0"/>
 *         &lt;element name="descMercaderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTitTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingresado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroViaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoBrutoTipoEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taiTitTrans", propOrder = {
    "bultos",
    "cantBultosTipoEmbalaje",
    "consignatario",
    "descMercaderia",
    "idTitTrans",
    "ingresado",
    "nroViaje",
    "pesoBrutoTipoEmbalaje"
})
public class TaiTitTrans {

    @XmlElement(nillable = true)
    protected List<TaiBulto> bultos;
    protected String cantBultosTipoEmbalaje;
    protected TaiPersona consignatario;
    protected String descMercaderia;
    protected String idTitTrans;
    protected String ingresado;
    protected String nroViaje;
    protected String pesoBrutoTipoEmbalaje;

    /**
     * Gets the value of the bultos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bultos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBultos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaiBulto }
     * 
     * 
     */
    public List<TaiBulto> getBultos() {
        if (bultos == null) {
            bultos = new ArrayList<TaiBulto>();
        }
        return this.bultos;
    }

    /**
     * Gets the value of the cantBultosTipoEmbalaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantBultosTipoEmbalaje() {
        return cantBultosTipoEmbalaje;
    }

    /**
     * Sets the value of the cantBultosTipoEmbalaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantBultosTipoEmbalaje(String value) {
        this.cantBultosTipoEmbalaje = value;
    }

    /**
     * Gets the value of the consignatario property.
     * 
     * @return
     *     possible object is
     *     {@link TaiPersona }
     *     
     */
    public TaiPersona getConsignatario() {
        return consignatario;
    }

    /**
     * Sets the value of the consignatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaiPersona }
     *     
     */
    public void setConsignatario(TaiPersona value) {
        this.consignatario = value;
    }

    /**
     * Gets the value of the descMercaderia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMercaderia() {
        return descMercaderia;
    }

    /**
     * Sets the value of the descMercaderia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMercaderia(String value) {
        this.descMercaderia = value;
    }

    /**
     * Gets the value of the idTitTrans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTitTrans() {
        return idTitTrans;
    }

    /**
     * Sets the value of the idTitTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTitTrans(String value) {
        this.idTitTrans = value;
    }

    /**
     * Gets the value of the ingresado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngresado() {
        return ingresado;
    }

    /**
     * Sets the value of the ingresado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngresado(String value) {
        this.ingresado = value;
    }

    /**
     * Gets the value of the nroViaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroViaje() {
        return nroViaje;
    }

    /**
     * Sets the value of the nroViaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroViaje(String value) {
        this.nroViaje = value;
    }

    /**
     * Gets the value of the pesoBrutoTipoEmbalaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBrutoTipoEmbalaje() {
        return pesoBrutoTipoEmbalaje;
    }

    /**
     * Sets the value of the pesoBrutoTipoEmbalaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBrutoTipoEmbalaje(String value) {
        this.pesoBrutoTipoEmbalaje = value;
    }

}
