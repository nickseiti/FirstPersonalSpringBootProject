package com.algaworks.crm.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

  @GetMapping
  public String hello(){
    return "Hello World";
  }

}