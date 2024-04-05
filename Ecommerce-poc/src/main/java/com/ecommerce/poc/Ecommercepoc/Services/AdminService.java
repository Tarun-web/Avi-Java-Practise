package com.ecommerce.poc.Ecommercepoc.Services;

import com.ecommerce.poc.Ecommercepoc.Entities.AdminEntity;
import com.ecommerce.poc.Ecommercepoc.Repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<AdminEntity> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Optional<AdminEntity> getAdminById(int id) {
        return adminRepository.findById(id);
    }

    public AdminEntity saveAdmin(AdminEntity admin) {
        return adminRepository.save(admin);
    }

    public AdminEntity updateAdmin(int id, AdminEntity updatedAdmin) {
        Optional<AdminEntity> adminOptional = adminRepository.findById(id);
        if (adminOptional.isPresent()) {
            updatedAdmin.setId(id);
            return adminRepository.save(updatedAdmin);
        }
        return null; // Handle error or throw exception if admin with given id is not found
    }

    public void deleteAdminById(int id) {
        adminRepository.deleteById(id);
    }
}
