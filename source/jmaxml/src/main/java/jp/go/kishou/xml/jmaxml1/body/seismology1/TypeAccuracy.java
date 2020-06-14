//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.Accuracy complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Accuracy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Epicenter" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.AccuracyEpicenter"/>
 *         &lt;element name="Depth" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.AccuracyDepth"/>
 *         &lt;element name="MagnitudeCalculation" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.AccuracyMagnitude"/>
 *         &lt;element name="NumberOfMagnitudeCalculation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Accuracy", propOrder = {
    "epicenter",
    "depth",
    "magnitudeCalculation",
    "numberOfMagnitudeCalculation"
})
public class TypeAccuracy {

    @XmlElement(name = "Epicenter", required = true)
    protected TypeAccuracyEpicenter epicenter;
    @XmlElement(name = "Depth", required = true)
    protected TypeAccuracyDepth depth;
    @XmlElement(name = "MagnitudeCalculation", required = true)
    protected TypeAccuracyMagnitude magnitudeCalculation;
    @XmlElement(name = "NumberOfMagnitudeCalculation")
    protected int numberOfMagnitudeCalculation;

    /**
     * epicenterプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeAccuracyEpicenter }
     *     
     */
    public TypeAccuracyEpicenter getEpicenter() {
        return epicenter;
    }

    /**
     * epicenterプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccuracyEpicenter }
     *     
     */
    public void setEpicenter(TypeAccuracyEpicenter value) {
        this.epicenter = value;
    }

    /**
     * depthプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeAccuracyDepth }
     *     
     */
    public TypeAccuracyDepth getDepth() {
        return depth;
    }

    /**
     * depthプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccuracyDepth }
     *     
     */
    public void setDepth(TypeAccuracyDepth value) {
        this.depth = value;
    }

    /**
     * magnitudeCalculationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeAccuracyMagnitude }
     *     
     */
    public TypeAccuracyMagnitude getMagnitudeCalculation() {
        return magnitudeCalculation;
    }

    /**
     * magnitudeCalculationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccuracyMagnitude }
     *     
     */
    public void setMagnitudeCalculation(TypeAccuracyMagnitude value) {
        this.magnitudeCalculation = value;
    }

    /**
     * numberOfMagnitudeCalculationプロパティの値を取得します。
     * 
     */
    public int getNumberOfMagnitudeCalculation() {
        return numberOfMagnitudeCalculation;
    }

    /**
     * numberOfMagnitudeCalculationプロパティの値を設定します。
     * 
     */
    public void setNumberOfMagnitudeCalculation(int value) {
        this.numberOfMagnitudeCalculation = value;
    }

}
