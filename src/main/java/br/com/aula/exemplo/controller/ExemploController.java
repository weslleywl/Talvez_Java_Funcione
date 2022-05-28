package br.com.aula.exemplo.controller;

import br.com.aula.exemplo.entity.Mobile;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // indica que vai ser o controller, recebe requisições
@RequestMapping(value = "/claro/mobile") // define a rota
public class ExemploController {

    @GetMapping // define o verbo http
    public HttpEntity<?> getExemplo(){

        /*
        "price":1990,
 "code": "653d9688-af26-4ff1-b1a6-58c474fba27f",
 "model":"Moto G5 Plus",
 "brand":"Moto G5 Plus",
 "photo":"http://www3.claro.com.br/sites/default/files/claro-net-simples_5654b06692637-224x170_565c9453ee1bf.png​",
 "date":"26/11/2015"
         */

        Mobile mobile = Mobile.builder()
                .price(1990)
                .code("653d9688-af26-4ff1-b1a6-58c474fba27f")
                .model("Moto G5 Plus")
                .brand("Moto G5 Plus")
                .photo("http://www3.claro.com.br/sites/default/files/claro-net-simples_5654b06692637-224x170_565c9453ee1bf.png\u200B")
                .date("26/11/2015")
                .build();
        List<Mobile> mobiles = new ArrayList<>();

        mobiles.add(mobile);
        mobiles.add(mobile);
        mobiles.add(mobile);
        mobiles.add(mobile);


        return ResponseEntity.ok(mobiles);
    }
     /*
     1 - Baixar Intellij

      */

}
