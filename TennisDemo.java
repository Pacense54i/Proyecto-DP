

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase que lanza la simulación del campeonato de tenis
 * 
 * @author Equipo Docente DP 
 * @version 1.0
 */

public class TennisDemo {

    public static void main(String[] args) {
        //Creación del campeonato
        //Instanciar una variable de tipo Campeonato;
        //Carga de datos iniciales del campeonato
        //Instanciar una variable de tipo InitTennisData pasando la variable instanciada de tipo campeonato como parámetro;
        //Llamada al método que inicia la simulación del campeonato
        //Llamar al método que hayáis definido en vuestra clase Campeonato en la variable instanciada de tipo campeonato para que realice el campeonato;
        
        
        Campeonato c = new Campeonato();
        InitTennisData data = new InitTennisData(c);
        c.competicion();
    }
}