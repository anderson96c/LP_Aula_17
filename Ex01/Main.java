/**
*
*
* Classe Main destinada a testar as funções das classes
* "Pizza" "Chocolate" "Refrigerante" "Carro" "Livro" "Celular"
* e "Deposito".
*
*
*
*@Autor  Anderson Caio da Fonseca Santos
*/
public class Main
{
	public static void main(String [] args)
	{	
		//Instaciando o deposito
		Deposito deposit = new Deposito();


		/**
		* Instanciando um item de cada uma das "classes netas"
		*/
		////////////////////////////////////////////////////////////////////////////////////////////////

		Pizza pizza1 = new Pizza("54676","Moda da casa", 35.00, "Domino's", "Indescritivel!", "23/08/2017", "24/08/2017", "Alimenticio",
					 "Calabresa, Frango, Carne, Cheddar e Catupiry", 12);
		////////////////////////////////////////////////////////////////////////////////////////////////

		Chocolate chocolate1 = new Chocolate("894984","Laka", 4.50, "Lacta", "Chocolate Branco", "16/05/2017", "16/11/2017", "Alimenticio",
						     "Branco", 24);
		////////////////////////////////////////////////////////////////////////////////////////////////

		//Refrigerante refri1 = new Refrigerante("541984""Coca-Cola", 6.00, "Coca-Cola", "Pode conter coisas que te matem lentamente por 								dentro", "23/08/2017", "23/08/2019", "Alimenticio", "Cola", 2.5);
		////////////////////////////////////////////////////////////////////////////////////////////////

		Carro carro1 = new Carro("189451","Uninho da firma", 8500.00, "Fiat", "Com uma escada pode chegar próximo à velocidade da luz", 						 "2001", "Metal", 30, true, "Uno", 450.6);
		////////////////////////////////////////////////////////////////////////////////////////////////

		//Livro livro1 = new Livro("55198""O nome do vento", 50.00, "Arqueiro", "Simplesmente épico!", "2007", "Papel", 50, 656);
		////////////////////////////////////////////////////////////////////////////////////////////////		

		Celular celular1 = new Celular("19849","Galaxy S8", 2800.00, "Samsung", "...", "2017", "Metal", 5, false, "Oi");
		////////////////////////////////////////////////////////////////////////////////////////////////

		/**
		*
		* Testando métodos especificos das classes
		*
                */
		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();		

		System.out.println("A pizza de " + pizza1.getSabor() + " tem " + pizza1.getPedacos() + " pedaços");		

		System.out.println("Testando a função 'eatSlice()'...");

		pizza1.eatSlice();
		pizza1.eatSlice();
		
		System.out.println("A pizza de " + pizza1.getSabor() + " tem " + pizza1.getPedacos() + " pedaços");

		System.out.println();
		System.out.println("**************************************************************");
		////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("O chocolate " + chocolate1.getTipo() + " tem " + chocolate1.getPedacos() +
				   " pedaços");

		System.out.println("Testando a função 'eat()'...");

		chocolate1.eat();
		chocolate1.eat();
		chocolate1.eat();
		chocolate1.eat();

		System.out.println("O chocolate " + chocolate1.getTipo() + " tem " + chocolate1.getPedacos() +
				   " pedaços");

		System.out.println();
		System.out.println("**************************************************************");
		////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		System.out.println("O refrigerante de " + refri1.getSabor() + " tem " + refri1.getLitros() + " litros");

		System.out.println("Testando a função 'drink()' ...");
		refri1.drink();
		refri1.drink();
		
		System.out.println("O refrigerante de " + refri1.getSabor() + " tem " + refri1.getLitros() + " litros");

		System.out.println();
		System.out.println("**************************************************************");
		*/
		////////////////////////////////////////////////////////////////////////////////////////////////
	
		System.out.println("O " + carro1.getModelo() + " já andou " + carro1.getQuilometros() + " quilometro");

		System.out.println("Testando a função 'drive()'...");
		carro1.drive(30.7);

		System.out.println("O " + carro1.getModelo() + " já andou " + carro1.getQuilometros() + " quilometro");

		System.out.println();
		System.out.println("**************************************************************");
		////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		System.out.println("O livro " + livro1.getNome() + " tem " + livro1.getPaginas() + " paginas e ja foram lidas " +
				  livro1.getPagMarcador() + " paginas");

		System.out.println("Lendo...");
		livro1.read(75);

		System.out.println("O livro " + livro1.getNome() + " tem " + livro1.getPaginas() + " paginas e ja foram lidas " +
				  livro1.getPagMarcador() + " paginas");

		System.out.println();
		System.out.println("**************************************************************");
		*/
		////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("O " + celular1.getNome() + " da operadora " + celular1.getOperadora() + " está com " +
				   celular1.getBateria() + "% de bateria");

		System.out.println("Usando...");
		celular1.usar();
		celular1.usar();
	
		System.out.println("O " + celular1.getNome() + " da operadora " + celular1.getOperadora() + " está com " +
				   celular1.getBateria() + "% de bateria");
		
		System.out.println("Recarregando e mudando de operadora...");
		celular1.recarregar();
		celular1.setOperadora("Tim");

		System.out.println("O " + celular1.getNome() + " da operadora " + celular1.getOperadora() + " está com " +
				   celular1.getBateria() + "% de bateria");

		System.out.println();
		System.out.println("**************************************************************");
		////////////////////////////////////////////////////////////////////////////////////////////////						

		/**
		*
		* Testando a classe deposito
		*
		*/
		////////////////////////////////////////////////////////////////////////////////////////////////

		if(deposit.isEmpty())
			System.out.println("O depósito está vazio!");

		else
			System.out.println("Há itens no depósito!");

		System.out.println("Adicionando itens ao depósito...");		

		deposit.addItem(pizza1);
		deposit.addItem(chocolate1);
		deposit.addItem(carro1);	
		deposit.addItem(celular1);
		
		if(deposit.isEmpty())
			System.out.println("O depósito está vazio!");

		else
			System.out.println("Há itens no depósito!");

		System.out.println("Atualmente o deposito comporta " + deposit.size() + " itens");

		System.out.println("O item mais caro do depósito: " + deposit.maiorPreco().getNome());

		System.out.println("Removendo o item mais caro...");
	
		deposit.removeItem(deposit.maiorPreco());

		System.out.println("Atualmente o deposito comporta " + deposit.size() + " itens");

		System.out.println("O item mais caro do depósito: " + deposit.maiorPreco().getNome());

		////////////////////////////////////////////////////////////////////////////////////////////////

		
	
	}
}
