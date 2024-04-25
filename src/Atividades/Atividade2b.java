package Atividades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Atividade2b {

	public static void main(String[] args) {
		File ficheiro = new File("PTGPSI/M12/info2.txt"); 
		
		//escrever no ficheiro
		try {
			ficheiro.createNewFile();
			FileWriter escritor = new FileWriter(ficheiro, true);
			BufferedWriter escrever = new BufferedWriter(escritor);
			
			escrever.write("Intodução ao modulo 12");
			escrever.newLine();
			escrever.write("Outra Vez");
			
			escrever.close();
			escritor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro!!");
			e.printStackTrace();
		}

	}

}
