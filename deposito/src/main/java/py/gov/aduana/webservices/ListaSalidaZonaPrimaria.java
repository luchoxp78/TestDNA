
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaSalidaZonaPrimaria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaSalidaZonaPrimaria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabeceraListaSalida" type="{http://aduana.gov.py/webservices}cabeceraSalida" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "listaSalidaZonaPrimaria", propOrder = {
    "cabeceraListaSalida",
    "autenticacion"
})
public class ListaSalidaZonaPrimaria {

    protected List<CabeceraSalida> cabeceraListaSalida;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the cabeceraListaSalida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabeceraListaSalida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabeceraListaSalida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabeceraSalida }
     * 
     * 
     */
    public List<CabeceraSalida> getCabeceraListaSalida() {
        if (cabeceraListaSalida == null) {
            cabeceraListaSalida = new ArrayList<CabeceraSalida>();
        }
        return this.cabeceraListaSalida;
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
