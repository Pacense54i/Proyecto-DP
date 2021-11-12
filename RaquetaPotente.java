
/**
 * Write a description of class RaquetaPotente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaPotente extends RaquetaGenerica
{
    /**
     * Constructor for objects of class RaquetaPotente
     * 
     * @param String model, Double pes, Double longi, Double tamano, Encordado estilo son los parametros necesarios para 
     * iniciar el constructor de la clase Raqueta Potente el cual hace una llamada al super tipo Raqueta Generica
     */
    public RaquetaPotente(String model, double pes, double longi, double tamano, Encordado estilo)
    {
        super(model,pes,longi,tamano,estilo);
    }
    
    /**
     * Calcula la potencia de la RaquetaPotente dependiendo si tenemos un tipo de RaquetaPotente con Encordado ABIERTO o CERRADO.
     * Para ello sobreescribe el metodo calcularPotencia() del supertipo RaquetaGenerica
     * 
     * El cálculo de la potencia será el calculado por defecto por cualquier raqueta multiplicado por el 
     * multiplicador de potencia asociado al tipo de encordado que use la raqueta 
     * 
     * @return Double result: resultado de las operaciones realizadas segun el tipo de encordado de la raqueta
     */
    @Override
    public double calcularPotencia()
    {
        Encordado aux = null;
        Double result = 0.0;       
        Double j = null;
        
        j = super.calcularPotencia(); //obtengo la ponetencia
        
        aux = super.getEncordado();     //obtengo el encordado de la raqueta
        
        //veo si es de tipo ABIERTO
        if(super.getEstiloDeEncordado().equals("ABIERTO")){
            result = j * aux.getMultiplicadorDePotencia(); //multiplicado por 2.0
        }
        else{   //si no es de tipo ABIERTO
            result = j * aux.getMultiplicadorDePotencia(); //multiplicado por 1.8
        }
      
        return result;
    }
    
    /**
     * Calcula la velocidad de la RaquetaPotente.
     * 
     * @reutrn se devuelve la velocidad obtenida supertipo Raqueta Generica multiplicada por la constante FACTOR1;
     */
    @Override
    public double calcularVelocidad()
    {
        return super.calcularVelocidad() * super.FACTOR1;
    }
    
    
    /**
     * Muestra en pantalla los valores de la diferentes variables de la clase Raqueta Potente
     * 
     *Con @Override se sobreescribe el metodo toString de la clase RaquetaGenerica
     *@return devuelve una cadena (String) con lo que se quiere mostrar por pantalla
     */
    @Override
    public String toString()
    {
        String cadena1 ="  RaquetaPotente " + super.getEncordado().toString();
        String cadena2 ="\n     [modelo: " + super.getModelo();
        String cadena3 ="\n     longuitud: " + super.getLongitud() + ",potencia asociada: " + calcularPotencia();
        String cadena4 ="\n     tamaño: " + super.getTamanoDeLaCabeza() + ",control asociado: " + calcularControl();
        String cadena5 ="\n     peso: " + super.getPeso() + ",velocidad asociada: " + calcularVelocidad() + "]";
        
        return cadena1 + cadena2 + cadena3 + cadena4 + cadena5;
    }
}
