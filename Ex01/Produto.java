/**
*
* Classe Produto
*
* Classe destinada a definir produtos de todos os tipos apenas com os atributos
* nome, preço, marca, descrição e data de fabricação. Pai das classes 
* "ProdutoDuravel" e "ProdutoNaoDuravel" as quais adicionam novos atributos
* e métodos para seus respectivos tipos de Produto.
*
*
*@Autor Anderson Caio da Fonseca Santos
*/
public abstract class Produto
{	
	//Atributos de um produto
	private String id;
	private String nome;
	private double preco;
	private String marca;
	private String descricao;
	private String data_fab;
	
	/**
	*
	* Método construtor da classe onde o usuário define os atributos do produto
	*/
	public Produto (String id_, String nome_, double preco_, String marca_, String descricao_, String data_fab_)
	{
		id = id_;
		nome = nome_;
		preco = preco_;
		marca = marca_;
		descricao = descricao_;
		data_fab = data_fab_;
	}

	/**
	 *Substitui o atributo nome pelo parametro passado
	 *
	 *@param	String n	novo nome do produto
	 */

	public void setNome(String n)
	{
		nome = n;
	}

	/**
	 *Substitui o atributo Preço
	 *
	 *@param	double p	novo preço do produto
	 */

	public void setPreco(double p)
	{
		preco = p;
	}

	/**
	 *Substitui o atributo marca pelo parametro passado
	 *
	 *@param	String m	nova marca do produto
	 */

	public void setMarca(String m)
	{
		marca = m;
	}

	/**
	 *Substitui o atributo descrição pelo parametro passado
	 *
	 *@param	String d	nova descrição do produto
	 */

	public void setDescricao(String d)
	{
		descricao = d;
	}

	/**
	 *Substitui o atributo marca pelo parametro passado
	 *
	 *@param	String dt	nova data de fabricação do produto
	 */

	public void setDataFab(String dt)
	{
		data_fab = dt;
	}

	/**
	 *Retorna o nome do produto
	 *
	 *@return	String		Atributo nome
	 */
	

	public String getNome()
	{
		return nome;
	}

	/**
	 *Retorna o preço do produto
	 *
	 *@return	double		Atributo preço
	 */
	
	public double getPreco()
	{
		return preco;
	}

	/**
	 *Retorna a marca do produto
	 *
	 *@return	String		Atributo marca
	 */

	public String getMarca()
	{
		return marca;
	}

	/**
	 *Retorna a descrição do produto
	 *
	 *@return	String		Atributo descrição
	 */

	public String getDescricao()
	{
		return descricao;
	}

	/**
	 *Retorna o preço do produto
	 *
	 *@return	String		Atributo data de fabricação
	 */
	
	public String getDataFab()
	{
		return data_fab;
	}

	/**
	 * Imprime todos os atributos na tela
	 */
	public String toString()
	{
		return "ID: " + id + "\n" + "Nome: " + nome + "\n" + "Preço " + preco + "\n" + "Marca: " + marca + "\n" + "Descrição: " + descricao + "\n" + "Fabricação: " + data_fab;
	}
		public abstract boolean podeVender();
}
