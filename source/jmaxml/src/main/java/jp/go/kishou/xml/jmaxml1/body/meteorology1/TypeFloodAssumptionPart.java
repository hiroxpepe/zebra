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
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeDateTime;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeFloodDepth;


/**
 * <p>type.FloodAssumptionPart complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.FloodAssumptionPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FloodAssumptionArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttainmentTime" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.DateTime" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}FloodDepth" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttainmentDeepestTime" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.FloodAssumptionPart", propOrder = {
    "floodAssumptionArea",
    "attainmentTime",
    "floodDepth",
    "attainmentDeepestTime"
})
public class TypeFloodAssumptionPart {

    @XmlElement(name = "FloodAssumptionArea")
    protected String floodAssumptionArea;
    @XmlElement(name = "AttainmentTime")
    protected TypeDateTime attainmentTime;
    @XmlElement(name = "FloodDepth", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeFloodDepth> floodDepth;
    @XmlElement(name = "AttainmentDeepestTime")
    protected TypeDateTime attainmentDeepestTime;

    /**
     * floodAssumptionAreaプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloodAssumptionArea() {
        return floodAssumptionArea;
    }

    /**
     * floodAssumptionAreaプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloodAssumptionArea(String value) {
        this.floodAssumptionArea = value;
    }

    /**
     * attainmentTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeDateTime }
     *     
     */
    public TypeDateTime getAttainmentTime() {
        return attainmentTime;
    }

    /**
     * attainmentTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateTime }
     *     
     */
    public void setAttainmentTime(TypeDateTime value) {
        this.attainmentTime = value;
    }

    /**
     * Gets the value of the floodDepth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floodDepth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloodDepth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFloodDepth }
     * 
     * 
     */
    public List<TypeFloodDepth> getFloodDepth() {
        if (floodDepth == null) {
            floodDepth = new ArrayList<TypeFloodDepth>();
        }
        return this.floodDepth;
    }

    /**
     * attainmentDeepestTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeDateTime }
     *     
     */
    public TypeDateTime getAttainmentDeepestTime() {
        return attainmentDeepestTime;
    }

    /**
     * attainmentDeepestTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateTime }
     *     
     */
    public void setAttainmentDeepestTime(TypeDateTime value) {
        this.attainmentDeepestTime = value;
    }

}
