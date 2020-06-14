//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>type.AdditionalInfo complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.AdditionalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObservationAddition" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ObservationAddition" minOccurs="0"/>
 *         &lt;element name="ClimateForecastAddition" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ClimateForecastAddition" minOccurs="0"/>
 *         &lt;element name="FloodForecastAddition" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.FloodForecastAddition" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='http://xml.kishou.go.jp/jmaxml1/addition1/' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.AdditionalInfo", propOrder = {
    "observationAddition",
    "climateForecastAddition",
    "floodForecastAddition",
    "any"
})
public class TypeAdditionalInfo {

    @XmlElement(name = "ObservationAddition")
    protected TypeObservationAddition observationAddition;
    @XmlElement(name = "ClimateForecastAddition")
    protected TypeClimateForecastAddition climateForecastAddition;
    @XmlElement(name = "FloodForecastAddition")
    protected TypeFloodForecastAddition floodForecastAddition;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * observationAdditionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeObservationAddition }
     *     
     */
    public TypeObservationAddition getObservationAddition() {
        return observationAddition;
    }

    /**
     * observationAdditionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeObservationAddition }
     *     
     */
    public void setObservationAddition(TypeObservationAddition value) {
        this.observationAddition = value;
    }

    /**
     * climateForecastAdditionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeClimateForecastAddition }
     *     
     */
    public TypeClimateForecastAddition getClimateForecastAddition() {
        return climateForecastAddition;
    }

    /**
     * climateForecastAdditionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeClimateForecastAddition }
     *     
     */
    public void setClimateForecastAddition(TypeClimateForecastAddition value) {
        this.climateForecastAddition = value;
    }

    /**
     * floodForecastAdditionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeFloodForecastAddition }
     *     
     */
    public TypeFloodForecastAddition getFloodForecastAddition() {
        return floodForecastAddition;
    }

    /**
     * floodForecastAdditionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFloodForecastAddition }
     *     
     */
    public void setFloodForecastAddition(TypeFloodForecastAddition value) {
        this.floodForecastAddition = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
