
/**
 * Write a description of class TenistasGolpeadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Golpeadores extends Tenista
{
    

    /**
     * Constructor for objects of class TenistasGolpeadores
     */
    public Golpeadores(String Nombre, Zapatillas z, double Saque, double Resto, int Ranking, String Pais, double num)
    {
        super(Nombre,z,Saque,Resto,Ranking,Pais,num);
    }

    /**
     * Muestra en pantalla los valores de la diferentes variables de la clase TenistasGolpeadores
     * 
     *Con @Override se sobreescribe el metodo toString de la clase Tenista
     *@return devuelve una cadena (String) con lo que se quiere mostrar por pantalla
     */
    @Override
    public String toString()
    {
        return super.toString();
    }
    
    /**
     * El tenista incrementa sus puntos acumulados en un 10% de la velocidad que alcanza su raqueta
     */
    public void golpear()
    {
        double acumulados = 0.0;
        RaquetaGenerica aux = super.getRaqueta();        
        
        acumulados = super.getPuntosAcumulados() + aux.calcularVelocidad() * 0.10 ;
        
        super.setPuntosAcumulados(acumulados);
    }
    
    
}
