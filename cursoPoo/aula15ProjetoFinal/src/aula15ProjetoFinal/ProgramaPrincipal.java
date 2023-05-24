 

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		
		v[0] = new Video("Top 5 melhores atrizes");
		v[1] = new Video("Os melhores alimentos do mundo!!!");
		v[2] = new Video("Aula de python com guanabara");
		
		Gafanhoto g[] = new Gafanhoto[3];
		
		g[0] = new Gafanhoto("Lucas",23,"M","Lucasrodriguezy");
		g[1] = new Gafanhoto("Ester", 23,"F","EsterMenezes99");
		g[2] = new Gafanhoto("Joaozin",14,"M","XXXmatadorcaveiraaa6765");
		
		
		Visualizacao vis = new Visualizacao(g[0],v[0]);
		

		
		v[0].play();
		v[0].like();
		v[1].play();
		vis.avaliar(75.0f);
		
		//tela
		System.out.println("<---------- Gafanhoto ------------------->");
		System.out.println(g[0].toString());
		System.out.println("<---------- Vídeo ------------------->");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println("<---------- Vísualizacao ------------------->");
		System.out.println(vis.toString());
		

	
	}

}
