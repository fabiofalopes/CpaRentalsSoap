
package default_package;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.6.2
 * 2024-01-02T18:20:42.456Z
 * Generated source version: 3.6.2
 */

@WebFault(name = "MalformedURLException", targetNamespace = "http://default_package/")
public class MalformedURLException_Exception extends Exception {

    private default_package.MalformedURLException faultInfo;

    public MalformedURLException_Exception() {
        super();
    }

    public MalformedURLException_Exception(String message) {
        super(message);
    }

    public MalformedURLException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public MalformedURLException_Exception(String message, default_package.MalformedURLException malformedURLException) {
        super(message);
        this.faultInfo = malformedURLException;
    }

    public MalformedURLException_Exception(String message, default_package.MalformedURLException malformedURLException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = malformedURLException;
    }

    public default_package.MalformedURLException getFaultInfo() {
        return this.faultInfo;
    }
}