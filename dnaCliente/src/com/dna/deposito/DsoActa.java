
package com.dna.deposito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dsoActa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsoActa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aduanaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaArribo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guias" type="{http://aduana.gov.py/webservices}tituloActa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idsoAnticipado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisProcedenciaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisTransporteDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonSocialAgente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonSocialEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transporteVacio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsoActa", propOrder = {
    "aduanaDesc",
    "estadoDesc",
    "fechaArribo",
    "fechaRegistro",
    "guias",
    "idso",
    "idsoAnticipado",
    "paisProcedenciaDesc",
    "paisTransporteDesc",
    "pesoBruto",
    "razonSocialAgente",
    "razonSocialEmpresa",
    "rucEmpresa",
    "tipoOperacion",
    "transporteVacio"
})
public class DsoActa {

    protected String aduanaDesc;
    protected String estadoDesc;
    protected String fechaArribo;
    protected String fechaRegistro;
    @XmlElement(nillable = true)
    protected List<TituloActa> guias;
    protected String idso;
    protected String idsoAnticipado;
    protected String paisProcedenciaDesc;
    protected String paisTransporteDesc;
    protected String pesoBruto;
    protected String razonSocialAgente;
    protected String razonSocialEmpresa;
    protected String rucEmpresa;
    protected String tipoOperacion;
    protected String transporteVacio;

    /**
     * Gets the value of the aduanaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduanaDesc() {
        return aduanaDesc;
    }

    /**
     * Sets the value of the aduanaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduanaDesc(String value) {
        this.aduanaDesc = value;
    }

    /**
     * Gets the value of the estadoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoDesc() {
        return estadoDesc;
    }

    /**
     * Sets the value of the estadoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoDesc(String value) {
        this.estadoDesc = value;
    }

    /**
     * Gets the value of the fechaArribo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaArribo() {
        return fechaArribo;
    }

    /**
     * Sets the value of the fechaArribo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaArribo(String value) {
        this.fechaArribo = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegistro(String value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the guias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TituloActa }
     * 
     * 
     */
    public List<TituloActa> getGuias() {
        if (guias == null) {
            guias = new ArrayList<TituloActa>();
        }
        return this.guias;
    }

    /**
     * Gets the value of the idso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdso() {
        return idso;
    }

    /**
     * Sets the value of the idso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdso(String value) {
        this.idso = value;
    }

    /**
     * Gets the value of the idsoAnticipado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdsoAnticipado() {
        return idsoAnticipado;
    }

    /**
     * Sets the value of the idsoAnticipado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdsoAnticipado(String value) {
        this.idsoAnticipado = value;
    }

    /**
     * Gets the value of the paisProcedenciaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisProcedenciaDesc() {
        return paisProcedenciaDesc;
    }

    /**
     * Sets the value of the paisProcedenciaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisProcedenciaDesc(String value) {
        this.paisProcedenciaDesc = value;
    }

    /**
     * Gets the value of the paisTransporteDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisTransporteDesc() {
        return paisTransporteDesc;
    }

    /**
     * Sets the value of the paisTransporteDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisTransporteDesc(String value) {
        this.paisTransporteDesc = value;
    }

    /**
     * Gets the value of the pesoBruto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBruto() {
        return pesoBruto;
    }

    /**
     * Sets the value of the pesoBruto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBruto(String value) {
        this.pesoBruto = value;
    }

    /**
     * Gets the value of the razonSocialAgente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialAgente() {
        return razonSocialAgente;
    }

    /**
     * Sets the value of the razonSocialAgente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialAgente(String value) {
        this.razonSocialAgente = value;
    }

    /**
     * Gets the value of the razonSocialEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialEmpresa() {
        return razonSocialEmpresa;
    }

    /**
     * Sets the value of the razonSocialEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialEmpresa(String value) {
        this.razonSocialEmpresa = value;
    }

    /**
     * Gets the value of the rucEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEmpresa() {
        return rucEmpresa;
    }

    /**
     * Sets the value of the rucEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEmpresa(String value) {
        this.rucEmpresa = value;
    }

    /**
     * Gets the value of the tipoOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Sets the value of the tipoOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Gets the value of the transporteVacio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransporteVacio() {
        return transporteVacio;
    }

    /**
     * Sets the value of the transporteVacio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransporteVacio(String value) {
        this.transporteVacio = value;
    }

}
