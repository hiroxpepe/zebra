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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeClassThresholdOfAverage;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeClimateFeature;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeReferableString;
import org.w3c.dom.Element;


/**
 * <p>type.Property complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Property">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SignificancyPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SignificancyPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubsequentSignificancyPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SignificancyPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WarningPeriod" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Period" minOccurs="0"/>
 *         &lt;element name="AdvisoryPeriod" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Period" minOccurs="0"/>
 *         &lt;element name="PeakTime" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastTerm" minOccurs="0"/>
 *         &lt;element name="DetailForecast" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.DetailForecast" minOccurs="0"/>
 *         &lt;element name="WindPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WindPart" minOccurs="0"/>
 *         &lt;element name="WindDirectionPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WindDirectionPart" minOccurs="0"/>
 *         &lt;element name="WindSpeedPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WindSpeedPart" minOccurs="0"/>
 *         &lt;element name="WarningAreaPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WarningAreaPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WeatherPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WeatherPart" minOccurs="0"/>
 *         &lt;element name="PressurePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PressurePart" minOccurs="0"/>
 *         &lt;element name="TemperaturePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.TemperaturePart" minOccurs="0"/>
 *         &lt;element name="VisibilityPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.VisibilityPart" minOccurs="0"/>
 *         &lt;element name="SynopsisPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SynopsisPart" minOccurs="0"/>
 *         &lt;element name="WaveHeightPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WaveHeightPart" minOccurs="0"/>
 *         &lt;element name="PrecipitationPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PrecipitationPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SnowfallDepthPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SnowfallDepthPart" minOccurs="0"/>
 *         &lt;element name="SnowDepthPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SnowDepthPart" minOccurs="0"/>
 *         &lt;element name="HumidityPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.HumidityPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TidalLevelPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.TidalLevelPart" minOccurs="0"/>
 *         &lt;element name="SunshinePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SunshinePart" minOccurs="0"/>
 *         &lt;element name="WeatherCodePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WeatherCodePart" minOccurs="0"/>
 *         &lt;element name="ProbabilityOfPrecipitationPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ProbabilityOfPrecipitationPart" minOccurs="0"/>
 *         &lt;element name="SeaIcePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SeaIcePart" minOccurs="0"/>
 *         &lt;element name="IcingPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.IcingPart" minOccurs="0"/>
 *         &lt;element name="ReliabilityClassPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ReliabilityClassPart" minOccurs="0"/>
 *         &lt;element name="ReliabilityValuePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ReliabilityValuePart" minOccurs="0"/>
 *         &lt;element name="ClassPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ClassPart" minOccurs="0"/>
 *         &lt;element name="PossibilityRankOfWarningPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PossibilityRankOfWarningPart" minOccurs="0"/>
 *         &lt;element name="TyphoonNamePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.TyphoonNamePart" minOccurs="0"/>
 *         &lt;element name="CenterPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.CenterPart" minOccurs="0"/>
 *         &lt;element name="CoordinatePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.CoordinatePart" minOccurs="0"/>
 *         &lt;element name="IsobarPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.IsobarPart" minOccurs="0"/>
 *         &lt;element name="WaterLevelPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WaterLevelPart" minOccurs="0"/>
 *         &lt;element name="FloodAssumptionTable" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.FloodAssumptionTable" minOccurs="0"/>
 *         &lt;element name="DischargePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.DischargePart" minOccurs="0"/>
 *         &lt;element name="ClimateFeaturePart" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.ClimateFeature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClimateValuesPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ClimateValuesPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClimateProbabilityValuesPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ClimateProbabilityValuesPart" minOccurs="0"/>
 *         &lt;element name="EventDatePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.EventDatePart" minOccurs="0"/>
 *         &lt;element name="PrecipitationClassPart" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.ClassThresholdOfAverage" minOccurs="0"/>
 *         &lt;element name="SolarZenithAnglePart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SolarZenithAnglePart" minOccurs="0"/>
 *         &lt;element name="UvIndexPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.UvIndexPart" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='http://xml.kishou.go.jp/jmaxml1/addition1/' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.ReferableString" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Property", propOrder = {
    "type",
    "significancyPart",
    "subsequentSignificancyPart",
    "warningPeriod",
    "advisoryPeriod",
    "peakTime",
    "detailForecast",
    "windPart",
    "windDirectionPart",
    "windSpeedPart",
    "warningAreaPart",
    "weatherPart",
    "pressurePart",
    "temperaturePart",
    "visibilityPart",
    "synopsisPart",
    "waveHeightPart",
    "precipitationPart",
    "snowfallDepthPart",
    "snowDepthPart",
    "humidityPart",
    "tidalLevelPart",
    "sunshinePart",
    "weatherCodePart",
    "probabilityOfPrecipitationPart",
    "seaIcePart",
    "icingPart",
    "reliabilityClassPart",
    "reliabilityValuePart",
    "classPart",
    "possibilityRankOfWarningPart",
    "typhoonNamePart",
    "centerPart",
    "coordinatePart",
    "isobarPart",
    "waterLevelPart",
    "floodAssumptionTable",
    "dischargePart",
    "climateFeaturePart",
    "climateValuesPart",
    "climateProbabilityValuesPart",
    "eventDatePart",
    "precipitationClassPart",
    "solarZenithAnglePart",
    "uvIndexPart",
    "any",
    "text"
})
public class TypeProperty {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "SignificancyPart")
    protected List<TypeSignificancyPart> significancyPart;
    @XmlElement(name = "SubsequentSignificancyPart")
    protected List<TypeSignificancyPart> subsequentSignificancyPart;
    @XmlElement(name = "WarningPeriod")
    protected TypePeriod warningPeriod;
    @XmlElement(name = "AdvisoryPeriod")
    protected TypePeriod advisoryPeriod;
    @XmlElement(name = "PeakTime")
    protected TypeForecastTerm peakTime;
    @XmlElement(name = "DetailForecast")
    protected TypeDetailForecast detailForecast;
    @XmlElement(name = "WindPart")
    protected TypeWindPart windPart;
    @XmlElement(name = "WindDirectionPart")
    protected TypeWindDirectionPart windDirectionPart;
    @XmlElement(name = "WindSpeedPart")
    protected TypeWindSpeedPart windSpeedPart;
    @XmlElement(name = "WarningAreaPart")
    protected List<TypeWarningAreaPart> warningAreaPart;
    @XmlElement(name = "WeatherPart")
    protected TypeWeatherPart weatherPart;
    @XmlElement(name = "PressurePart")
    protected TypePressurePart pressurePart;
    @XmlElement(name = "TemperaturePart")
    protected TypeTemperaturePart temperaturePart;
    @XmlElement(name = "VisibilityPart")
    protected TypeVisibilityPart visibilityPart;
    @XmlElement(name = "SynopsisPart")
    protected TypeSynopsisPart synopsisPart;
    @XmlElement(name = "WaveHeightPart")
    protected TypeWaveHeightPart waveHeightPart;
    @XmlElement(name = "PrecipitationPart")
    protected List<TypePrecipitationPart> precipitationPart;
    @XmlElement(name = "SnowfallDepthPart")
    protected TypeSnowfallDepthPart snowfallDepthPart;
    @XmlElement(name = "SnowDepthPart")
    protected TypeSnowDepthPart snowDepthPart;
    @XmlElement(name = "HumidityPart")
    protected List<TypeHumidityPart> humidityPart;
    @XmlElement(name = "TidalLevelPart")
    protected TypeTidalLevelPart tidalLevelPart;
    @XmlElement(name = "SunshinePart")
    protected TypeSunshinePart sunshinePart;
    @XmlElement(name = "WeatherCodePart")
    protected TypeWeatherCodePart weatherCodePart;
    @XmlElement(name = "ProbabilityOfPrecipitationPart")
    protected TypeProbabilityOfPrecipitationPart probabilityOfPrecipitationPart;
    @XmlElement(name = "SeaIcePart")
    protected TypeSeaIcePart seaIcePart;
    @XmlElement(name = "IcingPart")
    protected TypeIcingPart icingPart;
    @XmlElement(name = "ReliabilityClassPart")
    protected TypeReliabilityClassPart reliabilityClassPart;
    @XmlElement(name = "ReliabilityValuePart")
    protected TypeReliabilityValuePart reliabilityValuePart;
    @XmlElement(name = "ClassPart")
    protected TypeClassPart classPart;
    @XmlElement(name = "PossibilityRankOfWarningPart")
    protected TypePossibilityRankOfWarningPart possibilityRankOfWarningPart;
    @XmlElement(name = "TyphoonNamePart")
    protected TypeTyphoonNamePart typhoonNamePart;
    @XmlElement(name = "CenterPart")
    protected TypeCenterPart centerPart;
    @XmlElement(name = "CoordinatePart")
    protected TypeCoordinatePart coordinatePart;
    @XmlElement(name = "IsobarPart")
    protected TypeIsobarPart isobarPart;
    @XmlElement(name = "WaterLevelPart")
    protected TypeWaterLevelPart waterLevelPart;
    @XmlElement(name = "FloodAssumptionTable")
    protected TypeFloodAssumptionTable floodAssumptionTable;
    @XmlElement(name = "DischargePart")
    protected TypeDischargePart dischargePart;
    @XmlElement(name = "ClimateFeaturePart")
    protected List<TypeClimateFeature> climateFeaturePart;
    @XmlElement(name = "ClimateValuesPart")
    protected List<TypeClimateValuesPart> climateValuesPart;
    @XmlElement(name = "ClimateProbabilityValuesPart")
    protected TypeClimateProbabilityValuesPart climateProbabilityValuesPart;
    @XmlElement(name = "EventDatePart")
    protected TypeEventDatePart eventDatePart;
    @XmlElement(name = "PrecipitationClassPart")
    protected TypeClassThresholdOfAverage precipitationClassPart;
    @XmlElement(name = "SolarZenithAnglePart")
    protected TypeSolarZenithAnglePart solarZenithAnglePart;
    @XmlElement(name = "UvIndexPart")
    protected TypeUvIndexPart uvIndexPart;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "Text")
    protected List<TypeReferableString> text;

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

    /**
     * Gets the value of the significancyPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the significancyPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignificancyPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSignificancyPart }
     * 
     * 
     */
    public List<TypeSignificancyPart> getSignificancyPart() {
        if (significancyPart == null) {
            significancyPart = new ArrayList<TypeSignificancyPart>();
        }
        return this.significancyPart;
    }

    /**
     * Gets the value of the subsequentSignificancyPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsequentSignificancyPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsequentSignificancyPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSignificancyPart }
     * 
     * 
     */
    public List<TypeSignificancyPart> getSubsequentSignificancyPart() {
        if (subsequentSignificancyPart == null) {
            subsequentSignificancyPart = new ArrayList<TypeSignificancyPart>();
        }
        return this.subsequentSignificancyPart;
    }

    /**
     * warningPeriodプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePeriod }
     *     
     */
    public TypePeriod getWarningPeriod() {
        return warningPeriod;
    }

    /**
     * warningPeriodプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePeriod }
     *     
     */
    public void setWarningPeriod(TypePeriod value) {
        this.warningPeriod = value;
    }

    /**
     * advisoryPeriodプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePeriod }
     *     
     */
    public TypePeriod getAdvisoryPeriod() {
        return advisoryPeriod;
    }

    /**
     * advisoryPeriodプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePeriod }
     *     
     */
    public void setAdvisoryPeriod(TypePeriod value) {
        this.advisoryPeriod = value;
    }

    /**
     * peakTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastTerm }
     *     
     */
    public TypeForecastTerm getPeakTime() {
        return peakTime;
    }

    /**
     * peakTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastTerm }
     *     
     */
    public void setPeakTime(TypeForecastTerm value) {
        this.peakTime = value;
    }

    /**
     * detailForecastプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeDetailForecast }
     *     
     */
    public TypeDetailForecast getDetailForecast() {
        return detailForecast;
    }

    /**
     * detailForecastプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDetailForecast }
     *     
     */
    public void setDetailForecast(TypeDetailForecast value) {
        this.detailForecast = value;
    }

    /**
     * windPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeWindPart }
     *     
     */
    public TypeWindPart getWindPart() {
        return windPart;
    }

    /**
     * windPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWindPart }
     *     
     */
    public void setWindPart(TypeWindPart value) {
        this.windPart = value;
    }

    /**
     * windDirectionPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeWindDirectionPart }
     *     
     */
    public TypeWindDirectionPart getWindDirectionPart() {
        return windDirectionPart;
    }

    /**
     * windDirectionPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWindDirectionPart }
     *     
     */
    public void setWindDirectionPart(TypeWindDirectionPart value) {
        this.windDirectionPart = value;
    }

    /**
     * windSpeedPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeWindSpeedPart }
     *     
     */
    public TypeWindSpeedPart getWindSpeedPart() {
        return windSpeedPart;
    }

    /**
     * windSpeedPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWindSpeedPart }
     *     
     */
    public void setWindSpeedPart(TypeWindSpeedPart value) {
        this.windSpeedPart = value;
    }

    /**
     * Gets the value of the warningAreaPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningAreaPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningAreaPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWarningAreaPart }
     * 
     * 
     */
    public List<TypeWarningAreaPart> getWarningAreaPart() {
        if (warningAreaPart == null) {
            warningAreaPart = new ArrayList<TypeWarningAreaPart>();
        }
        return this.warningAreaPart;
    }

    /**
     * weatherPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeWeatherPart }
     *     
     */
    public TypeWeatherPart getWeatherPart() {
        return weatherPart;
    }

    /**
     * weatherPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWeatherPart }
     *     
     */
    public void setWeatherPart(TypeWeatherPart value) {
        this.weatherPart = value;
    }

    /**
     * pressurePartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePressurePart }
     *     
     */
    public TypePressurePart getPressurePart() {
        return pressurePart;
    }

    /**
     * pressurePartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePressurePart }
     *     
     */
    public void setPressurePart(TypePressurePart value) {
        this.pressurePart = value;
    }

    /**
     * temperaturePartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTemperaturePart }
     *     
     */
    public TypeTemperaturePart getTemperaturePart() {
        return temperaturePart;
    }

    /**
     * temperaturePartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTemperaturePart }
     *     
     */
    public void setTemperaturePart(TypeTemperaturePart value) {
        this.temperaturePart = value;
    }

    /**
     * visibilityPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeVisibilityPart }
     *     
     */
    public TypeVisibilityPart getVisibilityPart() {
        return visibilityPart;
    }

    /**
     * visibilityPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVisibilityPart }
     *     
     */
    public void setVisibilityPart(TypeVisibilityPart value) {
        this.visibilityPart = value;
    }

    /**
     * synopsisPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeSynopsisPart }
     *     
     */
    public TypeSynopsisPart getSynopsisPart() {
        return synopsisPart;
    }

    /**
     * synopsisPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSynopsisPart }
     *     
     */
    public void setSynopsisPart(TypeSynopsisPart value) {
        this.synopsisPart = value;
    }

    /**
     * waveHeightPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeWaveHeightPart }
     *     
     */
    public TypeWaveHeightPart getWaveHeightPart() {
        return waveHeightPart;
    }

    /**
     * waveHeightPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWaveHeightPart }
     *     
     */
    public void setWaveHeightPart(TypeWaveHeightPart value) {
        this.waveHeightPart = value;
    }

    /**
     * Gets the value of the precipitationPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precipitationPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecipitationPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePrecipitationPart }
     * 
     * 
     */
    public List<TypePrecipitationPart> getPrecipitationPart() {
        if (precipitationPart == null) {
            precipitationPart = new ArrayList<TypePrecipitationPart>();
        }
        return this.precipitationPart;
    }

    /**
     * snowfallDepthPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeSnowfallDepthPart }
     *     
     */
    public TypeSnowfallDepthPart getSnowfallDepthPart() {
        return snowfallDepthPart;
    }

    /**
     * snowfallDepthPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSnowfallDepthPart }
     *     
     */
    public void setSnowfallDepthPart(TypeSnowfallDepthPart value) {
        this.snowfallDepthPart = value;
    }

    /**
     * snowDepthPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeSnowDepthPart }
     *     
     */
    public TypeSnowDepthPart getSnowDepthPart() {
        return snowDepthPart;
    }

    /**
     * snowDepthPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSnowDepthPart }
     *     
     */
    public void setSnowDepthPart(TypeSnowDepthPart value) {
        this.snowDepthPart = value;
    }

    /**
     * Gets the value of the humidityPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the humidityPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHumidityPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeHumidityPart }
     * 
     * 
     */
    public List<TypeHumidityPart> getHumidityPart() {
        if (humidityPart == null) {
            humidityPart = new ArrayList<TypeHumidityPart>();
        }
        return this.humidityPart;
    }

    /**
     * tidalLevelPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTidalLevelPart }
     *     
     */
    public TypeTidalLevelPart getTidalLevelPart() {
        return tidalLevelPart;
    }

    /**
     * tidalLevelPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTidalLevelPart }
     *     
     */
    public void setTidalLevelPart(TypeTidalLevelPart value) {
        this.tidalLevelPart = value;
    }

    /**
     * sunshinePartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeSunshinePart }
     *     
     */
    public TypeSunshinePart getSunshinePart() {
        return sunshinePart;
    }

    /**
     * sunshinePartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSunshinePart }
     *     
     */
    public void setSunshinePart(TypeSunshinePart value) {
        this.sunshinePart = value;
    }

    /**
     * weatherCodePartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeWeatherCodePart }
     *     
     */
    public TypeWeatherCodePart getWeatherCodePart() {
        return weatherCodePart;
    }

    /**
     * weatherCodePartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWeatherCodePart }
     *     
     */
    public void setWeatherCodePart(TypeWeatherCodePart value) {
        this.weatherCodePart = value;
    }

    /**
     * probabilityOfPrecipitationPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeProbabilityOfPrecipitationPart }
     *     
     */
    public TypeProbabilityOfPrecipitationPart getProbabilityOfPrecipitationPart() {
        return probabilityOfPrecipitationPart;
    }

    /**
     * probabilityOfPrecipitationPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbabilityOfPrecipitationPart }
     *     
     */
    public void setProbabilityOfPrecipitationPart(TypeProbabilityOfPrecipitationPart value) {
        this.probabilityOfPrecipitationPart = value;
    }

    /**
     * seaIcePartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeSeaIcePart }
     *     
     */
    public TypeSeaIcePart getSeaIcePart() {
        return seaIcePart;
    }

    /**
     * seaIcePartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSeaIcePart }
     *     
     */
    public void setSeaIcePart(TypeSeaIcePart value) {
        this.seaIcePart = value;
    }

    /**
     * icingPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeIcingPart }
     *     
     */
    public TypeIcingPart getIcingPart() {
        return icingPart;
    }

    /**
     * icingPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIcingPart }
     *     
     */
    public void setIcingPart(TypeIcingPart value) {
        this.icingPart = value;
    }

    /**
     * reliabilityClassPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeReliabilityClassPart }
     *     
     */
    public TypeReliabilityClassPart getReliabilityClassPart() {
        return reliabilityClassPart;
    }

    /**
     * reliabilityClassPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReliabilityClassPart }
     *     
     */
    public void setReliabilityClassPart(TypeReliabilityClassPart value) {
        this.reliabilityClassPart = value;
    }

    /**
     * reliabilityValuePartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeReliabilityValuePart }
     *     
     */
    public TypeReliabilityValuePart getReliabilityValuePart() {
        return reliabilityValuePart;
    }

    /**
     * reliabilityValuePartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReliabilityValuePart }
     *     
     */
    public void setReliabilityValuePart(TypeReliabilityValuePart value) {
        this.reliabilityValuePart = value;
    }

    /**
     * classPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeClassPart }
     *     
     */
    public TypeClassPart getClassPart() {
        return classPart;
    }

    /**
     * classPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeClassPart }
     *     
     */
    public void setClassPart(TypeClassPart value) {
        this.classPart = value;
    }

    /**
     * possibilityRankOfWarningPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePossibilityRankOfWarningPart }
     *     
     */
    public TypePossibilityRankOfWarningPart getPossibilityRankOfWarningPart() {
        return possibilityRankOfWarningPart;
    }

    /**
     * possibilityRankOfWarningPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePossibilityRankOfWarningPart }
     *     
     */
    public void setPossibilityRankOfWarningPart(TypePossibilityRankOfWarningPart value) {
        this.possibilityRankOfWarningPart = value;
    }

    /**
     * typhoonNamePartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTyphoonNamePart }
     *     
     */
    public TypeTyphoonNamePart getTyphoonNamePart() {
        return typhoonNamePart;
    }

    /**
     * typhoonNamePartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTyphoonNamePart }
     *     
     */
    public void setTyphoonNamePart(TypeTyphoonNamePart value) {
        this.typhoonNamePart = value;
    }

    /**
     * centerPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCenterPart }
     *     
     */
    public TypeCenterPart getCenterPart() {
        return centerPart;
    }

    /**
     * centerPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCenterPart }
     *     
     */
    public void setCenterPart(TypeCenterPart value) {
        this.centerPart = value;
    }

    /**
     * coordinatePartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCoordinatePart }
     *     
     */
    public TypeCoordinatePart getCoordinatePart() {
        return coordinatePart;
    }

    /**
     * coordinatePartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCoordinatePart }
     *     
     */
    public void setCoordinatePart(TypeCoordinatePart value) {
        this.coordinatePart = value;
    }

    /**
     * isobarPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeIsobarPart }
     *     
     */
    public TypeIsobarPart getIsobarPart() {
        return isobarPart;
    }

    /**
     * isobarPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIsobarPart }
     *     
     */
    public void setIsobarPart(TypeIsobarPart value) {
        this.isobarPart = value;
    }

    /**
     * waterLevelPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeWaterLevelPart }
     *     
     */
    public TypeWaterLevelPart getWaterLevelPart() {
        return waterLevelPart;
    }

    /**
     * waterLevelPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWaterLevelPart }
     *     
     */
    public void setWaterLevelPart(TypeWaterLevelPart value) {
        this.waterLevelPart = value;
    }

    /**
     * floodAssumptionTableプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeFloodAssumptionTable }
     *     
     */
    public TypeFloodAssumptionTable getFloodAssumptionTable() {
        return floodAssumptionTable;
    }

    /**
     * floodAssumptionTableプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFloodAssumptionTable }
     *     
     */
    public void setFloodAssumptionTable(TypeFloodAssumptionTable value) {
        this.floodAssumptionTable = value;
    }

    /**
     * dischargePartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeDischargePart }
     *     
     */
    public TypeDischargePart getDischargePart() {
        return dischargePart;
    }

    /**
     * dischargePartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDischargePart }
     *     
     */
    public void setDischargePart(TypeDischargePart value) {
        this.dischargePart = value;
    }

    /**
     * Gets the value of the climateFeaturePart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the climateFeaturePart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClimateFeaturePart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeClimateFeature }
     * 
     * 
     */
    public List<TypeClimateFeature> getClimateFeaturePart() {
        if (climateFeaturePart == null) {
            climateFeaturePart = new ArrayList<TypeClimateFeature>();
        }
        return this.climateFeaturePart;
    }

    /**
     * Gets the value of the climateValuesPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the climateValuesPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClimateValuesPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeClimateValuesPart }
     * 
     * 
     */
    public List<TypeClimateValuesPart> getClimateValuesPart() {
        if (climateValuesPart == null) {
            climateValuesPart = new ArrayList<TypeClimateValuesPart>();
        }
        return this.climateValuesPart;
    }

    /**
     * climateProbabilityValuesPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeClimateProbabilityValuesPart }
     *     
     */
    public TypeClimateProbabilityValuesPart getClimateProbabilityValuesPart() {
        return climateProbabilityValuesPart;
    }

    /**
     * climateProbabilityValuesPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeClimateProbabilityValuesPart }
     *     
     */
    public void setClimateProbabilityValuesPart(TypeClimateProbabilityValuesPart value) {
        this.climateProbabilityValuesPart = value;
    }

    /**
     * eventDatePartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeEventDatePart }
     *     
     */
    public TypeEventDatePart getEventDatePart() {
        return eventDatePart;
    }

    /**
     * eventDatePartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEventDatePart }
     *     
     */
    public void setEventDatePart(TypeEventDatePart value) {
        this.eventDatePart = value;
    }

    /**
     * precipitationClassPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeClassThresholdOfAverage }
     *     
     */
    public TypeClassThresholdOfAverage getPrecipitationClassPart() {
        return precipitationClassPart;
    }

    /**
     * precipitationClassPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeClassThresholdOfAverage }
     *     
     */
    public void setPrecipitationClassPart(TypeClassThresholdOfAverage value) {
        this.precipitationClassPart = value;
    }

    /**
     * solarZenithAnglePartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeSolarZenithAnglePart }
     *     
     */
    public TypeSolarZenithAnglePart getSolarZenithAnglePart() {
        return solarZenithAnglePart;
    }

    /**
     * solarZenithAnglePartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSolarZenithAnglePart }
     *     
     */
    public void setSolarZenithAnglePart(TypeSolarZenithAnglePart value) {
        this.solarZenithAnglePart = value;
    }

    /**
     * uvIndexPartプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeUvIndexPart }
     *     
     */
    public TypeUvIndexPart getUvIndexPart() {
        return uvIndexPart;
    }

    /**
     * uvIndexPartプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeUvIndexPart }
     *     
     */
    public void setUvIndexPart(TypeUvIndexPart value) {
        this.uvIndexPart = value;
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

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeReferableString }
     * 
     * 
     */
    public List<TypeReferableString> getText() {
        if (text == null) {
            text = new ArrayList<TypeReferableString>();
        }
        return this.text;
    }

}
