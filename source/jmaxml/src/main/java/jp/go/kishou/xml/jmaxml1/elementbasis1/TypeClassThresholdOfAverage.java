//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.elementbasis1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.ClassThresholdOfAverage complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.ClassThresholdOfAverage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThresholdOfMinimum" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/>
 *         &lt;element name="ThresholdOfSignificantlyBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/>
 *         &lt;element name="ThresholdOfBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/>
 *         &lt;element name="ThresholdOfAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/>
 *         &lt;element name="ThresholdOfSignificantlyAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/>
 *         &lt;element name="ThresholdOfMaximum" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ClassThresholdOfAverage", propOrder = {
    "thresholdOfMinimum",
    "thresholdOfSignificantlyBelowNormal",
    "thresholdOfBelowNormal",
    "thresholdOfAboveNormal",
    "thresholdOfSignificantlyAboveNormal",
    "thresholdOfMaximum"
})
public class TypeClassThresholdOfAverage {

    @XmlElement(name = "ThresholdOfMinimum")
    protected TypeThreshold thresholdOfMinimum;
    @XmlElement(name = "ThresholdOfSignificantlyBelowNormal")
    protected TypeThreshold thresholdOfSignificantlyBelowNormal;
    @XmlElement(name = "ThresholdOfBelowNormal")
    protected TypeThreshold thresholdOfBelowNormal;
    @XmlElement(name = "ThresholdOfAboveNormal")
    protected TypeThreshold thresholdOfAboveNormal;
    @XmlElement(name = "ThresholdOfSignificantlyAboveNormal")
    protected TypeThreshold thresholdOfSignificantlyAboveNormal;
    @XmlElement(name = "ThresholdOfMaximum")
    protected TypeThreshold thresholdOfMaximum;

    /**
     * thresholdOfMinimumプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfMinimum() {
        return thresholdOfMinimum;
    }

    /**
     * thresholdOfMinimumプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfMinimum(TypeThreshold value) {
        this.thresholdOfMinimum = value;
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
     * thresholdOfMaximumプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfMaximum() {
        return thresholdOfMaximum;
    }

    /**
     * thresholdOfMaximumプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfMaximum(TypeThreshold value) {
        this.thresholdOfMaximum = value;
    }

}
