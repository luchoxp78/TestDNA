
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ingresoNovedadesDeposito complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ingresoNovedadesDeposito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idManifiesto" type="{http://aduana.gov.py/webservices}idManifiesto" minOccurs="0"/>
 *         &lt;element name="indicadores" type="{http://aduana.gov.py/webservices}indicadores" minOccurs="0"/>
 *         &lt;element name="bultosAIngresar" type="{http://aduana.gov.py/webservices}bultosAIngresar" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contenedorAIngresar" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idTransaccionDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ingresoNovedadesDeposito", propOrder = {
    "idManifiesto",
    "indicadores",
    "bultosAIngresar",
    "contenedorAIngresar",
    "idTransaccionDeposito",
    "autenticacion"
})
public class IngresoNovedadesDeposito {

    protected IdManifiesto idManifiesto;
    protected Indicadores indicadores;
    protected List<BultosAIngresar> bultosAIngresar;
    protected List<String> contenedorAIngresar;
    protected String idTransaccionDeposito;
    protected Autenticacion autenticacion;

    /**
     * Gets the value of the idManifiesto property.
     * 
     * @return
     *     possible object is
     *     {@link IdManifiesto }
     *     
     */
    public IdManifiesto getIdManifiesto() {
        return idManifiesto;
    }

    /**
     * Sets the value of the idManifiesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdManifiesto }
     *     
     */
    public void setIdManifiesto(IdManifiesto value) {
        this.idManifiesto = value;
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
     * Gets the value of the bultosAIngresar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bultosAIngresar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBultosAIngresar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BultosAIngresar }
     * 
     * 
     */
    public List<BultosAIngresar> getBultosAIngresar() {
        if (bultosAIngresar == null) {
            bultosAIngresar = new ArrayList<BultosAIngresar>();
        }
        return this.bultosAIngresar;
    }

    /**
     * Gets the value of the contenedorAIngresar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenedorAIngresar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenedorAIngresar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContenedorAIngresar() {
        if (contenedorAIngresar == null) {
            contenedorAIngresar = new ArrayList<String>();
        }
        return this.contenedorAIngresar;
    }

    /**
     * Gets the value of the idTransaccionDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransaccionDeposito() {
        return idTransaccionDeposito;
    }

    /**
     * Sets the value of the idTransaccionDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransaccionDeposito(String value) {
        this.idTransaccionDeposito = value;
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
