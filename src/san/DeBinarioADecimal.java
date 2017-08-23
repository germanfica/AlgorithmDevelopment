package san;

import utilidades.TecladoIn;

public class DeBinarioADecimal {
	
	public static double ConvertirBinarioADecimal(String numeroBinario){
		double resultado = 0;
		
		for (int i = 0; i < numeroBinario.length(); i++) {
			switch (numeroBinario.charAt(i)) {
			case '1':
				resultado = resultado+Math.pow(2, 1);
				break;
			default:
				resultado = resultado+Math.pow(2, 0);
				break;
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println("Ingrese el numero en binario: ");
		String numeroBinario = TecladoIn.readLine();
		System.out.println(ConvertirBinarioADecimal(numeroBinario));
	}
}