//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.seismology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeMagnitude;


/**
 * <p>type.Earthquake complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Earthquake">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hypocenter" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Hypocenter" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Magnitude" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Earthquake", propOrder = {
    "originTime",
    "arrivalTime",
    "condition",
    "hypocenter",
    "magnitude"
})
public class TypeEarthquake {

    @XmlElement(name = "OriginTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originTime;
    @XmlElement(name = "ArrivalTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "Hypocenter")
    protected TypeHypocenter hypocenter;
    @XmlElement(name = "Magnitude", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected List<TypeMagnitude> magnitude;

    /**
     * originTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginTime() {
        return originTime;
    }

    /**
     * originTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginTime(XMLGregorianCalendar value) {
        this.originTime = value;
    }

    /**
     * arrivalTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * arrivalTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * conditionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * conditionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * hypocenterプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeHypocenter }
     *     
     */
    public TypeHypocenter getHypocenter() {
        return hypocenter;
    }

    /**
     * hypocenterプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypocenter }
     *     
     */
    public void setHypocenter(TypeHypocenter value) {
        this.hypocenter = value;
    }

    /**
     * Gets the value of the magnitude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magnitude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMagnitude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeMagnitude }
     * 
     * 
     */
    public List<TypeMagnitude> getMagnitude() {
        if (magnitude == null) {
            magnitude = new ArrayList<TypeMagnitude>();
        }
        return this.magnitude;
    }

}
