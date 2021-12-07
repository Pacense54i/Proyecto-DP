
/**
 * Write a description of class TenistasVoladores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TenistasVoladores extends Tenista
{

    /**
     * Constructor for objects of class TenistasVoladores
     */
    public TenistasVoladores(String Nombre, Zapatillas z, double Saque, double Resto, int Ranking, String Pais, double num)
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
    
    @Override
    public void golpear()
    {
        
    }
    
    @Override
    public void cambiarRaqueta(Tenista t)
    {
    
    }
    
}
