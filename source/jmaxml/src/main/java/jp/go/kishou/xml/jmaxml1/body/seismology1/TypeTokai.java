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
 * <p>type.Tokai complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Tokai">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfoKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InfoSerial" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.InfoSerial" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Tokai", propOrder = {
    "infoKind",
    "infoSerial",
    "text"
})
public class TypeTokai {

    @XmlElement(name = "InfoKind", required = true)
    protected String infoKind;
    @XmlElement(name = "InfoSerial")
    protected TypeInfoSerial infoSerial;
    @XmlElement(name = "Text", required = true)
    protected String text;

    /**
     * infoKindプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoKind() {
        return infoKind;
    }

    /**
     * infoKindプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoKind(String value) {
        this.infoKind = value;
    }

    /**
     * infoSerialプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeInfoSerial }
     *     
     */
    public TypeInfoSerial getInfoSerial() {
        return infoSerial;
    }

    /**
     * infoSerialプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInfoSerial }
     *     
     */
    public void setInfoSerial(TypeInfoSerial value) {
        this.infoSerial = value;
    }

    /**
     * textプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * textプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
