/**
 * Classe forma
 * Define funções abstratas para calculo de áreas e perimetros de formas
 *
 *@Author Anderson Caio da Fonseca
 */
public abstract class Forma
{
	/**
	 * Retorna a área de uma forma
	 * @return	float	Area da forma
	 */
	public abstract float calcularArea();

	/**
	 * Retorna o perimetro de uma forma
	 * @return	float	perimetro da forma
	 */
	public abstract float calcularPerimetro();
}