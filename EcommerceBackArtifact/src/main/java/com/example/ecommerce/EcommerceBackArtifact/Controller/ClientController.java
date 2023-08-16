package com.example.ecommerce.EcommerceBackArtifact.Controller;

import com.example.ecommerce.EcommerceBackArtifact.Model.Clients;
import com.example.ecommerce.EcommerceBackArtifact.Service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
public class ClientController {

private final ClientService clientService;

    @GetMapping(value = "/users/getAll", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Clients>> geAllUsers() {
        List<Clients> clients = clientService.getAllClients();
        return ok(clients);
    }

    @PostMapping(value = "/check", produces = APPLICATION_JSON_VALUE)
    public String check() {
        return "Hello Wolrd";
    }
}
