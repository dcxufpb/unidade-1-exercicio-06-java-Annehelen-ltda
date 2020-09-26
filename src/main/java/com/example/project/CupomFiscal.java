package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	private static final String ENDLN = System.lineSeparator();

	private static boolean isEmpty(String str){
        int spaceCount = str.length() - str.replace(".", "").length();
        return (str == null || spaceCount == str.length());
    }
	
	public static String dadosLoja() {
		//Implemente aqui
		String num = NUMERO + "";
		if(NOME_LOJA.equals("")){
			throw new RuntimeException("O campo nome da loja é obrigatório");
		}
		if(LOGRADOURO.equals("")){
			throw new RuntimeException("O campo logradouro do endereço é obrigatório");
		}
		if(NUMERO == 0){
			num = "s/n";
		}
		if(MUNICIPIO.equals("")){
			throw new RuntimeException("O campo município do endereço é obrigatório");
		}
		if(ESTADO.equals("")){
			throw new RuntimeException("O campo estado do endereço é obrigatório");
		}
		if(CNPJ.equals("")){
			throw new RuntimeException("O campo CNPJ da loja é obrigatório");
		}
		if(INSCRICAO_ESTADUAL.equals("")){
			throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
		}
		String part2 = LOGRADOURO + ", " + num;
		if (! isEmpty (COMPLEMENTO)){
			part2 += " " + COMPLEMENTO;
			}
		String part3 = "";
		if (! isEmpty (BAIRRO)){
			part3 += BAIRRO + " - ";
		}
		part3 += MUNICIPIO + " - " + ESTADO;
		
		String part4 = "";
		if (! isEmpty (CEP)){
			part4 = "CEP:" + CEP;
			}
		if (! isEmpty (TELEFONE)){
			if (! isEmpty (part4)){
				part4 += " ";
			}
			part4 += "Tel " + TELEFONE;
			}
		if (! isEmpty(part4)){
			part4 += ENDLN;
			}
		String part5 = "";
		if (! isEmpty (OBSERVACAO)){
			part5 += OBSERVACAO;
			}

		String output = NOME_LOJA + ENDLN;
        output += part2 + ENDLN;
        output += part3 + ENDLN;
        output += part4;
        output += part5 + ENDLN;
        output += "CNPJ: " + CNPJ + ENDLN;
		output += "IE: " + INSCRICAO_ESTADUAL+ENDLN;
		

		return output;
	}

}
