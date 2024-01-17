package com.example.ecommerce.EcommerceBackArtifact.Repository;

import com.example.ecommerce.EcommerceBackArtifact.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
