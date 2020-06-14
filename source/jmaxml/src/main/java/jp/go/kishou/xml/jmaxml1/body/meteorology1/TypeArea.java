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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCircle;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCoordinate;


/**
 * <p>type.Area complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Area">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prefecture" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PrefectureCity" minOccurs="0"/>
 *         &lt;element name="PrefectureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrefectureList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.PrefectureList" minOccurs="0"/>
 *         &lt;element name="PrefectureCodeList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.PrefectureCodeList" minOccurs="0"/>
 *         &lt;element name="SubPrefecture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubPrefectureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubPrefectureList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.SubPrefectureList" minOccurs="0"/>
 *         &lt;element name="SubPrefectureCodeList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.SubPrefectureCodeList" minOccurs="0"/>
 *         &lt;element name="City" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PrefectureCity" minOccurs="0"/>
 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.CityList" minOccurs="0"/>
 *         &lt;element name="CityCodeList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.CityCodeList" minOccurs="0"/>
 *         &lt;element name="SubCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubCityList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.SubCityList" minOccurs="0"/>
 *         &lt;element name="SubCityCodeList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.SubCityCodeList" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Circle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Coordinate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Line" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Polygon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}enum.type.Area.Status" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="codeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Area", propOrder = {
    "name",
    "code",
    "prefecture",
    "prefectureCode",
    "prefectureList",
    "prefectureCodeList",
    "subPrefecture",
    "subPrefectureCode",
    "subPrefectureList",
    "subPrefectureCodeList",
    "city",
    "cityCode",
    "cityList",
    "cityCodeList",
    "subCity",
    "subCityCode",
    "subCityList",
    "subCityCodeList",
    "circle",
    "coordinate",
    "line",
    "polygon",
    "location",
    "status"
})
public class TypeArea {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Prefecture")
    protected TypePrefectureCity prefecture;
    @XmlElement(name = "PrefectureCode")
    protected String prefectureCode;
    @XmlList
    @XmlElement(name = "PrefectureList")
    protected List<String> prefectureList;
    @XmlList
    @XmlElement(name = "PrefectureCodeList")
    protected List<String> prefectureCodeList;
    @XmlElement(name = "SubPrefecture")
    protected String subPrefecture;
    @XmlElement(name = "SubPrefectureCode")
    protected String subPrefectureCode;
    @XmlList
    @XmlElement(name = "SubPrefectureList")
    protected List<String> subPrefectureList;
    @XmlList
    @XmlElement(name = "SubPrefectureCodeList")
    protected List<String> subPrefectureCodeList;
    @XmlElement(name = "City")
    protected TypePrefectureCity city;
    @XmlElement(name = "CityCode")
    protected String cityCode;
    @XmlList
    @XmlElement(name = "CityList")
    protected List<String> cityList;
    @XmlList
    @XmlElement(name = "CityCodeList")
    protected List<String> cityCodeList;
    @XmlElement(name = "SubCity")
    protected String subCity;
    @XmlElement(name = "SubCityCode")
    protected String subCityCode;
    @XmlList
    @XmlElement(name = "SubCityList")
    protected List<String> subCityList;
    @XmlList
    @XmlElement(name = "SubCityCodeList")
    protected List<String> subCityCodeList;
    @XmlElement(name = "Circle", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCircle> circle;
    @XmlElement(name = "Coordinate", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCoordinate> coordinate;
    @XmlElement(name = "Line", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCoordinate> line;
    @XmlElement(name = "Polygon", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCoordinate> polygon;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected EnumTypeAreaStatus status;
    @XmlAttribute(name = "codeType")
    protected String codeType;

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
     * prefectureプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePrefectureCity }
     *     
     */
    public TypePrefectureCity getPrefecture() {
        return prefecture;
    }

    /**
     * prefectureプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePrefectureCity }
     *     
     */
    public void setPrefecture(TypePrefectureCity value) {
        this.prefecture = value;
    }

    /**
     * prefectureCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefectureCode() {
        return prefectureCode;
    }

    /**
     * prefectureCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefectureCode(String value) {
        this.prefectureCode = value;
    }

    /**
     * Gets the value of the prefectureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefectureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefectureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrefectureList() {
        if (prefectureList == null) {
            prefectureList = new ArrayList<String>();
        }
        return this.prefectureList;
    }

    /**
     * Gets the value of the prefectureCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefectureCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefectureCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrefectureCodeList() {
        if (prefectureCodeList == null) {
            prefectureCodeList = new ArrayList<String>();
        }
        return this.prefectureCodeList;
    }

    /**
     * subPrefectureプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPrefecture() {
        return subPrefecture;
    }

    /**
     * subPrefectureプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPrefecture(String value) {
        this.subPrefecture = value;
    }

    /**
     * subPrefectureCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPrefectureCode() {
        return subPrefectureCode;
    }

    /**
     * subPrefectureCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPrefectureCode(String value) {
        this.subPrefectureCode = value;
    }

    /**
     * Gets the value of the subPrefectureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPrefectureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPrefectureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubPrefectureList() {
        if (subPrefectureList == null) {
            subPrefectureList = new ArrayList<String>();
        }
        return this.subPrefectureList;
    }

    /**
     * Gets the value of the subPrefectureCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPrefectureCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPrefectureCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubPrefectureCodeList() {
        if (subPrefectureCodeList == null) {
            subPrefectureCodeList = new ArrayList<String>();
        }
        return this.subPrefectureCodeList;
    }

    /**
     * cityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePrefectureCity }
     *     
     */
    public TypePrefectureCity getCity() {
        return city;
    }

    /**
     * cityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePrefectureCity }
     *     
     */
    public void setCity(TypePrefectureCity value) {
        this.city = value;
    }

    /**
     * cityCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * cityCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the cityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCityList() {
        if (cityList == null) {
            cityList = new ArrayList<String>();
        }
        return this.cityList;
    }

    /**
     * Gets the value of the cityCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCityCodeList() {
        if (cityCodeList == null) {
            cityCodeList = new ArrayList<String>();
        }
        return this.cityCodeList;
    }

    /**
     * subCityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCity() {
        return subCity;
    }

    /**
     * subCityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCity(String value) {
        this.subCity = value;
    }

    /**
     * subCityCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCityCode() {
        return subCityCode;
    }

    /**
     * subCityCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCityCode(String value) {
        this.subCityCode = value;
    }

    /**
     * Gets the value of the subCityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubCityList() {
        if (subCityList == null) {
            subCityList = new ArrayList<String>();
        }
        return this.subCityList;
    }

    /**
     * Gets the value of the subCityCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCityCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCityCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubCityCodeList() {
        if (subCityCodeList == null) {
            subCityCodeList = new ArrayList<String>();
        }
        return this.subCityCodeList;
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
     * statusプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeAreaStatus }
     *     
     */
    public EnumTypeAreaStatus getStatus() {
        return status;
    }

    /**
     * statusプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeAreaStatus }
     *     
     */
    public void setStatus(EnumTypeAreaStatus value) {
        this.status = value;
    }

    /**
     * codeTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * codeTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeType(String value) {
        this.codeType = value;
    }

}
