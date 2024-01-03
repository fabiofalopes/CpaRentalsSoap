package default_package;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.6.2
 * 2024-01-02T18:20:42.490Z
 * Generated source version: 3.6.2
 *
 */
@WebService(targetNamespace = "http://default_package/", name = "CpaRentalsSoapUtility")
@XmlSeeAlso({ObjectFactory.class})
public interface CpaRentalsSoapUtility {

    @WebMethod
    @RequestWrapper(localName = "login", targetNamespace = "http://default_package/", className = "default_package.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://default_package/", className = "default_package.LoginResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int login(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @RequestWrapper(localName = "testRMI", targetNamespace = "http://default_package/", className = "default_package.TestRMI")
    @ResponseWrapper(localName = "testRMIResponse", targetNamespace = "http://default_package/", className = "default_package.TestRMIResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String testRMI(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws NotBoundException_Exception, MalformedURLException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getReservationsByUserId", targetNamespace = "http://default_package/", className = "default_package.GetReservationsByUserId")
    @ResponseWrapper(localName = "getReservationsByUserIdResponse", targetNamespace = "http://default_package/", className = "default_package.GetReservationsByUserIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getReservationsByUserId(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod
    @RequestWrapper(localName = "cancelReserva", targetNamespace = "http://default_package/", className = "default_package.CancelReserva")
    @ResponseWrapper(localName = "cancelReservaResponse", targetNamespace = "http://default_package/", className = "default_package.CancelReservaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String cancelReserva(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebMethod
    @RequestWrapper(localName = "getAvailableSombrinhas", targetNamespace = "http://default_package/", className = "default_package.GetAvailableSombrinhas")
    @ResponseWrapper(localName = "getAvailableSombrinhasResponse", targetNamespace = "http://default_package/", className = "default_package.GetAvailableSombrinhasResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getAvailableSombrinhas(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3
    ) throws NotBoundException_Exception, MalformedURLException_Exception;

    @WebMethod
    @RequestWrapper(localName = "registerUser", targetNamespace = "http://default_package/", className = "default_package.RegisterUser")
    @ResponseWrapper(localName = "registerUserResponse", targetNamespace = "http://default_package/", className = "default_package.RegisterUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int registerUser(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @RequestWrapper(localName = "getDailyOcupationTable", targetNamespace = "http://default_package/", className = "default_package.GetDailyOcupationTable")
    @ResponseWrapper(localName = "getDailyOcupationTableResponse", targetNamespace = "http://default_package/", className = "default_package.GetDailyOcupationTableResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getDailyOcupationTable(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    @WebMethod
    @RequestWrapper(localName = "cancelReservation", targetNamespace = "http://default_package/", className = "default_package.CancelReservation")
    @ResponseWrapper(localName = "cancelReservationResponse", targetNamespace = "http://default_package/", className = "default_package.CancelReservationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String cancelReservation(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod
    @RequestWrapper(localName = "initConnection", targetNamespace = "http://default_package/", className = "default_package.InitConnection")
    @ResponseWrapper(localName = "initConnectionResponse", targetNamespace = "http://default_package/", className = "default_package.InitConnectionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String initConnection(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    ) throws NotBoundException_Exception, MalformedURLException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getReservasTable", targetNamespace = "http://default_package/", className = "default_package.GetReservasTable")
    @ResponseWrapper(localName = "getReservasTableResponse", targetNamespace = "http://default_package/", className = "default_package.GetReservasTableResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getReservasTable(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod
    @RequestWrapper(localName = "addReservation", targetNamespace = "http://default_package/", className = "default_package.AddReservation")
    @ResponseWrapper(localName = "addReservationResponse", targetNamespace = "http://default_package/", className = "default_package.AddReservationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String addReservation(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebMethod
    @RequestWrapper(localName = "getReservationById", targetNamespace = "http://default_package/", className = "default_package.GetReservationById")
    @ResponseWrapper(localName = "getReservationByIdResponse", targetNamespace = "http://default_package/", className = "default_package.GetReservationByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getReservationById(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod
    @RequestWrapper(localName = "makeReservation", targetNamespace = "http://default_package/", className = "default_package.MakeReservation")
    @ResponseWrapper(localName = "makeReservationResponse", targetNamespace = "http://default_package/", className = "default_package.MakeReservationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String makeReservation(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4
    );
}
