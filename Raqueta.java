
/**
 * Write a description of class InterfaceRaqueta here.
 * 
 * Interface en que incluye los metodos set, get y toString de cada atributo de la clase RaquetaGenerica
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Raqueta
{
    /**
     * Set model para especificar el modelo de la Raqueta
     * 
     * @param String model: modelo de la Raqueta.
     */
    public void setModelo (String modelo);
    
        /**
     * Devuelve el modelo actual de la Raqueta
     * 
     * @return devuelve el valor de la varible modelo(String)
     */
    public String getModelo ();
    
    /**
     * Set peso para especificar el peso de la Raqueta
     * 
     * @param double peso: peso de la Raqueta.
     */
    public void setPeso (double peso);
    
     /**
     * Devuelve el peso actual de la Raqueta
     * 
     * @return devuelve el valor de la varible peso(double)
     */
    public double getPeso ();
    
    /**
     * Set longitud para especificar el longitud de la Raqueta
     * 
     * @param double longitud: longitud de la Raqueta.
     */
     public void setLongitud (double longitud);
     
     /**
     * Devuelve la longitud actual de la Raqueta
     * 
     * @return devuelve el valor de la varible longitud(double)
     */
    public double getLongitud();
    
    /**
     * Set tamanoDeLaCabeza para especificar el tamanoDeLaCabeza de la Raqueta
     * 
     * @param double tamanoDeLaCabeza: tamanoDeLaCabeza de la Raqueta.
     */
     public void setTamanoDeLaCabeza (double tamanoDeLaCabeza);
     
     /**
     * Devuelve la tamanoDeLaCabeza actual de la Raqueta
     * 
     * @return devuelve el valor de la varible tamanoDeLaCabeza(double)
     */
    public double getTamanoDeLaCabeza();
    
    /**
     * Set estiloDeEncordado para especificar el estiloDeEncordado de la Raqueta
     * 
     * @param Encordado (objeto de tipo ENUM) estiloDeEncordado: atributo estiloDeEncordado de la Raqueta.
     */
    public void setEstiloDeEncordado (Encordado estiloDeEncordado);
    
    /**
     * Devuelve el estiloDeEncordado actual de la Raqueta 
     * Puede ser : ABIERTO o CERRADO
     * 
     * @return devuelve el tipo de encordado de la raqueta almacenado en la variable estiloDeEncordado de tipo Encordado (ENUM)
     */
    public String getEstiloDeEncordado();
    
    /**
     * Metodo usado para obtener el Encordado de la variable estiloDeEncordado de la clase RaquetaGenerica
     * 
     * @return devuelve el objeto Encordado(ENUM) de la variable estiloDeEncordado de la Raqueta
     */
    public Encordado getEncordado();
    
    /**
     * Muestra en pantalla los valores de la diferentes variables de la clase RaquetaGenerica
     * 
     *Con @Override se sobreescribe el metodo toString de la clase Object
     *@return devuelve una cadena (String) con lo que se quiere mostrar por pantalla
     */
    public String toString();
    
     /**
     * Se introduce los valores de la tabla Longitud Potencia en un HashMap llamado longitudPotencia
     * 
     * Las raquetas con mayor longitud ofrecen mayor potencia
     */
    public void iniciarMapaLongitudPotencia();
    
    /**
     * Se introduce los valores de la tabla Longitud Potencia en un HashMap llamado longitudPotencia
     * 
     * Las raquetas con una cabeza mayor ofrecen m??s potencia pero menos control
     */
    public void iniciarMapaTmCabControl();
    
    /**
     * Se introduce los valores de la tabla Longitud Potencia en un HashMap llamado longitudPotencia
     * 
     * Las raquetas con menos peso ofrecen una mayor velocidad
     */
    public void iniciarMapaPesoVelocidad();
    
    
    /**
     * Calcula la potencia de la Raqueta. Para ello obtiene del HashMap longitudPotencia la potencia correspondiente a su longitud
     * 
     * @return (Double) devuelve la potencia correspondiente a su longuitud
     */
    public double calcularPotencia();
    
    /**
     * Calcula el control de la Raqueta. Para ello obtiene del HashMap tmCabControl el control correspondiente a su tamanoDeLaCabeza
     * 
     * @return (Double) devuelve el control correspondiente a su tamanoDeLaCabeza
     */
    public double calcularControl();
    
    /**
     * Calcula la velocidad de la Raqueta. Para ello obtiene del HashMap pesoVelocidad la velocidad correspondiente a su peso
     * 
     * @return (Double) devuelve la velocidad correspondiente a su peso 
     */
    public double calcularVelocidad();
}
