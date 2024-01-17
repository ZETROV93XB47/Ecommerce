package com.example.ecommerce.EcommerceBackArtifact.Service;

import com.example.ecommerce.EcommerceBackArtifact.Model.Client;
import com.example.ecommerce.EcommerceBackArtifact.Repository.ClientRepository;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Data
@Service
@Transactional
public class ClientService {

    private final ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

}
