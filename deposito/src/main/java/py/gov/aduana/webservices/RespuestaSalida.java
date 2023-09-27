
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respuestaSalida complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respuestaSalida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errores" type="{http://aduana.gov.py/webservices}retorno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idRemision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="respuestaTransaccion" type="{http://aduana.gov.py/webservices}respuestaTransaccion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaSalida", propOrder = {
    "errores",
    "idRemision",
    "respuestaTransaccion"
})
public class RespuestaSalida {

    @XmlElement(nillable = true)
    protected List<Retorno> errores;
    protected String idRemision;
    protected RespuestaTransaccion respuestaTransaccion;

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
     * Gets the value of the idRemision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRemision() {
        return idRemision;
    }

    /**
     * Sets the value of the idRemision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRemision(String value) {
        this.idRemision = value;
    }

    /**
     * Gets the value of the respuestaTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaTransaccion }
     *     
     */
    public RespuestaTransaccion getRespuestaTransaccion() {
        return respuestaTransaccion;
    }

    /**
     * Sets the value of the respuestaTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaTransaccion }
     *     
     */
    public void setRespuestaTransaccion(RespuestaTransaccion value) {
        this.respuestaTransaccion = value;
    }

}
