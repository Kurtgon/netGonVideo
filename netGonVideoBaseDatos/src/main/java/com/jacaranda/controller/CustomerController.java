package com.jacaranda.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacaranda.entity.Customer;
import com.jacaranda.services.CrudService;

@RestController
@RequestMapping(path = "/api")

public class CustomerController {

	// Creamos el servicio
	@Autowired
	private CrudService crudService;

	// Método GET
	@GetMapping("/customers")
	public ResponseEntity<?> getCustomer() {
		return crudService.getCustomer();
	}

	// Método Get por parámetro id
	@GetMapping("/customers/{id}")
	public ResponseEntity<?> getCustomerId(@PathVariable long id) {
		return crudService.getCustomerId(id);
	}

	// Método POST
	@PostMapping("/customers")
	public ResponseEntity<?> createCustomer(@RequestBody Customer sent) {
		return crudService.createCustomer(sent);
	}

	// Método PUT
	@PutMapping("/customers")
	public ResponseEntity<?> updateCustomer(@RequestBody Customer sent) {
		return crudService.updateCustomer(sent);
	}

	// Método DELETE
	@DeleteMapping("/customers/{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable long id) {
		return crudService.deleteCustomer(id);
	}

}
