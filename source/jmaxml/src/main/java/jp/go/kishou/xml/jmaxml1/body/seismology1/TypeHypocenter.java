//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.Hypocenter complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Hypocenter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Area" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoArea"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accuracy" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Accuracy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Hypocenter", propOrder = {
    "area",
    "source",
    "accuracy"
})
public class TypeHypocenter {

    @XmlElement(name = "Area", required = true)
    protected TypeHypoArea area;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Accuracy")
    protected TypeAccuracy accuracy;

    /**
     * areaプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeHypoArea }
     *     
     */
    public TypeHypoArea getArea() {
        return area;
    }

    /**
     * areaプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoArea }
     *     
     */
    public void setArea(TypeHypoArea value) {
        this.area = value;
    }

    /**
     * sourceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * sourceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * accuracyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeAccuracy }
     *     
     */
    public TypeAccuracy getAccuracy() {
        return accuracy;
    }

    /**
     * accuracyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccuracy }
     *     
     */
    public void setAccuracy(TypeAccuracy value) {
        this.accuracy = value;
    }

}
