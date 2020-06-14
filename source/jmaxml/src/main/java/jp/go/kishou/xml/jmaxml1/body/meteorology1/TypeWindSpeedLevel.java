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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>type.WindSpeedLevel complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.WindSpeedLevel">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://xml.kishou.go.jp/jmaxml1/elementBasis1/>nullablefloat">
 *       &lt;attribute name="type" use="required" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}enum.type.WindSpeedLevel.type.attr" />
 *       &lt;attribute name="refID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="range" use="required" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.WindSpeedLevel.range.attr" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.WindSpeedLevel", propOrder = {
    "value"
})
public class TypeWindSpeedLevel {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type", required = true)
    protected EnumTypeWindSpeedLevelTypeAttr type;
    @XmlAttribute(name = "refID", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short refID;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "range", required = true)
    protected List<String> range;

    /**
     * valueプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * valueプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * typeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeWindSpeedLevelTypeAttr }
     *     
     */
    public EnumTypeWindSpeedLevelTypeAttr getType() {
        return type;
    }

    /**
     * typeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeWindSpeedLevelTypeAttr }
     *     
     */
    public void setType(EnumTypeWindSpeedLevelTypeAttr value) {
        this.type = value;
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

    /**
     * descriptionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * descriptionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the range property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRange() {
        if (range == null) {
            range = new ArrayList<String>();
        }
        return this.range;
    }

}
