//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.volcanology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypePlumeDirection;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypePlumeHeight;
import org.w3c.dom.Element;


/**
 * <p>type.plume complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.plume">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}PlumeHeightAboveCrater"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}PlumeHeightAboveSeaLevel" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}PlumeDirection"/>
 *         &lt;element name="PlumeComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='http://xml.kishou.go.jp/jmaxml1/addition1/' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.plume", propOrder = {
    "plumeHeightAboveCrater",
    "plumeHeightAboveSeaLevel",
    "plumeDirection",
    "plumeComment",
    "any"
})
public class TypePlume {

    @XmlElement(name = "PlumeHeightAboveCrater", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected TypePlumeHeight plumeHeightAboveCrater;
    @XmlElement(name = "PlumeHeightAboveSeaLevel", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypePlumeHeight plumeHeightAboveSeaLevel;
    @XmlElement(name = "PlumeDirection", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected TypePlumeDirection plumeDirection;
    @XmlElement(name = "PlumeComment")
    protected String plumeComment;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * plumeHeightAboveCraterプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePlumeHeight }
     *     
     */
    public TypePlumeHeight getPlumeHeightAboveCrater() {
        return plumeHeightAboveCrater;
    }

    /**
     * plumeHeightAboveCraterプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePlumeHeight }
     *     
     */
    public void setPlumeHeightAboveCrater(TypePlumeHeight value) {
        this.plumeHeightAboveCrater = value;
    }

    /**
     * plumeHeightAboveSeaLevelプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePlumeHeight }
     *     
     */
    public TypePlumeHeight getPlumeHeightAboveSeaLevel() {
        return plumeHeightAboveSeaLevel;
    }

    /**
     * plumeHeightAboveSeaLevelプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePlumeHeight }
     *     
     */
    public void setPlumeHeightAboveSeaLevel(TypePlumeHeight value) {
        this.plumeHeightAboveSeaLevel = value;
    }

    /**
     * plumeDirectionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePlumeDirection }
     *     
     */
    public TypePlumeDirection getPlumeDirection() {
        return plumeDirection;
    }

    /**
     * plumeDirectionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePlumeDirection }
     *     
     */
    public void setPlumeDirection(TypePlumeDirection value) {
        this.plumeDirection = value;
    }

    /**
     * plumeCommentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlumeComment() {
        return plumeComment;
    }

    /**
     * plumeCommentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlumeComment(String value) {
        this.plumeComment = value;
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

}
