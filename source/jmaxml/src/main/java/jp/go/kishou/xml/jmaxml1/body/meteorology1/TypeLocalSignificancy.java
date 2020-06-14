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
 * <p>type.LocalSignificancy complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.LocalSignificancy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Significancy" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Significancy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Sentence" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Sentence" minOccurs="0"/>
 *         &lt;element name="PeakTime" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastTerm" minOccurs="0"/>
 *         &lt;element name="Attention" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Attention" minOccurs="0"/>
 *         &lt;element name="Addition" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Addition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.LocalSignificancy", propOrder = {
    "areaName",
    "significancy",
    "sentence",
    "peakTime",
    "attention",
    "addition"
})
public class TypeLocalSignificancy {

    @XmlElement(name = "AreaName", required = true)
    protected String areaName;
    @XmlElement(name = "Significancy")
    protected List<TypeSignificancy> significancy;
    @XmlElement(name = "Sentence")
    protected TypeSentence sentence;
    @XmlElement(name = "PeakTime")
    protected TypeForecastTerm peakTime;
    @XmlElement(name = "Attention")
    protected TypeAttention attention;
    @XmlElement(name = "Addition")
    protected TypeAddition addition;

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
     * Gets the value of the significancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the significancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignificancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSignificancy }
     * 
     * 
     */
    public List<TypeSignificancy> getSignificancy() {
        if (significancy == null) {
            significancy = new ArrayList<TypeSignificancy>();
        }
        return this.significancy;
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
     * attentionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeAttention }
     *     
     */
    public TypeAttention getAttention() {
        return attention;
    }

    /**
     * attentionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAttention }
     *     
     */
    public void setAttention(TypeAttention value) {
        this.attention = value;
    }

    /**
     * additionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeAddition }
     *     
     */
    public TypeAddition getAddition() {
        return addition;
    }

    /**
     * additionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAddition }
     *     
     */
    public void setAddition(TypeAddition value) {
        this.addition = value;
    }

}
