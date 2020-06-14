//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.volcanology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>type.volcanoObservation complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.volcanoObservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventTime" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.eventTime" minOccurs="0"/>
 *         &lt;element name="ColorPlume" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.plume" minOccurs="0"/>
 *         &lt;element name="WhitePlume" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.plume" minOccurs="0"/>
 *         &lt;element name="OtherObservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Appendix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "type.volcanoObservation", propOrder = {
    "eventTime",
    "colorPlume",
    "whitePlume",
    "otherObservation",
    "appendix",
    "any"
})
public class TypeVolcanoObservation {

    @XmlElement(name = "EventTime")
    protected TypeEventTime eventTime;
    @XmlElement(name = "ColorPlume")
    protected TypePlume colorPlume;
    @XmlElement(name = "WhitePlume")
    protected TypePlume whitePlume;
    @XmlElement(name = "OtherObservation")
    protected String otherObservation;
    @XmlElement(name = "Appendix")
    protected String appendix;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * eventTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeEventTime }
     *     
     */
    public TypeEventTime getEventTime() {
        return eventTime;
    }

    /**
     * eventTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEventTime }
     *     
     */
    public void setEventTime(TypeEventTime value) {
        this.eventTime = value;
    }

    /**
     * colorPlumeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePlume }
     *     
     */
    public TypePlume getColorPlume() {
        return colorPlume;
    }

    /**
     * colorPlumeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePlume }
     *     
     */
    public void setColorPlume(TypePlume value) {
        this.colorPlume = value;
    }

    /**
     * whitePlumeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePlume }
     *     
     */
    public TypePlume getWhitePlume() {
        return whitePlume;
    }

    /**
     * whitePlumeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePlume }
     *     
     */
    public void setWhitePlume(TypePlume value) {
        this.whitePlume = value;
    }

    /**
     * otherObservationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherObservation() {
        return otherObservation;
    }

    /**
     * otherObservationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherObservation(String value) {
        this.otherObservation = value;
    }

    /**
     * appendixプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppendix() {
        return appendix;
    }

    /**
     * appendixプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppendix(String value) {
        this.appendix = value;
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
