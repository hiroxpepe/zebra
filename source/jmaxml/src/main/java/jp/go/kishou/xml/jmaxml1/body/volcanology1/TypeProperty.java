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
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypePlumeDirection;
import org.w3c.dom.Element;


/**
 * <p>type.property complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.property">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Size" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.size" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Polygon" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}PlumeDirection"/>
 *         &lt;element name="Distance" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.distance"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "type.property", propOrder = {
    "size",
    "polygon",
    "plumeDirection",
    "distance",
    "remark",
    "any"
})
public class TypeProperty {

    @XmlElement(name = "Size")
    protected TypeSize size;
    @XmlElement(name = "Polygon", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected List<TypeCoordinate> polygon;
    @XmlElement(name = "PlumeDirection", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected TypePlumeDirection plumeDirection;
    @XmlElement(name = "Distance", required = true)
    protected TypeDistance distance;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * sizeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeSize }
     *     
     */
    public TypeSize getSize() {
        return size;
    }

    /**
     * sizeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSize }
     *     
     */
    public void setSize(TypeSize value) {
        this.size = value;
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

    /**
     * plumeDirectionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePlumeDirection }
     *     
     */
    public TypePlumeDirection getPlumeDirection() {
        return plumeDirection;
    }

    /**
     * plumeDirectionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePlumeDirection }
     *     
     */
    public void setPlumeDirection(TypePlumeDirection value) {
        this.plumeDirection = value;
    }

    /**
     * distanceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeDistance }
     *     
     */
    public TypeDistance getDistance() {
        return distance;
    }

    /**
     * distanceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDistance }
     *     
     */
    public void setDistance(TypeDistance value) {
        this.distance = value;
    }

    /**
     * remarkプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * remarkプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
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
