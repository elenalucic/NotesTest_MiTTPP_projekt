
# Metode i tehnike testiranja programske podrške - Projekt






## Sadržaj

- Opis projekta
- Korištene tehnologije i aplikacije
- Upute za pokretanje i instalaciju projekta
- Testni slučajevi


## 1. Opis projekta

Projekt testiranja mobilne aplikacije "Notes" temelji se na automatiziranju testiranja ključnih funkcionalnosti aplikacije korištenjem alata Android Studio, Appium i IntelliJ IDEA.

## 2. Korištene tehnologije i aplikacije

### 2.1. Appium

Appium je open-source alat za automatizaciju mobilnih aplikacija koji podržava testiranje na Android i iOS platformama. Koristila sam Appium u kombinaciji s Intelij IDEA za automatizaciju testova mobilne aplikacije. Appium pruža mogućnost interakcije s mobilnim uređajem ili emulatorom te olakšava testiranje funkcionalnosti mobilne aplikacije.pokrenut.

### 2.2. Intellij IDEA

Intellij IDEA je integrirano razvojno okruženje (IDE) koje pruža potporu za razvoj različitih vrsta aplikacija, uključujući Java, Kotlin, i Android aplikacije. Kroz Intelij IDEA, implementirala sam testove za mobilnu aplikaciju koristeći Appium.

### 2.3. Android Studio

Android Studio je službeno razvojno okruženje za Android razvoj koje objedinjuje sve elemente procesa izrade aplikacija. S kodnim uređivačem, virtualnim emulatorom za Android i predlošcima koda, ovo besplatno razvojno okruženje ima za cilj pružiti jednostavan i učinkovit alat za izradu aplikacija.



## 3. Upute za pokretanje i instalaciju projekta

### 3.1. Za Intelij IDEA i Appium
-Instalirati Intellij IDEA i Appium 
-Otvoriti projekt u Intellij IDEA
-Pomoću upravitelja paketa (Maven ili Gradle) instalirati potrebne ovisnosti za Appium i testne okvire.
-Konfigurirati Appium postavke unutar projekta, uključujući URL za server i željene postavke za mobilni uređaj.
-Izvršiti testove putem Intelij IDEA, osiguravajući da je Appium server pokrenut i spreman za prihvaćanje testova.

### 3.2. Za Android Studio (za emulator)
-Instalirati Android Studio i otvoriti projekt.
-Konfigurirati Android Virtual Device (AVD) unutar Android Studio za željeni uređaj ili emulator.
-Pokrenuti AVD unutar Android Studio.
-U Intelij IDEA ili drugom IDE-u, konfigurirati testne skripte za ciljanje Android emulatora.
-Izvršiti testove, osiguravajući da emulator radi i povezan je s testnim skriptama.    

### 3.3. Pokretanje testova
Ova naredba pokreće sve testove:
```bash
  mvn test
```
Ova naredba pokreće jedan od testova:
```bash
  mvn -Dtest=TestClass#methodname test
```

## 4. Testni slučajevi

### 4.1. Struktura projekta

![App Screenshot](https://i.postimg.cc/vHkrvHkS/Snimka-zaslona-24.png)

Projekt se sastoji od 5 testova unutar jedne klase.Primijenjena je Page Object Model (POM) arhitektura radi organiziranja i održavanja koda. Ova arhitektura pomaže u odvajanju slojeva korisničkog sučelja od testova, olakšavajući čitljivost i održavanje koda.

### 4.2. Prvi testni slučaj

![App Screnshot](https://i.postimg.cc/L5x695Kk/test1.png)

![App Screnshot](https://i.postimg.cc/PrM1DQhK/pom.png)

Prvi testni slučaj provjerava funkcionalnost dodavanja bilješke u mobilnoj aplikaciji. Kroz automatske korake, provjeravamo mogućnost korisnika da pravilno unese tekst u polje za bilješke te da uspješno spremi unesenu bilješku. Očekivani rezultati uključuju vidljivost sučelja za unos, točnost unosa teksta te uspješno spremanje bilješke.
Za korisnički unos u polje teksta koristi se metoda sendKeys().Za pronalazak određene komponente koristimo metode findElementByXPath() ili findElementById() kojima predajemo xpath ili id komponente kao parametar.


### 4.3. Drugi testni slučaj 

![App Screenshot](https://i.postimg.cc/t4ZCb9rP/test2.png)

Drugi testni slučaj provjerava funkcionalnost dodavanja bilješke na određeni datum putem kalendar sučelja mobilne aplikacije, uključujući odabir datuma, dozvolu pristupa kalendaru, otvaranje sučelja za unos nove bilješke, unos teksta te kon spremanje bilješke.


### 4.4. Treći testni slučaj 

![App Screenshot](https://i.postimg.cc/x88VPPhH/test3.png)

Treći testni slučaj provjerava funkcionalnost dodavanja i označavanja aktivnosti kao završene u mobilnoj aplikaciji za upravljanje zadacima.

### 4.5. Četvrti testni slučaj 

![App Screenshot](https://i.postimg.cc/QtsXc1jk/test4.png)

Četvrti testni slučaj provjerava funkcionalnost otvaranja opcija mobilne aplikacije, verifikacija prisutnosti opcije "Trash" među prikazanim opcijama i povratak na glavni zaslon nakon verifikacije. 

### 4.6. Peti testni slučaj 

![App Screenshot](https://i.postimg.cc/wBDqt0Yj/test5.png)

Peti testni slučaj provjerava funkcionalnost otvaranja postavki mobilne aplikacije, odabira opcije za promjenu boje i konačno odabira nove boje. 

### 4.7. Šesti testni slučaj

![App Screenshot](https://i.postimg.cc/Wz1THVFd/test6.png)

Šesti testni slučaj provjerava funkcionalnost otvaranja postavki mobilne aplikacije, odabira opcije za preimenovanje oznake, unos novog imena oznake i konačno spremanje promjena


