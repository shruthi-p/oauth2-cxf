package com.imaginea.jaxrs.search;

import com.imaginea.jaxrs.search.beans.Product;
import org.springframework.security.access.prepost.PreAuthorize;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by shruthip on 8/31/16.
 */
@Path("/productsearch")
@Produces("application/json")
@Consumes("application/json")
public interface ProductSearchService {

    @GET
    @Path("/list/{category}")
    List<Product> getProductList();

}
