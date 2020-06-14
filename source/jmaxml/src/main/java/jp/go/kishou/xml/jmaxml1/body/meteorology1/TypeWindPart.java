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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWindDegree;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWindDirection;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWindScale;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWindSpeed;


/**
 * <p>type.WindPart complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.WindPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sentence" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Sentence" minOccurs="0"/>
 *         &lt;element name="Base" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWind" minOccurs="0"/>
 *         &lt;element name="Temporary" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWind" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Becoming" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWind" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubArea" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SubAreaWind" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}WindDirection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}WindDegree" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}WindSpeed" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}WindScale" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.WindPart", propOrder = {
    "sentence",
    "base",
    "temporary",
    "becoming",
    "subArea",
    "windDirection",
    "windDegree",
    "windSpeed",
    "windScale",
    "time",
    "remark"
})
public class TypeWindPart {

    @XmlElement(name = "Sentence")
    protected TypeSentence sentence;
    @XmlElement(name = "Base")
    protected TypeBaseWind base;
    @XmlElement(name = "Temporary")
    protected List<TypeBaseWind> temporary;
    @XmlElement(name = "Becoming")
    protected List<TypeBaseWind> becoming;
    @XmlElement(name = "SubArea")
    protected List<TypeSubAreaWind> subArea;
    @XmlElement(name = "WindDirection", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWindDirection> windDirection;
    @XmlElement(name = "WindDegree", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWindDegree> windDegree;
    @XmlElement(name = "WindSpeed", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWindSpeed> windSpeed;
    @XmlElement(name = "WindScale", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWindScale> windScale;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Remark")
    protected String remark;

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
     *     {@link TypeBaseWind }
     *     
     */
    public TypeBaseWind getBase() {
        return base;
    }

    /**
     * baseプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBaseWind }
     *     
     */
    public void setBase(TypeBaseWind value) {
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
     * {@link TypeBaseWind }
     * 
     * 
     */
    public List<TypeBaseWind> getTemporary() {
        if (temporary == null) {
            temporary = new ArrayList<TypeBaseWind>();
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
     * {@link TypeBaseWind }
     * 
     * 
     */
    public List<TypeBaseWind> getBecoming() {
        if (becoming == null) {
            becoming = new ArrayList<TypeBaseWind>();
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
     * {@link TypeSubAreaWind }
     * 
     * 
     */
    public List<TypeSubAreaWind> getSubArea() {
        if (subArea == null) {
            subArea = new ArrayList<TypeSubAreaWind>();
        }
        return this.subArea;
    }

    /**
     * Gets the value of the windDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWindDirection }
     * 
     * 
     */
    public List<TypeWindDirection> getWindDirection() {
        if (windDirection == null) {
            windDirection = new ArrayList<TypeWindDirection>();
        }
        return this.windDirection;
    }

    /**
     * Gets the value of the windDegree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windDegree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindDegree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWindDegree }
     * 
     * 
     */
    public List<TypeWindDegree> getWindDegree() {
        if (windDegree == null) {
            windDegree = new ArrayList<TypeWindDegree>();
        }
        return this.windDegree;
    }

    /**
     * Gets the value of the windSpeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windSpeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindSpeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWindSpeed }
     * 
     * 
     */
    public List<TypeWindSpeed> getWindSpeed() {
        if (windSpeed == null) {
            windSpeed = new ArrayList<TypeWindSpeed>();
        }
        return this.windSpeed;
    }

    /**
     * Gets the value of the windScale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windScale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindScale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWindScale }
     * 
     * 
     */
    public List<TypeWindScale> getWindScale() {
        if (windScale == null) {
            windScale = new ArrayList<TypeWindScale>();
        }
        return this.windScale;
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

}
