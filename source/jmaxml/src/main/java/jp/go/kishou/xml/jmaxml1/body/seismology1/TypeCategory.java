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
 * <p>type.Category complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kind" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Kind"/>
 *         &lt;element name="LastKind" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Kind" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Category", propOrder = {
    "kind",
    "lastKind"
})
public class TypeCategory {

    @XmlElement(name = "Kind", required = true)
    protected TypeKind kind;
    @XmlElement(name = "LastKind")
    protected TypeKind lastKind;

    /**
     * kindプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeKind }
     *     
     */
    public TypeKind getKind() {
        return kind;
    }

    /**
     * kindプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeKind }
     *     
     */
    public void setKind(TypeKind value) {
        this.kind = value;
    }

    /**
     * lastKindプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeKind }
     *     
     */
    public TypeKind getLastKind() {
        return lastKind;
    }

    /**
     * lastKindプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeKind }
     *     
     */
    public void setLastKind(TypeKind value) {
        this.lastKind = value;
    }

}
