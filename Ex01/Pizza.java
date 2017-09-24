/**
*
* Classe Pizza
*
* Herdeira da classe "ProdutoNaoDuravel"
*
* Acrescenta atributos 'sabor' e 'pedaços'
* e métodos para esses atributos
*
*@Autor Anderson Caio da Fonseca Santos 
*/
public class Pizza extends ProdutoNaoDuravel
{
	//Atributos de uma Pizza
	private String sabor;
	private int pedacos;

	/**
	 * Método construtor da classe
	 *
	 * Construtor 'super' herdado da classe ProdutoNaoDuravel
	 */
	public Pizza(String id_, String nome_, double preco_, String marca_, String descricao_, String data_fab_,
                              String dataVal_, String genero_, String sabor_, int pedacos_)
	{
		super(id_, nome_, preco_,marca_, descricao_, data_fab_,
                      dataVal_, genero_);

		sabor = sabor_;
		pedacos = pedacos_;
	}


	/**
	 *Retorna o sabor da Pizza
	 *
	 *@return	String		sabor da pizza
	 */

	public String getSabor()
	{
		return sabor;
	}
	
	/**
	 *Retorna a quantidade de padeços restantes da Pizza
	 *
	 *@return	int		quantidade de padeços restantes da Pizza
	 */

	public int getPedacos()
	{
		return pedacos;
	}

	/**
	 *Consome um pedaço da pizza caso ainda restem pedaços
	 *caso nao haja mais pedaços avisa que a pizza acabou
	 */
	
	public void eatSlice()
	{
		if(pedacos <= 0)
		{
			System.out.println("Acabou!");
		}

		else
			pedacos--;
	}


}
