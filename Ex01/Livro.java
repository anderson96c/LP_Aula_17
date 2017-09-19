/**
*
* Classe Livro
*
* Herdeira da classe "ProdutoDuravel"
*
* Acrescenta atributos 'paginas' e 'pagina do marcador'
* e métodos para esses atributos
*
*@Autor Anderson Caio da Fonseca Santos 
*/
public class Livro extends ProdutoDuravel
{	
	//Atributos de um Livro
	private int paginas;
	private int pagMarcador;
	
	/**
	 * Método construtor da classe
	 *
	 * Construtor 'super' herdado da classe ProdutoDuravel
	 */
	Livro(String nome_, double preco_, String marca_, String descricao_, String data_fab_,
              String materialPred_, int durabilidade_, int paginas_)
	{
		super(nome_, preco_, marca_, descricao_, data_fab_,
		      materialPred_, durabilidade_);

		paginas = paginas_;
		pagMarcador = 0;
	}

	/**
	 *Retorna a quantidade de paginas no livro
	 *
	 *@return	int 	quantidade de paginas no livro
	 */

	public int getPaginas()
	{
		return paginas;
	}

	/**
	 *Retorna a posição do marcador no livro
	 *
	 *@return	int 	posição do marcador no livro
	 */

	public int getPagMarcador()
	{
		return pagMarcador;
	}

	/**
	 *Avança o marcador de acordo com o número de paginas lido
	 *
	 *@param	int 	número de paginas a se ler
	 */

	public void read(int p)
	{
		//Evitar numero de paginas negativo
		if(p < 0)
		{
			System.out.println("Você não pode ler um número de páginas negativo!");
		}

		//Caso o marcador esteja no final do livro
		else if(pagMarcador >= paginas)
		{
			System.out.println("Terminou!");
		}

		//Caso o numero de paginas a ser lido seja maior que a quantidade restante
		else if(p >= (paginas - pagMarcador))
		{
			pagMarcador = paginas;
		}

		//Avançar o marcador p paginas
		else
		{
			pagMarcador = pagMarcador + p;
		}
	}
}
