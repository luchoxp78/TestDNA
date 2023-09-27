
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for despachoSimplTransaccion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="despachoSimplTransaccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="declaracionSimplificada" type="{http://aduana.gov.py/webservices}declaracionSimplificada" minOccurs="0"/>
 *         &lt;element name="errores" type="{http://aduana.gov.py/webservices}retorno" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "despachoSimplTransaccion", propOrder = {
    "declaracionSimplificada",
    "errores"
})
public class DespachoSimplTransaccion {

    protected DeclaracionSimplificada declaracionSimplificada;
    @XmlElement(nillable = true)
    protected List<Retorno> errores;

    /**
     * Gets the value of the declaracionSimplificada property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaracionSimplificada }
     *     
     */
    public DeclaracionSimplificada getDeclaracionSimplificada() {
        return declaracionSimplificada;
    }

    /**
     * Sets the value of the declaracionSimplificada property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaracionSimplificada }
     *     
     */
    public void setDeclaracionSimplificada(DeclaracionSimplificada value) {
        this.declaracionSimplificada = value;
    }

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

}
