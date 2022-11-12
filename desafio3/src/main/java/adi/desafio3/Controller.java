package adi.desafio3;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/random")
public class Controller {
    
    @GetMapping()
    private ResponseEntity<Quote> hello(){
        RestTemplate restTemplate = new RestTemplate();

        Quote quote = restTemplate.getForObject("https://api.quotable.io/random", Quote.class);

        ResponseEntity res = ResponseEntity.status(400).body(quote);

        return res;
    }
}
