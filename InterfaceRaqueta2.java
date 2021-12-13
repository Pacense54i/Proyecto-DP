
/**
 * Write a description of interface InterfaceRaqueta2 here.
 * 
 * Interface en que incluye los metodos relacionados con iniciar los mapas necesarios para calcular algo en este caso calcularValorSaque, calcularControl y calcularVelocidad 
 * en la clase RaquetaGenerica
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface InterfaceRaqueta2
{
    /**
     * Se introduce los valores de la tabla Longitud Potencia en un HashMap llamado longitudPotencia
     * 
     * Las raquetas con mayor longitud ofrecen mayor potencia
     */
    public void iniciarMapaLongitudPotencia();
    
    /**
     * Se introduce los valores de la tabla Longitud Potencia en un HashMap llamado longitudPotencia
     * 
     * Las raquetas con una cabeza mayor ofrecen más potencia pero menos control
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
