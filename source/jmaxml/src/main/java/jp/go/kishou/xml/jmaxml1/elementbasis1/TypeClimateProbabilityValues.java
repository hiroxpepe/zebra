//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.elementbasis1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.ClimateProbabilityValues complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.ClimateProbabilityValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProbabilityOfBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability"/>
 *         &lt;element name="ProbabilityOfNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability"/>
 *         &lt;element name="ProbabilityOfAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability"/>
 *       &lt;/sequence>
 *       &lt;attribute name="kind" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ClimateProbabilityValues", propOrder = {
    "probabilityOfBelowNormal",
    "probabilityOfNormal",
    "probabilityOfAboveNormal"
})
public class TypeClimateProbabilityValues {

    @XmlElement(name = "ProbabilityOfBelowNormal", required = true)
    protected TypeProbability probabilityOfBelowNormal;
    @XmlElement(name = "ProbabilityOfNormal", required = true)
    protected TypeProbability probabilityOfNormal;
    @XmlElement(name = "ProbabilityOfAboveNormal", required = true)
    protected TypeProbability probabilityOfAboveNormal;
    @XmlAttribute(name = "kind", required = true)
    protected String kind;
    @XmlAttribute(name = "refID")
    @XmlSchemaType(name = "unsignedByte")
    protected Short refID;

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

    /**
     * refIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRefID() {
        return refID;
    }

    /**
     * refIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRefID(Short value) {
        this.refID = value;
    }

}
