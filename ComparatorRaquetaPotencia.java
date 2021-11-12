import java.util.Comparator;

/**
 * Write a description of class ComparatorRaquetaPotencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparatorRaquetaPotencia implements Comparator<RaquetaGenerica>
{
    /**
     * Compara los valores de la variable Potencia (utilizando el método calcularPotencia) entre la RaquetaGenerica r1 y la RaquetaGenerica r2
     * 
     * @param RaquetaGenerica r1, RaquetaGenerica r2: dos variables Tenista  en la que se quieran comparar la variable ordenEliminado de ambos tenistas
     */
    public int compare(RaquetaGenerica r1, RaquetaGenerica r2)
    {
        if(r1.calcularPotencia() == r2.calcularPotencia() ){
            
                if(r1.getModelo().equals(r2.getModelo())  ){
                    return 0;
                }
                    else if( r1.getModelo().compareTo(r2.getModelo()) < 0 )
                            return 1;
                        else
                            return -1;
                
        }
        else if( r1.calcularPotencia() < r2.calcularPotencia() )
                return 1;
            else
                return -1;
                
            
        
    }
    
}

