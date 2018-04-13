package com.graworg.ad._2017.tp1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.graworg.ad.util.TecladoIn;

public class Exercise7 {
	
	/*
	 *  En una exposici�n de veh�culos se administra la informaci�n de los autos que est�n exhibidos. Para
	 *  cada auto se desea conocer: patente, marca, a�o de fabricaci�n, color y capacidad (cantidad de
	 *  personas sentadas y cintur�n de seguridad disponible).
	 *  
	 *  En base a la informaci�n relevada se desea mostrar:
	 *  
	 *  a) La cantidad de veh�culos rojos.
	 *  b) La capacidad promedio de los autos exhibidos.
	 *  c) La marca de veh�culos que m�s autos exhibe en la exposici�n.
	 *  
	 *  Dise�ar el algoritmo principal y los m�dulos correspondientes. Implementar en Java.
	 *  
	 *  Aclaraci�n de Germ�n: en el enunciado se menciona que:  ya se cuenta con informaci�n de los autos
	 *  exhibidos. Por lo tanto, como hay poca descripci�n acerca de c�mo cargar esos datos,
	 *  se presupone que los datos ya estan en el sistema.
	 *  Otra aclaraci�n: el enunciado no indica que hay que realizar un programa que permita
	 *  agregar veh�culos a la exposici�n.
	 */
	
	/**
	 * (a) Returns red vehicles number from disk.
	 * @return 		Red vehicles number.
	 */
	public static int getRedVehiclesNumberFromDisk() {
		// Restore data from disk
		String diskData = loadVehicleDataFromDisk();
		
		return getOccurrencesNumber(diskData, "color:rojo");
	}
	
	/**
	 * (b) Average vehicles capacity showed in the vehicle show.
	 */
	public static void showAverageVehicles() {
		// Mostrar la capacidad promedio de los autos exhibidos. (NO DISPONIBLE)
		// Por lo tanto es literalmente,
		// Sumar el numero de todos los vehiculos
		// y sacar el promedio con 4
		// Es sacar el promedio, pero usando el valor
		// numerico de la capacidad.
		
		// Voy a tener que hacer lo mismo hecho para obtener la cantidad de marcas,
		// pero ahora obteniendo la capacidad.
		String body = getVehicleBrands();
		System.out.println(body);
		System.out.println(getOccurrencesNumber(body, ""));
	}
	
	/**
	 * (c) Vehicles brand most used in the vehicle show.
	 */
	public static String getVehicleBrandMostUsed() {
		String body = "," + getVehicleBrandsUsed(), vehicleBrand = "", vehicleBrandMostUsed = "";
		int endIndex = 0, beginIndex = endIndex, vehicleBrandMostUsedNumber = 0;
				
		for(endIndex=0;endIndex<body.length();endIndex++) {
			if(body.charAt(endIndex)==',') {
				vehicleBrand = body.substring(beginIndex, endIndex);
				
				int beginAIndex = 0;
				for(int endAIndex=0; endAIndex < vehicleBrand.length(); endAIndex++ ) {
					if(vehicleBrand.charAt(endAIndex)==':') {
						String brand = vehicleBrand.substring(beginAIndex, endAIndex);
						int number = Integer.parseInt(vehicleBrand.substring(endAIndex+1, vehicleBrand.length()));
						
						if(vehicleBrandMostUsed.equals("") && vehicleBrandMostUsedNumber==0) {
							vehicleBrandMostUsed = brand;
							vehicleBrandMostUsedNumber = number;
						}else {
							// Pero qu� pasa si es igual?
							if(number>vehicleBrandMostUsedNumber) {
								vehicleBrandMostUsed = brand;
								vehicleBrandMostUsedNumber = number;
							}
						}
					}
				}
				beginIndex=endIndex+1;
			}
		}
		
		return vehicleBrandMostUsed;
	}
	
