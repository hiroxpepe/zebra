//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>type.AccuracyEpicenter complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.AccuracyEpicenter">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *       &lt;attribute name="rank" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="rank2" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.AccuracyEpicenter", propOrder = {
    "value"
})
public class TypeAccuracyEpicenter {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "rank", required = true)
    protected int rank;
    @XmlAttribute(name = "rank2", required = true)
    protected int rank2;

    /**
     * valueプロパティの値を取得します。
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * valueプロパティの値を設定します。
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * rankプロパティの値を取得します。
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * rankプロパティの値を設定します。
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * rank2プロパティの値を取得します。
     * 
     */
    public int getRank2() {
        return rank2;
    }

    /**
     * rank2プロパティの値を設定します。
     * 
     */
    public void setRank2(int value) {
        this.rank2 = value;
    }

}
