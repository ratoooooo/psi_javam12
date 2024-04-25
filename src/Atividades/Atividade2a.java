package Atividades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Atividade2a {

	public static void main(String[] args) {
		File ficheiro = new File("PTGPSI/M12/info.txt"); 
		String linha;
		
		//ler o ficheiro
		try {
			 FileReader leitor = new FileReader(ficheiro);
			 BufferedReader ler = new BufferedReader(leitor);
			 
			 linha = ler.readLine();
			 while (linha != null) {
				System.out.println(linha);
				linha = ler.readLine();
			}
		
		} catch (Exception e) {
			System.out.println("Ocorreu um erro!!");
		}
	}

}
