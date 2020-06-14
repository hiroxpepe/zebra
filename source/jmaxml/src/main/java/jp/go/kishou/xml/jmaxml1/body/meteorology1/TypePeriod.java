//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.Period complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Period">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartTime" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastTerm" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastTerm" minOccurs="0"/>
 *         &lt;element name="OverTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZoneTime" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastTerm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Period", propOrder = {
    "startTime",
    "endTime",
    "overTime",
    "zoneTime"
})
public class TypePeriod {

    @XmlElement(name = "StartTime")
    protected TypeForecastTerm startTime;
    @XmlElement(name = "EndTime")
    protected TypeForecastTerm endTime;
    @XmlElement(name = "OverTime")
    protected String overTime;
    @XmlElement(name = "ZoneTime")
    protected TypeForecastTerm zoneTime;

    /**
     * startTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastTerm }
     *     
     */
    public TypeForecastTerm getStartTime() {
        return startTime;
    }

    /**
     * startTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastTerm }
     *     
     */
    public void setStartTime(TypeForecastTerm value) {
        this.startTime = value;
    }

    /**
     * endTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastTerm }
     *     
     */
    public TypeForecastTerm getEndTime() {
        return endTime;
    }

    /**
     * endTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastTerm }
     *     
     */
    public void setEndTime(TypeForecastTerm value) {
        this.endTime = value;
    }

    /**
     * overTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverTime() {
        return overTime;
    }

    /**
     * overTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverTime(String value) {
        this.overTime = value;
    }

    /**
     * zoneTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastTerm }
     *     
     */
    public TypeForecastTerm getZoneTime() {
        return zoneTime;
    }

    /**
     * zoneTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastTerm }
     *     
     */
    public void setZoneTime(TypeForecastTerm value) {
        this.zoneTime = value;
    }

}
