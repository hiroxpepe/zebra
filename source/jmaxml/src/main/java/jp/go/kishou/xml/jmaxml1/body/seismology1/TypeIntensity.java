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
 * <p>type.Intensity complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Intensity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Forecast" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.IntensityDetail" minOccurs="0"/>
 *         &lt;element name="Observation" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.IntensityDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Intensity", propOrder = {
    "forecast",
    "observation"
})
public class TypeIntensity {

    @XmlElement(name = "Forecast")
    protected TypeIntensityDetail forecast;
    @XmlElement(name = "Observation")
    protected TypeIntensityDetail observation;

    /**
     * forecastプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeIntensityDetail }
     *     
     */
    public TypeIntensityDetail getForecast() {
        return forecast;
    }

    /**
     * forecastプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIntensityDetail }
     *     
     */
    public void setForecast(TypeIntensityDetail value) {
        this.forecast = value;
    }

    /**
     * observationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeIntensityDetail }
     *     
     */
    public TypeIntensityDetail getObservation() {
        return observation;
    }

    /**
     * observationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIntensityDetail }
     *     
     */
    public void setObservation(TypeIntensityDetail value) {
        this.observation = value;
    }

}
