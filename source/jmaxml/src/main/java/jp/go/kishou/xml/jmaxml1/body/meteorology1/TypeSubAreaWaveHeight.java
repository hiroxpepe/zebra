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
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWaveHeight;


/**
 * <p>type.SubAreaWaveHeight complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.SubAreaWaveHeight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sentence" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Sentence" minOccurs="0"/>
 *         &lt;element name="Base" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWaveHeight" minOccurs="0"/>
 *         &lt;element name="Temporary" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWaveHeight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Becoming" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWaveHeight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Local" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.LocalWaveHeight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}WaveHeight" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "type.SubAreaWaveHeight", propOrder = {
    "areaName",
    "sentence",
    "base",
    "temporary",
    "becoming",
    "local",
    "waveHeight",
    "time",
    "remark"
})
public class TypeSubAreaWaveHeight {

    @XmlElement(name = "AreaName")
    protected String areaName;
    @XmlElement(name = "Sentence")
    protected TypeSentence sentence;
    @XmlElement(name = "Base")
    protected TypeBaseWaveHeight base;
    @XmlElement(name = "Temporary")
    protected List<TypeBaseWaveHeight> temporary;
    @XmlElement(name = "Becoming")
    protected List<TypeBaseWaveHeight> becoming;
    @XmlElement(name = "Local")
    protected List<TypeLocalWaveHeight> local;
    @XmlElement(name = "WaveHeight", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWaveHeight> waveHeight;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Remark")
    protected String remark;

    /**
     * areaNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * areaNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

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
     *     {@link TypeBaseWaveHeight }
     *     
     */
    public TypeBaseWaveHeight getBase() {
        return base;
    }

    /**
     * baseプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBaseWaveHeight }
     *     
     */
    public void setBase(TypeBaseWaveHeight value) {
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
     * {@link TypeBaseWaveHeight }
     * 
     * 
     */
    public List<TypeBaseWaveHeight> getTemporary() {
        if (temporary == null) {
            temporary = new ArrayList<TypeBaseWaveHeight>();
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
     * {@link TypeBaseWaveHeight }
     * 
     * 
     */
    public List<TypeBaseWaveHeight> getBecoming() {
        if (becoming == null) {
            becoming = new ArrayList<TypeBaseWaveHeight>();
        }
        return this.becoming;
    }

    /**
     * Gets the value of the local property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the local property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeLocalWaveHeight }
     * 
     * 
     */
    public List<TypeLocalWaveHeight> getLocal() {
        if (local == null) {
            local = new ArrayList<TypeLocalWaveHeight>();
        }
        return this.local;
    }

    /**
     * Gets the value of the waveHeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waveHeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaveHeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWaveHeight }
     * 
     * 
     */
    public List<TypeWaveHeight> getWaveHeight() {
        if (waveHeight == null) {
            waveHeight = new ArrayList<TypeWaveHeight>();
        }
        return this.waveHeight;
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
