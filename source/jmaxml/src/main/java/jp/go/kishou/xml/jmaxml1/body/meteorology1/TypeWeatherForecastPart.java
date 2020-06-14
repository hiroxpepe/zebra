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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWeather;


/**
 * <p>type.WeatherForecastPart complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.WeatherForecastPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sentence" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Sentence" minOccurs="0"/>
 *         &lt;element name="Base" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWeather" minOccurs="0"/>
 *         &lt;element name="Temporary" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWeather" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Becoming" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWeather" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubArea" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SubAreaWeather" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Weather" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.WeatherForecastPart", propOrder = {
    "sentence",
    "base",
    "temporary",
    "becoming",
    "subArea",
    "weather",
    "time",
    "remark"
})
public class TypeWeatherForecastPart {

    @XmlElement(name = "Sentence")
    protected TypeSentence sentence;
    @XmlElement(name = "Base")
    protected TypeBaseWeather base;
    @XmlElement(name = "Temporary")
    protected List<TypeBaseWeather> temporary;
    @XmlElement(name = "Becoming")
    protected List<TypeBaseWeather> becoming;
    @XmlElement(name = "SubArea")
    protected List<TypeSubAreaWeather> subArea;
    @XmlElement(name = "Weather", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWeather> weather;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "refID", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short refID;

    /**
     * sentenceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeSentence }
     *     
     */
    public TypeSentence getSentence() {
        return sentence;
    }

    /**
     * sentenceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSentence }
     *     
     */
    public void setSentence(TypeSentence value) {
        this.sentence = value;
    }

    /**
     * baseプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeBaseWeather }
     *     
     */
    public TypeBaseWeather getBase() {
        return base;
    }

    /**
     * baseプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBaseWeather }
     *     
     */
    public void setBase(TypeBaseWeather value) {
        this.base = value;
    }

    /**
     * Gets the value of the temporary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temporary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemporary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseWeather }
     * 
     * 
     */
    public List<TypeBaseWeather> getTemporary() {
        if (temporary == null) {
            temporary = new ArrayList<TypeBaseWeather>();
        }
        return this.temporary;
    }

    /**
     * Gets the value of the becoming property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the becoming property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBecoming().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseWeather }
     * 
     * 
     */
    public List<TypeBaseWeather> getBecoming() {
        if (becoming == null) {
            becoming = new ArrayList<TypeBaseWeather>();
        }
        return this.becoming;
    }

    /**
     * Gets the value of the subArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSubAreaWeather }
     * 
     * 
     */
    public List<TypeSubAreaWeather> getSubArea() {
        if (subArea == null) {
            subArea = new ArrayList<TypeSubAreaWeather>();
        }
        return this.subArea;
    }

    /**
     * Gets the value of the weather property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weather property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeather().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWeather }
     * 
     * 
     */
    public List<TypeWeather> getWeather() {
        if (weather == null) {
            weather = new ArrayList<TypeWeather>();
        }
        return this.weather;
    }

    /**
     * timeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * timeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
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
     * refIDプロパティの値を取得します。
     * 
     */
    public short getRefID() {
        return refID;
    }

    /**
     * refIDプロパティの値を設定します。
     * 
     */
    public void setRefID(short value) {
        this.refID = value;
    }

}
