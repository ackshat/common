
package org.krams.tutorial.oxm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SubscriptionPort", targetNamespace = "http://krams915.blogspot.com/ws/schema/oss")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SubscriptionPort {


    /**
     * 
     * @param subscriptionRequest
     * @return
     *     returns com.blogspot.krams915.ws.schema.oss.SubscriptionResponse
     */
    @WebMethod
    @WebResult(name = "subscriptionResponse", targetNamespace = "http://krams915.blogspot.com/ws/schema/oss", partName = "subscriptionResponse")
    public SubscriptionResponse subscription(
        @WebParam(name = "subscriptionRequest", targetNamespace = "http://krams915.blogspot.com/ws/schema/oss", partName = "subscriptionRequest")
        SubscriptionRequest subscriptionRequest);

}
