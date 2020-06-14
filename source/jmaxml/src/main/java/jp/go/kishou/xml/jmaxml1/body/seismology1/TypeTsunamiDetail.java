//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.seismology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type.TsunamiDetail complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.TsunamiDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeDefine" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CodeDefine" minOccurs="0"/>
 *         &lt;element name="Item" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.TsunamiItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.TsunamiDetail", propOrder = {
    "codeDefine",
    "item"
})
public class TypeTsunamiDetail {

    @XmlElement(name = "CodeDefine")
    protected TypeCodeDefine codeDefine;
    @XmlElement(name = "Item", required = true)
    protected List<TypeTsunamiItem> item;

    /**
     * codeDefineプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCodeDefine }
     *     
     */
    public TypeCodeDefine getCodeDefine() {
        return codeDefine;
    }

    /**
     * codeDefineプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCodeDefine }
     *     
     */
    public void setCodeDefine(TypeCodeDefine value) {
        this.codeDefine = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTsunamiItem }
     * 
     * 
     */
    public List<TypeTsunamiItem> getItem() {
        if (item == null) {
            item = new ArrayList<TypeTsunamiItem>();
        }
        return this.item;
    }

}
