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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeComparison;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypePrecipitation;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeSnowDepth;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeSnowfallDepth;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeSunshine;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeTemperature;
import org.w3c.dom.Element;


/**
 * <p>type.ClimateValuesPart complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.ClimateValuesPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Temperature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Precipitation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Sunshine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}SnowfallDepth" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}SnowDepth" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='http://xml.kishou.go.jp/jmaxml1/addition1/' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Comparison" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "type.ClimateValuesPart", propOrder = {
    "temperature",
    "precipitation",
    "sunshine",
    "snowfallDepth",
    "snowDepth",
    "any",
    "comparison",
    "remark"
})
public class TypeClimateValuesPart {

    @XmlElement(name = "Temperature", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeTemperature> temperature;
    @XmlElement(name = "Precipitation", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypePrecipitation> precipitation;
    @XmlElement(name = "Sunshine", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeSunshine> sunshine;
    @XmlElement(name = "SnowfallDepth", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeSnowfallDepth> snowfallDepth;
    @XmlElement(name = "SnowDepth", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeSnowDepth> snowDepth;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "Comparison", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeComparison> comparison;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the temperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTemperature }
     * 
     * 
     */
    public List<TypeTemperature> getTemperature() {
        if (temperature == null) {
            temperature = new ArrayList<TypeTemperature>();
        }
        return this.temperature;
    }

    /**
     * Gets the value of the precipitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precipitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecipitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePrecipitation }
     * 
     * 
     */
    public List<TypePrecipitation> getPrecipitation() {
        if (precipitation == null) {
            precipitation = new ArrayList<TypePrecipitation>();
        }
        return this.precipitation;
    }

    /**
     * Gets the value of the sunshine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sunshine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSunshine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSunshine }
     * 
     * 
     */
    public List<TypeSunshine> getSunshine() {
        if (sunshine == null) {
            sunshine = new ArrayList<TypeSunshine>();
        }
        return this.sunshine;
    }

    /**
     * Gets the value of the snowfallDepth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snowfallDepth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnowfallDepth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSnowfallDepth }
     * 
     * 
     */
    public List<TypeSnowfallDepth> getSnowfallDepth() {
        if (snowfallDepth == null) {
            snowfallDepth = new ArrayList<TypeSnowfallDepth>();
        }
        return this.snowfallDepth;
    }

    /**
     * Gets the value of the snowDepth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snowDepth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnowDepth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSnowDepth }
     * 
     * 
     */
    public List<TypeSnowDepth> getSnowDepth() {
        if (snowDepth == null) {
            snowDepth = new ArrayList<TypeSnowDepth>();
        }
        return this.snowDepth;
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
     * Gets the value of the comparison property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparison property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparison().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeComparison }
     * 
     * 
     */
    public List<TypeComparison> getComparison() {
        if (comparison == null) {
            comparison = new ArrayList<TypeComparison>();
        }
        return this.comparison;
    }

    /**
     * remarkプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * remarkプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
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
