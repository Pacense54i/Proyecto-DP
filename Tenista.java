
/**
 * Clase Tenista la cual incluye los metodos get y set de cada atributo y otros modulos necesarios
 * 
 * @author (Carlos Garcia Sanchez, Sergio Jimenez Macias, Alfonso David Recio Calderon) 
 * @version (1.0)
 */
public class Tenista
{
    // instance variables - replace the example below with your own
    private int ordenEliminado;
    private double saque;
    private double resto;
    private int ranking;
    private double puntosAcumulados;
    private double guardarPtoSaque; 
    private String nombre;
    private String pais;
    private Zapatillas zapatilla;
    // guardarPtoSaque es una variable creada para guardar 
    //los puntos que ha conseguido un tenista con su saque
    //Al ser una variable creada con ese proposito no es necesario mostrarla 
    //por pantalla en el metodo mostrarTenista
    /**
     * Contructor de los objetos de la clase Tenista
     */
    
    public Tenista()
    {
        // initialise instance variables
        ordenEliminado = 0;
        saque = 0.0;
        resto = 0.0;
        ranking = 0;
        puntosAcumulados = 0.0;
        guardarPtoSaque = 0.0;
        nombre = " ";
        pais = " ";
        zapatilla = new Zapatillas();
    }
    
    /**
     * Contructor de parametrizado de los objetos de la clase Tenista
     * 
     * @param String Nombre, Zapatillas z, double Saque, double Resto, int Ranking, String Pais  parametros introducidos para iniciar el constructor
     */
    public Tenista (String Nombre, Zapatillas z, double Saque, double Resto, int Ranking, String Pais)
    {
        ordenEliminado = 0;
        saque = Saque;
        resto = Resto;
        ranking = Ranking;
        puntosAcumulados = 0.0;
        guardarPtoSaque = 0;
        nombre = Nombre;
        pais = Pais;
        zapatilla = z;
    }
    
    /**
     * Muestra por pantalla los valores de la variable de la clase Tenista
     */
    @Override
    public String toString()
    {
        String cadena=" Tenista [" + 
        "Nombre=" + nombre + "," + "Saque=" + saque + "," + "Resto=" + resto + "," + "Ranking=" + ranking + "," +
        "Pais=" + pais + ","  + "]";
        // zapatilla.mostrarZapatillas();
        return cadena;
    }
    
    
    /**
     * Set orden para especificar el ordenEliminado del Tenista
     * 
     * @param int orden: introduce el numero correspondiente del orden en el que ha sido eliminado el tenista
     */
    public void setOrdenEliminado(int orden)
    {
        this.ordenEliminado = orden;
    }
    
    /**
     * Devuelve el valor guardado en la variable ordenEliminado
     * 
     * @return int valor: valor actual de la variable ordenEliminado
     */
    public int getOrdenEliminado()
    {
        return this.ordenEliminado;
    }
    
    
    /**
     * Set saque1 para especificar el saque del Tenista
     * 
     * @param double saque1: valor para introducir en la variable saque
     */
    public void setSaque(double saque1)
    {
        this.saque = saque1;
    }
    
    /**
     * Devuelve el valor guardado en la variable saque
     * 
     * @return double saque: valor actual de la variable saque
     */
    public double getSaque()
    {
        return this.saque;
    }
    
    
    /**
     * Set rest para especificar el resto del Tenista
     * 
     * @param double rest: nuevo valor para la variable resto
     */
    public void setResto(double rest)
    {
        this.resto = rest;
    }
    
    /**
     * Devuelve el valor guardado en la variable resto
     * 
     * @return double resto: vuelve el valor actual de la variable resto
     */
    public double getResto()
    {
        return this.resto;
    }
    
    
    /**
     * Set rankin para especificar el ranking del Tenista
     * 
     * @param int rankin: nuevo valor para la variable ranking
     */
    public void setRanking(int rankin)
    {
        this.ranking = rankin;
    }
    
    /**
     * Devuelve el valor guardado en la variable ranking
     * 
     * @return int ranking: devuelve el valor actual de la variable ranking
     */
    public int getRanking()
    {
        return this.ranking;
    }
    
    
    /**
     * Set ptoAcumulados para especificar puntosAcumulados del Tenista
     * 
     * @param double puntosAcomulados:nuevo valor para la variable puntosAcomulados
     */
    public void setPuntosAcumulados(double ptoAcumulados)
    {
        this.puntosAcumulados = ptoAcumulados;
    }
    
