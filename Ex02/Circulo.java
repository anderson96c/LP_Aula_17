/**
 * Classe Circulo
 * define funções de calcular area e perimetro da classe abstrata Forma
 * tem o atributo raio para definir o circulo e utiliza esses valores nos métodos
 *
 * @Author Anderson Caio da Fonseca Santos
 */
import java.lang.Math;
public class Circulo extends Forma
{
	private float raio;

	/**
	 * Método construtor
	 * @param	raio		raio do circulo
	 */
	public Circulo(float raio)
	{
		this.raio = raio;
	}

	//Converter Math.PI de double para float
	float pi = (float)Math.PI;

	/**
	 * Retorna a area do circulo
	 * @return PI * raio²
	 */
	public float calcularArea()
	{
		
		return (pi * (raio*raio));
	}

	/**
	 * Retorna o perimetro do circulo
	 * @return 2 * PI * raio
	 */
	public float calcularPerimetro()
	{
		return (2 * pi * raio);
	}	
}