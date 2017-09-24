/**
 * Classe Quadrado
 * Herda da classe Retangulo
 * Define um retangulo com altura e largura iguais
 *
 * @Author Anderson Caio Fonseca Santos
 */
public class Quadrado extends Retangulo
{
	/**
	 * Método construtor
	 * @param	lado	tamanho dos lados do quadrado
	 */
	public Quadrado(float lado)
	{	
		super(lado,lado);
	}
}