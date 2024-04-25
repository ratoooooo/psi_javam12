package Atividades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Atividade4b {

	public static void main(String[] args) {
		
		File ficheiro = new File("PTGPSI/M12/lista_alunos.txt");
		Scanner dados = new Scanner(System.in);
		String num;
		String nome;
		String nota;
		String linha = "";
		
		System.out.println("Inisra o numero do aluno");
		num = dados.next();
		
		System.out.println("Inisra o nome do aluno");
		nome = dados.next();
		
		System.out.println("Inisra a nota do aluno");
		nota = dados.next();

		linha = String.join(";", num, nome, nota);
		
		System.out.println(linha);
		try {
			FileWriter escritor = new FileWriter(ficheiro, true);
			BufferedWriter escrever = new BufferedWriter(escritor);
			
			escrever.newLine();
			escrever.write(linha)
			
			escrever.close();
			escritor.close();
			
			
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
