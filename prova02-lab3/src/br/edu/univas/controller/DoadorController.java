package br.edu.univas.controller;

import java.util.Scanner;
import br.edu.univas.vo.Doador;
import br.edu.univas.vo.TipoSanguineo;

public class DoadorController {
	
	Scanner scanner = new Scanner (System.in);
	
	public void cadastrarDoador (Long cpf, String tipoSanguineo) {
		Doador doador = new Doador ();
		System.out.println("Digite seu CPF: ");
		doador.setCpf(scanner.nextLong());
		System.out.println("Digite seu tipo sanguineo: ");
		String tipo = scanner.nextLine();
		
		for (TipoSanguineo t : TipoSanguineo.values()) {
			doador.setTipoSanguineo(t);
		}
	}
	
	public void cadastrarDoacao (String tipoSanguineo, Long quantidade ) {
		Long qtd = (long) 0;
		System.out.println("Digite o tipo sanguineo doado: ");
		String tipo = scanner.nextLine();
		qtd ++;
		
	
		
	}

}
