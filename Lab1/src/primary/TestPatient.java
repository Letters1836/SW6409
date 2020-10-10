package primary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestPatient {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a =10;
//		String s="bbb";
//		int[] numArray = new int[10];
//		ArrayList<Patient> alist = new ArrayList<>();
		
		String patientInfoFilePath = System.getProperty("user.dir") + "/src/primary/userData.txt";
//		System.out.println(patientInfoFilePath);
		
		ArrayList<Patient> alist = new ArrayList<>();
		
		File patientInfoFile = new File(patientInfoFilePath);
		
		alist = readData(patientInfoFile);
		
		PatientGUI pg = new PatientGUI(alist);

	}
	
	static ArrayList<Patient> readData(File file) {
		
		ArrayList<Patient> alist = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				alist.add(processPatient(line));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return alist;
		
	}
	
	static Patient processPatient(String info) {
		
		Patient pat;
		
		String[] data = info.split("[,]");
		
//		for (String str : data) {
//			System.out.println(str);
//		}
		
		int ID = Integer.parseInt(data[0]);
		String name = data[1];
		int age = Integer.parseInt(data[2]);
		int weight = Integer.parseInt(data[3]);
		String doctor = data[4];
		
		pat = new Patient(ID, name, age, weight, doctor);
		
		return pat;
		
	}

}
