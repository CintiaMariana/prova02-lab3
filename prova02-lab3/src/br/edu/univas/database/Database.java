package br.edu.univas.database;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import br.edu.univas.controller.DoadorController;

import br.edu.univas.vo.Doador;

public class Database {
	
	private static List<Doador> doadores;
	private static Map<String, Long> estoqueSanguineo;
	
	public static void addDoador (Doador doador) {
		List<Doador> doadores = new ArrayList<Doador>();
		doadores.add(doador);	
	}
	
	public static void addDoacao (String tipoSanguineo, Long quantidade) {
		
	}
	
	public static Long getSituacaoEstoque (String tipoSanguineo) {
		return null;
		
	}
}
