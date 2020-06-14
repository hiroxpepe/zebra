//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeMagnitude;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeProbabilityOfAftershock;


/**
 * <p>type.AftershockItem complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.AftershockItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}ProbabilityOfAftershock"/>
 *         &lt;element name="TargetMagnitude" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Magnitude"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.AftershockItem", propOrder = {
    "startTime",
    "endTime",
    "probabilityOfAftershock",
    "targetMagnitude",
    "text"
})
public class TypeAftershockItem {

    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "ProbabilityOfAftershock", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected TypeProbabilityOfAftershock probabilityOfAftershock;
    @XmlElement(name = "TargetMagnitude", required = true)
    protected TypeMagnitude targetMagnitude;
    @XmlElement(name = "Text")
    protected String text;

    /**
     * startTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * startTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * endTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * endTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * probabilityOfAftershockプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeProbabilityOfAftershock }
     *     
     */
    public TypeProbabilityOfAftershock getProbabilityOfAftershock() {
        return probabilityOfAftershock;
    }

    /**
     * probabilityOfAftershockプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbabilityOfAftershock }
     *     
     */
    public void setProbabilityOfAftershock(TypeProbabilityOfAftershock value) {
        this.probabilityOfAftershock = value;
    }

    /**
     * targetMagnitudeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeMagnitude }
     *     
     */
    public TypeMagnitude getTargetMagnitude() {
        return targetMagnitude;
    }

    /**
     * targetMagnitudeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMagnitude }
     *     
     */
    public void setTargetMagnitude(TypeMagnitude value) {
        this.targetMagnitude = value;
    }

    /**
     * textプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * textプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
