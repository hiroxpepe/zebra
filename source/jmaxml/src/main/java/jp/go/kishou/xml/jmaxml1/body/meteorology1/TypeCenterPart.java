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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCircle;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCoordinate;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeDirection;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypePressure;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeRadius;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeSpeed;


/**
 * <p>type.CenterPart complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.CenterPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Coordinate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProbabilityCircle" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Circle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Direction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Speed" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Pressure" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Radius" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.CenterPart", propOrder = {
    "coordinate",
    "probabilityCircle",
    "location",
    "direction",
    "speed",
    "pressure",
    "radius",
    "time",
    "remark"
})
public class TypeCenterPart {

    @XmlElement(name = "Coordinate", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCoordinate> coordinate;
    @XmlElement(name = "ProbabilityCircle")
    protected List<TypeCircle> probabilityCircle;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Direction", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeDirection> direction;
    @XmlElement(name = "Speed", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeSpeed> speed;
    @XmlElement(name = "Pressure", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypePressure pressure;
    @XmlElement(name = "Radius", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeRadius> radius;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Remark")
    protected String remark;

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
     * Gets the value of the probabilityCircle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the probabilityCircle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProbabilityCircle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCircle }
     * 
     * 
     */
    public List<TypeCircle> getProbabilityCircle() {
        if (probabilityCircle == null) {
            probabilityCircle = new ArrayList<TypeCircle>();
        }
        return this.probabilityCircle;
    }

    /**
     * locationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * locationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

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
     * Gets the value of the speed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSpeed }
     * 
     * 
     */
    public List<TypeSpeed> getSpeed() {
        if (speed == null) {
            speed = new ArrayList<TypeSpeed>();
        }
        return this.speed;
    }

    /**
     * pressureプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePressure }
     *     
     */
    public TypePressure getPressure() {
        return pressure;
    }

    /**
     * pressureプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePressure }
     *     
     */
    public void setPressure(TypePressure value) {
        this.pressure = value;
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
     * timeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * timeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
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

}
