//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.informationbasis1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCircle;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCoordinate;


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
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Circle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Coordinate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Line" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Polygon" maxOccurs="unbounded" minOccurs="0"/>
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
    "circle",
    "coordinate",
    "line",
    "polygon"
})
public class TypeArea {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Circle", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCircle> circle;
    @XmlElement(name = "Coordinate", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCoordinate> coordinate;
    @XmlElement(name = "Line", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCoordinate> line;
    @XmlElement(name = "Polygon", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCoordinate> polygon;

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
     * Gets the value of the circle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the circle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCircle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCircle }
     * 
     * 
     */
    public List<TypeCircle> getCircle() {
        if (circle == null) {
            circle = new ArrayList<TypeCircle>();
        }
        return this.circle;
    }

    /**
     * Gets the value of the coordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCoordinate }
     * 
     * 
     */
    public List<TypeCoordinate> getCoordinate() {
        if (coordinate == null) {
            coordinate = new ArrayList<TypeCoordinate>();
        }
        return this.coordinate;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCoordinate }
     * 
     * 
     */
    public List<TypeCoordinate> getLine() {
        if (line == null) {
            line = new ArrayList<TypeCoordinate>();
        }
        return this.line;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCoordinate }
     * 
     * 
     */
    public List<TypeCoordinate> getPolygon() {
        if (polygon == null) {
            polygon = new ArrayList<TypeCoordinate>();
        }
        return this.polygon;
    }

}
