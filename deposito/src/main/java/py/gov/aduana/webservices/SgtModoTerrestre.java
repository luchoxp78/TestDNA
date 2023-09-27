
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sgtModoTerrestre complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sgtModoTerrestre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anhoFabricacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capacidadTraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marca" type="{http://aduana.gov.py/webservices}sgtMarcas" minOccurs="0"/>
 *         &lt;element name="modelo" type="{http://aduana.gov.py/webservices}sgtModelo" minOccurs="0"/>
 *         &lt;element name="nroChasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patenteSemiRemolque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remolqueSemi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sgtModoTerrestre", propOrder = {
    "anhoFabricacion",
    "capacidadTraccion",
    "color",
    "marca",
    "modelo",
    "nroChasis",
    "patente",
    "patenteSemiRemolque",
    "remolqueSemi"
})
public class SgtModoTerrestre {

    protected String anhoFabricacion;
    protected String capacidadTraccion;
    protected String color;
    protected SgtMarcas marca;
    protected SgtModelo modelo;
    protected String nroChasis;
    protected String patente;
    protected String patenteSemiRemolque;
    protected String remolqueSemi;

    /**
     * Gets the value of the anhoFabricacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnhoFabricacion() {
        return anhoFabricacion;
    }

    /**
     * Sets the value of the anhoFabricacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnhoFabricacion(String value) {
        this.anhoFabricacion = value;
    }

    /**
     * Gets the value of the capacidadTraccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapacidadTraccion() {
        return capacidadTraccion;
    }

    /**
     * Sets the value of the capacidadTraccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapacidadTraccion(String value) {
        this.capacidadTraccion = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link SgtMarcas }
     *     
     */
    public SgtMarcas getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtMarcas }
     *     
     */
    public void setMarca(SgtMarcas value) {
        this.marca = value;
    }

    /**
     * Gets the value of the modelo property.
     * 
     * @return
     *     possible object is
     *     {@link SgtModelo }
     *     
     */
    public SgtModelo getModelo() {
        return modelo;
    }

    /**
     * Sets the value of the modelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SgtModelo }
     *     
     */
    public void setModelo(SgtModelo value) {
        this.modelo = value;
    }

    /**
     * Gets the value of the nroChasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroChasis() {
        return nroChasis;
    }

    /**
     * Sets the value of the nroChasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroChasis(String value) {
        this.nroChasis = value;
    }

    /**
     * Gets the value of the patente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Sets the value of the patente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatente(String value) {
        this.patente = value;
    }

    /**
     * Gets the value of the patenteSemiRemolque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatenteSemiRemolque() {
        return patenteSemiRemolque;
    }

    /**
     * Sets the value of the patenteSemiRemolque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatenteSemiRemolque(String value) {
        this.patenteSemiRemolque = value;
    }

    /**
     * Gets the value of the remolqueSemi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemolqueSemi() {
        return remolqueSemi;
    }

    /**
     * Sets the value of the remolqueSemi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemolqueSemi(String value) {
        this.remolqueSemi = value;
    }

}