	/**
	 * Return vehicle brands used in the vehicle show.
	 * @return 		Vehicle brands used in the vehicle show.
	 */
	public static String getVehicleBrandsUsed() {
		int initialBrandIndex = 0;
		int finalBrandIndex = initialBrandIndex;
		
		String brands = getVehicleBrands();
		String brandsUsed = "";
		
		//System.out.println("All brands: " + brands.substring(0,brands.length()-1)+".");
		
		for(finalBrandIndex=0;finalBrandIndex<brands.length();finalBrandIndex++) {
			if(brands.charAt(finalBrandIndex)==',') {
				String currentBrand = brands.substring(initialBrandIndex, finalBrandIndex);
				
				// This allows to show up only brands used into the vehicle show.
				if(brandsUsed.equals("")||getOccurrencesNumber(brandsUsed, currentBrand)==0) {
					//System.out.println("getOccurrencesNumber ("+currentBrand+"): " + getOccurrencesNumber(brands, currentBrand));
					brandsUsed = brandsUsed + currentBrand + ":" + getOccurrencesNumber(brands, currentBrand) + ",";
				}
				
				initialBrandIndex=finalBrandIndex+1; // Don't delete
			}
		}
		
		return brandsUsed;
	}
	
	public static String getVehicleBrands() {
		// Restore data from disk
		String diskData = loadVehicleDataFromDisk();
		String repeatedBrands="";
		
		int initialVehicleIndex=0;
		int finalVehicleIndex=0;
		
		for(finalVehicleIndex=0;finalVehicleIndex<diskData.length();finalVehicleIndex++) {
			if(diskData.charAt(finalVehicleIndex)==';') {				
				String vehicleData = diskData.substring(initialVehicleIndex, finalVehicleIndex+1).toLowerCase();
				
				// If you need work with another field, remplace "brand" with your wanted field
				int initialBrandIndex = vehicleData.indexOf("brand"+":");
				int finalBrandIndex = initialBrandIndex;
				
				while(vehicleData.charAt(finalBrandIndex)!=',') {
					finalBrandIndex = finalBrandIndex+1;
				}
				
				// Store all brands without any exeption
				repeatedBrands = repeatedBrands+vehicleData.substring(initialBrandIndex+6, finalBrandIndex)+",";
				
				initialVehicleIndex=finalVehicleIndex+1;
			}
		}
		
		// Return all brands
		return repeatedBrands;
	}
	
	public static void outputMessage(int id) {
		switch (id) {
		case 0:
			System.out.println("Patente:");
			break;
		case 1:
			System.out.println("Marca:");
			break;
		case 2:
			System.out.println("A�o de fabricaci�n:");
			break;
		case 3:
			System.out.println("Color:");
			break;
		case 4:
			System.out.println("Capacidad del veh�culo:");
			break;
		case 5:
			System.out.print("||Bievenido a expo gesti�n de veh�culos||"+"\n"+
							 "0- Para finalizar el programa."+"\n" +
							 "1- Agregar veh�culo a la exposici�n."+"\n" +
							 "2- Limpiar lista de veh�culos."+"\n" +
							 "3- Mostrar lista de veh�culos."+"\n" +
							 "4- Mostrar la cantidad de veh�culos rojos."+"\n" +
							 "5- Mostrar la capacidad promedio de los autos exhibidos. (NO DISPONIBLE)"+"\n" +
							 "6- Mostrar la marca de veh�culos m�s usada en la exposici�n."
							 +"\n"
							 );
			break;
		case 6:
			System.out.println("||Agregar veh�culo a la exposici�n||");
			break;
		case 7:
			break;
		case 8:
			break;
		default:
			break;
		}
	}
	
	/**
	 * Returns occurrences number from introduced keyword.
	 * <p>
	 * This method always returns occurrences number from introduced keyword. 
	 *
	 * @param  body a reference to check occurrences number.
	 * @param  keyword a key that allows to check keyword number finded.
	 * @return      Occurrences number.
	 */
	public static int getOccurrencesNumber(String body, String keyword) {
		int occurrencesNumber = 0;
		int endIndex = 0;
		int beginIndex = endIndex;
		
		for(endIndex=0;endIndex<body.length();endIndex++) {
			if(body.charAt(endIndex)==','||body.charAt(endIndex)==';'||body.charAt(endIndex)==':') {
				if(body.substring(beginIndex, endIndex).toLowerCase().equals(keyword)) {
					occurrencesNumber=occurrencesNumber+1;
				}
				beginIndex=endIndex+1;
			}
			if(keyword=="") {
				if(body.charAt(endIndex)==',') {
					occurrencesNumber=occurrencesNumber+1;
					beginIndex=endIndex+1;
				}
			}
		}
		
		return occurrencesNumber;
	}
	
