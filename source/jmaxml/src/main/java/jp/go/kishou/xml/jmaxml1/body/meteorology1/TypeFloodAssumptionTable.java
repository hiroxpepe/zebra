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


/**
 * <p>type.FloodAssumptionTable complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.FloodAssumptionTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Area" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Area"/>
 *         &lt;element name="FloodAssumptionPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.FloodAssumptionPart" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "type.FloodAssumptionTable", propOrder = {
    "area",
    "floodAssumptionPart",
    "remark"
})
public class TypeFloodAssumptionTable {

    @XmlElement(name = "Area", required = true)
    protected TypeArea area;
    @XmlElement(name = "FloodAssumptionPart")
    protected List<TypeFloodAssumptionPart> floodAssumptionPart;
    @XmlElement(name = "Remark")
    protected String remark;

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
     * Gets the value of the floodAssumptionPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floodAssumptionPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloodAssumptionPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFloodAssumptionPart }
     * 
     * 
     */
    public List<TypeFloodAssumptionPart> getFloodAssumptionPart() {
        if (floodAssumptionPart == null) {
            floodAssumptionPart = new ArrayList<TypeFloodAssumptionPart>();
        }
        return this.floodAssumptionPart;
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
