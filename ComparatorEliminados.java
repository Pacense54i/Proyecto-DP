import java.util.Comparator;

/**
 * Write a description of class ComparatorEliminados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparatorEliminados implements Comparator<Tenista>
{
    
    /**
     * Compara los valores de la variable ordenEliminado entre el Tenista t1 y el Tenista t2
     * 
     * @param Tenista t1, Tenista t2: dos variables Tenista  en la que se quieran comparar la variable ordenEliminado de ambos tenistas
     */
    public int compare(Tenista t1, Tenista t2)
    {
        if(t1.getOrdenEliminado() == t2.getOrdenEliminado()){
                return 0;
        }
        else if( t1.getOrdenEliminado() < t2.getOrdenEliminado() )
                return 1;
            else
                return -1;
            
        
    }
    
}
