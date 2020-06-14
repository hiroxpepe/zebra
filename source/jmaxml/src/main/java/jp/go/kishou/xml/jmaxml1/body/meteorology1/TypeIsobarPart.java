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
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCoordinate;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypePressure;


/**
 * <p>type.IsobarPart complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.IsobarPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Pressure"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Line" minOccurs="0"/>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Polygon" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.IsobarPart", propOrder = {
    "pressure",
    "line",
    "polygon"
})
public class TypeIsobarPart {

    @XmlElement(name = "Pressure", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected TypePressure pressure;
    @XmlElement(name = "Line", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeCoordinate line;
    @XmlElement(name = "Polygon", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeCoordinate polygon;

    /**
     * pressureプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypePressure }
     *     
     */
    public TypePressure getPressure() {
        return pressure;
    }

    /**
     * pressureプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypePressure }
     *     
     */
    public void setPressure(TypePressure value) {
        this.pressure = value;
    }

    /**
     * lineプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCoordinate }
     *     
     */
    public TypeCoordinate getLine() {
        return line;
    }

    /**
     * lineプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCoordinate }
     *     
     */
    public void setLine(TypeCoordinate value) {
        this.line = value;
    }

    /**
     * polygonプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeCoordinate }
     *     
     */
    public TypeCoordinate getPolygon() {
        return polygon;
    }

    /**
     * polygonプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCoordinate }
     *     
     */
    public void setPolygon(TypeCoordinate value) {
        this.polygon = value;
    }

}
