package com.ecommerce.poc.Ecommercepoc.Repositories;

import com.ecommerce.poc.Ecommercepoc.Entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>
{

}
