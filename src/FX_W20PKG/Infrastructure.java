package FX_W20PKG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import CargoAirport.CargoAirport;
import CommercialAirport.CommercialAirport;

public class Infrastructure {
	
	public static int findTallestHighRise(Structure[] StrArr) {
		
		int index = -1;
		double height = 0.0;
		
		for (int i = 0; i < StrArr.length; ++i) {
			if (StrArr[i] != null && StrArr[i] instanceof HighRise) {
				HighRise hr = (HighRise)StrArr[i];
				if (hr.getHeight() > height) {
					height = hr.getHeight();
					index = i;
				}
			}	
		}
		
		return index;
		
	}
	
	public static void showBuildingInfo(Structure[] StrArr) {
		// assuming show all Building objects and subclass objects of Building
		for (int i = 0; i < StrArr.length; ++i) {
			if (StrArr[i] != null && StrArr[i] instanceof Building) {
				System.out.println(StrArr[i].getClass().getName() + ": " + StrArr[i]);
			}
		}
		
	}
	
	public static void displayAllObjects(Structure[] StrArr, int startIndex) {

		if (startIndex == StrArr.length - 1) {
			System.out.println(StrArr[startIndex].getClass().getName() + ": " + StrArr[startIndex]);
		} else {
			displayAllObjects(StrArr, startIndex + 1);
			System.out.println(StrArr[startIndex].getClass().getName() + ": " + StrArr[startIndex]);
		}
		
	}
	
	public static Structure[] copyStructures(Structure[] StrArr) {
		
		Structure[] cpyStrArr = new Structure[StrArr.length];
		for (int i = 0; i < cpyStrArr.length; ++i) {
			cpyStrArr[i] = StrArr[i].clone();
		}
		return cpyStrArr;
		
	}
	
	public static void findExistingAirportCodes(PrintWriter fout, Structure[] StrArr) {
		
		Airport ap;
		String[] codes = new String[StrArr.length];
		for (int i = 0; i < StrArr.length; ++i) {
			if (StrArr[i] != null && StrArr[i] instanceof Airport) {
				ap = (Airport)StrArr[i];
				codes[i] = ap.getCode();
			}
		}
		for (int i = 0; i < codes.length; ++i) {
			if (codes[i] != null) {
				fout.append(codes[i] + "\n");
			}
		}
		
	}
	
	public static void displayAirportCodes(BufferedReader fin) {
		
		int i;    
		try {
	        while((i = fin.read()) != -1){  
	        	System.out.print((char)i);  
	        } 
		}catch (IOException e) {
        	System.out.println("I/O error occured!");
        }
		
	}
	
