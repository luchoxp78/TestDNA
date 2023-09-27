
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for declaracionEfc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="declaracionEfc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aduana.gov.py/webservices}declaracion">
 *       &lt;sequence>
 *         &lt;element name="bultos" type="{http://aduana.gov.py/webservices}bultoEfc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contenedores" type="{http://aduana.gov.py/webservices}contenedorEfc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="despachoMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iddtInte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "declaracionEfc", propOrder = {
    "bultos",
    "cantidad",
    "contenedores",
    "despachoMadre",
    "destinacion",
    "iddtInte",
    "peso"
})
public class DeclaracionEfc
    extends Declaracion
{

    @XmlElement(nillable = true)
    protected List<BultoEfc> bultos;
    protected String cantidad;
    @XmlElement(nillable = true)
    protected List<ContenedorEfc> contenedores;
    protected String despachoMadre;
    protected String destinacion;
    protected String iddtInte;
    protected String peso;

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
     * {@link BultoEfc }
     * 
     * 
     */
    public List<BultoEfc> getBultos() {
        if (bultos == null) {
            bultos = new ArrayList<BultoEfc>();
        }
        return this.bultos;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the contenedores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenedores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenedores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContenedorEfc }
     * 
     * 
     */
    public List<ContenedorEfc> getContenedores() {
        if (contenedores == null) {
            contenedores = new ArrayList<ContenedorEfc>();
        }
        return this.contenedores;
    }

    /**
     * Gets the value of the despachoMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespachoMadre() {
        return despachoMadre;
    }

    /**
     * Sets the value of the despachoMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespachoMadre(String value) {
        this.despachoMadre = value;
    }

    /**
     * Gets the value of the destinacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinacion() {
        return destinacion;
    }

    /**
     * Sets the value of the destinacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinacion(String value) {
        this.destinacion = value;
    }

    /**
     * Gets the value of the iddtInte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIddtInte() {
        return iddtInte;
    }

    /**
     * Sets the value of the iddtInte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIddtInte(String value) {
        this.iddtInte = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeso(String value) {
        this.peso = value;
    }

}
