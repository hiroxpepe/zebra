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
import javax.xml.datatype.Duration;


/**
 * <p>type.TsunamiItem complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.TsunamiItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Area" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.ForecastArea"/>
 *         &lt;element name="Category" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Category" minOccurs="0"/>
 *         &lt;element name="FirstHeight" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.FirstHeight" minOccurs="0"/>
 *         &lt;element name="MaxHeight" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.MaxHeight" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="Station" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.TsunamiStation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.TsunamiItem", propOrder = {
    "area",
    "category",
    "firstHeight",
    "maxHeight",
    "duration",
    "station"
})
public class TypeTsunamiItem {

    @XmlElement(name = "Area", required = true)
    protected TypeForecastArea area;
    @XmlElement(name = "Category")
    protected TypeCategory category;
    @XmlElement(name = "FirstHeight")
    protected TypeFirstHeight firstHeight;
    @XmlElement(name = "MaxHeight")
    protected TypeMaxHeight maxHeight;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "Station")
    protected List<TypeTsunamiStation> station;

    /**
     * areaプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastArea }
     *     
     */
    public TypeForecastArea getArea() {
        return area;
    }

    /**
     * areaプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastArea }
     *     
     */
    public void setArea(TypeForecastArea value) {
        this.area = value;
    }

    /**
     * categoryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCategory }
     *     
     */
    public TypeCategory getCategory() {
        return category;
    }

    /**
     * categoryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCategory }
     *     
     */
    public void setCategory(TypeCategory value) {
        this.category = value;
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
     * durationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * durationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the station property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the station property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTsunamiStation }
     * 
     * 
     */
    public List<TypeTsunamiStation> getStation() {
        if (station == null) {
            station = new ArrayList<TypeTsunamiStation>();
        }
        return this.station;
    }

}
