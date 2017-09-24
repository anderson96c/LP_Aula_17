/**
*
* Classe Celular
*
* Herdeira da classe "ProdutoDuravel"
*
* Acrescenta atributos 'operadora' e 'bateria'
* e métodos para esses atributos
*
*@Autor Anderson Caio da Fonseca Santos 
*/
public class Celular extends ProdutoDuravel
{
	//Atributos de um Celular
	private String operadora;
	private int bateria;
	
	/**
	 * Método construtor da classe
	 *
	 * Construtor 'super' herdado da classe ProdutoDuravel
	 */
	public Celular(String id_, String nome_, double preco_, String marca_, String descricao_, String data_fab_,
                       String materialPred_, int durabilidade_, boolean avaria_, String operadora_)
	{
		super(id_, nome_, preco_, marca_, descricao_, data_fab_,
		      materialPred_, durabilidade_, avaria_);

		operadora = operadora_;
		bateria = 100;
	}

	/**
	 *Substitui a operadora do celular pelo parametro
	 *
	 *@param	String	 	nova operadora
	 */

	public void setOperadora(String o)
	{
		operadora = o;
	}
	
	/**
	 *Retorna a operadora do celular
	 *
	 *@return	String	 	operadora
	 */

	public String getOperadora()
	{
		return operadora;
	}

	/**
	 *Retorna a porcentagem de carga da bateria
	 *
	 *@return	int		carga da bateria
	 */

	public int getBateria()
	{
		return bateria;
	}

	/**
	 *Simula o consumo de bateria ao usar o celular
	 */
	
	public void usar()
	{
		//Caso a carga esteja em 0%
		if(bateria <= 0)
		{
			System.out.println("Descarregado!");
		}

		//Subtrair 20 da carga total
		bateria = bateria - 20; 
	}
	/**
	 *Recupera toda a carga da bateria
	 */
	public void recarregar()
	{
		bateria = 100;
	}

	public boolean eletro()
	{
		return true;
	}

}
