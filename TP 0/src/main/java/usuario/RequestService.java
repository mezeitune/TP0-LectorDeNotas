package usuario;

import javax.ws.rs.core.MediaType;

import org.uqbar.commons.utils.Observable;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;


@Observable
public class RequestService {
	
	private Client client;
	
	 public RequestService() {
	        this.client = Client.create();
	 }
     public ClientResponse datos(String token){
    	  return client.resource("http://notitas.herokuapp.com")
      		.path("student")
      		.header("Authorization", token)
      		.accept(MediaType.APPLICATION_JSON) 
      		.get(ClientResponse.class);
      }
}
