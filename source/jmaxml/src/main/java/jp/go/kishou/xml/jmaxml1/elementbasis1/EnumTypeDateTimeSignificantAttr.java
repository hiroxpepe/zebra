//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.07.23 時間 02:14:31 PM JST 
//


package jp.go.kishou.xml.jmaxml1.elementbasis1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>enum.type.DateTime.significant.attrのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.DateTime.significant.attr">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="yyyy"/>
 *     &lt;enumeration value="yyyy-mm"/>
 *     &lt;enumeration value="yyyy-mm-dd"/>
 *     &lt;enumeration value="yyyy-mm-ddThh"/>
 *     &lt;enumeration value="yyyy-mm-ddThh:mm"/>
 *     &lt;enumeration value="yyyy-mm-ddThh:mm:ss"/>
 *     &lt;enumeration value="yyyy-mm-ddThh:mm:ss.sss"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enum.type.DateTime.significant.attr")
@XmlEnum
public enum EnumTypeDateTimeSignificantAttr {

    @XmlEnumValue("yyyy")
    YYYY("yyyy"),
    @XmlEnumValue("yyyy-mm")
    YYYY_MM("yyyy-mm"),
    @XmlEnumValue("yyyy-mm-dd")
    YYYY_MM_DD("yyyy-mm-dd"),
    @XmlEnumValue("yyyy-mm-ddThh")
    YYYY_MM_DD_THH("yyyy-mm-ddThh"),
    @XmlEnumValue("yyyy-mm-ddThh:mm")
    YYYY_MM_DD_THH_MM("yyyy-mm-ddThh:mm"),
    @XmlEnumValue("yyyy-mm-ddThh:mm:ss")
    YYYY_MM_DD_THH_MM_SS("yyyy-mm-ddThh:mm:ss"),
    @XmlEnumValue("yyyy-mm-ddThh:mm:ss.sss")
    YYYY_MM_DD_THH_MM_SS_SSS("yyyy-mm-ddThh:mm:ss.sss");
    private final String value;

    EnumTypeDateTimeSignificantAttr(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumTypeDateTimeSignificantAttr fromValue(String v) {
        for (EnumTypeDateTimeSignificantAttr c: EnumTypeDateTimeSignificantAttr.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
