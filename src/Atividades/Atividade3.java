package Atividades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		File ficheiro = new File("PTGPSI/M12/salario.txt");
		Scanner dados = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Inisra o slaario do funcionario");
		salario = dados.nextDouble();
		
		Funcionario func = new Funcionario(salario);
		System.out.println(func.toString());
		
		try {
			ficheiro.createNewFile();
			FileWriter escritor = new FileWriter(ficheiro);
			BufferedWriter escrever = new BufferedWriter(escritor);
			
			escritor.write(func.toString());
			
			escrever.close();
			escritor.close();
		} catch (IOException e) {
			System.out.println("ERROOOOO!!!");
			e.printStackTrace();
		}
	}

}
