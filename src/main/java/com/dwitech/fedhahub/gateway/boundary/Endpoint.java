package com.dwitech.fedhahub.gateway.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
@Path("/endpoint")
public class Endpoint {
	@Context private HttpHeaders httpHeaders;

	@GET
	public String showHeaderValue() {
		return "Value of the header with key X_CORRELATION_ID : " + httpHeaders.getHeaderString("X_CORRELATION_ID");
	}
}