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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.Tsunami complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Tsunami">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observation" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.TsunamiDetail" minOccurs="0"/>
 *         &lt;element name="Estimation" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.TsunamiDetail" minOccurs="0"/>
 *         &lt;element name="Forecast" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.TsunamiDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Tsunami", propOrder = {
    "release",
    "observation",
    "estimation",
    "forecast"
})
public class TypeTsunami {

    @XmlElement(name = "Release")
    protected String release;
    @XmlElement(name = "Observation")
    protected TypeTsunamiDetail observation;
    @XmlElement(name = "Estimation")
    protected TypeTsunamiDetail estimation;
    @XmlElement(name = "Forecast")
    protected TypeTsunamiDetail forecast;

    /**
     * releaseプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease() {
        return release;
    }

    /**
     * releaseプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease(String value) {
        this.release = value;
    }

    /**
     * observationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public TypeTsunamiDetail getObservation() {
        return observation;
    }

    /**
     * observationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public void setObservation(TypeTsunamiDetail value) {
        this.observation = value;
    }

    /**
     * estimationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public TypeTsunamiDetail getEstimation() {
        return estimation;
    }

    /**
     * estimationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public void setEstimation(TypeTsunamiDetail value) {
        this.estimation = value;
    }

    /**
     * forecastプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public TypeTsunamiDetail getForecast() {
        return forecast;
    }

    /**
     * forecastプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public void setForecast(TypeTsunamiDetail value) {
        this.forecast = value;
    }

}
