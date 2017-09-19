/**
*
* Classe Deposito
*
* Destinada a simular um deposito para variádos produtos instaciados pela
* classe Produto e suas herdeiras
*
* Instacia um ArrayList de Produto para armazenar os objetos
*
*@Autor Anderson Caio da Fonseca Santos
*/
import java.util.ArrayList;

public class Deposito
{
	//ArrayList para o armazenamento
	private ArrayList<Produto> deposit;

	/**
	 * Método construtor da classe
	 */
	public Deposito()
	{
		deposit = new ArrayList<Produto>();
	}
	
	/**
	 *Recebe um indice e retorna o produto contido nesse indice
	 *do ArrayList deposit
	 *
	 *@param	int		indice
	 * 
	 *@return	Produto		Produto localizado no indice fornecido	
	 */

	public Produto get(int index)
	{
		return deposit.get(index);
	}

	/**
	 *Recebe um produto e o adiciona ao deposito
	 *
	 *@param	Produto		Produto a ser adicionado ao deposito	
	 */

	public void addItem(Produto p)
	{
		deposit.add(p);
	}

	/**
	 *Recebe um produto e o retira do deposito
	 *
	 *@param	Produto		Produto a ser removido do deposito	
	 */
	
	public void removeItem(Produto p)
	{
		deposit.remove(p);
	}

	/**
	 *Retorna a quantidade de elementos no deposito
	 *
	 *@return	int	quantidade de produtos no deposito	
	 */

	public int size()
	{
		return deposit.size();
	}

	/**
	 *Retorna caso o deposito esteja vazio
	 *
	 *@return	boolean		true caso esteja vazio, caso contrario, false 	
	 */

	public boolean isEmpty()
	{
		return deposit.isEmpty();
	}

	/**
	 *Retorna o produto com o maior atributo preço
	 *
	 *@return	Produto		Produto com o maior preço
	 */

	public Produto maiorPreco()
	{
		Produto maior = deposit.get(0);
		for(int i = 1; i < deposit.size(); i++)
		{
			Produto p = deposit.get(i);

			if(p.getPreco() > maior.getPreco())
			{
				maior = p;
			}
		}

		return maior;
	}
}
