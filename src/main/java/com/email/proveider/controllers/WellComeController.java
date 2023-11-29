package com.email.proveider.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellComeController {


		@GetMapping("/hello")
		public String helloWord() {
			return "Olá Mundo";
			
		}
		
		@GetMapping("/users")
		@PreAuthorize("hasAnyRole('ADMIN','USER')")
		public String usuers() {
			return "Bem vindo a página de Usuários";
		}
		
		@GetMapping("/admin")
		@PreAuthorize("hasAnyRole('ADMIN')")
		public String admin() {
			return "Está é a página de administrador";
		}
}
