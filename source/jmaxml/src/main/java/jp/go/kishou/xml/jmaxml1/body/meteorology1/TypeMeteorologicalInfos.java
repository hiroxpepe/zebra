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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.MeteorologicalInfos complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.MeteorologicalInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeteorologicalInfo" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.MeteorologicalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TimeSeriesInfo" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.TimeSeriesInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.MeteorologicalInfos", propOrder = {
    "meteorologicalInfo",
    "timeSeriesInfo"
})
public class TypeMeteorologicalInfos {

    @XmlElement(name = "MeteorologicalInfo")
    protected List<TypeMeteorologicalInfo> meteorologicalInfo;
    @XmlElement(name = "TimeSeriesInfo")
    protected List<TypeTimeSeriesInfo> timeSeriesInfo;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the meteorologicalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meteorologicalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeteorologicalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeMeteorologicalInfo }
     * 
     * 
     */
    public List<TypeMeteorologicalInfo> getMeteorologicalInfo() {
        if (meteorologicalInfo == null) {
            meteorologicalInfo = new ArrayList<TypeMeteorologicalInfo>();
        }
        return this.meteorologicalInfo;
    }

    /**
     * Gets the value of the timeSeriesInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSeriesInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSeriesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTimeSeriesInfo }
     * 
     * 
     */
    public List<TypeTimeSeriesInfo> getTimeSeriesInfo() {
        if (timeSeriesInfo == null) {
            timeSeriesInfo = new ArrayList<TypeTimeSeriesInfo>();
        }
        return this.timeSeriesInfo;
    }

    /**
     * typeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * typeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
