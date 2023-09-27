
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cabeceraSalida complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cabeceraSalida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidoConductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelarCodigoBarra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chapa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciConductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contenedores" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="despacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleSalida" type="{http://aduana.gov.py/webservices}detalleSalida" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="direccionConductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionImportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaTermino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idImportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTransacionDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marcaVehiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noRequiereIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreConductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonSocialTransportista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remisionDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucTransportista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cabeceraSalida", propOrder = {
    "aduana",
    "apellidoConductor",
    "cancelarCodigoBarra",
    "chapa",
    "ciConductor",
    "contenedores",
    "despacho",
    "detalleSalida",
    "direccionConductor",
    "direccionImportador",
    "fechaInicio",
    "fechaTermino",
    "idImportador",
    "idTransacionDeposito",
    "manifiesto",
    "marcaVehiculo",
    "noRequiereIngreso",
    "nombreConductor",
    "numeroTitulo",
    "prefijoTitulo",
    "razonSocialTransportista",
    "remisionDeposito",
    "rucTransportista"
})
public class CabeceraSalida {

    protected String aduana;
    protected String apellidoConductor;
    protected String cancelarCodigoBarra;
    protected String chapa;
    protected String ciConductor;
    @XmlElement(nillable = true)
    protected List<String> contenedores;
    protected String despacho;
    @XmlElement(nillable = true)
    protected List<DetalleSalida> detalleSalida;
    protected String direccionConductor;
    protected String direccionImportador;
    protected String fechaInicio;
    protected String fechaTermino;
    protected String idImportador;
    protected String idTransacionDeposito;
    protected String manifiesto;
    protected String marcaVehiculo;
    protected String noRequiereIngreso;
    protected String nombreConductor;
    protected String numeroTitulo;
    protected String prefijoTitulo;
    protected String razonSocialTransportista;
    protected String remisionDeposito;
    protected String rucTransportista;

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
     * Gets the value of the apellidoConductor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoConductor() {
        return apellidoConductor;
    }

    /**
     * Sets the value of the apellidoConductor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoConductor(String value) {
        this.apellidoConductor = value;
    }

    /**
     * Gets the value of the cancelarCodigoBarra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelarCodigoBarra() {
        return cancelarCodigoBarra;
    }

    /**
     * Sets the value of the cancelarCodigoBarra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelarCodigoBarra(String value) {
        this.cancelarCodigoBarra = value;
    }

    /**
     * Gets the value of the chapa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChapa() {
        return chapa;
    }

    /**
     * Sets the value of the chapa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapa(String value) {
        this.chapa = value;
    }

    /**
     * Gets the value of the ciConductor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiConductor() {
        return ciConductor;
    }

    /**
     * Sets the value of the ciConductor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiConductor(String value) {
        this.ciConductor = value;
    }

    /**
     * Gets the value of the contenedores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenedores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenedores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContenedores() {
        if (contenedores == null) {
            contenedores = new ArrayList<String>();
        }
        return this.contenedores;
    }

    /**
     * Gets the value of the despacho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespacho() {
        return despacho;
    }

    /**
     * Sets the value of the despacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespacho(String value) {
        this.despacho = value;
    }

    /**
     * Gets the value of the detalleSalida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleSalida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleSalida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleSalida }
     * 
     * 
     */
    public List<DetalleSalida> getDetalleSalida() {
        if (detalleSalida == null) {
            detalleSalida = new ArrayList<DetalleSalida>();
        }
        return this.detalleSalida;
    }

    /**
     * Gets the value of the direccionConductor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionConductor() {
        return direccionConductor;
    }

    /**
     * Sets the value of the direccionConductor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionConductor(String value) {
        this.direccionConductor = value;
    }

    /**
     * Gets the value of the direccionImportador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionImportador() {
        return direccionImportador;
    }

    /**
     * Sets the value of the direccionImportador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionImportador(String value) {
        this.direccionImportador = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the fechaTermino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaTermino() {
        return fechaTermino;
    }

    /**
     * Sets the value of the fechaTermino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaTermino(String value) {
        this.fechaTermino = value;
    }

    /**
     * Gets the value of the idImportador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdImportador() {
        return idImportador;
    }

    /**
     * Sets the value of the idImportador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdImportador(String value) {
        this.idImportador = value;
    }

    /**
     * Gets the value of the idTransacionDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransacionDeposito() {
        return idTransacionDeposito;
    }

    /**
     * Sets the value of the idTransacionDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransacionDeposito(String value) {
        this.idTransacionDeposito = value;
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
     * Gets the value of the marcaVehiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    /**
     * Sets the value of the marcaVehiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaVehiculo(String value) {
        this.marcaVehiculo = value;
    }

    /**
     * Gets the value of the noRequiereIngreso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoRequiereIngreso() {
        return noRequiereIngreso;
    }

    /**
     * Sets the value of the noRequiereIngreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoRequiereIngreso(String value) {
        this.noRequiereIngreso = value;
    }

    /**
     * Gets the value of the nombreConductor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreConductor() {
        return nombreConductor;
    }

    /**
     * Sets the value of the nombreConductor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreConductor(String value) {
        this.nombreConductor = value;
    }

    /**
     * Gets the value of the numeroTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTitulo() {
        return numeroTitulo;
    }

    /**
     * Sets the value of the numeroTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTitulo(String value) {
        this.numeroTitulo = value;
    }

    /**
     * Gets the value of the prefijoTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoTitulo() {
        return prefijoTitulo;
    }

    /**
     * Sets the value of the prefijoTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoTitulo(String value) {
        this.prefijoTitulo = value;
    }

    /**
     * Gets the value of the razonSocialTransportista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialTransportista() {
        return razonSocialTransportista;
    }

    /**
     * Sets the value of the razonSocialTransportista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialTransportista(String value) {
        this.razonSocialTransportista = value;
    }

    /**
     * Gets the value of the remisionDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemisionDeposito() {
        return remisionDeposito;
    }

    /**
     * Sets the value of the remisionDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemisionDeposito(String value) {
        this.remisionDeposito = value;
    }

    /**
     * Gets the value of the rucTransportista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucTransportista() {
        return rucTransportista;
    }

    /**
     * Sets the value of the rucTransportista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucTransportista(String value) {
        this.rucTransportista = value;
    }

}
