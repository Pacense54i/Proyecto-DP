
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase que carga los datos con los que simular un campeonato de tenis
 * 
 * @author Equipo Docente DP 
 * @version 3.0
 */
public class InitTennisData {

     public InitTennisData(Campeonato campeonato) {
    //Descomentar la carga de datos que se quiera probar
        cargarDatos1(campeonato);//Produce la salida Salida1_EC3
    //cargarDatos2(campeonato);/Produce la salida Salida2_EC3
        
    }
    
    private void cargarDatos1(Campeonato campeonato) {

                //Instanciamos 8 zapatillas: (Los parámetros están en el orden: tipo, modelo, número y valor)
        Zapatillas  z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
        Zapatillas  z2 = new ZapatillasConAgarre("Court Vapor React", 40,  5);
            Zapatillas  z3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
            Zapatillas  z4 = new ZapatillasAmortiguadas("Vapor Lite", 42,  3);
            Zapatillas  z5 = new ZapatillasConAgarre("Court Lite", 39, 3);
            Zapatillas  z6 = new ZapatillasAmortiguadas("UberSonic 4K", 40, 6);
            Zapatillas  z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 3.5);
            Zapatillas  z8 = new ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);


        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais y número de pie)
        //Novedad en EC3: cada tenista es de tipo "Golpeadores" o de tipo "Voleadores"
        Tenista  t1 = new Golpeadores ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
            Tenista  t2 = new Golpeadores ("Ashleigh Barty", z2, 70, 80, 1, "Australia", 40);
            Tenista  t3 = new Voleadores ("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
            Tenista  t4 = new Voleadores ("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
            Tenista  t5 = new Golpeadores ("Elina Svitolina", z6, 55.5, 68.5, 4, "Ucrania", 40);
            Tenista  t6 = new Golpeadores ("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
            Tenista  t7 = new Voleadores ("Aryna Sabalenka", z3, 67.5, 79.5, 2, "Bielorrusia", 40);
            Tenista  t8 = new Voleadores ("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);
         
         //A continuación se inscribirán a los 8 tenistas en el campeonato
         t1.realizarInscripcion();
         t2.realizarInscripcion();
         t3.realizarInscripcion();
         t4.realizarInscripcion();
         t5.realizarInscripcion();
         t6.realizarInscripcion();
         t7.realizarInscripcion();
         t8.realizarInscripcion();

        //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
          Zapatillas  z9  = new ZapatillasAmortiguadas("Lotto Space", 40,  5);
            Zapatillas  z10 = new ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
            Zapatillas  z11 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
            Zapatillas  z12 = new ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
           Zapatillas  z13 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
            Zapatillas  z14 = new ZapatillasAmortiguadas("Wilson Rush", 42,  3.5);
            Zapatillas  z15 = new ZapatillasAmortiguadas("Head Revolt", 40,  5);
            Zapatillas  z16 = new ZapatillasConAgarre("Joma Slam", 40, 3);
            Zapatillas  z17 = new ZapatillasConAgarre("Adidas Gamecourt", 40,  5);
            Zapatillas  z18 = new ZapatillasConAgarre("Asics Gel-Game", 42,  4.5);
            Zapatillas  z19 = new ZapatillasConAgarre("Asics Solution", 42, 3);
            Zapatillas  z20 = new ZapatillasConAgarre("Nike Air Zoom", 40,  5);
            Zapatillas  z21 = new ZapatillasConAgarre("Nike Zoom Vapor", 42,  4);
            Zapatillas  z22 = new ZapatillasConAgarre("Wilson Kaos", 41,  5);
            Zapatillas  z23 = new ZapatillasConAgarre("Head Revolt Pro", 42,  4.5);
            
            //INTRODUCIMOS LAS ZAPATILLAS EN LA LISTA DE ZAPATILLAS
            Campeonato.getInstancia().introducirZapatillas(z9);
            Campeonato.getInstancia().introducirZapatillas(z10);
            Campeonato.getInstancia().introducirZapatillas(z11);
            Campeonato.getInstancia().introducirZapatillas(z12);
            Campeonato.getInstancia().introducirZapatillas(z13);
            Campeonato.getInstancia().introducirZapatillas(z14);
            Campeonato.getInstancia().introducirZapatillas(z15);
            Campeonato.getInstancia().introducirZapatillas(z16);
            Campeonato.getInstancia().introducirZapatillas(z17);
            Campeonato.getInstancia().introducirZapatillas(z18);
            Campeonato.getInstancia().introducirZapatillas(z19);
            Campeonato.getInstancia().introducirZapatillas(z20);
            Campeonato.getInstancia().introducirZapatillas(z21);
            Campeonato.getInstancia().introducirZapatillas(z22);
            Campeonato.getInstancia().introducirZapatillas(z23);
    
    
        //Instanciamos raquetas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control
        RaquetaGenerica  r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
            RaquetaGenerica  r2 = new  RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
            RaquetaGenerica  r3 = new  RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
            RaquetaGenerica  r4 = new  RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
            RaquetaGenerica  r5 = new  RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
            RaquetaGenerica  r6 = new  RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
            RaquetaGenerica  r7 = new  RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
            RaquetaGenerica  r8 = new  RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
            RaquetaGenerica  r9 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
            RaquetaGenerica  r10 = new  RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
            RaquetaGenerica  r11 = new  RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
            RaquetaGenerica  r12 = new  RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);
            
            
             //Novedad en EC3: Las siguientes raquetas son nuevas para EC3
            RaquetaGenerica  r14 = new RaquetaPotente("Wilson Energy XL", 260, 690, 680, Encordado.ABIERTO);
            RaquetaGenerica  r15 = new RaquetaPotente("Wilson Pro Open", 340, 740, 720, Encordado.ABIERTO);
            RaquetaGenerica  r16 = new RaquetaPotente("Babolat Boost Drive", 220, 680,600, Encordado.CERRADO);
            RaquetaGenerica  r17 = new RaquetaPotente("Babolat Pure Drive", 260, 720, 600, Encordado.CERRADO);
            RaquetaGenerica  r18 = new RaquetaControlada("Prince Force Ti OS", 340, 740, 600, Encordado.CERRADO);
            RaquetaGenerica  r19 = new RaquetaControlada("Head Prestige Pro", 340, 740, 720, Encordado.ABIERTO);
            RaquetaGenerica  r20 = new RaquetaControlada("Head Instinct", 220, 680,600, Encordado.ABIERTO);
            RaquetaGenerica  r21 = new RaquetaControlada("Dunlop Nitro", 340, 720, 600, Encordado.CERRADO);
            RaquetaGenerica  r22 = new RaquetaEquilibrada("Prince Force", 320, 690, 630, Encordado.ABIERTO, 6, 2);
            RaquetaGenerica  r23 = new RaquetaEquilibrada("Prince Warrior", 340, 740, 720, Encordado.ABIERTO, 6, 2);
            RaquetaGenerica  r24 = new RaquetaEquilibrada("Wilson Pro Staff", 220, 680, 600, Encordado.CERRADO, 2.5, 4);
            
            //INTRODUCIMOS LAS RAQUETAS EN LA LISTA DE RAQUETAS
            Campeonato.getInstancia().introducirRaquetas(r1);
            Campeonato.getInstancia().introducirRaquetas(r2);
            Campeonato.getInstancia().introducirRaquetas(r3);
            Campeonato.getInstancia().introducirRaquetas(r4);
            Campeonato.getInstancia().introducirRaquetas(r5);
            Campeonato.getInstancia().introducirRaquetas(r6);
            Campeonato.getInstancia().introducirRaquetas(r7);
            Campeonato.getInstancia().introducirRaquetas(r8);
            Campeonato.getInstancia().introducirRaquetas(r9);
            Campeonato.getInstancia().introducirRaquetas(r10);
            Campeonato.getInstancia().introducirRaquetas(r11);
            Campeonato.getInstancia().introducirRaquetas(r12);
            Campeonato.getInstancia().introducirRaquetas(r14);
            Campeonato.getInstancia().introducirRaquetas(r15);
            Campeonato.getInstancia().introducirRaquetas(r16);
            Campeonato.getInstancia().introducirRaquetas(r17);
            Campeonato.getInstancia().introducirRaquetas(r18);
            Campeonato.getInstancia().introducirRaquetas(r19);
            Campeonato.getInstancia().introducirRaquetas(r20);
            Campeonato.getInstancia().introducirRaquetas(r21);
            Campeonato.getInstancia().introducirRaquetas(r22);
            Campeonato.getInstancia().introducirRaquetas(r23);
            Campeonato.getInstancia().introducirRaquetas(r24);
        
    }
    
    private void cargarDatos2(Campeonato campeonato) {
            //Instanciamos 8 zapatillas: (Los parámetros están en el orden: modelo, número, tipo valor)
             Zapatillas  z1 = new  ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
            Zapatillas  z2 = new  ZapatillasConAgarre("Court Vapor React", 40,  5);
            Zapatillas  z3 = new  ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
            Zapatillas  z4 = new  ZapatillasAmortiguadas("Vapor Lite", 42,  3);
            Zapatillas  z5 = new  ZapatillasConAgarre("Court Lite", 39, 3);
            Zapatillas  z6 = new  ZapatillasAmortiguadas("UberSonic 4K", 40, 5.5);
            Zapatillas  z7 = new  ZapatillasAmortiguadas("Zoom GP Turbo", 43, 7);
            Zapatillas  z8 = new  ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);

        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais)
        //Novedad en EC3: cada tenista es de tipo "Golpeadores" o de tipo "Voleadores"
            Tenista  t1 = new Golpeadores ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
        Tenista  t2 = new Golpeadores ("Ashleigh Barty", z6, 70, 80, 1, "Australia", 40);
            Tenista  t3 = new Golpeadores ("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
            Tenista  t4 = new Golpeadores ("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
            Tenista  t5 = new Voleadores ("Elina Svitolina", z3, 55.5, 68.5, 4, "Ucrania", 40);
            Tenista  t6 = new Voleadores ("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
            Tenista  t7 = new Voleadores ("Aryna Sabalenka", z2, 67.5, 79.5, 2, "Bielorrusia", 40);
            Tenista  t8 = new Voleadores ("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);

        //A continuación se inscribirán a los 8 tenistas en el campeonato
         t1.realizarInscripcion();
         t2.realizarInscripcion();
         t3.realizarInscripcion();
         t4.realizarInscripcion();
         t5.realizarInscripcion();
         t6.realizarInscripcion();
         t7.realizarInscripcion();
         t8.realizarInscripcion();
        
        
         //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
        Zapatillas   z9 = new ZapatillasAmortiguadas("Lotto Space", 40,  5);
            Zapatillas  z10 = new ZapatillasConAgarre("Adidas Gamecourt", 40,  5);
            Zapatillas  z11 = new ZapatillasConAgarre("Asics Gel-Game", 42,  4.5);
            Zapatillas  z12 = new ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
            Zapatillas  z13 = new ZapatillasConAgarre("Joma Slam", 40, 3);
            Zapatillas  z14 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
            Zapatillas  z15 = new ZapatillasConAgarre("Asics Solution", 42, 3);
            Zapatillas  z16 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
            Zapatillas  z17 = new ZapatillasConAgarre("Nike Air Zoom", 40,  5);
            Zapatillas  z18 = new ZapatillasConAgarre("Nike Zoom Vapor", 42,  4);
            Zapatillas  z19 = new ZapatillasAmortiguadas("Wilson Rush", 42,  3.5);
            Zapatillas  z20 = new ZapatillasAmortiguadas("Head Revolt", 40,  3);
            Zapatillas  z21 = new ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
            Zapatillas  z22 = new ZapatillasConAgarre("Wilson Kaos", 41,  5);
            Zapatillas  z23 = new ZapatillasConAgarre("Head Revolt Pro", 42,  4.5);
            
            
            //INTRODUCIMOS LAS ZAPATILLAS EN LA LISTA DE ZAPATILLAS
            Campeonato.getInstancia().introducirZapatillas(z9);
            Campeonato.getInstancia().introducirZapatillas(z10);
            Campeonato.getInstancia().introducirZapatillas(z11);
            Campeonato.getInstancia().introducirZapatillas(z12);
            Campeonato.getInstancia().introducirZapatillas(z13);
            Campeonato.getInstancia().introducirZapatillas(z14);
            Campeonato.getInstancia().introducirZapatillas(z15);
            Campeonato.getInstancia().introducirZapatillas(z16);
            Campeonato.getInstancia().introducirZapatillas(z17);
            Campeonato.getInstancia().introducirZapatillas(z18);
            Campeonato.getInstancia().introducirZapatillas(z19);
            Campeonato.getInstancia().introducirZapatillas(z20);
            Campeonato.getInstancia().introducirZapatillas(z21);
            Campeonato.getInstancia().introducirZapatillas(z22);
            Campeonato.getInstancia().introducirZapatillas(z23);
    
        //Instanciamos raquetas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control
        RaquetaGenerica  r1 = new RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
            RaquetaGenerica  r2 = new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
            RaquetaGenerica  r3 = new RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
            RaquetaGenerica  r4 = new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
            RaquetaGenerica  r5 = new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
            RaquetaGenerica  r6 = new RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
            RaquetaGenerica  r7 = new RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
            RaquetaGenerica  r8 = new RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
            RaquetaGenerica  r9 = new RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
            RaquetaGenerica  r10 = new RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
            RaquetaGenerica  r11 = new RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
            RaquetaGenerica  r12 = new RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);

             //Novedad en EC3: Las siguientes raquetas son nuevas para EC3
            RaquetaGenerica  r13 = new RaquetaPotente("Wilson Energy XL", 260, 690, 680, Encordado.ABIERTO);
            RaquetaGenerica  r14 = new RaquetaPotente("Wilson Pro Open", 340, 740, 720, Encordado.ABIERTO);
            RaquetaGenerica  r15 = new RaquetaPotente("Babolat Boost Drive", 220, 680,600, Encordado.CERRADO);
            RaquetaGenerica  r16 = new RaquetaPotente("Babolat Pure Drive", 260, 720, 600, Encordado.CERRADO);
            
            //INTRODUCIMOS LAS RAQUETAS EN LA LISTA DE RAQUETAS
            Campeonato.getInstancia().introducirRaquetas(r1);
            Campeonato.getInstancia().introducirRaquetas(r2);
            Campeonato.getInstancia().introducirRaquetas(r3);
            Campeonato.getInstancia().introducirRaquetas(r4);
            Campeonato.getInstancia().introducirRaquetas(r5);
            Campeonato.getInstancia().introducirRaquetas(r6);
            Campeonato.getInstancia().introducirRaquetas(r7);
            Campeonato.getInstancia().introducirRaquetas(r8);
            Campeonato.getInstancia().introducirRaquetas(r1);
            Campeonato.getInstancia().introducirRaquetas(r10);
            Campeonato.getInstancia().introducirRaquetas(r11);
            Campeonato.getInstancia().introducirRaquetas(r12);
            Campeonato.getInstancia().introducirRaquetas(r13);
            Campeonato.getInstancia().introducirRaquetas(r14);
            Campeonato.getInstancia().introducirRaquetas(r15);
            Campeonato.getInstancia().introducirRaquetas(r16);
    }
   }

