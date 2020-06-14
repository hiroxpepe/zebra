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
 * <p>enum.type.FloodDepth.unit.attrのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.FloodDepth.unit.attr">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="m"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enum.type.FloodDepth.unit.attr")
@XmlEnum
public enum EnumTypeFloodDepthUnitAttr {

    @XmlEnumValue("m")
    M("m");
    private final String value;

    EnumTypeFloodDepthUnitAttr(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumTypeFloodDepthUnitAttr fromValue(String v) {
        for (EnumTypeFloodDepthUnitAttr c: EnumTypeFloodDepthUnitAttr.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
