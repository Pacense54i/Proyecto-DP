
/**
 * Enumeration class Encordado - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Encordado
{
    ABIERTO("ABIERTO",2.0, 2.2),
    CERRADO("CERRADO",1.8,2.5);
    
    private String estilo;
    private Double multiplicadorDePotencia;
    private Double multiplicadorDeControl;
    
    /**
     * Constructor del tipo ENUM Encordado
     */
    Encordado(String estiloDeEncordado, Double mulPotencia, Double mulControl)
    {
        estilo = estiloDeEncordado;
        multiplicadorDePotencia = mulPotencia;
        multiplicadorDeControl = mulControl;
    }
    
    /**
     * Devuelve el String almacenado en el atributo Estilo 
     * 
     * @return String estilo: devuelve el estilo del encordado
     */
    public String getEstilo()
    {
        return this.estilo;  
    }
    
    /**
     * Devuelve el valor guardado en el atributo multiplicadorDePotencia
     * 
     * @return Double multiplicadorDePotencia: devuelve el multiplicadorDePotencia asociado a tipo de estilo del encordado dado que este valor es diferente segun el estilo del encordado
     */
    public Double getMultiplicadorDePotencia()
    {
        return this.multiplicadorDePotencia;
    }
    
    /**
     * Devuelve el valor guardado en el atributo multiplicadorDeControl
     * 
     * @return Double multiplicadorDeControl: devuelve el multiplicadorDeControl asociado a tipo de estilo del encordado dado que este valor es diferente segun el estilo del encordado
     */
    public Double getMultiplicadorDeControl()
    {
        return this.multiplicadorDeControl;
    }
    
    /**
     * Muestra en pantalla los valores del tipo ENUM encordado
     * 
     *Con @Override se sobreescribe el metodo toString de la clase Object
     *@return devuelve una cadena (String) con lo que se quiere mostrar por pantalla
     */
    @Override
    public String toString()
    {
        String cadena = "(Encordado:" + getEstilo() + ")" + "(Multiplicador de Potencia:" + getMultiplicadorDePotencia() + ")" +
        "(Multiplicador de Control:" + getMultiplicadorDeControl() + ")";
        return cadena;
    }
}