    /**
     * Devuelve el valor guardado en la variable puntosAcumulados
     * 
     * @return double puntosAcomulados: devuelve el valor de la variable  puntosAcomulados
     */
    public double getPuntosAcumulados()
    {
       return this.puntosAcumulados;
    }
    
    
    /**
     * Set guardarSaque para especificar el  guardarPtoSaque del Tenista
     * 
     * @param double guardarSaque: nuevo valor para la variable guardarPtoSaque
     */
    public void setGuardarPtoSaque(double guardarSaque)
    {
       this.guardarPtoSaque = guardarSaque;
    }
    
    /**
     * Devuelve el valor guardado en la variable guardarPtoSaque
     * 
     * @return double guardarPuntosSaque: devuelve el valor actual de la varuable guardarPtoSaque
     */
    public double getGuardarPtoSaque()
    {
       return this.guardarPtoSaque;
    }
    
    
    
    /**
     * Set name para especificar el nombre del Tenista
     * 
     * @param string name: nuevo valor para la variable name
     */
    public void setNombre(String name)
    {
        this.nombre = name;
    }
    
    /**
     * Devuelve el valor guardado en la variable nombre
     * 
     * @return string nombre: devuelve el valor actual de la variable nombre
     */
    public String getNombre()
    {
       return this.nombre;
    }
    
    
    /**
     * Set country para especificar el pais del Tenista
     * 
     * @param string country: nuevo valor para la variable contry
     */
    public void setPais(String country)
    {
        this.pais = country;
    }
    
    /**
     * Devuelve el valor guardado en la variable pais
     * 
     * @return string pais: devuelve el valor actual de la variable pais
     */
    public String getPais()
    {
       return this.pais;
    }
    
    
    /**
     * Set calzado para especificar la zapatilla del Tenista
     * 
     * @param Zapatillas calzado: nueva zapatilla para el Tenista
     */
    public void setZapatilla(Zapatillas calzado)
    {
        this.zapatilla = calzado;
    }
    
    /**
     * Devuelve el valor guardado en la variable zapatilla
     * 
     * @return Zapatilla: devuelve la zapatilla del tenista
     */
    public Zapatillas getZapatilla()
    {
       return this.zapatilla;
    }
    
    
    /**
     * Devuelve el valor del saque del tenista con las zapatillas aux
     * 
     * @return devuelve la variable result(double) que contiene el valor de 
     *          multiplicar los puntos de la variable saque por el valor del saque de la zapatilla
     */
    public double calcularSaque()
    {
        double result;
        result = 0;
        Zapatillas auxZapa = new Zapatillas();
        auxZapa = this.getZapatilla();
        
        result =  this.getSaque() * auxZapa.calcularValorSaque();
        guardarPtoSaque = result;
        
        return result;
    }
    
    /**
     * Poner la pelota en juego
     */
    public void sacar()
    {
        double increment;
        increment = 0;
        
        increment = this.getPuntosAcumulados() + this.calcularSaque();
        
        this.setPuntosAcumulados(increment);
        
    }
    
    
    /**
     * Devuelve el valor del resto del tenista con las zapatillas aux
     * 
     * @return devuelve la variable result(double) que contiene el valor de multiplicar los puntos de la variable resto por el valor del resto
     */
    public double calcularResto()
    {
        double result;
        result = 0;
        Zapatillas auxZapa = new Zapatillas();
        auxZapa = this.getZapatilla();
        
        result =  this.getResto() * auxZapa.calcularValorResto();
        
        return result;
    }
    
    /**
     * Compara el resto del tenista t2 con el valor del saque del tenista t1. Si es mayor se incrementan los puntos acomulados
     * 
     * @param Tenista oponente: Tenista con el que se quiere comparar el valor de saque
     */
    public void restar(Tenista oponente)
    {
        double incrementar;
        double resto;
        resto = this.calcularResto(); //calcular resto del tenista 1
        
            if(resto > oponente.getGuardarPtoSaque()){ //comparacion del resto del tenista 1 con el saque del tenista oponente(t2)
                incrementar = this.getPuntosAcumulados() + resto;
                this.setPuntosAcumulados(incrementar);
            }
        //Al haber usado ya la variable guardarPtoSaque voy a ponerla a 0
        //para que no haya problemas a la hora de volver a 
        //usarla con otro tenista
        guardarPtoSaque = 0;
     }
     
     /**
     * Pone en juego a los tenistas
     * 
     * @param Tenista oponente: Tenista contra el que se quiere jugar el partido
     */
    public void jugar(Tenista oponente)
    {
        sacar();
        oponente.restar(this);
    }
}
    
    
  
