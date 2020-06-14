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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.Axes complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Axes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Axis" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Axis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LongAxis" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Axis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShortAxis" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Axis" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Axes", propOrder = {
    "axis",
    "longAxis",
    "shortAxis"
})
public class TypeAxes {

    @XmlElement(name = "Axis")
    protected List<TypeAxis> axis;
    @XmlElement(name = "LongAxis")
    protected List<TypeAxis> longAxis;
    @XmlElement(name = "ShortAxis")
    protected List<TypeAxis> shortAxis;

    /**
     * Gets the value of the axis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAxis }
     * 
     * 
     */
    public List<TypeAxis> getAxis() {
        if (axis == null) {
            axis = new ArrayList<TypeAxis>();
        }
        return this.axis;
    }

    /**
     * Gets the value of the longAxis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longAxis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAxis }
     * 
     * 
     */
    public List<TypeAxis> getLongAxis() {
        if (longAxis == null) {
            longAxis = new ArrayList<TypeAxis>();
        }
        return this.longAxis;
    }

    /**
     * Gets the value of the shortAxis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortAxis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAxis }
     * 
     * 
     */
    public List<TypeAxis> getShortAxis() {
        if (shortAxis == null) {
            shortAxis = new ArrayList<TypeAxis>();
        }
        return this.shortAxis;
    }

}
