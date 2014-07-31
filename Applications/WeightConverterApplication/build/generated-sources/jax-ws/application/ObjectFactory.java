
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

    private final static QName _ConvertPoundToKgResponse_QNAME = new QName("http://Service/", "convertPoundToKgResponse");
    private final static QName _ConvertKgToPoundResponse_QNAME = new QName("http://Service/", "convertKgToPoundResponse");
    private final static QName _ConvertPoundToKg_QNAME = new QName("http://Service/", "convertPoundToKg");
    private final static QName _ConvertKgToPound_QNAME = new QName("http://Service/", "convertKgToPound");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: application
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertPoundToKg }
     * 
     */
    public ConvertPoundToKg createConvertPoundToKg() {
        return new ConvertPoundToKg();
    }

    /**
     * Create an instance of {@link ConvertKgToPoundResponse }
     * 
     */
    public ConvertKgToPoundResponse createConvertKgToPoundResponse() {
        return new ConvertKgToPoundResponse();
    }

    /**
     * Create an instance of {@link ConvertPoundToKgResponse }
     * 
     */
    public ConvertPoundToKgResponse createConvertPoundToKgResponse() {
        return new ConvertPoundToKgResponse();
    }

    /**
     * Create an instance of {@link ConvertKgToPound }
     * 
     */
    public ConvertKgToPound createConvertKgToPound() {
        return new ConvertKgToPound();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertPoundToKgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "convertPoundToKgResponse")
    public JAXBElement<ConvertPoundToKgResponse> createConvertPoundToKgResponse(ConvertPoundToKgResponse value) {
        return new JAXBElement<ConvertPoundToKgResponse>(_ConvertPoundToKgResponse_QNAME, ConvertPoundToKgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertKgToPoundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "convertKgToPoundResponse")
    public JAXBElement<ConvertKgToPoundResponse> createConvertKgToPoundResponse(ConvertKgToPoundResponse value) {
        return new JAXBElement<ConvertKgToPoundResponse>(_ConvertKgToPoundResponse_QNAME, ConvertKgToPoundResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertPoundToKg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "convertPoundToKg")
    public JAXBElement<ConvertPoundToKg> createConvertPoundToKg(ConvertPoundToKg value) {
        return new JAXBElement<ConvertPoundToKg>(_ConvertPoundToKg_QNAME, ConvertPoundToKg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertKgToPound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "convertKgToPound")
    public JAXBElement<ConvertKgToPound> createConvertKgToPound(ConvertKgToPound value) {
        return new JAXBElement<ConvertKgToPound>(_ConvertKgToPound_QNAME, ConvertKgToPound.class, null, value);
    }

}
