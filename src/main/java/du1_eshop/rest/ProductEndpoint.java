package du1_eshop.rest;

import du1_eshop.model.Product;
import du1_eshop.repository.ProductRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/products")
public class ProductEndpoint {

    @Inject
    private ProductRepository productRepository;

    public Product getProduct(Long id) {
        return productRepository.find(id);
    }

    public Product createProduct(Product product) {
        return productRepository.create(product);
    }

    public void deleteProduct(Long id) {
        productRepository.delete(id);
    }

    @GET
    @Produces(APPLICATION_JSON)
    public Response getProducts() {
        List<Product> products = productRepository.findAll();

        if (products.size()==0)
            return Response.noContent().build();
        return Response.ok(products).build();

    }
}
