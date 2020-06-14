//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.volcanology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCoordinate;
import org.w3c.dom.Element;


/**
 * <p>type.area complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.area">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Coordinate" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Coordinate" minOccurs="0"/>
 *         &lt;element name="AreaFromMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CraterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CraterCoordinate" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Coordinate" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='http://xml.kishou.go.jp/jmaxml1/addition1/' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.area", propOrder = {
    "name",
    "code",
    "coordinate",
    "areaFromMark",
    "craterName",
    "craterCoordinate",
    "any"
})
public class TypeArea {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Coordinate")
    protected TypeCoordinate coordinate;
    @XmlElement(name = "AreaFromMark")
    protected String areaFromMark;
    @XmlElement(name = "CraterName")
    protected String craterName;
    @XmlElement(name = "CraterCoordinate")
    protected TypeCoordinate craterCoordinate;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * coordinateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCoordinate }
     *     
     */
    public TypeCoordinate getCoordinate() {
        return coordinate;
    }

    /**
     * coordinateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCoordinate }
     *     
     */
    public void setCoordinate(TypeCoordinate value) {
        this.coordinate = value;
    }

    /**
     * areaFromMarkプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaFromMark() {
        return areaFromMark;
    }

    /**
     * areaFromMarkプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaFromMark(String value) {
        this.areaFromMark = value;
    }

    /**
     * craterNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCraterName() {
        return craterName;
    }

    /**
     * craterNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCraterName(String value) {
        this.craterName = value;
    }

    /**
     * craterCoordinateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCoordinate }
     *     
     */
    public TypeCoordinate getCraterCoordinate() {
        return craterCoordinate;
    }

    /**
     * craterCoordinateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCoordinate }
     *     
     */
    public void setCraterCoordinate(TypeCoordinate value) {
        this.craterCoordinate = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
