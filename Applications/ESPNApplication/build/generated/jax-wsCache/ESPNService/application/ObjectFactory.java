
package application;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the application package. 
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

    private final static QName _ParserConfigurationException_QNAME = new QName("http://service/", "ParserConfigurationException");
    private final static QName _GetSportsNewsResponse_QNAME = new QName("http://service/", "getSportsNewsResponse");
    private final static QName _SAXException_QNAME = new QName("http://service/", "SAXException");
    private final static QName _GetSportsNews_QNAME = new QName("http://service/", "getSportsNews");
    private final static QName _IOException_QNAME = new QName("http://service/", "IOException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: application
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link GetSportsNews }
     * 
     */
    public GetSportsNews createGetSportsNews() {
        return new GetSportsNews();
    }

    /**
     * Create an instance of {@link SAXException }
     * 
     */
    public SAXException createSAXException() {
        return new SAXException();
    }

    /**
     * Create an instance of {@link GetSportsNewsResponse }
     * 
     */
    public GetSportsNewsResponse createGetSportsNewsResponse() {
        return new GetSportsNewsResponse();
    }

    /**
     * Create an instance of {@link ParserConfigurationException }
     * 
     */
    public ParserConfigurationException createParserConfigurationException() {
        return new ParserConfigurationException();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParserConfigurationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ParserConfigurationException")
    public JAXBElement<ParserConfigurationException> createParserConfigurationException(ParserConfigurationException value) {
        return new JAXBElement<ParserConfigurationException>(_ParserConfigurationException_QNAME, ParserConfigurationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSportsNewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getSportsNewsResponse")
    public JAXBElement<GetSportsNewsResponse> createGetSportsNewsResponse(GetSportsNewsResponse value) {
        return new JAXBElement<GetSportsNewsResponse>(_GetSportsNewsResponse_QNAME, GetSportsNewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SAXException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "SAXException")
    public JAXBElement<SAXException> createSAXException(SAXException value) {
        return new JAXBElement<SAXException>(_SAXException_QNAME, SAXException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSportsNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getSportsNews")
    public JAXBElement<GetSportsNews> createGetSportsNews(GetSportsNews value) {
        return new JAXBElement<GetSportsNews>(_GetSportsNews_QNAME, GetSportsNews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

}
