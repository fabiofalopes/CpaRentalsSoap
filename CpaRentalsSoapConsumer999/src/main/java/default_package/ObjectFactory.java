
package default_package;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the default_package package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddReservation_QNAME = new QName("http://default_package/", "addReservation");
    private final static QName _AddReservationResponse_QNAME = new QName("http://default_package/", "addReservationResponse");
    private final static QName _CancelReserva_QNAME = new QName("http://default_package/", "cancelReserva");
    private final static QName _CancelReservaResponse_QNAME = new QName("http://default_package/", "cancelReservaResponse");
    private final static QName _CancelReservation_QNAME = new QName("http://default_package/", "cancelReservation");
    private final static QName _CancelReservationResponse_QNAME = new QName("http://default_package/", "cancelReservationResponse");
    private final static QName _GetAvailableSombrinhas_QNAME = new QName("http://default_package/", "getAvailableSombrinhas");
    private final static QName _GetAvailableSombrinhasResponse_QNAME = new QName("http://default_package/", "getAvailableSombrinhasResponse");
    private final static QName _GetDailyOcupationTable_QNAME = new QName("http://default_package/", "getDailyOcupationTable");
    private final static QName _GetDailyOcupationTableResponse_QNAME = new QName("http://default_package/", "getDailyOcupationTableResponse");
    private final static QName _GetReservasTable_QNAME = new QName("http://default_package/", "getReservasTable");
    private final static QName _GetReservasTableResponse_QNAME = new QName("http://default_package/", "getReservasTableResponse");
    private final static QName _GetReservationById_QNAME = new QName("http://default_package/", "getReservationById");
    private final static QName _GetReservationByIdResponse_QNAME = new QName("http://default_package/", "getReservationByIdResponse");
    private final static QName _GetReservationsByUserId_QNAME = new QName("http://default_package/", "getReservationsByUserId");
    private final static QName _GetReservationsByUserIdResponse_QNAME = new QName("http://default_package/", "getReservationsByUserIdResponse");
    private final static QName _InitConnection_QNAME = new QName("http://default_package/", "initConnection");
    private final static QName _InitConnectionResponse_QNAME = new QName("http://default_package/", "initConnectionResponse");
    private final static QName _Login_QNAME = new QName("http://default_package/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://default_package/", "loginResponse");
    private final static QName _MakeReservation_QNAME = new QName("http://default_package/", "makeReservation");
    private final static QName _MakeReservationResponse_QNAME = new QName("http://default_package/", "makeReservationResponse");
    private final static QName _RegisterUser_QNAME = new QName("http://default_package/", "registerUser");
    private final static QName _RegisterUserResponse_QNAME = new QName("http://default_package/", "registerUserResponse");
    private final static QName _TestRMI_QNAME = new QName("http://default_package/", "testRMI");
    private final static QName _TestRMIResponse_QNAME = new QName("http://default_package/", "testRMIResponse");
    private final static QName _NotBoundException_QNAME = new QName("http://default_package/", "NotBoundException");
    private final static QName _MalformedURLException_QNAME = new QName("http://default_package/", "MalformedURLException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: default_package
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddReservation }
     * 
     */
    public AddReservation createAddReservation() {
        return new AddReservation();
    }

    /**
     * Create an instance of {@link AddReservationResponse }
     * 
     */
    public AddReservationResponse createAddReservationResponse() {
        return new AddReservationResponse();
    }

    /**
     * Create an instance of {@link CancelReserva }
     * 
     */
    public CancelReserva createCancelReserva() {
        return new CancelReserva();
    }

    /**
     * Create an instance of {@link CancelReservaResponse }
     * 
     */
    public CancelReservaResponse createCancelReservaResponse() {
        return new CancelReservaResponse();
    }

    /**
     * Create an instance of {@link CancelReservation }
     * 
     */
    public CancelReservation createCancelReservation() {
        return new CancelReservation();
    }

    /**
     * Create an instance of {@link CancelReservationResponse }
     * 
     */
    public CancelReservationResponse createCancelReservationResponse() {
        return new CancelReservationResponse();
    }

    /**
     * Create an instance of {@link GetAvailableSombrinhas }
     * 
     */
    public GetAvailableSombrinhas createGetAvailableSombrinhas() {
        return new GetAvailableSombrinhas();
    }

    /**
     * Create an instance of {@link GetAvailableSombrinhasResponse }
     * 
     */
    public GetAvailableSombrinhasResponse createGetAvailableSombrinhasResponse() {
        return new GetAvailableSombrinhasResponse();
    }

    /**
     * Create an instance of {@link GetDailyOcupationTable }
     * 
     */
    public GetDailyOcupationTable createGetDailyOcupationTable() {
        return new GetDailyOcupationTable();
    }

    /**
     * Create an instance of {@link GetDailyOcupationTableResponse }
     * 
     */
    public GetDailyOcupationTableResponse createGetDailyOcupationTableResponse() {
        return new GetDailyOcupationTableResponse();
    }

    /**
     * Create an instance of {@link GetReservasTable }
     * 
     */
    public GetReservasTable createGetReservasTable() {
        return new GetReservasTable();
    }

    /**
     * Create an instance of {@link GetReservasTableResponse }
     * 
     */
    public GetReservasTableResponse createGetReservasTableResponse() {
        return new GetReservasTableResponse();
    }

    /**
     * Create an instance of {@link GetReservationById }
     * 
     */
    public GetReservationById createGetReservationById() {
        return new GetReservationById();
    }

    /**
     * Create an instance of {@link GetReservationByIdResponse }
     * 
     */
    public GetReservationByIdResponse createGetReservationByIdResponse() {
        return new GetReservationByIdResponse();
    }

    /**
     * Create an instance of {@link GetReservationsByUserId }
     * 
     */
    public GetReservationsByUserId createGetReservationsByUserId() {
        return new GetReservationsByUserId();
    }

    /**
     * Create an instance of {@link GetReservationsByUserIdResponse }
     * 
     */
    public GetReservationsByUserIdResponse createGetReservationsByUserIdResponse() {
        return new GetReservationsByUserIdResponse();
    }

    /**
     * Create an instance of {@link InitConnection }
     * 
     */
    public InitConnection createInitConnection() {
        return new InitConnection();
    }

    /**
     * Create an instance of {@link InitConnectionResponse }
     * 
     */
    public InitConnectionResponse createInitConnectionResponse() {
        return new InitConnectionResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link MakeReservation }
     * 
     */
    public MakeReservation createMakeReservation() {
        return new MakeReservation();
    }

    /**
     * Create an instance of {@link MakeReservationResponse }
     * 
     */
    public MakeReservationResponse createMakeReservationResponse() {
        return new MakeReservationResponse();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link TestRMI }
     * 
     */
    public TestRMI createTestRMI() {
        return new TestRMI();
    }

    /**
     * Create an instance of {@link TestRMIResponse }
     * 
     */
    public TestRMIResponse createTestRMIResponse() {
        return new TestRMIResponse();
    }

    /**
     * Create an instance of {@link NotBoundException }
     * 
     */
    public NotBoundException createNotBoundException() {
        return new NotBoundException();
    }

    /**
     * Create an instance of {@link MalformedURLException }
     * 
     */
    public MalformedURLException createMalformedURLException() {
        return new MalformedURLException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "addReservation")
    public JAXBElement<AddReservation> createAddReservation(AddReservation value) {
        return new JAXBElement<AddReservation>(_AddReservation_QNAME, AddReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "addReservationResponse")
    public JAXBElement<AddReservationResponse> createAddReservationResponse(AddReservationResponse value) {
        return new JAXBElement<AddReservationResponse>(_AddReservationResponse_QNAME, AddReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReserva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelReserva }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "cancelReserva")
    public JAXBElement<CancelReserva> createCancelReserva(CancelReserva value) {
        return new JAXBElement<CancelReserva>(_CancelReserva_QNAME, CancelReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReservaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelReservaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "cancelReservaResponse")
    public JAXBElement<CancelReservaResponse> createCancelReservaResponse(CancelReservaResponse value) {
        return new JAXBElement<CancelReservaResponse>(_CancelReservaResponse_QNAME, CancelReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "cancelReservation")
    public JAXBElement<CancelReservation> createCancelReservation(CancelReservation value) {
        return new JAXBElement<CancelReservation>(_CancelReservation_QNAME, CancelReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "cancelReservationResponse")
    public JAXBElement<CancelReservationResponse> createCancelReservationResponse(CancelReservationResponse value) {
        return new JAXBElement<CancelReservationResponse>(_CancelReservationResponse_QNAME, CancelReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableSombrinhas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAvailableSombrinhas }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getAvailableSombrinhas")
    public JAXBElement<GetAvailableSombrinhas> createGetAvailableSombrinhas(GetAvailableSombrinhas value) {
        return new JAXBElement<GetAvailableSombrinhas>(_GetAvailableSombrinhas_QNAME, GetAvailableSombrinhas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableSombrinhasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAvailableSombrinhasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getAvailableSombrinhasResponse")
    public JAXBElement<GetAvailableSombrinhasResponse> createGetAvailableSombrinhasResponse(GetAvailableSombrinhasResponse value) {
        return new JAXBElement<GetAvailableSombrinhasResponse>(_GetAvailableSombrinhasResponse_QNAME, GetAvailableSombrinhasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDailyOcupationTable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDailyOcupationTable }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getDailyOcupationTable")
    public JAXBElement<GetDailyOcupationTable> createGetDailyOcupationTable(GetDailyOcupationTable value) {
        return new JAXBElement<GetDailyOcupationTable>(_GetDailyOcupationTable_QNAME, GetDailyOcupationTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDailyOcupationTableResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDailyOcupationTableResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getDailyOcupationTableResponse")
    public JAXBElement<GetDailyOcupationTableResponse> createGetDailyOcupationTableResponse(GetDailyOcupationTableResponse value) {
        return new JAXBElement<GetDailyOcupationTableResponse>(_GetDailyOcupationTableResponse_QNAME, GetDailyOcupationTableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservasTable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservasTable }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getReservasTable")
    public JAXBElement<GetReservasTable> createGetReservasTable(GetReservasTable value) {
        return new JAXBElement<GetReservasTable>(_GetReservasTable_QNAME, GetReservasTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservasTableResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservasTableResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getReservasTableResponse")
    public JAXBElement<GetReservasTableResponse> createGetReservasTableResponse(GetReservasTableResponse value) {
        return new JAXBElement<GetReservasTableResponse>(_GetReservasTableResponse_QNAME, GetReservasTableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservationById }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getReservationById")
    public JAXBElement<GetReservationById> createGetReservationById(GetReservationById value) {
        return new JAXBElement<GetReservationById>(_GetReservationById_QNAME, GetReservationById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservationByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getReservationByIdResponse")
    public JAXBElement<GetReservationByIdResponse> createGetReservationByIdResponse(GetReservationByIdResponse value) {
        return new JAXBElement<GetReservationByIdResponse>(_GetReservationByIdResponse_QNAME, GetReservationByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationsByUserId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservationsByUserId }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getReservationsByUserId")
    public JAXBElement<GetReservationsByUserId> createGetReservationsByUserId(GetReservationsByUserId value) {
        return new JAXBElement<GetReservationsByUserId>(_GetReservationsByUserId_QNAME, GetReservationsByUserId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationsByUserIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservationsByUserIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getReservationsByUserIdResponse")
    public JAXBElement<GetReservationsByUserIdResponse> createGetReservationsByUserIdResponse(GetReservationsByUserIdResponse value) {
        return new JAXBElement<GetReservationsByUserIdResponse>(_GetReservationsByUserIdResponse_QNAME, GetReservationsByUserIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitConnection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitConnection }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "initConnection")
    public JAXBElement<InitConnection> createInitConnection(InitConnection value) {
        return new JAXBElement<InitConnection>(_InitConnection_QNAME, InitConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitConnectionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitConnectionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "initConnectionResponse")
    public JAXBElement<InitConnectionResponse> createInitConnectionResponse(InitConnectionResponse value) {
        return new JAXBElement<InitConnectionResponse>(_InitConnectionResponse_QNAME, InitConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "makeReservation")
    public JAXBElement<MakeReservation> createMakeReservation(MakeReservation value) {
        return new JAXBElement<MakeReservation>(_MakeReservation_QNAME, MakeReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "makeReservationResponse")
    public JAXBElement<MakeReservationResponse> createMakeReservationResponse(MakeReservationResponse value) {
        return new JAXBElement<MakeReservationResponse>(_MakeReservationResponse_QNAME, MakeReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "registerUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<RegisterUser>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "registerUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestRMI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestRMI }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "testRMI")
    public JAXBElement<TestRMI> createTestRMI(TestRMI value) {
        return new JAXBElement<TestRMI>(_TestRMI_QNAME, TestRMI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestRMIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestRMIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "testRMIResponse")
    public JAXBElement<TestRMIResponse> createTestRMIResponse(TestRMIResponse value) {
        return new JAXBElement<TestRMIResponse>(_TestRMIResponse_QNAME, TestRMIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotBoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotBoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "NotBoundException")
    public JAXBElement<NotBoundException> createNotBoundException(NotBoundException value) {
        return new JAXBElement<NotBoundException>(_NotBoundException_QNAME, NotBoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "MalformedURLException")
    public JAXBElement<MalformedURLException> createMalformedURLException(MalformedURLException value) {
        return new JAXBElement<MalformedURLException>(_MalformedURLException_QNAME, MalformedURLException.class, null, value);
    }

}
