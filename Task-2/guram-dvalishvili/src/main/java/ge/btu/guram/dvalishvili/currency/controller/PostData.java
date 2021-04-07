package ge.btu.guram.dvalishvili.currency.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PostData {
    @XmlElement
    public String to;
    @XmlElement
    public double amount;
}
