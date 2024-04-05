package com.ecommerce.poc.Ecommercepoc.Repositories;
import com.ecommerce.poc.Ecommercepoc.Entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
