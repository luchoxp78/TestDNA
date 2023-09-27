
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tituloActa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tituloActa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bultos" type="{http://aduana.gov.py/webservices}ldsActa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentoTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisExtrazonaIso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonSocialImportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucImportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tituloActa", propOrder = {
    "bultos",
    "consolidado",
    "documentoTransporte",
    "fraccionado",
    "paisExtrazonaIso",
    "prefijo",
    "razonSocialImportador",
    "rucImportador"
})
public class TituloActa {

    @XmlElement(nillable = true)
    protected List<LdsActa> bultos;
    protected String consolidado;
    protected String documentoTransporte;
    protected String fraccionado;
    protected String paisExtrazonaIso;
    protected String prefijo;
    protected String razonSocialImportador;
    protected String rucImportador;

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
     * {@link LdsActa }
     * 
     * 
     */
    public List<LdsActa> getBultos() {
        if (bultos == null) {
            bultos = new ArrayList<LdsActa>();
        }
        return this.bultos;
    }

    /**
     * Gets the value of the consolidado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsolidado() {
        return consolidado;
    }

    /**
     * Sets the value of the consolidado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsolidado(String value) {
        this.consolidado = value;
    }

    /**
     * Gets the value of the documentoTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoTransporte() {
        return documentoTransporte;
    }

    /**
     * Sets the value of the documentoTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoTransporte(String value) {
        this.documentoTransporte = value;
    }

    /**
     * Gets the value of the fraccionado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraccionado() {
        return fraccionado;
    }

    /**
     * Sets the value of the fraccionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraccionado(String value) {
        this.fraccionado = value;
    }

    /**
     * Gets the value of the paisExtrazonaIso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisExtrazonaIso() {
        return paisExtrazonaIso;
    }

    /**
     * Sets the value of the paisExtrazonaIso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisExtrazonaIso(String value) {
        this.paisExtrazonaIso = value;
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
     * Gets the value of the razonSocialImportador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialImportador() {
        return razonSocialImportador;
    }

    /**
     * Sets the value of the razonSocialImportador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialImportador(String value) {
        this.razonSocialImportador = value;
    }

    /**
     * Gets the value of the rucImportador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucImportador() {
        return rucImportador;
    }

    /**
     * Sets the value of the rucImportador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucImportador(String value) {
        this.rucImportador = value;
    }

}
