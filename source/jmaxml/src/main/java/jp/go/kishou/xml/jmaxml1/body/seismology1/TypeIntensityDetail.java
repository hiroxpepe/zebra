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
 * <p>type.IntensityDetail complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.IntensityDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeDefine" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CodeDefine" minOccurs="0"/>
 *         &lt;element name="MaxInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastInt" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.ForecastInt" minOccurs="0"/>
 *         &lt;element name="Appendix" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.IntensityAppendix" minOccurs="0"/>
 *         &lt;element name="Pref" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.IntensityPref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.IntensityDetail", propOrder = {
    "codeDefine",
    "maxInt",
    "forecastInt",
    "appendix",
    "pref"
})
public class TypeIntensityDetail {

    @XmlElement(name = "CodeDefine")
    protected TypeCodeDefine codeDefine;
    @XmlElement(name = "MaxInt")
    protected String maxInt;
    @XmlElement(name = "ForecastInt")
    protected TypeForecastInt forecastInt;
    @XmlElement(name = "Appendix")
    protected TypeIntensityAppendix appendix;
    @XmlElement(name = "Pref")
    protected List<TypeIntensityPref> pref;

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
     * maxIntプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxInt() {
        return maxInt;
    }

    /**
     * maxIntプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxInt(String value) {
        this.maxInt = value;
    }

    /**
     * forecastIntプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastInt }
     *     
     */
    public TypeForecastInt getForecastInt() {
        return forecastInt;
    }

    /**
     * forecastIntプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastInt }
     *     
     */
    public void setForecastInt(TypeForecastInt value) {
        this.forecastInt = value;
    }

    /**
     * appendixプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TypeIntensityAppendix }
     *     
     */
    public TypeIntensityAppendix getAppendix() {
        return appendix;
    }

    /**
     * appendixプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIntensityAppendix }
     *     
     */
    public void setAppendix(TypeIntensityAppendix value) {
        this.appendix = value;
    }

    /**
     * Gets the value of the pref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeIntensityPref }
     * 
     * 
     */
    public List<TypeIntensityPref> getPref() {
        if (pref == null) {
            pref = new ArrayList<TypeIntensityPref>();
        }
        return this.pref;
    }

}
