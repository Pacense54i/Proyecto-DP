
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase que carga los datos con los que simular un campeonato de tenis
 * 
 * @author Equipo Docente DP 
 * @version 2.0
 */
public class InitTennisData {

     public InitTennisData() {
    //Descomentar la carga de datos que se quiera probar
        cargarDatos1();//Produce la salida Salida1_EC2
    //cargarDatos2();/Produce la salida Salida2_EC2
        
    //CargarDatos ya no tiene parámetro!!
    }
    
    private void cargarDatos1() {
    //Instanciamos 8 zapatillas: (Los parámetros están en el orden: tipo, modelo, número y valor)
    Zapatillas z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
    Zapatillas z2 = new ZapatillasConAgarre("Court Vapor React", 40,  5);
    Zapatillas z3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
    Zapatillas z4 = new ZapatillasAmortiguadas("Vapor Lite", 42,  3);
    Zapatillas z5 = new ZapatillasConAgarre("Court Lite", 39, 3);
    Zapatillas z6 = new ZapatillasAmortiguadas("UberSonic 4K", 40, 6);
    Zapatillas z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 3.5);
    Zapatillas z8 = new ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);


    //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais y número de pie)
    Tenista t1 = new Tenista("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
    Tenista t2 = new Tenista("Ashleigh Barty", z2, 70, 80, 1, "Australia", 40);
    Tenista t3 = new Tenista("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
    Tenista t4 = new Tenista("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
    Tenista t5 = new Tenista("Elina Svitolina", z6, 55.5, 68.5, 4, "Ucrania", 40);
    Tenista t6 = new Tenista("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
    Tenista t7 = new Tenista("Aryna Sabalenka", z3, 67.5, 79.5, 2, "Bielorrusia", 40);
    Tenista t8 = new Tenista("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);
         
    //A continuación se inscribirán a los 8 tenistas en el campeonato
    Campeonato c = Campeonato.getInstancia();
       c.inscribirJugadores(t1);
       c.inscribirJugadores(t2);
       c.inscribirJugadores(t3);
       c.inscribirJugadores(t4);
       c.inscribirJugadores(t5);
       c.inscribirJugadores(t6);
       c.inscribirJugadores(t7);
       c.inscribirJugadores(t8);
       
       
       //RealizarInscripcion
       //c1.RealizarInscripcion o t1, no me he enterado bien
    
    /////////////////////////////////////////////////////////////////

    //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
    Zapatillas z9 = new ZapatillasAmortiguadas("Lotto Space", 40,  5);
    Zapatillas z10 = new ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
    Zapatillas z11 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
    Zapatillas z12 = new ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
    Zapatillas z13 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
    Zapatillas z14 = new ZapatillasAmortiguadas("Wilson Rush", 42,  3.5);
    Zapatillas z15 = new ZapatillasAmortiguadas("Head Revolt", 40,  5);
    Zapatillas z16 = new ZapatillasConAgarre("Joma Slam", 40, 3);
    Zapatillas z17 = new ZapatillasConAgarre("Adidas Gamecourt", 40,  5);
    Zapatillas z18 = new ZapatillasConAgarre("Asics Gel-Game", 42,  4.5);
    Zapatillas z19 = new ZapatillasConAgarre("Asics Solution", 42, 3);
    Zapatillas z20 = new ZapatillasConAgarre("Nike Air Zoom", 40,  5);
    Zapatillas z21 = new ZapatillasConAgarre("Nike Zoom Vapor", 42,  4);
    Zapatillas z22 = new ZapatillasConAgarre("Wilson Kaos", 41,  5);
    Zapatillas z23 = new ZapatillasConAgarre("Head Revolt Pro", 42,  4.5);
    
        
        //INTRODUCIMOS LAS ZAPATILLAS EN LA LISTA DE ZAPATILLAS
    
        c.introducirZapatillas(z9);
        c.introducirZapatillas(z10);
        c.introducirZapatillas(z11);
        c.introducirZapatillas(z12);
        c.introducirZapatillas(z13);
        c.introducirZapatillas(z14);
        c.introducirZapatillas(z15);
        c.introducirZapatillas(z16);
        c.introducirZapatillas(z17);
        c.introducirZapatillas(z18);
        c.introducirZapatillas(z19);
        c.introducirZapatillas(z20);
        c.introducirZapatillas(z21);
        c.introducirZapatillas(z22);
        c.introducirZapatillas(z23);
        //////////////////////////////////////////////////
        

        
        
    
    //Instanciamos raquetas para ser usadas en el campeonato: 
    //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
    //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control
        RaquetaGenerica r1 =  new RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        RaquetaGenerica r2 =  new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
        RaquetaGenerica r3 =  new RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
        RaquetaGenerica r4 =  new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
        RaquetaGenerica r5 =  new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        RaquetaGenerica r6 =  new RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
        RaquetaGenerica r7 =  new RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
        RaquetaGenerica r8 =  new RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
        RaquetaGenerica r9 =  new RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        RaquetaGenerica r10 =  new RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        RaquetaGenerica r11 =  new RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
        RaquetaGenerica r12 =  new RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);
    
    
    //INTRODUCIMOS LAS RAQUETAS EN LA LISTA DE RAQUETAS
    
        c.introducirRaquetas(r1);
        c.introducirRaquetas(r2);
        c.introducirRaquetas(r3);
        c.introducirRaquetas(r4);
        c.introducirRaquetas(r5);
        c.introducirRaquetas(r6);
        c.introducirRaquetas(r7);
        c.introducirRaquetas(r8);
        c.introducirRaquetas(r9);
        c.introducirRaquetas(r10);
        c.introducirRaquetas(r11);
        c.introducirRaquetas(r12);
    
    }
    
    private void cargarDatos2() {
    // //Instanciamos 8 zapatillas: (Los parámetros están en el orden: modelo, número, tipo valor)
    // Zapatillas z1 =  new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
    // Zapatillas z2 =  new ZapatillasConAgarre("Court Vapor React", 40,  5);
    // Zapatillas z3 =  new ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
    // Zapatillas z4 =  new ZapatillasAmortiguadas("Vapor Lite", 42,  3);
    // Zapatillas z5 =  new ZapatillasConAgarre("Court Lite", 39, 3);
    // Zapatillas z6 =  new ZapatillasAmortiguadas("UberSonic 4K", 40, 5.5);
    // Zapatillas z7 =  new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 7);
    // Zapatillas z8 =  new ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);

    // //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais)
    // Tenista t1 =   ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
    // Tenista t2 =   ("Ashleigh Barty", z6, 70, 80, 1, "Australia", 40);
    // Tenista t3 =   ("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
    // Tenista t4 =   ("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
    // Tenista t5 =   ("Elina Svitolina", z3, 55.5, 68.5, 4, "Ucrania", 40);
    // Tenista t6 =   ("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
    // Tenista t7 =   ("Aryna Sabalenka", z2, 67.5, 79.5, 2, "Bielorrusia", 40);
    // Tenista t8 =   ("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);
    
    
    
    //A continuación se inscribirán a los 8 tenistas en el campeonato
    // Campeonato c = Campeonato.getInstancia();
       // c.inscribirJugadores(t1);
       // c.inscribirJugadores(t2);
       // c.inscribirJugadores(t3);
       // c.inscribirJugadores(t4);
       // c.inscribirJugadores(t5);
       // c.inscribirJugadores(t6);
       // c.inscribirJugadores(t7);
       // c.inscribirJugadores(t8);
       
    
    /////////////////////////////////////////////////////////////////
    
    

    // //A continuación se inscribirán a los 8 tenistas en el campeonato
    // //Instanciamos zapatillas para ser usadas en el campeonato: 
    // //(Los parámetros están en el orden: tipo, modelo, número y valor)
    // Zapatillas z9 = new ZapatillasAmortiguadas("Lotto Space", 40,  5);
    // Zapatillas z10 = new ZapatillasConAgarre("Adidas Gamecourt", 40,  5);
    // Zapatillas z11 = new ZapatillasConAgarre("Asics Gel-Game", 42,  4.5);
    // Zapatillas z12 = new ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
    // Zapatillas z13 = new ZapatillasConAgarre("Joma Slam", 40, 3);
    // Zapatillas z14 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
    // Zapatillas z15 = new ZapatillasConAgarre("Asics Solution", 42, 3);
    // Zapatillas z16 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
    // Zapatillas z17 = new ZapatillasConAgarre("Nike Air Zoom", 40,  5);
    // Zapatillas z18 = new ZapatillasConAgarre("Nike Zoom Vapor", 42,  4);
    // Zapatillas z19 = new ZapatillasAmortiguadas("Wilson Rush", 42,  3.5);
    // Zapatillas z20 = new ZapatillasAmortiguadas("Head Revolt", 40,  3);
    // Zapatillas z21 = new ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
    // Zapatillas z22 = new ZapatillasConAgarre("Wilson Kaos", 41,  5);
    // Zapatillas z23 = new ZapatillasConAgarre("Head Revolt Pro", 42,  4.5);
    
    
    //INTRODUCIMOS LAS ZAPATILLAS EN LA LISTA DE ZAPATILLAS
    
        // c.introducirZapatillas(z9);
        // c.introducirZapatillas(z10);
        // c.introducirZapatillas(z11);
        // c.introducirZapatillas(z12);
        // c.introducirZapatillas(z13);
        // c.introducirZapatillas(z14);
        // c.introducirZapatillas(z15);
        // c.introducirZapatillas(z16);
        // c.introducirZapatillas(z17);
        // c.introducirZapatillas(z18);
        // c.introducirZapatillas(z19);
        // c.introducirZapatillas(z20);
        // c.introducirZapatillas(z21);
        // c.introducirZapatillas(z22);
        // c.introducirZapatillas(z23);
        //////////////////////////////////////////////////
        
    
    // // Instanciamos raquetas para ser usadas en el campeonato: 
    // // (Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
    // //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control
    // RaquetaGenerica r1 = new RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
    // RaquetaGenerica r2 = new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
    // RaquetaGenerica r3 = new RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
    // RaquetaGenerica r4 = new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
    // RaquetaGenerica r5 = new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
    // RaquetaGenerica r6 = new RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
    // RaquetaGenerica r7 = new RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
    // RaquetaGenerica r8 = new RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
    // RaquetaGenerica r9 = new RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
    // RaquetaGenerica r10 = new RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
    // RaquetaGenerica r11 = new RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
    // RaquetaGenerica r12 = new RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);
    
    
    //INTRODUCIMOS LAS RAQUETAS EN LA LISTA DE RAQUETAS
    
        // c.introducirRaquetas(r1);
        // c.introducirRaquetas(r2);
        // c.introducirRaquetas(r3);
        // c.introducirRaquetas(r4);
        // c.introducirRaquetas(r5);
        // c.introducirRaquetas(r6);
        // c.introducirRaquetas(r7);
        // c.introducirRaquetas(r8);
        // c.introducirRaquetas(r9);
        // c.introducirRaquetas(r10);
        // c.introducirRaquetas(r11);
        // c.introducirRaquetas(r12);
   }
}
