//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.informationbasis1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>type.head complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.head">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TargetDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TargetDTDubious" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="ValidDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EventID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InfoType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Serial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InfoKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InfoKindVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Headline" type="{http://xml.kishou.go.jp/jmaxml1/informationBasis1/}type.headline"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.head", propOrder = {
    "title",
    "reportDateTime",
    "targetDateTime",
    "targetDTDubious",
    "targetDuration",
    "validDateTime",
    "eventID",
    "infoType",
    "serial",
    "infoKind",
    "infoKindVersion",
    "headline"
})
public class TypeHead {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "ReportDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportDateTime;
    @XmlElement(name = "TargetDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar targetDateTime;
    @XmlElement(name = "TargetDTDubious")
    protected String targetDTDubious;
    @XmlElement(name = "TargetDuration")
    protected Duration targetDuration;
    @XmlElement(name = "ValidDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validDateTime;
    @XmlElement(name = "EventID", required = true)
    protected String eventID;
    @XmlElement(name = "InfoType", required = true)
    protected String infoType;
    @XmlElement(name = "Serial", required = true)
    protected String serial;
    @XmlElement(name = "InfoKind", required = true)
    protected String infoKind;
    @XmlElement(name = "InfoKindVersion", required = true)
    protected String infoKindVersion;
    @XmlElement(name = "Headline", required = true)
    protected TypeHeadline headline;

    /**
     * titleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * titleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * reportDateTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDateTime() {
        return reportDateTime;
    }

    /**
     * reportDateTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDateTime(XMLGregorianCalendar value) {
        this.reportDateTime = value;
    }

    /**
     * targetDateTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetDateTime() {
        return targetDateTime;
    }

    /**
     * targetDateTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetDateTime(XMLGregorianCalendar value) {
        this.targetDateTime = value;
    }

    /**
     * targetDTDubiousプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDTDubious() {
        return targetDTDubious;
    }

    /**
     * targetDTDubiousプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDTDubious(String value) {
        this.targetDTDubious = value;
    }

    /**
     * targetDurationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTargetDuration() {
        return targetDuration;
    }

    /**
     * targetDurationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTargetDuration(Duration value) {
        this.targetDuration = value;
    }

    /**
     * validDateTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDateTime() {
        return validDateTime;
    }

    /**
     * validDateTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDateTime(XMLGregorianCalendar value) {
        this.validDateTime = value;
    }

    /**
     * eventIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * eventIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * infoTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoType() {
        return infoType;
    }

    /**
     * infoTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoType(String value) {
        this.infoType = value;
    }

    /**
     * serialプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * serialプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * infoKindプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoKind() {
        return infoKind;
    }

    /**
     * infoKindプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoKind(String value) {
        this.infoKind = value;
    }

    /**
     * infoKindVersionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoKindVersion() {
        return infoKindVersion;
    }

    /**
     * infoKindVersionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoKindVersion(String value) {
        this.infoKindVersion = value;
    }

    /**
     * headlineプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeHeadline }
     *     
     */
    public TypeHeadline getHeadline() {
        return headline;
    }

    /**
     * headlineプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHeadline }
     *     
     */
    public void setHeadline(TypeHeadline value) {
        this.headline = value;
    }

}
