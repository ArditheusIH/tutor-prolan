package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();
    public Product create(Product product) {
        productData.add(product);
        return product;
    }

    public Iterator<Product> findAll(){
        return productData.iterator();
    }

    public Product findProductByName(String name) {
        for (Product product : productData) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    public Product editProduct(String name, Product newProduct){
        Product product = findProductByName(name);
        product.setName(newProduct.getName());
        product.setQuantity(newProduct.getQuantity());
        product.setId(newProduct.getId());
        return product;
    }

    public Product deleteProduct(String name) {
        Product yangMauDihapus = findProductByName(name);
        productData.remove(yangMauDihapus);
        return yangMauDihapus;
    }

    public List<Product> getProductData() {
        return productData;
    }
}
