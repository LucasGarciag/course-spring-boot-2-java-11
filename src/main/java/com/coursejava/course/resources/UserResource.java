package com.coursejava.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursejava.course.entities.User;

//Para dizer que essa classe é um recurso web que é implementado por um controlador rest:
@RestController

//Dando nome para meu recurso:
@RequestMapping(value = "/users")
//em value o caminho do meu recurso
public class UserResource {
	//Criando endpoint para acessar os usuarios
	
	//Tipo de retorno será ResponseEntity
	//findall é o nome.
	
	//Notação para dizer que meu metodo responde a requisições get do http
	@GetMapping
	public ResponseEntity<User> findall(){
		User u = new User(1L, "Maria", "Maria@gmail.com", "99999999", "12345");
		//retorna um Entity com ok para retornar a resposta com sucesso. e body para
		//retornar o corpo da resposta.
		return ResponseEntity.ok().body(u);
		
	}
	
}
