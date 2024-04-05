package com.ecommerce.poc.Ecommercepoc.Repositories;

import com.ecommerce.poc.Ecommercepoc.Entities.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {
}
