
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for idManifiesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="idManifiesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controlarIndicador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadores" type="{http://aduana.gov.py/webservices}indicadores" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroExpActa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoNovedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idManifiesto", propOrder = {
    "aduana",
    "controlarIndicador",
    "deposito",
    "fecDesde",
    "fecHasta",
    "fechaIngreso",
    "indicadores",
    "manifiesto",
    "nroExpActa",
    "prefijo",
    "rucDestinatario",
    "tipoNovedad",
    "titulo"
})
public class IdManifiesto {

    protected String aduana;
    protected String controlarIndicador;
    protected String deposito;
    protected String fecDesde;
    protected String fecHasta;
    protected String fechaIngreso;
    protected Indicadores indicadores;
    protected String manifiesto;
    protected String nroExpActa;
    protected String prefijo;
    protected String rucDestinatario;
    protected String tipoNovedad;
    protected String titulo;

    /**
     * Gets the value of the aduana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduana() {
        return aduana;
    }

    /**
     * Sets the value of the aduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduana(String value) {
        this.aduana = value;
    }

    /**
     * Gets the value of the controlarIndicador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlarIndicador() {
        return controlarIndicador;
    }

    /**
     * Sets the value of the controlarIndicador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlarIndicador(String value) {
        this.controlarIndicador = value;
    }

    /**
     * Gets the value of the deposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeposito() {
        return deposito;
    }

    /**
     * Sets the value of the deposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeposito(String value) {
        this.deposito = value;
    }

    /**
     * Gets the value of the fecDesde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecDesde() {
        return fecDesde;
    }

    /**
     * Sets the value of the fecDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecDesde(String value) {
        this.fecDesde = value;
    }

    /**
     * Gets the value of the fecHasta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecHasta() {
        return fecHasta;
    }

    /**
     * Sets the value of the fecHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecHasta(String value) {
        this.fecHasta = value;
    }

    /**
     * Gets the value of the fechaIngreso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Sets the value of the fechaIngreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIngreso(String value) {
        this.fechaIngreso = value;
    }

    /**
     * Gets the value of the indicadores property.
     * 
     * @return
     *     possible object is
     *     {@link Indicadores }
     *     
     */
    public Indicadores getIndicadores() {
        return indicadores;
    }

    /**
     * Sets the value of the indicadores property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indicadores }
     *     
     */
    public void setIndicadores(Indicadores value) {
        this.indicadores = value;
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
     * Gets the value of the nroExpActa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroExpActa() {
        return nroExpActa;
    }

    /**
     * Sets the value of the nroExpActa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroExpActa(String value) {
        this.nroExpActa = value;
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
     * Gets the value of the rucDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucDestinatario() {
        return rucDestinatario;
    }

    /**
     * Sets the value of the rucDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucDestinatario(String value) {
        this.rucDestinatario = value;
    }

    /**
     * Gets the value of the tipoNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNovedad() {
        return tipoNovedad;
    }

    /**
     * Sets the value of the tipoNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNovedad(String value) {
        this.tipoNovedad = value;
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

}
