//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeProbabilityOfPrecipitation;


/**
 * <p>type.ProbabilityOfPrecipitationPart complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.ProbabilityOfPrecipitationPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}ProbabilityOfPrecipitation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ProbabilityOfPrecipitationPart", propOrder = {
    "probabilityOfPrecipitation"
})
public class TypeProbabilityOfPrecipitationPart {

    @XmlElement(name = "ProbabilityOfPrecipitation", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected List<TypeProbabilityOfPrecipitation> probabilityOfPrecipitation;

    /**
     * Gets the value of the probabilityOfPrecipitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the probabilityOfPrecipitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProbabilityOfPrecipitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeProbabilityOfPrecipitation }
     * 
     * 
     */
    public List<TypeProbabilityOfPrecipitation> getProbabilityOfPrecipitation() {
        if (probabilityOfPrecipitation == null) {
            probabilityOfPrecipitation = new ArrayList<TypeProbabilityOfPrecipitation>();
        }
        return this.probabilityOfPrecipitation;
    }

}
