package pl.eduPlatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.eduPlatform.repository.model.view.*;
import pl.eduPlatform.service.ViewService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/view/v1")
public class ViewController {

    @Autowired
    private ViewService ArticleService;

    @GetMapping("/article-autor")
    public List<ArtykulAutorV> getAllArtykulAutorV() {
        return ArticleService.getAllArticleAuthorV();
    }

    @GetMapping("/article-kurs-zajecia")
    public List<ArtykulKursZajeciaV> getAllArtykulKursZajeciaAuthorV() {
        return ArticleService.getAllArtykulKursZajeciaAutorV();
    }

    @GetMapping("/grupa-lp-czlonkow")
    public List<GrupaLpCzlonkowV> getAllGrupaLpCzlonkowV() {
        return ArticleService.getAllGrupaLpCzlonkow();
    }

    @GetMapping("/kurs-wlasciciel")
    public List<KursWlascicielV> getAllKursWlascicielVV() {
        return ArticleService.getAllKursWlascicielV();
    }

    @GetMapping("/logowanie")
    public List<LogowanieV> getAllLogowanieV() {
        return ArticleService.getAllLogowanieV();
    }

    @GetMapping("/publikacje")
    public List<PublikacjeV> getAllPublikacjeV() {
        return ArticleService.getAllPublikacjeV();
    }

    @GetMapping("/uzytkownik")
    public List<UzytkownikV> getAllUzytkownikV() {
        return ArticleService.getAllUzytkownikV();
    }

    @GetMapping("/uzytkownik-nazwa-grupy")
    public List<UzytkownikNazwaGrupyV> getAllUzytkownikNazwaGrupyV() {
        return ArticleService.getAllUzytkownikNazwaGrupyV();
    }

    @GetMapping("/uzytkownik-rola")
    public List<UzytkownikRolaV> getAllUzytkownikRolaV() {
        return ArticleService.getAllUzytkownikRolaV();
    }

    @GetMapping("/zajecia-prowadzacy")
    public List<ZajeciaProwadzacyV> getAllZajeciaProwadzacyV() {
        return ArticleService.getAllZajeciaProwadzacyV();
    }

}
