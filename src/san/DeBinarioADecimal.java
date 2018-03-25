package san;

import util.TecladoIn;

public class DeBinarioADecimal {
	
	public static double ConvertirBinarioADecimal(String numeroBinario){
		double resultado = 0;
		int temporal=0;

		for (int i = numeroBinario.length()-1; i >= 0; i--) {
			if(numeroBinario.charAt(i)=='1')
				resultado = resultado+Math.pow(2, i);
			temporal=temporal+1;
		}
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println("Ingrese el numero en binario: ");
		String numeroBinario = TecladoIn.readLine();
		System.out.println(ConvertirBinarioADecimal(numeroBinario));
	}
}