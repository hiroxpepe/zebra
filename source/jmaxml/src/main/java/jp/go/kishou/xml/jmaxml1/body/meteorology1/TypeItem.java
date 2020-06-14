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


/**
 * <p>type.Item complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kind" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Kind" maxOccurs="unbounded"/>
 *         &lt;element name="Areas" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Areas" minOccurs="0"/>
 *         &lt;element name="Stations" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Stations" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Area" minOccurs="0"/>
 *         &lt;element name="Station" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Station" minOccurs="0"/>
 *         &lt;element name="ChangeStatus" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}enum.type.Item.ChangeStatus" minOccurs="0"/>
 *         &lt;element name="FullStatus" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}enum.type.Item.FullStatus" minOccurs="0"/>
 *         &lt;element name="EditingMark" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}enum.type.Item.EditingMark" minOccurs="0"/>
 *         &lt;element name="OtherReport" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Item", propOrder = {
    "kind",
    "areas",
    "stations",
    "area",
    "station",
    "changeStatus",
    "fullStatus",
    "editingMark",
    "otherReport"
})
public class TypeItem {

    @XmlElement(name = "Kind", required = true)
    protected List<TypeKind> kind;
    @XmlElement(name = "Areas")
    protected TypeAreas areas;
    @XmlElement(name = "Stations")
    protected TypeStations stations;
    @XmlElement(name = "Area")
    protected TypeArea area;
    @XmlElement(name = "Station")
    protected TypeStation station;
    @XmlElement(name = "ChangeStatus")
    @XmlSchemaType(name = "string")
    protected EnumTypeItemChangeStatus changeStatus;
    @XmlElement(name = "FullStatus")
    @XmlSchemaType(name = "string")
    protected EnumTypeItemFullStatus fullStatus;
    @XmlElement(name = "EditingMark")
    protected String editingMark;
    @XmlElement(name = "OtherReport")
    protected List<String> otherReport;

    /**
     * Gets the value of the kind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKind }
     * 
     * 
     */
    public List<TypeKind> getKind() {
        if (kind == null) {
            kind = new ArrayList<TypeKind>();
        }
        return this.kind;
    }

    /**
     * areasプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeAreas }
     *     
     */
    public TypeAreas getAreas() {
        return areas;
    }

    /**
     * areasプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAreas }
     *     
     */
    public void setAreas(TypeAreas value) {
        this.areas = value;
    }

    /**
     * stationsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeStations }
     *     
     */
    public TypeStations getStations() {
        return stations;
    }

    /**
     * stationsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStations }
     *     
     */
    public void setStations(TypeStations value) {
        this.stations = value;
    }

    /**
     * areaプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeArea }
     *     
     */
    public TypeArea getArea() {
        return area;
    }

    /**
     * areaプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeArea }
     *     
     */
    public void setArea(TypeArea value) {
        this.area = value;
    }

    /**
     * stationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeStation }
     *     
     */
    public TypeStation getStation() {
        return station;
    }

    /**
     * stationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStation }
     *     
     */
    public void setStation(TypeStation value) {
        this.station = value;
    }

    /**
     * changeStatusプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeItemChangeStatus }
     *     
     */
    public EnumTypeItemChangeStatus getChangeStatus() {
        return changeStatus;
    }

    /**
     * changeStatusプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeItemChangeStatus }
     *     
     */
    public void setChangeStatus(EnumTypeItemChangeStatus value) {
        this.changeStatus = value;
    }

    /**
     * fullStatusプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeItemFullStatus }
     *     
     */
    public EnumTypeItemFullStatus getFullStatus() {
        return fullStatus;
    }

    /**
     * fullStatusプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeItemFullStatus }
     *     
     */
    public void setFullStatus(EnumTypeItemFullStatus value) {
        this.fullStatus = value;
    }

    /**
     * editingMarkプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditingMark() {
        return editingMark;
    }

    /**
     * editingMarkプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditingMark(String value) {
        this.editingMark = value;
    }

    /**
     * Gets the value of the otherReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherReport() {
        if (otherReport == null) {
            otherReport = new ArrayList<String>();
        }
        return this.otherReport;
    }

}