	public static void main(String[] args) {
		////////////////////////
		//   Task 3.A & 3.B   //
		////////////////////////
		final int arraySize = 66;
		Structure[] StrArr = new Structure[arraySize];
		
		// initializing 6 Structure objects and put them into Array
		Structure str1 = new Structure(1970, 1000000.28);
		Structure str2 = new Structure(2001, 900000.98);
		Structure str3 = new Structure(1980, 9000000.28);
		Structure str4 = new Structure(1999, 20000.56);
		Structure str5 = new Structure(2013, 800000.28);
		Structure str6 = new Structure(2020, 7300000.28);
		StrArr[0] = str1;
		StrArr[11] = str2;
		StrArr[22] = str3;
		StrArr[33] = str4;
		StrArr[44] = str5;
		StrArr[55] = str6;

		// initializing 6 Building objects and put them into Array
		Building bld1 = new Building(1870, 23456.78, 400.78, "Concrete");
		Building bld2 = new Building(1970, 12345.67, 1400.78, "Wood");
		Building bld3 = new Building(1930, 3456.78, 2400.78, "Glass");
		Building bld4 = new Building(1960, 456.56, 3400.78, "Concrete");
		Building bld5 = new Building(1990, 56.45, 5400.78, "Metal");
		Building bld6 = new Building(2013, 60000.34, 8400.78, "Concrete");
		StrArr[1] = bld1;
		StrArr[12] = bld2;
		StrArr[23] = bld3;
		StrArr[34] = bld4;
		StrArr[45] = bld5;
		StrArr[56] = bld6;
		
		// initializing 6 Bridge objects and put them into Array
		Bridge bdg1 = new Bridge(1900, 24680.35, 100.12, 10.18);
		Bridge bdg2 = new Bridge(1801, 12468.35, 80.12, 9.18);
		Bridge bdg3 = new Bridge(1702, 324680.35, 70.12, 20.18);
		Bridge bdg4 = new Bridge(1603, 424680.35, 60.12, 15.18);
		Bridge bdg5 = new Bridge(2000, 524680.35, 400.12, 12.18);
		Bridge bdg6 = new Bridge(2010, 624680.35, 300.12, 80.18);
		StrArr[2] = bdg1;
		StrArr[13] = bdg2;
		StrArr[24] = bdg3;
		StrArr[35] = bdg4;
		StrArr[46] = bdg5;
		StrArr[57] = bdg6;
		
		// initializing 6 Airport objects and put them into Array
		Airport ap1 = new Airport(1950, 200000.99, 12, "YUL");
		Airport ap2 = new Airport(1960, 123400.99, 10, "PVG");
		Airport ap3 = new Airport(1955, 200000.99, 7, "PEK");
		Airport ap4 = new Airport(1966, 300000.99, 6, "YDT");
		Airport ap5 = new Airport(1980, 400000.99, 5, "AAA");
		Airport ap6 = new Airport(1977, 500000.99, 8, "AAB");
		StrArr[3] = ap1;
		StrArr[14] = ap2;
		StrArr[25] = ap3;
		StrArr[36] = ap4;
		StrArr[47] = ap5;
		StrArr[58] = ap6;
		
		// initializing 6 ResidentialBuilding objects and put them into Array
		ResidentialBuilding rb1 = new ResidentialBuilding(2010, 976543.21, 1400.99, "Concrete", 400);
		ResidentialBuilding rb2 = new ResidentialBuilding(2001, 5676543.21, 2400.99, "Wood", 1400);
		ResidentialBuilding rb3 = new ResidentialBuilding(2002, 3476543.21, 400.99, "Metal", 500);
		ResidentialBuilding rb4 = new ResidentialBuilding(2003, 1276543.21, 3400.99, "Concrete", 450);
		ResidentialBuilding rb5 = new ResidentialBuilding(2004, 76543.21, 4400.99, "Glass", 499);
		ResidentialBuilding rb6 = new ResidentialBuilding(2005, 876543.21, 5400.99, "Concrete", 700);
		StrArr[4] = rb1;
		StrArr[15] = rb2;
		StrArr[26] = rb3;
		StrArr[37] = rb4;
		StrArr[48] = rb5;
		StrArr[59] = rb6;
		
		// initializing 6 House objects and put them into Array
		House hs1 = new House(2010, 23456.78, 400.99, "Concrete", 10, 12, 3);
		House hs2 = new House(1970, 53456.78, 300.99, "Glass", 20, 8, 3);
		House hs3 = new House(1980, 63456.78, 200.99, "Wood", 12, 7, 3);
		House hs4 = new House(1860, 73456.78, 100.99, "Metal", 30, 10, 2);
		House hs5 = new House(1900, 83456.78, 500.99, "Concrete", 15, 12, 1);
		House hs6 = new House(2020, 93456.78, 700.99, "Concrete", 9, 20, 2);
		StrArr[5] = hs1;
		StrArr[16] = hs2;
		StrArr[27] = hs3;
		StrArr[38] = hs4;
		StrArr[49] = hs5;
		StrArr[60] = hs6;
		
		// initializing 6 Condo objects and put them into Array
		CondoBuilding cb1 = new CondoBuilding(2010, 787890.88, 500.78, "Concrete", 500, 40);
		CondoBuilding cb2 = new CondoBuilding(1980, 67890.88, 1500.78, "Concrete", 100, 10);
		CondoBuilding cb3 = new CondoBuilding(1975, 87890.88, 2500.78, "Glass", 50, 40);
		CondoBuilding cb4 = new CondoBuilding(1989, 187890.88, 3500.78, "Metal", 40, 50);
		CondoBuilding cb5 = new CondoBuilding(1999, 37890.88, 4500.78, "Wood", 120, 70);
		CondoBuilding cb6 = new CondoBuilding(2005, 47890.88, 5500.78, "Concrete", 300, 80);
		StrArr[6] = cb1;
		StrArr[17] = cb2;
		StrArr[28] = cb3;
		StrArr[39] = cb4;
		StrArr[50] = cb5;
		StrArr[61] = cb6;
		
		// initializing 6 HighRise objects and put them into Array
		HighRise hr1 = new HighRise(1900, 13579.88, 400.34, "Concrete", 100.13);
		HighRise hr2 = new HighRise(1810, 213579.88, 300.34, "Wood", 200.13);
		HighRise hr3 = new HighRise(1720, 313579.88, 200.34, "Glass", 400.13);
		HighRise hr4 = new HighRise(1630, 413579.88, 100.34, "Metal", 300.13);
		HighRise hr5 = new HighRise(2000, 513579.88, 600.34, "Concrete", 89.13);
		HighRise hr6 = new HighRise(2020, 613579.88, 700.34, "Concrete", 120.13);
		StrArr[7] = hr1;
		StrArr[18] = hr2;
		StrArr[29] = hr3;
		StrArr[40] = hr4;
		StrArr[51] = hr5;
		StrArr[62] = hr6;
		
		// initializing 6 Overpass objects and put them into Array
		Overpass op1 = new Overpass(2010, 786543.90, 200, 20, 200);
		Overpass op2 = new Overpass(1860, 86543.90, 100, 10, 1200);
		Overpass op3 = new Overpass(1970, 986543.90, 400, 18, 400);
		Overpass op4 = new Overpass(1982, 186543.90, 210, 11, 600);
		Overpass op5 = new Overpass(1989, 386543.90, 230, 12, 800);
		Overpass op6 = new Overpass(2001, 586543.90, 2050, 13, 1000);
		StrArr[8] = op1;
		StrArr[19] = op2;
		StrArr[30] = op3;
		StrArr[41] = op4;
		StrArr[52] = op5;
		StrArr[63] = op6;
		
		// initializing 6 CargoAirport objects and put them into Array
		CargoAirport ca1 = new CargoAirport(2000, 9999898.78, 12, "BBC", 5000.99);
		CargoAirport ca2 = new CargoAirport(2010, 8999898.78, 4, "CAA", 5000.99);
		CargoAirport ca3 = new CargoAirport(2009, 999898.78, 15, "DEE", 5000.99);
		CargoAirport ca4 = new CargoAirport(1975, 7999898.78, 20, "FGG", 5000.99);
		CargoAirport ca5 = new CargoAirport(1980, 1999898.78, 8, "FFF", 5000.99);
		CargoAirport ca6 = new CargoAirport(1989, 34999898.78, 10, "FAB", 5000.99);
		StrArr[9] = ca1;
		StrArr[20] = ca2;
		StrArr[31] = ca3;
		StrArr[42] = ca4;
		StrArr[53] = ca5;
		StrArr[64] = ca6;
		
		// initializing 6 CommercialAirport objects and put them into Array
		CommercialAirport com1 = new CommercialAirport(1989, 445566.77, 20, "EAB", 60);
		CommercialAirport com2 = new CommercialAirport(1999, 545566.77, 12, "EAA", 55);
		CommercialAirport com3 = new CommercialAirport(2000, 645566.77, 15, "GAB", 90);
		CommercialAirport com4 = new CommercialAirport(2001, 745566.77, 18, "HAB", 60);
		CommercialAirport com5 = new CommercialAirport(2010, 845566.77, 27, "JAB", 50);
		CommercialAirport com6 = new CommercialAirport(1975, 945566.77, 40, "TAB", 40);
		StrArr[10] = com1;
		StrArr[21] = com2;
		StrArr[32] = com3;
		StrArr[43] = com4;
		StrArr[54] = com5;
		StrArr[65] = com6;
		////////////////////////
		//      Task 3.C      //
		////////////////////////
		System.out.println("\nStarting Task 3.C\n");
		int i = findTallestHighRise(StrArr);
		if (i != -1) {
			System.out.println("Tallest HighRise was found at index: " + i + 
					" Here is the info of that object");
			System.out.println(StrArr[i].getClass().getName() + ": " + StrArr[i]);
		}
		else {
			System.out.println("No HighRise objects were found in the array!");
		}
		System.out.println("\nEnd of Task 3.C\n");
		////////////////////////
		//      Task 3.D      //
		////////////////////////
		System.out.println("\nStarting Task 3.D\n");
		showBuildingInfo(StrArr);
		System.out.println("\nEnd of Task 3.D\n");
		////////////////////////
		//      Task 3.E      //
		////////////////////////
		System.out.println("\nStarting Task 3.E\n");
		System.out.println("first Structure in Array: " + StrArr[0].getClass().getName() +
			" " + StrArr[0]);
		System.out.println("last Structure in Array: " + StrArr[65].getClass().getName() +
			" " + StrArr[65] + "\n");
		
		displayAllObjects(StrArr, 0);
		System.out.println("\nEnd of Task 3.E\n");
		////////////////////////
		//      Task 3.F      //
		////////////////////////
		System.out.println("\nStarting Task 3.F\n");
		System.out.println("Below is the original array: ");
		Structure[] strArr1 = new Structure[10];
		for (int j = 0; j < 10; ++j) {
			strArr1[j] = StrArr[j].clone();
		}
		displayAllObjects(strArr1, 0);
		System.out.println("\nBelow is the copied array: ");
		displayAllObjects(copyStructures(strArr1), 0);
		System.out.println("\nEnd of Task 3.F\n");
		////////////////////////
		//        Task 4      //
		////////////////////////
		System.out.println("\nStarting Task 4\n");
		ArrayList<Structure> strArrLst = new ArrayList<Structure>(30);
		for (int j = 0; j < StrArr.length; ++j) {
			if (StrArr[j] != null) {
				strArrLst.add(StrArr[j]);
			}
		}
		// remove 5 objects
		strArrLst.remove(4);
		strArrLst.remove(8);
		strArrLst.remove(12);
		strArrLst.remove(24);
		strArrLst.remove(44);
		System.out.println(strArrLst.contains(StrArr[4]));
		System.out.print(strArrLst.contains(StrArr[5]));
		System.out.println(" index: " + strArrLst.indexOf(StrArr[5]));
		System.out.println("\nEnd of Task 4\n");
		////////////////////////
		//       Task 5       //
		////////////////////////
		System.out.println("\nStarting Task 5\n");
		try (PrintWriter fout = new PrintWriter("AirportCodes.txt")) {
			findExistingAirportCodes(fout, StrArr);
			
		} catch (IOException e) {
			System.out.println("I/O error occured!");
		}
		try (BufferedReader fin = new BufferedReader(new FileReader("AirportCodes.txt"))) {
			displayAirportCodes(fin);
		} catch (IOException e) {
			System.out.println("I/O error occured!");
		}
		System.out.println("\nEnd of Task 5\n");
		////////////////////////
		//       Task 6       //
		////////////////////////
		System.out.println("\nStarting Task 6\n");
		System.out.println("initializing StructureList 1 using \"addToStart\" method\n");
		StructureList sl1 = new StructureList();
		for (int j = 0; j < 5; ++j) {
			if (StrArr[j] != null) {
				sl1.addToStart(StrArr[j]);
			}
		}
		System.out.println("content of sl1:");
		sl1.showListContents();
		System.out.println("\ninitializing StructureList 2 using \"addAtEnd\" method\n");
		StructureList sl2 = new StructureList();
		for (int j = 5; j < 10; ++j) {
			if (StrArr[j] != null) {
				sl2.addAtEnd(StrArr[j]);
			}
		}
		System.out.println("content of sl2:");
		sl2.showListContents();
		System.out.println("\nusing \"clone\" method initialize StructureList 3\n");
		StructureList sl3 = (StructureList)sl1.clone();
		System.out.println("content of sl3:");
		sl3.showListContents();
		System.out.println("\nShowing result of sl1.append(sl2)\n");
		sl1.append(sl2);
		System.out.println("content of sl1:");
		sl1.showListContents();
		System.out.println("content of sl2:");
		sl2.showListContents();
		System.out.println("\nEnd of Task 6\n");
		
	}

}
