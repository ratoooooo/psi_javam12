package Atividades;

import java.io.File;

public class Atividade1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criar pasta
		File pasta1 = new File("PSI");
		if(pasta1.mkdir())
		{
			System.out.println("Pasta criada com sucesso");
		}
		else
		{
			System.out.println("A pasta ja existe");
		}
		
		//criar subpasta
		File M12 = new File("PSI/M12");
		M12.mkdir();
		
		/*
		File ambiente = new File("C:/Users/dinis/OneDrive/Ambiente de Trabalho");
		ambiente.mkdir();
		*/
		
		//renomear pastas
		 File m12Renovada = new File("PTGPSI");
		 pasta1.renameTo(m12Renovada);
		 
		 //remover pastas
		 //M12.delete();
		 
		 //caminho absoluto
		 System.out.println(pasta1.getAbsolutePath());
		 
		 //caminho relativo
		 System.out.println(M12.getPath());
		
	}

}
