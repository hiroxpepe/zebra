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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>type.EventDatePart complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.EventDatePart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.EventDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Normal" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.EventDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LastYear" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.EventDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='http://xml.kishou.go.jp/jmaxml1/addition1/' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "type.EventDatePart", propOrder = {
    "date",
    "normal",
    "lastYear",
    "any",
    "remark"
})
public class TypeEventDatePart {

    @XmlElement(name = "Date")
    protected List<TypeEventDate> date;
    @XmlElement(name = "Normal")
    protected List<TypeEventDate> normal;
    @XmlElement(name = "LastYear")
    protected List<TypeEventDate> lastYear;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "Remark")
    protected String remark;

    /**
     * Gets the value of the date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeEventDate }
     * 
     * 
     */
    public List<TypeEventDate> getDate() {
        if (date == null) {
            date = new ArrayList<TypeEventDate>();
        }
        return this.date;
    }

    /**
     * Gets the value of the normal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeEventDate }
     * 
     * 
     */
    public List<TypeEventDate> getNormal() {
        if (normal == null) {
            normal = new ArrayList<TypeEventDate>();
        }
        return this.normal;
    }

    /**
     * Gets the value of the lastYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeEventDate }
     * 
     * 
     */
    public List<TypeEventDate> getLastYear() {
        if (lastYear == null) {
            lastYear = new ArrayList<TypeEventDate>();
        }
        return this.lastYear;
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
