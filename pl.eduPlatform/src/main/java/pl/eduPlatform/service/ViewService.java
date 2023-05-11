package pl.eduPlatform.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.eduPlatform.repository.*;
import pl.eduPlatform.repository.model.view.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ViewService {

    private final ArtykulAutorVRepository articleAuthorVRepository;
    private final ArtykulKursZajeciaVRepository artykulKursZajeciaVRepository;
    private final GrupaLpCzlonkowVRepository grupaLpCzlonkowVRepository;
    private final KursWlascicielVRepository kursWlascicielVRepository;
    private final LogowanieVRepository logowanieVRepository;
    private final PublikacjeVRepository publikacjeVRepository;
    private final UzytkownikVRepository uzytkownikVRepository;
    private final UzytkownikNazwaGrupyVRepository uzytkownikNazwaGrupyVRepository;
    private final UzytkownikRolaVRepository uzytkownikRolaVRepository;
    private final ZajeciaProwadzacyVRepository zajeciaProwadzacyVRepository;

    public List<ArtykulAutorV> getAllArticleAuthorV() { return articleAuthorVRepository.findAll(); }

    public List<ArtykulKursZajeciaV> getAllArtykulKursZajeciaAutorV() { return artykulKursZajeciaVRepository.findAll(); }

    public List<GrupaLpCzlonkowV> getAllGrupaLpCzlonkow() {
        return grupaLpCzlonkowVRepository.findAll();
    }

    public List<KursWlascicielV> getAllKursWlascicielV() {
        return kursWlascicielVRepository.findAll();
    }

    public List<LogowanieV> getAllLogowanieV() {
        return logowanieVRepository.findAll();
    }

    public List<PublikacjeV> getAllPublikacjeV() {
        return publikacjeVRepository.findAll();
    }

    public List<UzytkownikV> getAllUzytkownikV() {
        return uzytkownikVRepository.findAll();
    }

    public List<UzytkownikNazwaGrupyV> getAllUzytkownikNazwaGrupyV() {
        return uzytkownikNazwaGrupyVRepository.findAll();
    }

    public List<UzytkownikRolaV> getAllUzytkownikRolaV() {
        return uzytkownikRolaVRepository.findAll();
    }

    public List<ZajeciaProwadzacyV> getAllZajeciaProwadzacyV() {
        return zajeciaProwadzacyVRepository.findAll();
    }

}
