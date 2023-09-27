
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sgtCrt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sgtCrt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="camionOriginal" type="{http://aduana.gov.py/webservices}sgtVehiculo" minOccurs="0"/>
 *         &lt;element name="consignatario" type="{http://aduana.gov.py/webservices}sgtPersona" minOccurs="0"/>
 *         &lt;element name="descMercaderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinoAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineas" type="{http://aduana.gov.py/webservices}sgtLinea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nroCrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoBulto" type="{http://aduana.gov.py/webservices}sgtNeb" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sgtCrt", propOrder = {
    "camionOriginal",
    "consignatario",
    "descMercaderia",
    "destinoAduana",
    "id",
    "idso",
    "lineas",
    "nroCrt",
    "prefijo",
    "rut",
    "tipoBulto"
})
public class SgtCrt {

    protected SgtVehiculo camionOriginal;
    protected SgtPersona consignatario;
    protected String descMercaderia;
    protected String destinoAduana;
    protected Long id;
    protected String idso;
    @XmlElement(nillable = true)
    protected List<SgtLinea> lineas;
    protected String nroCrt;
    protected String prefijo;
    protected String rut;
    protected SgtNeb tipoBulto;

    /**
     * Gets the value of the camionOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link SgtVehiculo }
     *     
     */
    public SgtVehiculo getCamionOriginal() {
        return camionOriginal;
    }

    /**
     * Sets the value of the camionOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtVehiculo }
     *     
     */
    public void setCamionOriginal(SgtVehiculo value) {
        this.camionOriginal = value;
    }

    /**
     * Gets the value of the consignatario property.
     * 
     * @return
     *     possible object is
     *     {@link SgtPersona }
     *     
     */
    public SgtPersona getConsignatario() {
        return consignatario;
    }

    /**
     * Sets the value of the consignatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtPersona }
     *     
     */
    public void setConsignatario(SgtPersona value) {
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
     * Gets the value of the destinoAduana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoAduana() {
        return destinoAduana;
    }

    /**
     * Sets the value of the destinoAduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoAduana(String value) {
        this.destinoAduana = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Gets the value of the lineas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SgtLinea }
     * 
     * 
     */
    public List<SgtLinea> getLineas() {
        if (lineas == null) {
            lineas = new ArrayList<SgtLinea>();
        }
        return this.lineas;
    }

    /**
     * Gets the value of the nroCrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroCrt() {
        return nroCrt;
    }

    /**
     * Sets the value of the nroCrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroCrt(String value) {
        this.nroCrt = value;
    }

    /**
     * Gets the value of the prefijo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijo() {
        return prefijo;
    }

    /**
     * Sets the value of the prefijo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijo(String value) {
        this.prefijo = value;
    }

    /**
     * Gets the value of the rut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRut() {
        return rut;
    }

    /**
     * Sets the value of the rut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRut(String value) {
        this.rut = value;
    }

    /**
     * Gets the value of the tipoBulto property.
     * 
     * @return
     *     possible object is
     *     {@link SgtNeb }
     *     
     */
    public SgtNeb getTipoBulto() {
        return tipoBulto;
    }

    /**
     * Sets the value of the tipoBulto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtNeb }
     *     
     */
    public void setTipoBulto(SgtNeb value) {
        this.tipoBulto = value;
    }

}
