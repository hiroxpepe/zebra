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
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeTsunamiHeight;


/**
 * <p>type.MaxHeight complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.MaxHeight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TsunamiHeightFrom" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.TsunamiHeight" minOccurs="0"/>
 *         &lt;element name="TsunamiHeightTo" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.TsunamiHeight" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}TsunamiHeight" minOccurs="0"/>
 *         &lt;element name="Revise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.MaxHeight", propOrder = {
    "dateTime",
    "condition",
    "tsunamiHeightFrom",
    "tsunamiHeightTo",
    "tsunamiHeight",
    "revise",
    "period"
})
public class TypeMaxHeight {

    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "TsunamiHeightFrom")
    protected TypeTsunamiHeight tsunamiHeightFrom;
    @XmlElement(name = "TsunamiHeightTo")
    protected TypeTsunamiHeight tsunamiHeightTo;
    @XmlElement(name = "TsunamiHeight", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeTsunamiHeight tsunamiHeight;
    @XmlElement(name = "Revise")
    protected String revise;
    @XmlElement(name = "Period")
    protected Float period;

    /**
     * dateTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * dateTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
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
     * tsunamiHeightFromプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public TypeTsunamiHeight getTsunamiHeightFrom() {
        return tsunamiHeightFrom;
    }

    /**
     * tsunamiHeightFromプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public void setTsunamiHeightFrom(TypeTsunamiHeight value) {
        this.tsunamiHeightFrom = value;
    }

    /**
     * tsunamiHeightToプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public TypeTsunamiHeight getTsunamiHeightTo() {
        return tsunamiHeightTo;
    }

    /**
     * tsunamiHeightToプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public void setTsunamiHeightTo(TypeTsunamiHeight value) {
        this.tsunamiHeightTo = value;
    }

    /**
     * tsunamiHeightプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public TypeTsunamiHeight getTsunamiHeight() {
        return tsunamiHeight;
    }

    /**
     * tsunamiHeightプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public void setTsunamiHeight(TypeTsunamiHeight value) {
        this.tsunamiHeight = value;
    }

    /**
     * reviseプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevise() {
        return revise;
    }

    /**
     * reviseプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevise(String value) {
        this.revise = value;
    }

    /**
     * periodプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriod() {
        return period;
    }

    /**
     * periodプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriod(Float value) {
        this.period = value;
    }

}
