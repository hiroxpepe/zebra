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


/**
 * <p>type.TsunamiStation complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.TsunamiStation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sensor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HighTideDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FirstHeight" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.FirstHeight"/>
 *         &lt;element name="MaxHeight" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.MaxHeight" minOccurs="0"/>
 *         &lt;element name="CurrentHeight" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CurrentHeight" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.TsunamiStation", propOrder = {
    "name",
    "code",
    "sensor",
    "highTideDateTime",
    "firstHeight",
    "maxHeight",
    "currentHeight"
})
public class TypeTsunamiStation {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Sensor")
    protected String sensor;
    @XmlElement(name = "HighTideDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar highTideDateTime;
    @XmlElement(name = "FirstHeight", required = true)
    protected TypeFirstHeight firstHeight;
    @XmlElement(name = "MaxHeight")
    protected TypeMaxHeight maxHeight;
    @XmlElement(name = "CurrentHeight")
    protected TypeCurrentHeight currentHeight;

    /**
     * nameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * nameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * codeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * codeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * sensorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensor() {
        return sensor;
    }

    /**
     * sensorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensor(String value) {
        this.sensor = value;
    }

    /**
     * highTideDateTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHighTideDateTime() {
        return highTideDateTime;
    }

    /**
     * highTideDateTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHighTideDateTime(XMLGregorianCalendar value) {
        this.highTideDateTime = value;
    }

    /**
     * firstHeightプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeFirstHeight }
     *     
     */
    public TypeFirstHeight getFirstHeight() {
        return firstHeight;
    }

    /**
     * firstHeightプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFirstHeight }
     *     
     */
    public void setFirstHeight(TypeFirstHeight value) {
        this.firstHeight = value;
    }

    /**
     * maxHeightプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeMaxHeight }
     *     
     */
    public TypeMaxHeight getMaxHeight() {
        return maxHeight;
    }

    /**
     * maxHeightプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMaxHeight }
     *     
     */
    public void setMaxHeight(TypeMaxHeight value) {
        this.maxHeight = value;
    }

    /**
     * currentHeightプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCurrentHeight }
     *     
     */
    public TypeCurrentHeight getCurrentHeight() {
        return currentHeight;
    }

    /**
     * currentHeightプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCurrentHeight }
     *     
     */
    public void setCurrentHeight(TypeCurrentHeight value) {
        this.currentHeight = value;
    }

}
