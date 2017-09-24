/**
*
* Classe ProdutoNaoDuravel
*
* Classe herdeira da classe "Produto"
*
* Acrecensta os atributos 'data de validade' e 'genero'
* e métodos 'set' e 'get' para esses atributos
*
*@Autor Anderson Caio da Fonseca Santos
*/
import java.util.*;
public abstract class ProdutoNaoDuravel extends Produto
{
	//Atributos de um ProdutoNaoDuravel
	private String dataVal;
	private String genero;
	
	/**
	 * Método construtor da classe
	 *
	 * contrutor 'super' herdado da classe Produto
	 */
	public ProdutoNaoDuravel(String id_, String nome_, double preco_, String marca_, String descricao_, String data_fab_,
                              String dataVal_, String genero_)
	{
		super(id_, nome_, preco_, marca_, descricao_, data_fab_);

		dataVal = dataVal_;
		genero = genero_;
	}

	/**
	 *Substitui o atributo data de validade pelo parametro passado
	 *
	 *@param	String		nova data de validade
	 */

	public void setDataVal(String d)
	{
		dataVal = d;
	}

	/**
	 *Substitui o atributo genero pelo parametro passado
	 *
	 *@param	String		novo genero
	 */

	public void setGenero(String g)
	{
		genero = g;
	}

	/**
	 *Retorna a data de validade do produto
	 *
	 *@return	String		data de validade do produto
	 */

	public String getDataVal()
	{
		return dataVal;
	}

	/**
	 *Retorna o genero do produto
	 *
	 *@return	String		genero do produto
	 */

	public String getGenero()
	{
		return genero;
	}

	/**
	 * Imprime todos os atributos na tela
	 */
	public String toString()
	{
		return super.toString() + "\n" +"Validade: " + dataVal + "\n" +"Genero: " + genero;
	}
	
	public boolean podeVender()
	{
		return true;
	}

}
