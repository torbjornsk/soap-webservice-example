package example;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * TODO: Javadoc
 */
@WebService()
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(@WebParam(name = "someStuff") final Something something) {
    String result = "Hello, world, with " + something;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new HelloWorld ();
    String address = "http://localhost:9000/HelloWorld";
    Endpoint.publish(address, implementor);
  }
}
