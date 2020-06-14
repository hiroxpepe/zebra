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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.DetailForecast complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.DetailForecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WeatherForecastPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WeatherForecastPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrecipitationForecastPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PrecipitationPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SnowfallDepthForecastPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SnowfallDepthPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WindForecastPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WindForecastPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WaveHeightForecastPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WaveHeightForecastPart" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.DetailForecast", propOrder = {
    "weatherForecastPart",
    "precipitationForecastPart",
    "snowfallDepthForecastPart",
    "windForecastPart",
    "waveHeightForecastPart"
})
public class TypeDetailForecast {

    @XmlElement(name = "WeatherForecastPart")
    protected List<TypeWeatherForecastPart> weatherForecastPart;
    @XmlElement(name = "PrecipitationForecastPart")
    protected List<TypePrecipitationPart> precipitationForecastPart;
    @XmlElement(name = "SnowfallDepthForecastPart")
    protected List<TypeSnowfallDepthPart> snowfallDepthForecastPart;
    @XmlElement(name = "WindForecastPart")
    protected List<TypeWindForecastPart> windForecastPart;
    @XmlElement(name = "WaveHeightForecastPart")
    protected List<TypeWaveHeightForecastPart> waveHeightForecastPart;

    /**
     * Gets the value of the weatherForecastPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weatherForecastPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherForecastPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWeatherForecastPart }
     * 
     * 
     */
    public List<TypeWeatherForecastPart> getWeatherForecastPart() {
        if (weatherForecastPart == null) {
            weatherForecastPart = new ArrayList<TypeWeatherForecastPart>();
        }
        return this.weatherForecastPart;
    }

    /**
     * Gets the value of the precipitationForecastPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precipitationForecastPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecipitationForecastPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePrecipitationPart }
     * 
     * 
     */
    public List<TypePrecipitationPart> getPrecipitationForecastPart() {
        if (precipitationForecastPart == null) {
            precipitationForecastPart = new ArrayList<TypePrecipitationPart>();
        }
        return this.precipitationForecastPart;
    }

    /**
     * Gets the value of the snowfallDepthForecastPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snowfallDepthForecastPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnowfallDepthForecastPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSnowfallDepthPart }
     * 
     * 
     */
    public List<TypeSnowfallDepthPart> getSnowfallDepthForecastPart() {
        if (snowfallDepthForecastPart == null) {
            snowfallDepthForecastPart = new ArrayList<TypeSnowfallDepthPart>();
        }
        return this.snowfallDepthForecastPart;
    }

    /**
     * Gets the value of the windForecastPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windForecastPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindForecastPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWindForecastPart }
     * 
     * 
     */
    public List<TypeWindForecastPart> getWindForecastPart() {
        if (windForecastPart == null) {
            windForecastPart = new ArrayList<TypeWindForecastPart>();
        }
        return this.windForecastPart;
    }

    /**
     * Gets the value of the waveHeightForecastPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waveHeightForecastPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaveHeightForecastPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWaveHeightForecastPart }
     * 
     * 
     */
    public List<TypeWaveHeightForecastPart> getWaveHeightForecastPart() {
        if (waveHeightForecastPart == null) {
            waveHeightForecastPart = new ArrayList<TypeWaveHeightForecastPart>();
        }
        return this.waveHeightForecastPart;
    }

}