	/**
	 * Before to know about displayed cars information we need to load vehicle data. In this way,
	 * we will be able to managing cars information.
	 */
	public static String loadVehicleDataFromDisk() {
		String data = "";
		
		try {
			// Open file to read from, named SavedObj.sav.
			FileInputStream saveFile = new FileInputStream("saveFile.sav");
			
			// Create an ObjectInputStream to get objects from save file.
			ObjectInputStream save = new ObjectInputStream(saveFile);
			
			// Now we do the restore.
			// readObject() returns a generic Object, we cast those back
			// into their original class type.
			// For primitive types, use the corresponding reference class.
			data = (String) save.readObject();
			
			// Close the file.
			save.close(); // This also closes saveFile.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
	public static void saveVehicleDataToDisk(String data) {
		try {
			// Open a file to write to, named SavedObj.sav.
			FileOutputStream saveFile = new FileOutputStream("saveFile.sav");
			
			// Create an ObjectOutputStream to put objects into save file.
			ObjectOutputStream save = new ObjectOutputStream(saveFile);
			
			// Now we do the save.
			save.writeObject(data);
			
			// Close the file.
			save.close(); // This also closes saveFile.
			
			System.out.println("Veh�culo agregado exitosamente.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// This methods allows to insert vechile data onto an string.
	public static String addVehicleData() {
		String data = "", patent, brand, color;
		int manufactureYear, vechicleCapacity;
		
		outputMessage(6); // Welcome message
		outputMessage(0); // Patent field message
		patent = TecladoIn.readLine();
		outputMessage(1); // Brand field message
		brand = TecladoIn.readLine();
		outputMessage(2); // Manufacture year field message
		manufactureYear = TecladoIn.readInt();
		outputMessage(3); // Color field message
		color = TecladoIn.readLine();
		outputMessage(4); // Vechicle capacity field message
		vechicleCapacity = TecladoIn.readInt();
		
		data = data+"patent:"+patent+","+"brand:"+brand+","+"manufactureYear:"+manufactureYear+","+"color:"+color+","+"vechicleCapacity:"+vechicleCapacity+";";
	
		return data;
	}
	
	public static void clearVehicleDataFromDisk() {
		String data = "";
		try {
			// Open a file to write to, named SavedObj.sav.
			FileOutputStream saveFile = new FileOutputStream("saveFile.sav");
			
			// Create an ObjectOutputStream to put objects into save file.
			ObjectOutputStream save = new ObjectOutputStream(saveFile);
			
			// Now we do the save.
			save.writeObject(data);
			
			// Close the file.
			save.close(); // This also closes saveFile.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showVehicleListFromDisk() {
		int initialPoint=0;
		// Restore data from disk
		String diskData = loadVehicleDataFromDisk();
		System.out.print("Lista de veh�culos: "+"\n");
		for(int endPoint=0;endPoint<diskData.length();endPoint++) {
			if(diskData.charAt(endPoint)==';') {
				System.out.println(diskData.substring(initialPoint, endPoint));
				initialPoint=endPoint+1;
			}
		}
	}
	
	public static void showMainMenu() { 
		int answer = -1; // Default value equal to -1
		
		// Type 0 to exit the application
		while(answer!=0) {
			//Welcome message
			outputMessage(5);
			
			answer = TecladoIn.readInt();
			
			switch (answer) {
			case 1:
				String diskData = loadVehicleDataFromDisk(); // Restore vechicle data from disk
				String data = addVehicleData(); // Add new vehicle data
				saveVehicleDataToDisk(diskData+data); // Save vehicle data to disk
				break;
			case 2:
				clearVehicleDataFromDisk();
				break;
			case 3:
				showVehicleListFromDisk();
			case 4:
				System.out.print("N�mero de veh�culos rojos: "+getRedVehiclesNumberFromDisk()+"\n");
				break;
			case 5:
				showAverageVehicles();
				break;
			case 6:
				System.out.println("La marca m�s usada es: "+getVehicleBrandMostUsed());
				break;
			default:
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		showMainMenu();
	}
}

