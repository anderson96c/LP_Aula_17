/**
*
* Classe ProdutoDuravel
*
* Classe herdeira da classe "Produto"
*
* Acrecensta os atributos 'material predominante' e 'durabilidade'
* e métodos 'set' e 'get' para esses atributos
*
*@Autor Anderson Caio da Fonseca Santos
*/

abstract public class ProdutoDuravel extends Produto
{
	//Atributos de um ProdutoDuravel
	private String materialPred;
	private int durabilidade;
	
	/**
	 * Método construtor da classe
	 *
	 * contrutor 'super' herdado da classe Produto
	 */

	public ProdutoDuravel(String id_, String nome_, double preco_, String marca_, String descricao_, String data_fab_,
                              String materialPred_, int durabilidade_)
	{
		super(id_, nome_, preco_, marca_, descricao_, data_fab_);

		materialPred = materialPred_;
		durabilidade = durabilidade_;
	}

	/**
	 *Substitui o atributo material predominante pelo parametro passado
	 *
	 *@param	String		novo material predominante
	 */

	public void setMaterialPred(String m)
	{
		materialPred = m;
	}

	/**
	 *Substitui o atributo durabilidade pelo parametro passado
	 *
	 *@param	int		nova durabilidade
	 */

	public void setDurabilidade(int d)
	{
		durabilidade = d;
	}

	/**
	 *Retorna o material predominante do produto
	 *
	 *@return	String		material predominante no produto
	 */

	public String getMaterialPred()
	{
		return materialPred;
	}

	/**
	 *Retorna a durabilidade do produto
	 *
	 *@return	int		durabilidade do produto
	 */

	public int getDurabilidade()
	{
		return durabilidade;
	}

	/**
	 * Imprime todos os atributos na tela
	 */
	public void print()
	{
		super.print();
		System.out.println("Material Predominante: " + materialPred);
		System.out.println("Durabilidae: " + durabilidade);
	}

	public boolean vendido()
	{
		return false;
	}

	public abstract boolean eletro();


	
}
