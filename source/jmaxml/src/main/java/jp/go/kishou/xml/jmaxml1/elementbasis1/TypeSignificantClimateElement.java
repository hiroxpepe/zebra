//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.elementbasis1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.SignificantClimateElement complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.SignificantClimateElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.ReferableString" maxOccurs="unbounded"/>
 *         &lt;element name="ProbabilityOfBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability" minOccurs="0"/>
 *         &lt;element name="ProbabilityOfNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability" minOccurs="0"/>
 *         &lt;element name="ProbabilityOfAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability" minOccurs="0"/>
 *         &lt;element name="ProbabilityOfSignificantlyBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability" minOccurs="0"/>
 *         &lt;element name="ProbabilityOfSignificantlyAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability" minOccurs="0"/>
 *         &lt;element name="ThresholdOfBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/>
 *         &lt;element name="ThresholdOfAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/>
 *         &lt;element name="ThresholdOfSignificantlyBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/>
 *         &lt;element name="ThresholdOfSignificantlyAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="kind" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.SignificantClimateElement", propOrder = {
    "text",
    "probabilityOfBelowNormal",
    "probabilityOfNormal",
    "probabilityOfAboveNormal",
    "probabilityOfSignificantlyBelowNormal",
    "probabilityOfSignificantlyAboveNormal",
    "thresholdOfBelowNormal",
    "thresholdOfAboveNormal",
    "thresholdOfSignificantlyBelowNormal",
    "thresholdOfSignificantlyAboveNormal"
})
public class TypeSignificantClimateElement {

    @XmlElement(name = "Text", required = true)
    protected List<TypeReferableString> text;
    @XmlElement(name = "ProbabilityOfBelowNormal")
    protected TypeProbability probabilityOfBelowNormal;
    @XmlElement(name = "ProbabilityOfNormal")
    protected TypeProbability probabilityOfNormal;
    @XmlElement(name = "ProbabilityOfAboveNormal")
    protected TypeProbability probabilityOfAboveNormal;
    @XmlElement(name = "ProbabilityOfSignificantlyBelowNormal")
    protected TypeProbability probabilityOfSignificantlyBelowNormal;
    @XmlElement(name = "ProbabilityOfSignificantlyAboveNormal")
    protected TypeProbability probabilityOfSignificantlyAboveNormal;
    @XmlElement(name = "ThresholdOfBelowNormal")
    protected TypeThreshold thresholdOfBelowNormal;
    @XmlElement(name = "ThresholdOfAboveNormal")
    protected TypeThreshold thresholdOfAboveNormal;
    @XmlElement(name = "ThresholdOfSignificantlyBelowNormal")
    protected TypeThreshold thresholdOfSignificantlyBelowNormal;
    @XmlElement(name = "ThresholdOfSignificantlyAboveNormal")
    protected TypeThreshold thresholdOfSignificantlyAboveNormal;
    @XmlAttribute(name = "kind", required = true)
    protected String kind;

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

    /**
     * probabilityOfBelowNormalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeProbability }
     *     
     */
    public TypeProbability getProbabilityOfBelowNormal() {
        return probabilityOfBelowNormal;
    }

    /**
     * probabilityOfBelowNormalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbability }
     *     
     */
    public void setProbabilityOfBelowNormal(TypeProbability value) {
        this.probabilityOfBelowNormal = value;
    }

    /**
     * probabilityOfNormalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeProbability }
     *     
     */
    public TypeProbability getProbabilityOfNormal() {
        return probabilityOfNormal;
    }

    /**
     * probabilityOfNormalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbability }
     *     
     */
    public void setProbabilityOfNormal(TypeProbability value) {
        this.probabilityOfNormal = value;
    }

    /**
     * probabilityOfAboveNormalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeProbability }
     *     
     */
    public TypeProbability getProbabilityOfAboveNormal() {
        return probabilityOfAboveNormal;
    }

    /**
     * probabilityOfAboveNormalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbability }
     *     
     */
    public void setProbabilityOfAboveNormal(TypeProbability value) {
        this.probabilityOfAboveNormal = value;
    }

    /**
     * probabilityOfSignificantlyBelowNormalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeProbability }
     *     
     */
    public TypeProbability getProbabilityOfSignificantlyBelowNormal() {
        return probabilityOfSignificantlyBelowNormal;
    }

    /**
     * probabilityOfSignificantlyBelowNormalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbability }
     *     
     */
    public void setProbabilityOfSignificantlyBelowNormal(TypeProbability value) {
        this.probabilityOfSignificantlyBelowNormal = value;
    }

    /**
     * probabilityOfSignificantlyAboveNormalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeProbability }
     *     
     */
    public TypeProbability getProbabilityOfSignificantlyAboveNormal() {
        return probabilityOfSignificantlyAboveNormal;
    }

    /**
     * probabilityOfSignificantlyAboveNormalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbability }
     *     
     */
    public void setProbabilityOfSignificantlyAboveNormal(TypeProbability value) {
        this.probabilityOfSignificantlyAboveNormal = value;
    }

    /**
     * thresholdOfBelowNormalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfBelowNormal() {
        return thresholdOfBelowNormal;
    }

    /**
     * thresholdOfBelowNormalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfBelowNormal(TypeThreshold value) {
        this.thresholdOfBelowNormal = value;
    }

    /**
     * thresholdOfAboveNormalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfAboveNormal() {
        return thresholdOfAboveNormal;
    }

    /**
     * thresholdOfAboveNormalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfAboveNormal(TypeThreshold value) {
        this.thresholdOfAboveNormal = value;
    }

    /**
     * thresholdOfSignificantlyBelowNormalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfSignificantlyBelowNormal() {
        return thresholdOfSignificantlyBelowNormal;
    }

    /**
     * thresholdOfSignificantlyBelowNormalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfSignificantlyBelowNormal(TypeThreshold value) {
        this.thresholdOfSignificantlyBelowNormal = value;
    }

    /**
     * thresholdOfSignificantlyAboveNormalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfSignificantlyAboveNormal() {
        return thresholdOfSignificantlyAboveNormal;
    }

    /**
     * thresholdOfSignificantlyAboveNormalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfSignificantlyAboveNormal(TypeThreshold value) {
        this.thresholdOfSignificantlyAboveNormal = value;
    }

    /**
     * kindプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * kindプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

}
