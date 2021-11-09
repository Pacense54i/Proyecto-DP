
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
    
    Encordado(String estiloDeEncordado, Double mulPotencia, Double mulControl)
    {
        estilo = estiloDeEncordado;
        multiplicadorDePotencia = mulPotencia;
        multiplicadorDeControl = mulControl;
    }
    
    public String getEstilo()
    {
        return this.estilo;  
    }
    
    public Double getMultiplicadorDePotencia()
    {
        return this.multiplicadorDePotencia;
    }
    
    public Double getMultiplicadorDeControl()
    {
        return this.multiplicadorDeControl;
    }
    
    @Override
    public String toString()
    {
        String cadena = "(Encordado:" + getEstilo() + ")" + "(Multiplicador de Potencia:" + getMultiplicadorDePotencia() + ")" +
        "(Multiplicador de Control:" + getMultiplicadorDeControl() + ")";
        return cadena;
    }
}
