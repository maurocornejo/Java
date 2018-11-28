package Ejercicios_cursoudemy_java;

import java.util.Random;

public class CuentaCorriente {
	
	public CuentaCorriente(String nombreTitular, double saldo) {
		
		this.saldo=saldo;
		
		this.nombreTitular=nombreTitular;
		
		Random rnd=new Random();
		
		numeroCuenta=Math.abs(rnd.nextLong());
	}
	
	public void setIngreso(double ingreso) {
		
		if(ingreso<0) System.out.println("No se permiten ingresos negativos");
		
		else saldo+=ingreso;
		
	}
	public void setReintegro(double reintegro) {
		
		saldo=reintegro;
	}
	
	public String getSaldo() {
		
		return "El saldo de la cuenta es : "  + saldo;
				
	}
	
	public static void Transferencia(CuentaCorriente titu1, CuentaCorriente titu2, double cantidad) {
		
		titu1.saldo-=cantidad;
		titu2.saldo+=cantidad;
	}
	
	public String getDatosCuenta() {
		
		return "titular :" + nombreTitular  + "\n" + "N de Cuenta: " + numeroCuenta + "\n" +"Saldo: " +saldo; 
	}
	
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;

}
