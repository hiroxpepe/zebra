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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>type.Axis complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Axis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Direction" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Direction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Bearings" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Bearings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Radius" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Radius" maxOccurs="unbounded"/>
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
@XmlType(name = "type.Axis", propOrder = {
    "direction",
    "bearings",
    "radius",
    "any"
})
public class TypeAxis {

    @XmlElement(name = "Direction")
    protected List<TypeDirection> direction;
    @XmlElement(name = "Bearings")
    protected List<TypeBearings> bearings;
    @XmlElement(name = "Radius", required = true)
    protected List<TypeRadius> radius;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the direction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDirection }
     * 
     * 
     */
    public List<TypeDirection> getDirection() {
        if (direction == null) {
            direction = new ArrayList<TypeDirection>();
        }
        return this.direction;
    }

    /**
     * Gets the value of the bearings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bearings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBearings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBearings }
     * 
     * 
     */
    public List<TypeBearings> getBearings() {
        if (bearings == null) {
            bearings = new ArrayList<TypeBearings>();
        }
        return this.bearings;
    }

    /**
     * Gets the value of the radius property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radius property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadius().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeRadius }
     * 
     * 
     */
    public List<TypeRadius> getRadius() {
        if (radius == null) {
            radius = new ArrayList<TypeRadius>();
        }
        return this.radius;
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
