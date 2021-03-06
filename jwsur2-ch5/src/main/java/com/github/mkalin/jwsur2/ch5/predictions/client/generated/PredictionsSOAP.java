
package com.github.mkalin.jwsur2.ch5.predictions.client.generated;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PredictionsSOAP", targetNamespace = "http://predictions.ch5.jwsur2.mkalin.github.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PredictionsSOAP {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://predictions.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.predictions.client.generated.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://predictions.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.predictions.client.generated.DeleteResponse")
    @Action(input = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/deleteRequest", output = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/deleteResponse")
    public String delete(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws VerbosityException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "create", targetNamespace = "http://predictions.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.predictions.client.generated.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://predictions.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.predictions.client.generated.CreateResponse")
    @Action(input = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/createRequest", output = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/createResponse", fault = {
        @FaultAction(className = VerbosityException_Exception.class, value = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/create/Fault/VerbosityException")
    })
    public String create(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws VerbosityException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.github.mkalin.jwsur2.ch5.predictions.client.generated.Prediction>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "http://predictions.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.predictions.client.generated.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://predictions.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.predictions.client.generated.GetAllResponse")
    @Action(input = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/getAllRequest", output = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/getAllResponse")
    public List<Prediction> getAll();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws VerbosityException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "edit", targetNamespace = "http://predictions.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.predictions.client.generated.Edit")
    @ResponseWrapper(localName = "editResponse", targetNamespace = "http://predictions.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.predictions.client.generated.EditResponse")
    @Action(input = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/editRequest", output = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/editResponse", fault = {
        @FaultAction(className = VerbosityException_Exception.class, value = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/edit/Fault/VerbosityException")
    })
    public String edit(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws VerbosityException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns com.github.mkalin.jwsur2.ch5.predictions.client.generated.Prediction
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOne", targetNamespace = "http://predictions.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.predictions.client.generated.GetOne")
    @ResponseWrapper(localName = "getOneResponse", targetNamespace = "http://predictions.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.predictions.client.generated.GetOneResponse")
    @Action(input = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/getOneRequest", output = "http://predictions.ch5.jwsur2.mkalin.github.com/PredictionsSOAP/getOneResponse")
    public Prediction getOne(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
