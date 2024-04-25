package Atividades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Atividade4 {

	public static void main(String[] args) {
		File ficheiro = new File("PTGPSI/M12/lista_alunos.txt");
		String linha;
		try {
			FileReader leitor = new FileReader(ficheiro);
			BufferedReader ler = new BufferedReader(leitor);
			
			linha = ler.readLine();
			System.out.println("Lista de Alunos");
			System.out.println("----------------------");
			while(linha != null)
			{
				String[] info = linha.split(";");
				System.out.println("Nº: "+ info[0]);
				System.out.println("Nome: " + info[1]);
				System.out.println("Nota: " + info[2]);
				System.out.println("----------------------");
				linha = ler.readLine();
			}
			
			
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
