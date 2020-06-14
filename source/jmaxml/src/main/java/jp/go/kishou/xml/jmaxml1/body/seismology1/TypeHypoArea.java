//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.seismology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCoordinate;


/**
 * <p>type.HypoArea complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.HypoArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Code" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoAreaCode"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Coordinate" maxOccurs="unbounded"/>
 *         &lt;element name="ReduceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReduceCode" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoAreaReduceCode" minOccurs="0"/>
 *         &lt;element name="DetailedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailedCode" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoAreaDetailedCode" minOccurs="0"/>
 *         &lt;element name="NameFromMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkCode" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoAreaMarkCode" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoAreaDistance" minOccurs="0"/>
 *         &lt;element name="LandOrSea" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}enum.type.HypoArea.LandOrSea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.HypoArea", propOrder = {
    "name",
    "code",
    "coordinate",
    "reduceName",
    "reduceCode",
    "detailedName",
    "detailedCode",
    "nameFromMark",
    "markCode",
    "direction",
    "distance",
    "landOrSea"
})
public class TypeHypoArea {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code", required = true)
    protected TypeHypoAreaCode code;
    @XmlElement(name = "Coordinate", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected List<TypeCoordinate> coordinate;
    @XmlElement(name = "ReduceName")
    protected String reduceName;
    @XmlElement(name = "ReduceCode")
    protected TypeHypoAreaReduceCode reduceCode;
    @XmlElement(name = "DetailedName")
    protected String detailedName;
    @XmlElement(name = "DetailedCode")
    protected TypeHypoAreaDetailedCode detailedCode;
    @XmlElement(name = "NameFromMark")
    protected String nameFromMark;
    @XmlElement(name = "MarkCode")
    protected TypeHypoAreaMarkCode markCode;
    @XmlElement(name = "Direction")
    protected String direction;
    @XmlElement(name = "Distance")
    protected TypeHypoAreaDistance distance;
    @XmlElement(name = "LandOrSea")
    @XmlSchemaType(name = "string")
    protected EnumTypeHypoAreaLandOrSea landOrSea;

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
     *     {@link TypeHypoAreaCode }
     *     
     */
    public TypeHypoAreaCode getCode() {
        return code;
    }

    /**
     * codeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoAreaCode }
     *     
     */
    public void setCode(TypeHypoAreaCode value) {
        this.code = value;
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
     * reduceNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReduceName() {
        return reduceName;
    }

    /**
     * reduceNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReduceName(String value) {
        this.reduceName = value;
    }

    /**
     * reduceCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeHypoAreaReduceCode }
     *     
     */
    public TypeHypoAreaReduceCode getReduceCode() {
        return reduceCode;
    }

    /**
     * reduceCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoAreaReduceCode }
     *     
     */
    public void setReduceCode(TypeHypoAreaReduceCode value) {
        this.reduceCode = value;
    }

    /**
     * detailedNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedName() {
        return detailedName;
    }

    /**
     * detailedNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedName(String value) {
        this.detailedName = value;
    }

    /**
     * detailedCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeHypoAreaDetailedCode }
     *     
     */
    public TypeHypoAreaDetailedCode getDetailedCode() {
        return detailedCode;
    }

    /**
     * detailedCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoAreaDetailedCode }
     *     
     */
    public void setDetailedCode(TypeHypoAreaDetailedCode value) {
        this.detailedCode = value;
    }

    /**
     * nameFromMarkプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFromMark() {
        return nameFromMark;
    }

    /**
     * nameFromMarkプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFromMark(String value) {
        this.nameFromMark = value;
    }

    /**
     * markCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeHypoAreaMarkCode }
     *     
     */
    public TypeHypoAreaMarkCode getMarkCode() {
        return markCode;
    }

    /**
     * markCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoAreaMarkCode }
     *     
     */
    public void setMarkCode(TypeHypoAreaMarkCode value) {
        this.markCode = value;
    }

    /**
     * directionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * directionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * distanceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeHypoAreaDistance }
     *     
     */
    public TypeHypoAreaDistance getDistance() {
        return distance;
    }

    /**
     * distanceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoAreaDistance }
     *     
     */
    public void setDistance(TypeHypoAreaDistance value) {
        this.distance = value;
    }

    /**
     * landOrSeaプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeHypoAreaLandOrSea }
     *     
     */
    public EnumTypeHypoAreaLandOrSea getLandOrSea() {
        return landOrSea;
    }

    /**
     * landOrSeaプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeHypoAreaLandOrSea }
     *     
     */
    public void setLandOrSea(EnumTypeHypoAreaLandOrSea value) {
        this.landOrSea = value;
    }

}
