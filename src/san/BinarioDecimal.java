package san;

import utilidades.TecladoIn;

public class BinarioDecimal {
	
	public static double ConvertirBinarioDecimal(String binario){
		double resultado=0;
		
		for (int i = 0; i < binario.length(); i++) {
			if(binario.charAt(i)=='1'){
				resultado = resultado+Math.pow(2, i);
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		String binario;
		System.out.println("Ingrese el numero en binario: ");
		binario = TecladoIn.readLine();
		System.out.println(ConvertirBinarioDecimal(binario));
	}
}
