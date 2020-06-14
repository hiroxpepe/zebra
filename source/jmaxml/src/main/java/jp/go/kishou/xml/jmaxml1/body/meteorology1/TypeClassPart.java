//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeAreaClass;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeIntensityClass;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeTyphoonClass;


/**
 * <p>type.ClassPart complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.ClassPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}TyphoonClass" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}AreaClass" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}IntensityClass" minOccurs="0"/>
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
@XmlType(name = "type.ClassPart", propOrder = {
    "typhoonClass",
    "areaClass",
    "intensityClass",
    "time",
    "remark"
})
public class TypeClassPart {

    @XmlElement(name = "TyphoonClass", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeTyphoonClass typhoonClass;
    @XmlElement(name = "AreaClass", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeAreaClass areaClass;
    @XmlElement(name = "IntensityClass", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeIntensityClass intensityClass;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Remark")
    protected String remark;

    /**
     * typhoonClassプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeTyphoonClass }
     *     
     */
    public TypeTyphoonClass getTyphoonClass() {
        return typhoonClass;
    }

    /**
     * typhoonClassプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTyphoonClass }
     *     
     */
    public void setTyphoonClass(TypeTyphoonClass value) {
        this.typhoonClass = value;
    }

    /**
     * areaClassプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeAreaClass }
     *     
     */
    public TypeAreaClass getAreaClass() {
        return areaClass;
    }

    /**
     * areaClassプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAreaClass }
     *     
     */
    public void setAreaClass(TypeAreaClass value) {
        this.areaClass = value;
    }

    /**
     * intensityClassプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeIntensityClass }
     *     
     */
    public TypeIntensityClass getIntensityClass() {
        return intensityClass;
    }

    /**
     * intensityClassプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIntensityClass }
     *     
     */
    public void setIntensityClass(TypeIntensityClass value) {
        this.intensityClass = value;
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
