package com.me.my_application.resource;

import me.desair.tus.server.TusFileUploadService;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/upload")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ApiResource {

    @Context
    HttpServletRequest servletRequest;

    @Context
    HttpServletResponse servletResponse;

//    @Inject
//    TusFileUploadService tusFileUploadService; // Not working

    @GET
    @Path("/**")
    @PermitAll
    public Response upload() throws IOException {
        new TusFileUploadService().process(this.servletRequest, this.servletResponse);

        return Response.accepted().build();
    }

}