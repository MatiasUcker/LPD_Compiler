package lpd_compiler;

import java.util.Hashtable;

public class TS extends Hashtable<Chave, Token> {
	
	
	private static final long serialVersionUID = 1L;
	
	
	// Metodo adiciona token
	public void addToken (Chave chave, Token token) {
		if (!this.containsKey(chave)) {
			this.put(chave, token);
		}
	}
	
	// Metodo busca token
	public Token getToken (Chave chave) {
		if (this.containsKey(chave)) {
			if (this.get(chave) != null) {
				return this.get(chave);
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	
	// Metodo set atributo
	public void setAtributo (Chave chave, String atributo, String valor) {
		
		Token token = this.get(chave);
		
		if (atributo.contentEquals("escopo")) {
			token.escopo = valor;
			novaChave(chave, token);
		}
		else if (atributo.contentEquals("lexema")) {
			token.lexema = valor;
			novaChave(chave, token);
		}
		else if (atributo.contentEquals("simbolo")) {
			token.simbolo = Simbolo.valueOf(valor);
			novaChave(chave, token);
		}
		else if (atributo.contentEquals("linha")) {
			token.linha = Integer.valueOf(valor);
		}
		else if (atributo.contentEquals("coluna")) {
			token.coluna = Integer.valueOf(valor);
		}
		else if (atributo.contentEquals("tipo")) {
			token.tipo = valor;
		}
		else System.out.println("Erro, atributo nao encontrado");
	}
	
	// Metodo busca atributo 
	public String getAtributo (Chave chave, String atributo) {
		
		Token token = this.get(chave);
		
		if (atributo.contentEquals("escopo")) {
			return chave.escopo;
		}
		else if (atributo.contentEquals("lexema")) {
			return token.lexema;
		}
		else if (atributo.contentEquals("tipo")) {
			return token.tipo.toString();
		}
		else if (atributo.contentEquals("linha")) {
			return String.valueOf(token.linha);
		}
		else if (atributo.contentEquals("coluna")) {
			return String.valueOf(token.coluna);
		}
		else {
			return "Erro, atributo nao encontrado";
		}
	}
	
	private void novaChave(Chave oldChave, Token token) {
		Chave novaChave = new Chave(token.escopo, token.simbolo, token.lexema);
		this.put(novaChave, token);
		this.remove(oldChave);
	}
}
