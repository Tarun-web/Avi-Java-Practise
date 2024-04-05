package com.ecommerce.poc.Ecommercepoc.Services;

import com.ecommerce.poc.Ecommercepoc.Entities.ProductEntity;
import com.ecommerce.poc.Ecommercepoc.Repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    // Save or update a product
    public ProductEntity saveProduct(ProductEntity product) {
        return productRepository.save(product);
    }

    // Get all products
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    // Get product by ID
    public Optional<ProductEntity> getProductById(int id) {
        return productRepository.findById(id);
    }

    // Delete product by ID
    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }

    // Update product details
    public ProductEntity updateProduct(int id, ProductEntity updatedProduct) {
        Optional<ProductEntity> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            ProductEntity existingProduct = productOptional.get();
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setQuantity(updatedProduct.getQuantity());
            existingProduct.setDescription(updatedProduct.getDescription());
            return productRepository.save(existingProduct);
        }
        return null;
    }
}
