package Atividades;

import java.io.File;
import java.io.IOException;

public class Atividade1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ficheiro = new File("PTGPSI/M12/info.txt");
		
		//criar ficheiro
		try {
			ficheiro.createNewFile();
			System.out.println("Ficheiro criado com sucesso");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao criar o ficheiro");
		}
		
		//eliminar ficheiro
		//icheiro.delete();
	}

}
