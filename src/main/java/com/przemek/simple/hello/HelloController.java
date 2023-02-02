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

//    Dopisz endpoint, który obsłuży zapytania wysyłane na adres http://localhost:8080/elo
//    Ma odpowiedzieć tekstem "Elo!"
//    Sprawdź czy wszystko działa wchodząc na http://localhost:8080/elo

//
    @GetMapping("siema/{imie}")
    public String powitacCie(@PathVariable String imie) {
        System.out.println("Wchodze w powitacCie");
        return "Siema " + imie;
    }

//    Dopisz endpoint, który obsłuży zapytania wysyłane na adres http://localhost:8080/elo/mordeczka
//    Ma odpowiedzieć tekstem "Elo mordeczko Przemek" dla przykładowego zapytania:
//    http://localhost:8080/elo/Przemek

    @GetMapping("/dodaj/{liczba1}/{liczba2}")
    public int dodaj(@PathVariable int liczba1, @PathVariable int liczba2) {
        int suma = liczba1 + liczba2;
        return suma;
    }
}


// Zadanie domowe:
// Napisz endpoint który będzie zwracał słowo wypisane konkretną ilość razy
// Jego ścieżka: http://localhost:8080/wypisz/slowo/5
// Wynikiem takiego wywolania powinno być wypisanie na stronie:
//  slowo
//  slowo
//  slowo
//  slowo
//  slowo