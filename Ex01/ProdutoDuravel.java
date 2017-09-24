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

public abstract class ProdutoDuravel extends Produto
{
	//Atributos de um ProdutoDuravel
	private String materialPred;
	private int durabilidade;
	private boolean avaria;
	
	/**
	 * Método construtor da classe
	 *
	 * contrutor 'super' herdado da classe Produto
	 */

	public ProdutoDuravel(String id_, String nome_, double preco_, String marca_, String descricao_, String data_fab_,
                              String materialPred_, int durabilidade_, boolean avaria_)
	{
		super(id_, nome_, preco_, marca_, descricao_, data_fab_);

		materialPred = materialPred_;
		durabilidade = durabilidade_;
		avaria = avaria_;
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
	public String toString()
	{
		return super.toString() + "\n" + "Material Predominante: " + materialPred + "\n" + "Durabilidae: " + durabilidade;
	}

	public boolean podeVender()
	{
		return !avaria;
	}


	public abstract boolean eletro();


	
}
