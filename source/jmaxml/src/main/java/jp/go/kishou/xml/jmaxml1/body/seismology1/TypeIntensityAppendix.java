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
 * <p>type.IntensityAppendix complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.IntensityAppendix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxIntChange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxIntChangeReason" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.IntensityAppendix", propOrder = {
    "maxIntChange",
    "maxIntChangeReason"
})
public class TypeIntensityAppendix {

    @XmlElement(name = "MaxIntChange")
    protected int maxIntChange;
    @XmlElement(name = "MaxIntChangeReason")
    protected int maxIntChangeReason;

    /**
     * maxIntChangeプロパティの値を取得します。
     * 
     */
    public int getMaxIntChange() {
        return maxIntChange;
    }

    /**
     * maxIntChangeプロパティの値を設定します。
     * 
     */
    public void setMaxIntChange(int value) {
        this.maxIntChange = value;
    }

    /**
     * maxIntChangeReasonプロパティの値を取得します。
     * 
     */
    public int getMaxIntChangeReason() {
        return maxIntChangeReason;
    }

    /**
     * maxIntChangeReasonプロパティの値を設定します。
     * 
     */
    public void setMaxIntChangeReason(int value) {
        this.maxIntChangeReason = value;
    }

}
