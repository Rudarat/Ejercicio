
/**
 * 
 * @author Ana Jaime Sevilla
 *
 */
public class CCuenta {
	
		private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInteres;

	    public CCuenta()
	    {
	    }

	    /**
	     * 
	     * @param nom
	     * @param cue
	     * @param sal
	     * @param tipo
	     */
	    
	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        setNombre(nom);
	        setCuenta(cue);
	        saldo=sal;
	    }

	    /**
	     * 
	     * @return saldo
	     */
	    
	    public double estado()
	    {
	        return saldo;
	    }

	    /**
	     * 
	     * @param cantidad
	     * @throws Exception
	     */
	    
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        saldo = saldo + cantidad;
	    }

	    /**
	     * 
	     * @param cantidad
	     * @throws Exception
	     */
	    
	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        saldo = saldo - cantidad;
	    }
	    
	    /**
	     * 
	     * @return nombre
	     */

		public String getNombre() {
			return nombre;
		}
		
		/**
		 * 
		 * @param nombre
		 */

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		/**
		 * 
		 * @return cuenta
		 */

		public String getCuenta() {
			return cuenta;
		}
		
		/**
		 * 
		 * @param cuenta
		 */

		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}
		
		/**
		 * 
		 * @return tipoInteres
		 */

		public double getTipoInteres() {
			return tipoInteres;
		}

		/**
		 * 
		 * @param tipoInteres
		 */
		
		public void setTipoInteres(double tipoInteres) {
			this.tipoInteres = tipoInteres;
		}
		
		public double getSaldo() { 
			return saldo;
		}
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

}
