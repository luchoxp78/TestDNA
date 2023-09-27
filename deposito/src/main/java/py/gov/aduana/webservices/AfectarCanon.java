
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for afectarCanon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afectarCanon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aduanaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comisionSsd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conexion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controlTransito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idLiquidacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSofia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSofiaComision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSofiaComisionSsd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imponible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="institucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="justificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liberado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucSaldo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioAfectacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afectarCanon", propOrder = {
    "aduanaPago",
    "comision",
    "comisionSsd",
    "concepto",
    "conexion",
    "controlTransito",
    "id",
    "idLiquidacion",
    "idSofia",
    "idSofiaComision",
    "idSofiaComisionSsd",
    "imponible",
    "institucion",
    "justificacion",
    "liberado",
    "manifiesto",
    "monto",
    "obs",
    "origen",
    "pais",
    "prefijo",
    "programa",
    "rucSaldo",
    "titulo",
    "usuarioAfectacion"
})
public class AfectarCanon {

    protected String aduanaPago;
    protected String comision;
    protected String comisionSsd;
    protected String concepto;
    protected String conexion;
    protected String controlTransito;
    protected String id;
    protected String idLiquidacion;
    protected String idSofia;
    protected String idSofiaComision;
    protected String idSofiaComisionSsd;
    protected String imponible;
    protected String institucion;
    protected String justificacion;
    protected String liberado;
    protected String manifiesto;
    protected String monto;
    protected String obs;
    protected String origen;
    protected String pais;
    protected String prefijo;
    protected String programa;
    protected String rucSaldo;
    protected String titulo;
    protected String usuarioAfectacion;

    /**
     * Gets the value of the aduanaPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduanaPago() {
        return aduanaPago;
    }

    /**
     * Sets the value of the aduanaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduanaPago(String value) {
        this.aduanaPago = value;
    }

    /**
     * Gets the value of the comision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComision() {
        return comision;
    }

    /**
     * Sets the value of the comision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComision(String value) {
        this.comision = value;
    }

    /**
     * Gets the value of the comisionSsd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComisionSsd() {
        return comisionSsd;
    }

    /**
     * Sets the value of the comisionSsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComisionSsd(String value) {
        this.comisionSsd = value;
    }

    /**
     * Gets the value of the concepto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Sets the value of the concepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcepto(String value) {
        this.concepto = value;
    }

    /**
     * Gets the value of the conexion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConexion() {
        return conexion;
    }

    /**
     * Sets the value of the conexion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConexion(String value) {
        this.conexion = value;
    }

    /**
     * Gets the value of the controlTransito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlTransito() {
        return controlTransito;
    }

    /**
     * Sets the value of the controlTransito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlTransito(String value) {
        this.controlTransito = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idLiquidacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLiquidacion() {
        return idLiquidacion;
    }

    /**
     * Sets the value of the idLiquidacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLiquidacion(String value) {
        this.idLiquidacion = value;
    }

    /**
     * Gets the value of the idSofia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSofia() {
        return idSofia;
    }

    /**
     * Sets the value of the idSofia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSofia(String value) {
        this.idSofia = value;
    }

    /**
     * Gets the value of the idSofiaComision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSofiaComision() {
        return idSofiaComision;
    }

    /**
     * Sets the value of the idSofiaComision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSofiaComision(String value) {
        this.idSofiaComision = value;
    }

    /**
     * Gets the value of the idSofiaComisionSsd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSofiaComisionSsd() {
        return idSofiaComisionSsd;
    }

    /**
     * Sets the value of the idSofiaComisionSsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSofiaComisionSsd(String value) {
        this.idSofiaComisionSsd = value;
    }

    /**
     * Gets the value of the imponible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImponible() {
        return imponible;
    }

    /**
     * Sets the value of the imponible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImponible(String value) {
        this.imponible = value;
    }

    /**
     * Gets the value of the institucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * Sets the value of the institucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitucion(String value) {
        this.institucion = value;
    }

    /**
     * Gets the value of the justificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificacion() {
        return justificacion;
    }

    /**
     * Sets the value of the justificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificacion(String value) {
        this.justificacion = value;
    }

    /**
     * Gets the value of the liberado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiberado() {
        return liberado;
    }

    /**
     * Sets the value of the liberado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiberado(String value) {
        this.liberado = value;
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
     * Gets the value of the monto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonto() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonto(String value) {
        this.monto = value;
    }

    /**
     * Gets the value of the obs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObs() {
        return obs;
    }

    /**
     * Sets the value of the obs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObs(String value) {
        this.obs = value;
    }

    /**
     * Gets the value of the origen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
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
     * Gets the value of the programa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * Sets the value of the programa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrograma(String value) {
        this.programa = value;
    }

    /**
     * Gets the value of the rucSaldo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucSaldo() {
        return rucSaldo;
    }

    /**
     * Sets the value of the rucSaldo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucSaldo(String value) {
        this.rucSaldo = value;
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
     * Gets the value of the usuarioAfectacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioAfectacion() {
        return usuarioAfectacion;
    }

    /**
     * Sets the value of the usuarioAfectacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioAfectacion(String value) {
        this.usuarioAfectacion = value;
    }

}
