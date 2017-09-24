/**
 * Classe RepositorioFormas
 * Possui uma função para gerar formas aleatórias e o método main para 
 * gerar as formas com esta função e checar seus valores
 *
 * @Author Anderson Caio da Fonseca Santos
 */
import java.util.*;

public class RepositorioFormas
{
	/**
	 * Utiliza números aleatórios para fazer Retangulos Quadrados e Circulos
	 * com diferentes tamanhos
	 */
	public static Forma gerarForma()
	{
		//Gerador aleatorio
		Random rand = new Random();

		//Tipo da forma
		int tipo = rand.nextInt(3);

		//Retangulo
		if(tipo == 0)
		{
			float r1 = (float)rand.nextInt(40)+1;
			float r2 = (float)rand.nextInt(40)+1;
			Retangulo r = new Retangulo(r1,r2);
			return r;
		}

		//Circulo
		else if(tipo == 1)
		{
			float r1 = (float)rand.nextInt(40)+1;
			Circulo c = new Circulo(r1);
			return c;
		}

		//Quadrado
		else
		{
			float r1 = (float)rand.nextInt(40)+1;
			Quadrado q = new Quadrado(r1);
			return q;
		}
	}

	public static void main(String [] args)
	{
		//Repositório de formas
		ArrayList<Forma> repo = new ArrayList<Forma>();

		//Gerando formas
		for(int i = 0; i < 20; i++)
		{
			Forma f = gerarForma();
			repo.add(f);
		}

		//Revendo tipo tamanho e perimetro de cada forma
		for(int i = 0; i < 20; i++)
		{
			Forma f = repo.get(i);
			if(f instanceof Quadrado)
			{
				System.out.print("Quadrado >> ");
				System.out.print("Área: "+ f.calcularArea());
				System.out.println(" Perímetro: " + f.calcularPerimetro());
			}
			else if(f instanceof Retangulo)
			{
				System.out.print("Retangulo >> ");
				System.out.print("Área: "+ f.calcularArea());
				System.out.println(" Perímetro: " + f.calcularPerimetro());
			}
			else if(f instanceof Circulo)
			{
				System.out.print("Circulo >> ");
				System.out.print("Área: "+ f.calcularArea());
				System.out.println(" Perímetro: " + f.calcularPerimetro());
			}
		}
	}


}