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
     * Compara los valores de la variable ordenEliminado entre el Tenista t1 y el Tenista t2
     * 
     * @param RaquetaGenerica r1, RaquetaGenerica r2: dos variables Tenista  en la que se quieran comparar la variable ordenEliminado de ambos tenistas
     */
    public int compare(RaquetaGenerica r1, RaquetaGenerica r2)
    {
        if(r1.calcularPotencia().compareTo( r2.calcularPotencia() ) == 0){
            
                if(r1.getModelo().compareTo( r2.getModelo() ) == 0){
                    return 0;
                }
                    else if( r1.getModelo().compareTo( r2.getModelo() ) > 0)
                            return 1;
                        else
                            return -1;
                
                
        }
        else if( r1.calcularPotencia().compareTo( r2.calcularPotencia() ) > 0)
                return 1;
            else
                return -1;
                
            
        
    }
    
}

