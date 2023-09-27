
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiModoTerrestre complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiModoTerrestre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anioFabricacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capacidadTraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codModelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idRutDta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indLastre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "taiModoTerrestre", propOrder = {
    "anioFabricacion",
    "capacidadTraccion",
    "codMarca",
    "codModelo",
    "codPais",
    "color",
    "idRutDta",
    "indLastre",
    "nroChasis",
    "patente",
    "patenteSemiRemolque",
    "remolqueSemi"
})
public class TaiModoTerrestre {

    protected String anioFabricacion;
    protected String capacidadTraccion;
    protected String codMarca;
    protected String codModelo;
    protected String codPais;
    protected String color;
    protected String idRutDta;
    protected String indLastre;
    protected String nroChasis;
    protected String patente;
    protected String patenteSemiRemolque;
    protected String remolqueSemi;

    /**
     * Gets the value of the anioFabricacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    /**
     * Sets the value of the anioFabricacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnioFabricacion(String value) {
        this.anioFabricacion = value;
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
     * Gets the value of the codMarca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMarca() {
        return codMarca;
    }

    /**
     * Sets the value of the codMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMarca(String value) {
        this.codMarca = value;
    }

    /**
     * Gets the value of the codModelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodModelo() {
        return codModelo;
    }

    /**
     * Sets the value of the codModelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodModelo(String value) {
        this.codModelo = value;
    }

    /**
     * Gets the value of the codPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPais() {
        return codPais;
    }

    /**
     * Sets the value of the codPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPais(String value) {
        this.codPais = value;
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
     * Gets the value of the idRutDta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRutDta() {
        return idRutDta;
    }

    /**
     * Sets the value of the idRutDta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRutDta(String value) {
        this.idRutDta = value;
    }

    /**
     * Gets the value of the indLastre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndLastre() {
        return indLastre;
    }

    /**
     * Sets the value of the indLastre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndLastre(String value) {
        this.indLastre = value;
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
