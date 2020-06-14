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


/**
 * <p>type.FloodForecastAddition complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.FloodForecastAddition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HydrometricStationPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.HydrometricStationPart" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.FloodForecastAddition", propOrder = {
    "hydrometricStationPart"
})
public class TypeFloodForecastAddition {

    @XmlElement(name = "HydrometricStationPart", required = true)
    protected List<TypeHydrometricStationPart> hydrometricStationPart;

    /**
     * Gets the value of the hydrometricStationPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hydrometricStationPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHydrometricStationPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeHydrometricStationPart }
     * 
     * 
     */
    public List<TypeHydrometricStationPart> getHydrometricStationPart() {
        if (hydrometricStationPart == null) {
            hydrometricStationPart = new ArrayList<TypeHydrometricStationPart>();
        }
        return this.hydrometricStationPart;
    }

}
