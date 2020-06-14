//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.informationbasis1.TypeHead;
import org.w3c.dom.Element;


/**
 * <p>type.report complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.report">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Control" type="{http://xml.kishou.go.jp/jmaxml1/}type.control"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/informationBasis1/}Head"/>
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.report", propOrder = {
    "control",
    "head",
    "any"
})
public class TypeReport {

    @XmlElement(name = "Control", required = true)
    protected TypeControl control;
    @XmlElement(name = "Head", namespace = "http://xml.kishou.go.jp/jmaxml1/informationBasis1/", required = true)
    protected TypeHead head;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * controlプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeControl }
     *     
     */
    public TypeControl getControl() {
        return control;
    }

    /**
     * controlプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeControl }
     *     
     */
    public void setControl(TypeControl value) {
        this.control = value;
    }

    /**
     * headプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeHead }
     *     
     */
    public TypeHead getHead() {
        return head;
    }

    /**
     * headプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHead }
     *     
     */
    public void setHead(TypeHead value) {
        this.head = value;
    }

    /**
     * anyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * anyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
