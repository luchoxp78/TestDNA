
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for manifiestoMICDTA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manifiestoMICDTA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carreta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="micdta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manifiestoMICDTA", propOrder = {
    "carreta",
    "matricula",
    "micdta"
})
public class ManifiestoMICDTA {

    protected String carreta;
    protected String matricula;
    protected String micdta;

    /**
     * Gets the value of the carreta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarreta() {
        return carreta;
    }

    /**
     * Sets the value of the carreta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarreta(String value) {
        this.carreta = value;
    }

    /**
     * Gets the value of the matricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Gets the value of the micdta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicdta() {
        return micdta;
    }

    /**
     * Sets the value of the micdta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicdta(String value) {
        this.micdta = value;
    }

}
