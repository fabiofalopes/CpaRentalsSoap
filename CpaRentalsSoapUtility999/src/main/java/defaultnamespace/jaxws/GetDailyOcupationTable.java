
package defaultnamespace.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.6.2
 * Tue Jan 02 18:14:14 WET 2024
 * Generated source version: 3.6.2
 */

@XmlRootElement(name = "getDailyOcupationTable", namespace = "http://default_package/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDailyOcupationTable", namespace = "http://default_package/", propOrder = {"arg0", "arg1", "arg2"})

public class GetDailyOcupationTable {

    @XmlElement(name = "arg0")
    private int arg0;
    @XmlElement(name = "arg1")
    private java.lang.String arg1;
    @XmlElement(name = "arg2")
    private java.lang.String arg2;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

    public java.lang.String getArg1() {
        return this.arg1;
    }

    public void setArg1(java.lang.String newArg1)  {
        this.arg1 = newArg1;
    }

    public java.lang.String getArg2() {
        return this.arg2;
    }

    public void setArg2(java.lang.String newArg2)  {
        this.arg2 = newArg2;
    }

}

