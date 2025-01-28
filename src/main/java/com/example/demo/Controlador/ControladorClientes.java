
package com.example.demo.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ControladorClientes {
    @GetMapping("saludo")
    public String saludo(){
        return "esta es la prueba en la nube";
    }
}
