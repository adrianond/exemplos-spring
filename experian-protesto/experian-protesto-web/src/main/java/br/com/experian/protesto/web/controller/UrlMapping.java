package br.com.experian.protesto.web.controller;

public class UrlMapping {
	
	private static final class RootPath{
		static final String PROTESTOS = "protestos";
	}

	public static final class commun{
		public static final String VIEW_SUCESSO = "/sucesso";
		public static final String VIEW_ERRO = "/erro";
		
		
	}
	public static final class Protestos{
		public static final String PROTESTOS_1 = RootPath.PROTESTOS + "/protestos1";
		public static final String HELLO_WORD = PROTESTOS_1 + "/hello";
		public static String CONSULTA_DADOS_GERAIS = PROTESTOS_1 + "/consultaDadosGerais";
	}
	
}
