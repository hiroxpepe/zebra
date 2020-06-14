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
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeDateTime;


/**
 * <p>type.Kind complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Kind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastKind" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.NextKind" minOccurs="0"/>
 *         &lt;element name="NextKinds" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.NextKinds" minOccurs="0"/>
 *         &lt;element name="Attention" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Attention" minOccurs="0"/>
 *         &lt;element name="WarningNotice" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WarningNotice" minOccurs="0"/>
 *         &lt;element name="Addition" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Addition" minOccurs="0"/>
 *         &lt;element name="DateTime" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.DateTime" minOccurs="0"/>
 *         &lt;element name="Property" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Property" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Kind", propOrder = {
    "name",
    "code",
    "status",
    "className",
    "condition",
    "lastKind",
    "nextKinds",
    "attention",
    "warningNotice",
    "addition",
    "dateTime",
    "property"
})
public class TypeKind {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "LastKind")
    protected TypeNextKind lastKind;
    @XmlElement(name = "NextKinds")
    protected TypeNextKinds nextKinds;
    @XmlElement(name = "Attention")
    protected TypeAttention attention;
    @XmlElement(name = "WarningNotice")
    protected TypeWarningNotice warningNotice;
    @XmlElement(name = "Addition")
    protected TypeAddition addition;
    @XmlElement(name = "DateTime")
    protected TypeDateTime dateTime;
    @XmlElement(name = "Property")
    protected List<TypeProperty> property;

    /**
     * nameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * nameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * codeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * codeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * statusプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * statusプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * classNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * classNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
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

    /**
     * lastKindプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeNextKind }
     *     
     */
    public TypeNextKind getLastKind() {
        return lastKind;
    }

    /**
     * lastKindプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNextKind }
     *     
     */
    public void setLastKind(TypeNextKind value) {
        this.lastKind = value;
    }

    /**
     * nextKindsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeNextKinds }
     *     
     */
    public TypeNextKinds getNextKinds() {
        return nextKinds;
    }

    /**
     * nextKindsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNextKinds }
     *     
     */
    public void setNextKinds(TypeNextKinds value) {
        this.nextKinds = value;
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
     * warningNoticeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeWarningNotice }
     *     
     */
    public TypeWarningNotice getWarningNotice() {
        return warningNotice;
    }

    /**
     * warningNoticeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWarningNotice }
     *     
     */
    public void setWarningNotice(TypeWarningNotice value) {
        this.warningNotice = value;
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

    /**
     * dateTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeDateTime }
     *     
     */
    public TypeDateTime getDateTime() {
        return dateTime;
    }

    /**
     * dateTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateTime }
     *     
     */
    public void setDateTime(TypeDateTime value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeProperty }
     * 
     * 
     */
    public List<TypeProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<TypeProperty>();
        }
        return this.property;
    }

}
