/**
*
* Classe Refrigerante
*
* Herdeira da classe "ProdutoNaoDuravel"
*
* Acrescenta atributos 'sabor' e 'litros'
* e métodos para esses atributos
*
*@Autor Anderson Caio da Fonseca Santos 
*/
public class Refrigerante extends ProdutoNaoDuravel
{
	//Atributos de um Refrigerante
	private String sabor;
	private double litros;
	
	/**
	 * Método construtor da classe
	 *
	 * Construtor 'super' herdado da classe ProdutoNaoDuravel
	 */
	public Refrigerante(String nome_, double preco_, String marca_, String descricao_, String data_fab_,
                            String dataVal_, String genero_, String sabor_, double litros_)
	{
		super(nome_, preco_,marca_, descricao_, data_fab_,
                      dataVal_, genero_);

		sabor = sabor_;
		litros = litros_;
	}
	
	/**
	 *Retorna o sabor do Refrigenrante
	 *
	 *@return	String		sabor do refrigerante
	 */

	public String getSabor()
	{
		return sabor;
	}

	/**
	 *Retorna a quantidade de litros restantes de refrigerante
	 *
	 *@return	double		litros restantes de refrigerante
	 */

	public double getLitros()
	{
		return litros;
	}
	/**
	 *Consome 500ml de refrigerante
	 */
	public void drink()
	{
		if(litros <= 0)
		{
			System.out.println("Acabou!");
		}
		
		else
		{
			litros = litros - 0.5;
		}
	}
		
}
