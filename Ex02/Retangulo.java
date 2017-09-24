/**
 * Classe Retangulo
 * define funções de calcular area e perimetro da classe abstrata Forma
 * tem atributos altura e largura para definir o retangulo e utiliza esses valores nos métodos
 *
 * @Author Anderson Caio da Fonseca Santos
 */
public class Retangulo extends Forma
{
	private float altura;
	private float largura;

	/**
	 * Método construtor
	 * @param	altura		altura do retangulo
	 * @param	largura		largura do retangulo
	 */
	public Retangulo(float altura, float largura)
	{
		this.altura = altura;
		this.largura = largura;
	}
	/**
	 * Retorna a area do retangulo
	 * @return altura do retangulo * largura do retangulo
	 */
	public float calcularArea()
	{
		return altura * largura;
	}

	/**
	 * Retorna o perimetro do retangulo
	 * @return 2*altura do retangulo + 2*largura do retangulo
	 */
	public float calcularPerimetro()
	{
		return 2*altura + 2*largura;
	}
}