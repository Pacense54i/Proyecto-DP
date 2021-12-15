

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;

/**
 * Clase que lanza la simulación del campeonato de tenis
 * 
 * @author Equipo Docente DP 
 * @version 1.0
 */

public class TennisDemo {

    public static void main(String[] args) throws IOException {
        //1 Creación del campeonato
        //Instanciar una variable de tipo Campeonato;
            //OPCIONAL-> Exclusivamente para los que implementen patrón Observer:
            //Crear una instancia de cada tipo de medio de comunicación (MedioGeneralista con nombre "La Tierrina", MedioSensacionalista con nombre "Adios" y MedioDeportivo con nombre "Anota"
            //Suscribir a cada uno de esos medios a lo que pueda ocurrir en el Campeonato
        //2 Carga de datos iniciales del campeonato
        //Instanciar una variable de tipo InitTennisData pasando (o no) la variable instanciada de tipo campeonato como parámetro;
        //3 Llamada al método que inicia la simulación del campeonato
        //Llamar al método que hayáis definido en vuestra clase Campeonato en la variable instanciada de tipo campeonato para que realice el campeonato;
        
        
        Campeonato c = Campeonato.getInstancia();
        InitTennisData data = new InitTennisData(c);
        c.competicion();
    }
}