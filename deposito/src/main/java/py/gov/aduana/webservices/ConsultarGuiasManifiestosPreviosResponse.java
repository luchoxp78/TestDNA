
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarGuiasManifiestosPreviosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarGuiasManifiestosPreviosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://aduana.gov.py/webservices}guiasManifiestosPreviosRespuestaConsulta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarGuiasManifiestosPreviosResponse", propOrder = {
    "_return"
})
public class ConsultarGuiasManifiestosPreviosResponse {

    @XmlElement(name = "return")
    protected GuiasManifiestosPreviosRespuestaConsulta _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GuiasManifiestosPreviosRespuestaConsulta }
     *     
     */
    public GuiasManifiestosPreviosRespuestaConsulta getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuiasManifiestosPreviosRespuestaConsulta }
     *     
     */
    public void setReturn(GuiasManifiestosPreviosRespuestaConsulta value) {
        this._return = value;
    }

}
