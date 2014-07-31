
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
    private final static QName _SearchJobsResponse_QNAME = new QName("http://service/", "searchJobsResponse");
    private final static QName _SAXException_QNAME = new QName("http://service/", "SAXException");
    private final static QName _IOException_QNAME = new QName("http://service/", "IOException");
    private final static QName _SearchJobs_QNAME = new QName("http://service/", "searchJobs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: application
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchJobs }
     * 
     */
    public SearchJobs createSearchJobs() {
        return new SearchJobs();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link SAXException }
     * 
     */
    public SAXException createSAXException() {
        return new SAXException();
    }

    /**
     * Create an instance of {@link SearchJobsResponse }
     * 
     */
    public SearchJobsResponse createSearchJobsResponse() {
        return new SearchJobsResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchJobsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "searchJobsResponse")
    public JAXBElement<SearchJobsResponse> createSearchJobsResponse(SearchJobsResponse value) {
        return new JAXBElement<SearchJobsResponse>(_SearchJobsResponse_QNAME, SearchJobsResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchJobs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "searchJobs")
    public JAXBElement<SearchJobs> createSearchJobs(SearchJobs value) {
        return new JAXBElement<SearchJobs>(_SearchJobs_QNAME, SearchJobs.class, null, value);
    }

}
