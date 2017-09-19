/**
*
* Classe Chocolate
*
* Herdeira da classe "ProdutoNaoDuravel"
*
* Acrescenta atributos 'tipo' e 'pedaços'
* e métodos para esses atributos
*
*@Autor Anderson Caio da Fonseca Santos 
*/
public class Chocolate extends ProdutoNaoDuravel
{
	//Atributos de um Chocolate
	private String tipo;
	private int pedacos;
	
	/**
	 * Método construtor da classe
	 *
	 * Construtor 'super' herdado da classe ProdutoNaoDuravel
	 */
	public Chocolate(String nome_, double preco_, String marca_, String descricao_, String data_fab_,
                         String dataVal_, String genero_, String tipo_, int pedacos_)
	{
		super(nome_, preco_,marca_, descricao_, data_fab_,
                      dataVal_, genero_);

		tipo = tipo_;
		pedacos = pedacos_;
	}
	
	/**
	 *Retorna o tipo de Chocolate
	 *
	 *@return	String		tipo do chocolate
	 */

	public String getTipo()
	{
		return tipo;
	}

	/**
	 *Retorna a quantidade restante de pedaços do chocolate
	 *
	 *@return	int		restante de pedaços do chocolate
	 */

	public int getPedacos()
	{
		return pedacos;
	}
	
	/**
	 *Consome um pedaço de Chocolate
	 */
	public void eat()
	{
		pedacos--;
	}

	

}
