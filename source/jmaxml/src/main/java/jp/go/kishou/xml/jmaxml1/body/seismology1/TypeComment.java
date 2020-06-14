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
 * <p>type.Comment complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.Comment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WarningComment" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CommentForm" minOccurs="0"/>
 *         &lt;element name="ForecastComment" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CommentForm" minOccurs="0"/>
 *         &lt;element name="ObservationComment" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CommentForm" minOccurs="0"/>
 *         &lt;element name="VarComment" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CommentForm" minOccurs="0"/>
 *         &lt;element name="FreeFormComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Comment", propOrder = {
    "warningComment",
    "forecastComment",
    "observationComment",
    "varComment",
    "freeFormComment"
})
public class TypeComment {

    @XmlElement(name = "WarningComment")
    protected TypeCommentForm warningComment;
    @XmlElement(name = "ForecastComment")
    protected TypeCommentForm forecastComment;
    @XmlElement(name = "ObservationComment")
    protected TypeCommentForm observationComment;
    @XmlElement(name = "VarComment")
    protected TypeCommentForm varComment;
    @XmlElement(name = "FreeFormComment")
    protected String freeFormComment;

    /**
     * warningCommentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCommentForm }
     *     
     */
    public TypeCommentForm getWarningComment() {
        return warningComment;
    }

    /**
     * warningCommentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommentForm }
     *     
     */
    public void setWarningComment(TypeCommentForm value) {
        this.warningComment = value;
    }

    /**
     * forecastCommentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCommentForm }
     *     
     */
    public TypeCommentForm getForecastComment() {
        return forecastComment;
    }

    /**
     * forecastCommentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommentForm }
     *     
     */
    public void setForecastComment(TypeCommentForm value) {
        this.forecastComment = value;
    }

    /**
     * observationCommentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCommentForm }
     *     
     */
    public TypeCommentForm getObservationComment() {
        return observationComment;
    }

    /**
     * observationCommentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommentForm }
     *     
     */
    public void setObservationComment(TypeCommentForm value) {
        this.observationComment = value;
    }

    /**
     * varCommentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCommentForm }
     *     
     */
    public TypeCommentForm getVarComment() {
        return varComment;
    }

    /**
     * varCommentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommentForm }
     *     
     */
    public void setVarComment(TypeCommentForm value) {
        this.varComment = value;
    }

    /**
     * freeFormCommentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFormComment() {
        return freeFormComment;
    }

    /**
     * freeFormCommentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFormComment(String value) {
        this.freeFormComment = value;
    }

}
