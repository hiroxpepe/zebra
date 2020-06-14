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
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeDateTime;
import org.w3c.dom.Element;


/**
 * <p>type.eventTime complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.eventTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventDateTime" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.DateTime" minOccurs="0"/>
 *         &lt;element name="EventDateTimeUTC" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.DateTime" minOccurs="0"/>
 *         &lt;element name="EventDateTimeComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "type.eventTime", propOrder = {
    "eventDateTime",
    "eventDateTimeUTC",
    "eventDateTimeComment",
    "any"
})
public class TypeEventTime {

    @XmlElement(name = "EventDateTime")
    protected TypeDateTime eventDateTime;
    @XmlElement(name = "EventDateTimeUTC")
    protected TypeDateTime eventDateTimeUTC;
    @XmlElement(name = "EventDateTimeComment")
    protected String eventDateTimeComment;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * eventDateTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeDateTime }
     *     
     */
    public TypeDateTime getEventDateTime() {
        return eventDateTime;
    }

    /**
     * eventDateTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateTime }
     *     
     */
    public void setEventDateTime(TypeDateTime value) {
        this.eventDateTime = value;
    }

    /**
     * eventDateTimeUTCプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeDateTime }
     *     
     */
    public TypeDateTime getEventDateTimeUTC() {
        return eventDateTimeUTC;
    }

    /**
     * eventDateTimeUTCプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateTime }
     *     
     */
    public void setEventDateTimeUTC(TypeDateTime value) {
        this.eventDateTimeUTC = value;
    }

    /**
     * eventDateTimeCommentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDateTimeComment() {
        return eventDateTimeComment;
    }

    /**
     * eventDateTimeCommentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDateTimeComment(String value) {
        this.eventDateTimeComment = value;
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
