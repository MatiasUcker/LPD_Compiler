package lpd_compiler;

import java.io.IOException;

public class Main_PPR {

	public static void main(String[] args) throws IOException {
		
		PPR ppr = new PPR("teste.lpd");
		ppr.parse();
	}
}
