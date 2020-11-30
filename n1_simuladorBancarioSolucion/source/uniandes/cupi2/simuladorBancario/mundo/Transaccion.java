package uniandes.cupi2.simuladorBancario.mundo;

public class Transaccion {
	/*
	 * ATRIBUTOS
	 */
	
	private double valor;
	
	private int consecutivo;
	
	private int cuenta;
	
	private int tipo;
	
	protected static final int	ENTRADA = 0;
	protected static final int	SALIDA = 1;
	protected static final int	AHORROS = 0;
	protected static final int	CORRIENTE = 1;
	protected static final int	CDT = 2;

	/*
	 * Constructor
	 */
	
	public Transaccion (int pConsecutivo, double pMonto, int pTipo, int pCuenta)
	{
		consecutivo = pConsecutivo;
		valor = pMonto;
		tipo = pTipo;
		cuenta = pCuenta;
	}
	
	/*
	 * Metodos
	 */
	public int darConsecutivo()
	{
		return consecutivo;
	}
	
	public double darValor()
	{
		return valor;
	}
	
	public int darTipo()
	{
		return tipo;
	}
	
	public int darCuenta()
	{
		return cuenta;
	}
	
}
