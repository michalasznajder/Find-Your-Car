package pl.michalsznajder.browsemycarsspring.assets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.michalsznajder.browsemycarsspring.models.Car;
import pl.michalsznajder.browsemycarsspring.models.Mark;
import pl.michalsznajder.browsemycarsspring.models.Model;
import pl.michalsznajder.browsemycarsspring.models.Picture;
import pl.michalsznajder.browsemycarsspring.services.ICarService;
import pl.michalsznajder.browsemycarsspring.services.IMarkService;
import pl.michalsznajder.browsemycarsspring.services.IModelService;
import pl.michalsznajder.browsemycarsspring.services.IPictureService;

import javax.annotation.PostConstruct;


@Component
public class InitialData {

    @Autowired
    private IMarkService iMarkService;
    @Autowired
    private IModelService iModelService;
    @Autowired
    private ICarService iCarService;
    @Autowired
    private IPictureService iPictureService;


    @PostConstruct
    public void initialiseData(){

//        MARKS
        Mark mercedesBenz = new Mark("Mercedes-Benz");
        iMarkService.createMark(mercedesBenz);
        Mark audi = new Mark("Audi");
        iMarkService.createMark(audi);
        Mark bmw = new Mark("BMW");
        iMarkService.createMark(bmw);
        Mark tesla = new Mark("Tesla");
        iMarkService.createMark(tesla);
        Mark ford = new Mark("Ford");
        iMarkService.createMark(ford);
        Mark volkswagen = new Mark("Volkswagen");
        iMarkService.createMark(volkswagen);
        Mark fiat = new Mark("Fiat");
        iMarkService.createMark(fiat);
        Mark volvo = new Mark("Volvo");
        iMarkService.createMark(volvo);
        Mark opel = new Mark("Opel");
        iMarkService.createMark(opel);
        Mark toyota = new Mark("Toyota");
        iMarkService.createMark(toyota);
        Mark smart = new Mark("Smart");
        iMarkService.createMark(smart);
        Mark peugeot = new Mark("Peugeot");
        iMarkService.createMark(peugeot);
        Mark suzuki = new Mark("Suzuki");
        iMarkService.createMark(suzuki);


//        MERCEDES
        Model klasaA = new Model("Klasa A", mercedesBenz);
        iModelService.createModel(klasaA);
        Model klasaB = new Model("Klasa B", mercedesBenz);
        iModelService.createModel(klasaB);
        Model klasaC = new Model("Klasa C", mercedesBenz);
        iModelService.createModel(klasaC);
        Model klasaE = new Model("Klasa E", mercedesBenz);
        iModelService.createModel(klasaE);
        Model klasaS = new Model("Klasa S", mercedesBenz);
        iModelService.createModel(klasaS);
        Model claShootingBrake = new Model("CLA Shooting Brake", mercedesBenz);
        iModelService.createModel(claShootingBrake);
        Model klasaCkombi = new Model("Klasa C Kombi", mercedesBenz);
        iModelService.createModel(klasaCkombi);
        Model klasaEkombi = new Model("Klasa E Kombi", mercedesBenz);
        iModelService.createModel(klasaEkombi);

//        AUDI
        Model a1 = new Model("A1", audi);
        iModelService.createModel(a1);
        Model a3 = new Model("A3", audi);
        iModelService.createModel(a3);
        Model a4 = new Model("A4", audi);
        iModelService.createModel(a4);
        Model rs4 = new Model("RS4", audi);
        iModelService.createModel(rs4);
        Model a5 = new Model("A5", audi);
        iModelService.createModel(a5);
        Model rs5 = new Model("RS5", audi);
        iModelService.createModel(rs5);
        Model a6 = new Model("A6", audi);
        iModelService.createModel(a6);
        Model a7 = new Model("A7", audi);
        iModelService.createModel(a7);
        Model a8 = new Model("A8", audi);
        iModelService.createModel(a8);
        Model q2 = new Model("Q2", audi);
        iModelService.createModel(q2);
        Model q3 = new Model("Q3", audi);
        iModelService.createModel(q3);
        Model q5 = new Model("Q5", audi);
        iModelService.createModel(q5);
        Model q7 = new Model("Q7", audi);
        iModelService.createModel(q7);

//        BMW
        Model serii1 = new Model("Serii 1", bmw);
        iModelService.createModel(serii1);
        Model serii2 = new Model("Serii 2", bmw);
        iModelService.createModel(serii2);
        Model serii3 = new Model("Serii 3", bmw);
        iModelService.createModel(serii3);
        Model m3 = new Model("M3", bmw);
        iModelService.createModel(m3);
        Model serii5 = new Model("Serii 5", bmw);
        iModelService.createModel(serii5);
        Model serii7 = new Model("Serii 7", bmw);
        iModelService.createModel(serii7);
        Model x1 = new Model("X1", bmw);
        iModelService.createModel(x1);
        Model x2 = new Model("X2", bmw);
        iModelService.createModel(x2);
        Model x3 = new Model("X3", bmw);
        iModelService.createModel(x3);
        Model z4 = new Model("Z4", bmw);
        iModelService.createModel(z4);

//        TESLA
        Model s = new Model("S", tesla);
        iModelService.createModel(s);
        Model x = new Model("X", tesla);
        iModelService.createModel(x);
        Model y = new Model("Y", tesla);
        iModelService.createModel(y);
        Model e = new Model("E", tesla);
        iModelService.createModel(e);

//        FORD
        Model focus = new Model("Focus", ford);
        iModelService.createModel(focus);
        Model mondeo = new Model("Mondeo", ford);
        iModelService.createModel(mondeo);
        Model fiesta = new Model("Fiesta", ford);
        iModelService.createModel(fiesta);
        Model ecosport = new Model("Ecosport", ford);
        iModelService.createModel(ecosport);
        Model puma = new Model("Puma", ford);
        iModelService.createModel(puma);
        Model kuga = new Model("Kuga", ford);
        iModelService.createModel(kuga);
        Model galaxy = new Model("Galaxy", ford);
        iModelService.createModel(galaxy);

//        VOLKSWAGEN
        Model passat = new Model("Passat", volkswagen);
        iModelService.createModel(passat);
        Model golf = new Model("Golf", volkswagen);
        iModelService.createModel(golf);
        Model polo = new Model("Polo", volkswagen);
        iModelService.createModel(polo);
        Model tCross = new Model("T-Cross", volkswagen);
        iModelService.createModel(tCross);
        Model touran = new Model("Touran", volkswagen);
        iModelService.createModel(touran);
        Model touareg = new Model("Touareg", volkswagen);
        iModelService.createModel(touareg);
        Model sharan = new Model("Sharan", volkswagen);
        iModelService.createModel(sharan);
        Model arteon = new Model("Arteon", volkswagen);
        iModelService.createModel(arteon);

//        FIAT
        Model panda = new Model("Panda", fiat);
        iModelService.createModel(panda);
        Model f500 = new Model("500", fiat);
        iModelService.createModel(f500);
        Model f500L = new Model("500L", fiat);
        iModelService.createModel(f500L);
        Model tipo = new Model("Tipo", fiat);
        iModelService.createModel(tipo);
        Model tipoKombi = new Model("Tipo Kombi", fiat);
        iModelService.createModel(tipoKombi);


//        VOLVO
        Model xc90 = new Model("XC90", volvo);
        iModelService.createModel(xc90);
        Model xc60 = new Model("XC60", volvo);
        iModelService.createModel(xc60);
        Model xc40 = new Model("XC40", volvo);
        iModelService.createModel(xc40);
        Model v90 = new Model("V90", volvo);
        iModelService.createModel(v90);
        Model v60 = new Model("V60", volvo);
        iModelService.createModel(v60);
        Model s90 = new Model("S90", volvo);
        iModelService.createModel(s90);
        Model s60 = new Model("S60", volvo);
        iModelService.createModel(s60);
        Model s40 = new Model("S40", volvo);
        iModelService.createModel(s40);

//        OPEL
        Model astra = new Model("Panda", opel);
        iModelService.createModel(astra);
        Model combo = new Model("Combo", opel);
        iModelService.createModel(combo);
        Model crossland = new Model("Crossland", opel);
        iModelService.createModel(crossland);
        Model insignia = new Model("Insignia", opel);
        iModelService.createModel(insignia);
        Model corsa = new Model("Corsa", opel);
        iModelService.createModel(corsa);
        Model mokka = new Model("Mokka", opel);
        iModelService.createModel(mokka);
        Model zafira = new Model("Zafira", opel);
        iModelService.createModel(zafira);

//        TOYOTA

        Model rav4 = new Model("RAV4", toyota);
        iModelService.createModel(rav4);
        Model landCruiser = new Model("Land-Cruiser", toyota);
        iModelService.createModel(landCruiser);
        Model aygo = new Model("Aygo", toyota);
        iModelService.createModel(aygo);
        Model yaris = new Model("Yaris", toyota);
        iModelService.createModel(yaris);
        Model corolla = new Model("Corolla", toyota);
        iModelService.createModel(corolla);
        Model prius = new Model("Prius", toyota);
        iModelService.createModel(prius);
        Model camry = new Model("Camry", toyota);
        iModelService.createModel(camry);

//        SMART

        Model fortwo = new Model("fortwo", smart);
        iModelService.createModel(fortwo);
        Model fortwoCabrio = new Model("fortwo cabrio", smart);
        iModelService.createModel(fortwoCabrio);
        Model forfour = new Model("forfour", smart);
        iModelService.createModel(forfour);

//        PEUGEUT

        Model p208 = new Model("208", peugeot);
        iModelService.createModel(p208);
        Model p308 = new Model("308", peugeot);
        iModelService.createModel(p308);
        Model p508 = new Model("508", peugeot);
        iModelService.createModel(p508);
        Model p407 = new Model("407", peugeot);
        iModelService.createModel(p407);
        Model rifter = new Model("Rifter", peugeot);
        iModelService.createModel(rifter);
        Model boxer = new Model("Boxer", peugeot);
        iModelService.createModel(boxer);

//        SUZUKI

        Model alto = new Model("Alto", suzuki);
        iModelService.createModel(alto);
        Model sPresso = new Model("S-Presso", suzuki);
        iModelService.createModel(sPresso);
        Model celerio = new Model("Celerio", suzuki);
        iModelService.createModel(celerio);
        Model ignis = new Model("Ignis", suzuki);
        iModelService.createModel(ignis);
        Model swift = new Model("Swift", suzuki);
        iModelService.createModel(swift);
        Model vitara = new Model("Vitara", suzuki);
        iModelService.createModel(vitara);
        Model sx4 = new Model("SX4", suzuki);
        iModelService.createModel(sx4);


        Car audiRS4 = new Car(rs4, 2015, Fuel.benzyna, true, 350, 210000, 119000,
                "RS 4 Avant tiptronic 3.0 TFSI 350 KM Serwisowane Łódź");
        iCarService.createCar(audiRS4);
        Picture audiRS4Pic1 = new Picture("https://images.pexels.com/photos/1054211/pexels-photo-1054211.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260", audiRS4);
        Picture audiRS4Pic2 = new Picture("https://images.pexels.com/photos/1035108/pexels-photo-1035108.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260", audiRS4);
        iPictureService.createPicture(audiRS4Pic1);
        iPictureService.createPicture(audiRS4Pic2);

        Car volvoS40 = new Car(s40, 2011, Fuel.benzyna, true, 140, 123241, 28500,
                "Volvo S40 Lift. 2.0 Automat Salon Polska");
        iCarService.createCar(volvoS40);
        Picture volvoS40Pic1 = new Picture("https://images.pexels.com/photos/4501407/pexels-photo-4501407.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", volvoS40);
        iPictureService.createPicture(volvoS40Pic1);

        Car bmwM3 = new Car(m3, 2019, Fuel.benzyna, true, 390, 46800, 190000,
                "M3 E93 Cabrio Manual,Bi Xenon Dynamic,M Drive,Felgi\"20\"");
        iCarService.createCar(bmwM3);
        Picture bmwM3Pic1 = new Picture("https://images.pexels.com/photos/195974/pexels-photo-195974.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260", bmwM3);
        iPictureService.createPicture(bmwM3Pic1);

        Car mercedesKlasaC = new Car(klasaC, 2012, Fuel.diesel, true, 240, 84921, 37500,
                "C200 184KM GAZ LPG Pakiet AMG LIFT Webasto Navi Oryg.KM Super Stan !");
        iCarService.createCar(mercedesKlasaC);
        Picture mercedesKlasaCPic1 = new Picture("https://images.pexels.com/photos/4298467/pexels-photo-4298467.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260", mercedesKlasaC);
        iPictureService.createPicture(mercedesKlasaCPic1);
        Picture mercedesKlasaCPic2 = new Picture("https://images.pexels.com/photos/4298464/pexels-photo-4298464.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260", mercedesKlasaC);
        iPictureService.createPicture(mercedesKlasaCPic2);

        Car bmwZ4 = new Car(z4, 2013, Fuel.benzyna, true, 290, 49900, 98000,
                "BMW Z4 3.5i 306KM, 49800 km, Kabriolet, stan bdb, full wyposażony, ASO");
        iCarService.createCar(bmwZ4);
        Picture bmwZ4Pic1 = new Picture("https://images.pexels.com/photos/93624/pexels-photo-93624.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", bmwZ4);
        iPictureService.createPicture(bmwZ4Pic1);
        Picture bmwZ4Pic2 = new Picture("https://images.pexels.com/photos/93621/pexels-photo-93621.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", bmwZ4);
        iPictureService.createPicture(bmwZ4Pic2);
        Picture bmwZ4Pic3 = new Picture("https://images.pexels.com/photos/93619/pexels-photo-93619.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", bmwZ4);
        iPictureService.createPicture(bmwZ4Pic3);

        Car peugeot407 = new Car(p407, 2009, Fuel.diesel, true, 190, 238900, 25000,
                "LIFT BiTurbo JBL ASO Katowice 204km/500nm JEDYNY Pelna HISTORIA");
        iCarService.createCar(peugeot407);
        Picture peugeot407Pic1 = new Picture("https://images.pexels.com/photos/4201027/pexels-photo-4201027.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", peugeot407);
        iPictureService.createPicture(peugeot407Pic1);
        Picture peugeot407Pic2 = new Picture("https://images.pexels.com/photos/4201000/pexels-photo-4201000.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", peugeot407);
        iPictureService.createPicture(peugeot407Pic2);
        Picture peugeot407Pic3 = new Picture("https://images.pexels.com/photos/4191865/pexels-photo-4191865.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", peugeot407);
        iPictureService.createPicture(peugeot407Pic3);

        Car smartFortwo = new Car(fortwo, 2005, Fuel.benzyna, true, 90, 243110, 7000,
                "Smart Fortwo Klimatyzacja Autamat stan idealny 2 KPL KÓŁ");
        iCarService.createCar(smartFortwo);
        Picture smartFortwoPic1 = new Picture("https://images.pexels.com/photos/4018816/pexels-photo-4018816.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", smartFortwo);
        iPictureService.createPicture(smartFortwoPic1);

        Car suzukiSX4 = new Car(sx4, 2010, Fuel.diesel, true, 150, 134800, 18500,
                "1.6 +Nowa Instalacja LPG! +Nowe Opony! 100% Sprawne, Pewne Auto!");
        iCarService.createCar(suzukiSX4);
        Picture suzukiSX4Pic1 = new Picture("https://images.pexels.com/photos/2351696/pexels-photo-2351696.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", suzukiSX4);
        iPictureService.createPicture(suzukiSX4Pic1);
        Picture suzukiSX4Pic2 = new Picture("https://images.pexels.com/photos/2351661/pexels-photo-2351661.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", suzukiSX4);
        iPictureService.createPicture(suzukiSX4Pic2);
        Picture suzukiSX4Pic3 = new Picture("https://images.pexels.com/photos/2351695/pexels-photo-2351695.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", suzukiSX4);
        iPictureService.createPicture(suzukiSX4Pic3);


    }


}
