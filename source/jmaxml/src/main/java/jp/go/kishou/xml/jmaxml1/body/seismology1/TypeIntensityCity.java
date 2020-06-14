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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>type.IntensityCity complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.IntensityCity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Category" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Category" minOccurs="0"/>
 *         &lt;element name="MaxInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastInt" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.ForecastInt" minOccurs="0"/>
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Revise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntensityStation" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.IntensityStation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.IntensityCity", propOrder = {
    "name",
    "code",
    "category",
    "maxInt",
    "forecastInt",
    "arrivalTime",
    "condition",
    "revise",
    "intensityStation"
})
public class TypeIntensityCity {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Category")
    protected TypeCategory category;
    @XmlElement(name = "MaxInt")
    protected String maxInt;
    @XmlElement(name = "ForecastInt")
    protected TypeForecastInt forecastInt;
    @XmlElement(name = "ArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "Revise")
    protected String revise;
    @XmlElement(name = "IntensityStation")
    protected List<TypeIntensityStation> intensityStation;

    /**
     * nameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * nameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * codeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * codeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     * maxIntプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxInt() {
        return maxInt;
    }

    /**
     * maxIntプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxInt(String value) {
        this.maxInt = value;
    }

    /**
     * forecastIntプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastInt }
     *     
     */
    public TypeForecastInt getForecastInt() {
        return forecastInt;
    }

    /**
     * forecastIntプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastInt }
     *     
     */
    public void setForecastInt(TypeForecastInt value) {
        this.forecastInt = value;
    }

    /**
     * arrivalTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * arrivalTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
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
     * Gets the value of the intensityStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intensityStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntensityStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeIntensityStation }
     * 
     * 
     */
    public List<TypeIntensityStation> getIntensityStation() {
        if (intensityStation == null) {
            intensityStation = new ArrayList<TypeIntensityStation>();
        }
        return this.intensityStation;
    }

}
