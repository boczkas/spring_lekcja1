package com.przemek.simple.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Co to jest REST?
// https://zaprogramujzycie.pl/czym-jest-rest/
@RestController
// Ta klasa będzie obsługiwała wszystko co leci z przeglądarki na /
@RequestMapping("/")
public class HelloController {

//    Na to mówi się endpoint
    @GetMapping("siema")
    public String powitac() {
        System.out.println("Wchodze w powitac");
        return "Siema";
    }

//    Zadanie:
//    Dopisz endpoint, który obsłuży zapytania wysyłane na adres http://localhost:8080/elo
//    Ma odpowiedzieć tekstem "Elo!"
//    Sprawdź czy wszystko działa wchodząc na http://localhost:8080/elo

//
    @GetMapping("siema/{imie}")
    public String powitacCie(@PathVariable String imie) {
        System.out.println("Wchodze w powitacCie");
        return "Siema " + imie;
    }

//    Zadanie:
//    Dopisz endpoint, który obsłyży zapytania wysyłane na adres http://localhost:8080/elo/mordeczka
//    Ma odpowiedzieć tekstem "Elo mordeczko Przemek" dla przykładowego zapytania:
//    http://localhost:8080/elo/Przemek

}
