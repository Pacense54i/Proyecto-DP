import java.util.TreeSet;
import java.util.Iterator;
import java.io.IOException;

/**
 * Write a description of class TenistasVoladores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Voleadores extends Tenista
{

    /**
     * Constructor for objects of class TenistasVoladores
     */
    public Voleadores(String Nombre, Zapatillas z, double Saque, double Resto, int Ranking, String Pais, double num)
    {
        super(Nombre,z,Saque,Resto,Ranking,Pais,num);
    }

    
    /**
     * El tenista incrementa sus puntos acumulados en un 15% de la potencia de su raqueta.
     */
    public void golpear()
    {
        double acumulados = 0.0;
        RaquetaGenerica aux = super.getRaqueta();        
        
        acumulados = super.getPuntosAcumulados() + aux.calcularPotencia() * 0.15 ;
        
        super.setPuntosAcumulados(acumulados);
    }
    
    /**
     * El tenista cambian su raqueta .
     * Para ello, obtiene  la primera raqueta disponible (de las que lista de Raquetas de la clase Campeonato) que tenga una velocidad mayor a la suya 
     * y cambiará su raqueta por dicha raqueta eliminando tambien la raqueta de la lista de Raquetas de la clase Campeonato
     * 
     * Con @Override se sobreescribe el metodo toString de la clase Tenista
     */
    @Override
    public void cambiarRaqueta() throws IOException
    {
        Iterator <RaquetaGenerica> iterator = Campeonato.getInstancia().getRaquetasCampeonato().iterator();
        boolean enc = false;
        RaquetaGenerica r = super.getRaqueta();
        while (iterator.hasNext() && enc==false)
        {
            RaquetaGenerica aux = (RaquetaGenerica) iterator.next();
            if( aux.calcularVelocidad() > r.calcularVelocidad()){
                enc=true;
                iterator.remove();
                super.setRaqueta(aux);
                System.out.println("       " + super.getNombre() + " cambia su raqueta por: " + aux.getClass().getName() + " modelo =" + aux.getModelo() + " Velocidad = " 
                + aux.calcularVelocidad());
                
                //Campeonato.getInstancia().getFichero().write("\n        " + super.getNombre() + " cambia su raqueta por: " + aux.getClass().getName() + " modelo =" + aux.getModelo() + " Velocidad = " 
                //+ aux.calcularVelocidad());
            }
        }
        
        if(!enc){
            System.out.println("       " + super.getNombre() + " no cambia su raqueta");
            Campeonato.getInstancia().getFichero().write("\n       " + super.getNombre() + " no cambia su raqueta");
        }
    }
    
}
