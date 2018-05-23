package mkyong;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample1 {
	private static final String NOMBRE_ARCHIVO = "src/mkyong/filename.txt";

	private static void almacenarClientesEnElDisco() {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			String content = "Aasdasdqwe\n";

			fw = new FileWriter(NOMBRE_ARCHIVO);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Listo.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		almacenarClientesEnElDisco();
	}
}
