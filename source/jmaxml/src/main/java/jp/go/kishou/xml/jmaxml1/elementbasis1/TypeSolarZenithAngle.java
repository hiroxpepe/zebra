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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>type.SolarZenithAngle complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.SolarZenithAngle">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *       &lt;attribute name="unit" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}enum.type.SolarZenithAngle.unit.attr" />
 *       &lt;attribute name="refID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="condition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.SolarZenithAngle", propOrder = {
    "value"
})
public class TypeSolarZenithAngle {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "unit")
    protected EnumTypeSolarZenithAngleUnitAttr unit;
    @XmlAttribute(name = "refID")
    @XmlSchemaType(name = "unsignedByte")
    protected Short refID;
    @XmlAttribute(name = "condition")
    protected String condition;

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
     *     {@link EnumTypeSolarZenithAngleUnitAttr }
     *     
     */
    public EnumTypeSolarZenithAngleUnitAttr getUnit() {
        return unit;
    }

    /**
     * unitプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeSolarZenithAngleUnitAttr }
     *     
     */
    public void setUnit(EnumTypeSolarZenithAngleUnitAttr value) {
        this.unit = value;
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

}
