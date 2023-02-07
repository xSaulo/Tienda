
package com.tienda.Tienda.controller;

import com.tienda.Tienda.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Para indicar que es una Controladora
@Slf4j
public class ClienteController {
    
   
    @GetMapping("/") //Para poder escribir una URL y decir localhost, ventana de inicio
    public String inicio(Model model){
        var variable="Hola desde el Back-End";
        model.addAttribute("mensaje", variable);
 Cliente cliente1 = new Cliente("Juan",
      "Perez Castro",
        "jcastro@gmail.com",
       "89076576");
           Cliente cliente2 = new Cliente("Juan",
      "Perez Castro",
        "jcastro@gmail.com",
       "89076576");
           Cliente cliente3 = new Cliente("Juan",
      "Delgado Castro",
        "dcastro@gmail.com",
       "90076576");
       
     
       var clientes = Arrays.asList (cliente1,cliente2,cliente3);
                model.addAttribute("clientes", clientes);
               //var clientes= Arrays.asList(a:cliente1, a:cliente2, a:cliente3);
        return "index";
    }
}
