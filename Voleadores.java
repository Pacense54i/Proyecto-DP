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
     * Muestra en pantalla los valores de la diferentes variables de la clase TenistasVoladores
     * 
     *Con @Override se sobreescribe el metodo toString de la clase Tenista
     *@return devuelve una cadena (String) con lo que se quiere mostrar por pantalla
     */
    @Override
    public String toString()
    {
        return super.toString();
    }
    
    public void golpear()
    {
        double acumulados = 0.0;
        RaquetaGenerica aux = super.getRaqueta();        
        
        acumulados = super.getPuntosAcumulados() + aux.calcularPotencia() * 0.15 ;
        
        super.setPuntosAcumulados(acumulados);
    }
    
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
