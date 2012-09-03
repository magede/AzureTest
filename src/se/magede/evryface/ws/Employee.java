package se.magede.evryface.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import se.magede.evryface.intranetconnector.HtmlToXmlParser;

@Path("/employee/")
public class Employee {

	@GET
	@Path("{username}/{password}/{searchtext}")
	@Produces(MediaType.TEXT_XML)
	public String getEmployee(
			@PathParam("username") String username,
			@PathParam("password") String password,
			@PathParam("searchtext") String searchtext) {
		
		return HtmlToXmlParser.getExployeeXML(username, password, searchtext);
	}
	
}
