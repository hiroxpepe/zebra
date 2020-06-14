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
 * <p>type.ClimateForecastAddition complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="type.ClimateForecastAddition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetDateTimeNotice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextForecastSchedule" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NoticeOfSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalNotice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ClimateForecastAddition", propOrder = {
    "targetDateTimeNotice",
    "nextForecastSchedule",
    "noticeOfSchedule",
    "additionalNotice"
})
public class TypeClimateForecastAddition {

    @XmlElement(name = "TargetDateTimeNotice")
    protected String targetDateTimeNotice;
    @XmlElement(name = "NextForecastSchedule")
    protected List<TypeForecastSchedule> nextForecastSchedule;
    @XmlElement(name = "NoticeOfSchedule")
    protected String noticeOfSchedule;
    @XmlElement(name = "AdditionalNotice")
    protected String additionalNotice;

    /**
     * targetDateTimeNoticeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDateTimeNotice() {
        return targetDateTimeNotice;
    }

    /**
     * targetDateTimeNoticeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDateTimeNotice(String value) {
        this.targetDateTimeNotice = value;
    }

    /**
     * Gets the value of the nextForecastSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextForecastSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextForecastSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeForecastSchedule }
     * 
     * 
     */
    public List<TypeForecastSchedule> getNextForecastSchedule() {
        if (nextForecastSchedule == null) {
            nextForecastSchedule = new ArrayList<TypeForecastSchedule>();
        }
        return this.nextForecastSchedule;
    }

    /**
     * noticeOfScheduleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoticeOfSchedule() {
        return noticeOfSchedule;
    }

    /**
     * noticeOfScheduleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeOfSchedule(String value) {
        this.noticeOfSchedule = value;
    }

    /**
     * additionalNoticeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalNotice() {
        return additionalNotice;
    }

    /**
     * additionalNoticeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalNotice(String value) {
        this.additionalNotice = value;
    }

}
