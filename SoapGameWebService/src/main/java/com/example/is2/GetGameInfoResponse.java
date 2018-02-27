//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.02.27 um 10:14:59 AM CET 
//


package com.example.is2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gameInfo" type="{http://is2.example.com}game"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gameInfo"
})
@XmlRootElement(name = "getGameInfoResponse")
public class GetGameInfoResponse {

    @XmlElement(required = true)
    protected Game gameInfo;

    /**
     * Ruft den Wert der gameInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Game }
     *     
     */
    public Game getGameInfo() {
        return gameInfo;
    }

    /**
     * Legt den Wert der gameInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Game }
     *     
     */
    public void setGameInfo(Game value) {
        this.gameInfo = value;
    }

}
