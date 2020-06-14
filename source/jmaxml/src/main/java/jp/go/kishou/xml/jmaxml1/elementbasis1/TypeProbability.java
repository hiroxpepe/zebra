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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>type.Probability complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Probability">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bound" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="significant" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Probability", propOrder = {
    "value"
})
public class TypeProbability {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "unit")
    protected String unit;
    @XmlAttribute(name = "bound")
    protected String bound;
    @XmlAttribute(name = "significant")
    protected Boolean significant;

    /**
     * valueプロパティの値を取得します。
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * valueプロパティの値を設定します。
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * unitプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * unitプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * boundプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBound() {
        return bound;
    }

    /**
     * boundプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBound(String value) {
        this.bound = value;
    }

    /**
     * significantプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignificant() {
        return significant;
    }

    /**
     * significantプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignificant(Boolean value) {
        this.significant = value;
    }

}
