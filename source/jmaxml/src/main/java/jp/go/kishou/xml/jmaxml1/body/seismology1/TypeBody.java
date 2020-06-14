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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.Body complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Body">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Naming" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Naming" minOccurs="0"/>
 *         &lt;element name="Tsunami" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Tsunami" minOccurs="0"/>
 *         &lt;element name="Earthquake" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Earthquake" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Intensity" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Intensity" minOccurs="0"/>
 *         &lt;element name="Tokai" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Tokai" minOccurs="0"/>
 *         &lt;element name="EarthquakeCount" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.EarthquakeCount" minOccurs="0"/>
 *         &lt;element name="Aftershock" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Aftershocks" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextAdvisory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Comment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Body", propOrder = {
    "naming",
    "tsunami",
    "earthquake",
    "intensity",
    "tokai",
    "earthquakeCount",
    "aftershock",
    "text",
    "nextAdvisory",
    "comments"
})
public class TypeBody {

    @XmlElement(name = "Naming")
    protected TypeNaming naming;
    @XmlElement(name = "Tsunami")
    protected TypeTsunami tsunami;
    @XmlElement(name = "Earthquake")
    protected List<TypeEarthquake> earthquake;
    @XmlElement(name = "Intensity")
    protected TypeIntensity intensity;
    @XmlElement(name = "Tokai")
    protected TypeTokai tokai;
    @XmlElement(name = "EarthquakeCount")
    protected TypeEarthquakeCount earthquakeCount;
    @XmlElement(name = "Aftershock")
    protected TypeAftershocks aftershock;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "NextAdvisory")
    protected String nextAdvisory;
    @XmlElement(name = "Comments")
    protected TypeComment comments;

    /**
     * namingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeNaming }
     *     
     */
    public TypeNaming getNaming() {
        return naming;
    }

    /**
     * namingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNaming }
     *     
     */
    public void setNaming(TypeNaming value) {
        this.naming = value;
    }

    /**
     * tsunamiプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunami }
     *     
     */
    public TypeTsunami getTsunami() {
        return tsunami;
    }

    /**
     * tsunamiプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunami }
     *     
     */
    public void setTsunami(TypeTsunami value) {
        this.tsunami = value;
    }

    /**
     * Gets the value of the earthquake property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earthquake property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarthquake().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeEarthquake }
     * 
     * 
     */
    public List<TypeEarthquake> getEarthquake() {
        if (earthquake == null) {
            earthquake = new ArrayList<TypeEarthquake>();
        }
        return this.earthquake;
    }

    /**
     * intensityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeIntensity }
     *     
     */
    public TypeIntensity getIntensity() {
        return intensity;
    }

    /**
     * intensityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIntensity }
     *     
     */
    public void setIntensity(TypeIntensity value) {
        this.intensity = value;
    }

    /**
     * tokaiプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTokai }
     *     
     */
    public TypeTokai getTokai() {
        return tokai;
    }

    /**
     * tokaiプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTokai }
     *     
     */
    public void setTokai(TypeTokai value) {
        this.tokai = value;
    }

    /**
     * earthquakeCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeEarthquakeCount }
     *     
     */
    public TypeEarthquakeCount getEarthquakeCount() {
        return earthquakeCount;
    }

    /**
     * earthquakeCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEarthquakeCount }
     *     
     */
    public void setEarthquakeCount(TypeEarthquakeCount value) {
        this.earthquakeCount = value;
    }

    /**
     * aftershockプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeAftershocks }
     *     
     */
    public TypeAftershocks getAftershock() {
        return aftershock;
    }

    /**
     * aftershockプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAftershocks }
     *     
     */
    public void setAftershock(TypeAftershocks value) {
        this.aftershock = value;
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

    /**
     * nextAdvisoryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextAdvisory() {
        return nextAdvisory;
    }

    /**
     * nextAdvisoryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextAdvisory(String value) {
        this.nextAdvisory = value;
    }

    /**
     * commentsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeComment }
     *     
     */
    public TypeComment getComments() {
        return comments;
    }

    /**
     * commentsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeComment }
     *     
     */
    public void setComments(TypeComment value) {
        this.comments = value;
    }

}
