
package com.dna.deposito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infAutoTit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infAutoTit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="desgloses" type="{http://aduana.gov.py/webservices}infAutoTit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hijos" type="{http://aduana.gov.py/webservices}infAutoTit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="indDesconsolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indDesglosado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indFraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineas" type="{http://aduana.gov.py/webservices}lineaTitulo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiestoMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primeraFrac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonConsignatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucConsignatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infAutoTit", propOrder = {
    "desgloses",
    "estado",
    "fecha",
    "hijos",
    "indDesconsolidado",
    "indDesglosado",
    "indFraccionado",
    "lineas",
    "manifiesto",
    "manifiestoMadre",
    "prefijo",
    "prefijoMadre",
    "primeraFrac",
    "razonConsignatario",
    "rucConsignatario",
    "titulo",
    "tituloMadre"
})
public class InfAutoTit {

    @XmlElement(nillable = true)
    protected List<InfAutoTit> desgloses;
    protected String estado;
    protected String fecha;
    @XmlElement(nillable = true)
    protected List<InfAutoTit> hijos;
    protected String indDesconsolidado;
    protected String indDesglosado;
    protected String indFraccionado;
    @XmlElement(nillable = true)
    protected List<LineaTitulo> lineas;
    protected String manifiesto;
    protected String manifiestoMadre;
    protected String prefijo;
    protected String prefijoMadre;
    protected String primeraFrac;
    protected String razonConsignatario;
    protected String rucConsignatario;
    protected String titulo;
    protected String tituloMadre;

    /**
     * Gets the value of the desgloses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desgloses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesgloses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfAutoTit }
     * 
     * 
     */
    public List<InfAutoTit> getDesgloses() {
        if (desgloses == null) {
            desgloses = new ArrayList<InfAutoTit>();
        }
        return this.desgloses;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the hijos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hijos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHijos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfAutoTit }
     * 
     * 
     */
    public List<InfAutoTit> getHijos() {
        if (hijos == null) {
            hijos = new ArrayList<InfAutoTit>();
        }
        return this.hijos;
    }

    /**
     * Gets the value of the indDesconsolidado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndDesconsolidado() {
        return indDesconsolidado;
    }

    /**
     * Sets the value of the indDesconsolidado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndDesconsolidado(String value) {
        this.indDesconsolidado = value;
    }

    /**
     * Gets the value of the indDesglosado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndDesglosado() {
        return indDesglosado;
    }

    /**
     * Sets the value of the indDesglosado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndDesglosado(String value) {
        this.indDesglosado = value;
    }

    /**
     * Gets the value of the indFraccionado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndFraccionado() {
        return indFraccionado;
    }

    /**
     * Sets the value of the indFraccionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndFraccionado(String value) {
        this.indFraccionado = value;
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
     * {@link LineaTitulo }
     * 
     * 
     */
    public List<LineaTitulo> getLineas() {
        if (lineas == null) {
            lineas = new ArrayList<LineaTitulo>();
        }
        return this.lineas;
    }

    /**
     * Gets the value of the manifiesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifiesto() {
        return manifiesto;
    }

    /**
     * Sets the value of the manifiesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifiesto(String value) {
        this.manifiesto = value;
    }

    /**
     * Gets the value of the manifiestoMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifiestoMadre() {
        return manifiestoMadre;
    }

    /**
     * Sets the value of the manifiestoMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifiestoMadre(String value) {
        this.manifiestoMadre = value;
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
     * Gets the value of the prefijoMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoMadre() {
        return prefijoMadre;
    }

    /**
     * Sets the value of the prefijoMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoMadre(String value) {
        this.prefijoMadre = value;
    }

    /**
     * Gets the value of the primeraFrac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeraFrac() {
        return primeraFrac;
    }

    /**
     * Sets the value of the primeraFrac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeraFrac(String value) {
        this.primeraFrac = value;
    }

    /**
     * Gets the value of the razonConsignatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonConsignatario() {
        return razonConsignatario;
    }

    /**
     * Sets the value of the razonConsignatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonConsignatario(String value) {
        this.razonConsignatario = value;
    }

    /**
     * Gets the value of the rucConsignatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucConsignatario() {
        return rucConsignatario;
    }

    /**
     * Sets the value of the rucConsignatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucConsignatario(String value) {
        this.rucConsignatario = value;
    }

    /**
     * Gets the value of the titulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the tituloMadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloMadre() {
        return tituloMadre;
    }

    /**
     * Sets the value of the tituloMadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloMadre(String value) {
        this.tituloMadre = value;
    }

}
