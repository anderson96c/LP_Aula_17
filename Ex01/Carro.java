/**
*
* Classe Carro
*
* Herdeira da classe "ProdutoDuravel"
*
* Acrescenta atributos 'modelo' e 'quilometros percorridos'
* e métodos para esses atributos
*
*@Autor Anderson Caio da Fonseca Santos 
*/
public class Carro extends ProdutoDuravel
{
	//Atributos de um Carro
	private String modelo;
	private double quilometros;
	
	/**
	 * Método construtor da classe
	 *
	 * Construtor 'super' herdado da classe ProdutoDuravel
	 */
	public Carro(String id_,String nome_, double preco_, String marca_, String descricao_, String data_fab_,
                     String materialPred_, int durabilidade_,boolean avaria_, String modelo_, double quilometros_)
	{
		super(id_, nome_, preco_, marca_, descricao_, data_fab_,
		      materialPred_, durabilidade_, avaria_);

		modelo = modelo_;
		quilometros = quilometros_;
	}
	
	/**
	 *Retorna o modelo do Carro
	 *
	 *@return	String	 	modelo
	 */

	public String getModelo()
	{
		return modelo;
	}

	/**
	 *Retorna os quilometros percorridos pelo carro
	 *
	 *@return	double	 	quilometros percorridos
	 */

	public double getQuilometros()
	{
		return quilometros;
	}

	/**
	 *Soma a quantidade quilometros 'q' aos quilometros percorridos
	 */
	
	public void drive(double q)
	{
		quilometros = quilometros + q;
	}

	public boolean eletro()
	{
		return false;
	}

}
