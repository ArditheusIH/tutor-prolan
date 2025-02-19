package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ProductServiceImplTest {
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateProduct() {
        Product product = new Product();
        product.setProductId("1");
        product.setProductName("Test Product");
        product.setProductQuantity(10);

        when(productRepository.create(product)).thenReturn(product);

        Product createdProduct = productService.create(product);

        assertNotNull(createdProduct);
        assertEquals("1", createdProduct.getProductId());
        assertEquals("Test Product", createdProduct.getProductName());
        assertEquals(10, createdProduct.getProductQuantity());

        verify(productRepository, times(1)).create(product);
    }

    @Test
    void testFindAllProducts() {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("Product 1");
        product1.setProductQuantity(5);

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Product 2");
        product2.setProductQuantity(10);

        productList.add(product1);
        productList.add(product2);

        Iterator<Product> iterator = productList.iterator();
        when(productRepository.findAll()).thenReturn(iterator);

        List<Product> allProducts = productService.findAll();

        assertNotNull(allProducts);
        assertEquals(2, allProducts.size());
        assertEquals("Product 1", allProducts.get(0).getProductName());
        assertEquals("Product 2", allProducts.get(1).getProductName());

        verify(productRepository, times(1)).findAll();
    }

    @Test
    void testFindProductByName() {
        Product product = new Product();
        product.setProductId("1");
        product.setProductName("Test Product");
        product.setProductQuantity(10);

        when(productRepository.findProductByName("Test Product")).thenReturn(product);

        Product foundProduct = productService.findProductByName("Test Product");

        assertNotNull(foundProduct);
        assertEquals("1", foundProduct.getProductId());
        assertEquals("Test Product", foundProduct.getProductName());
        assertEquals(10, foundProduct.getProductQuantity());

        verify(productRepository, times(1)).findProductByName("Test Product");
    }

    @Test
    void testEditProduct() {
        Product originalProduct = new Product();
        originalProduct.setProductId("1");
        originalProduct.setProductName("Original Product");
        originalProduct.setProductQuantity(5);

        Product editedProduct = new Product();
        editedProduct.setProductId("1");
        editedProduct.setProductName("Edited Product");
        editedProduct.setProductQuantity(10);

        when(productRepository.editProduct("Original Product", editedProduct)).thenReturn(editedProduct);

        Product result = productService.editProduct("Original Product", editedProduct);

        assertNotNull(result);
        assertEquals("1", result.getProductId());
        assertEquals("Edited Product", result.getProductName());
        assertEquals(10, result.getProductQuantity());

        verify(productRepository, times(1)).editProduct("Original Product", editedProduct);
    }

    @Test
    void testDeleteProduct() {
        Product product = new Product();
        product.setProductId("1");
        product.setProductName("Test Product");
        product.setProductQuantity(10);

        when(productRepository.deleteProduct("Test Product")).thenReturn(product);

        Product deletedProduct = productService.deleteProduct("Test Product");

        assertNotNull(deletedProduct);
        assertEquals("1", deletedProduct.getProductId());
        assertEquals("Test Product", deletedProduct.getProductName());
        assertEquals(10, deletedProduct.getProductQuantity());

        verify(productRepository, times(1)).deleteProduct("Test Product");
    }
}
