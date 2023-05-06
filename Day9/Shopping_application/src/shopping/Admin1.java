package shopping;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Admin1 {
	private String adminName;
	private String adminPassword;
	
	static Scanner adminReader;
	static Scanner productReader; 

	 
	public Admin1(String adminName, String password) {
		this.adminName = adminName;
		this.adminPassword = password;
	}
	
	public static int getNumberOfProducts() throws FileNotFoundException {
		productReader =  new Scanner(new File("D:\\Games\\Work\\WileyEdge\\Codes\\Day9\\Shopping_application\\src\\shopping\\db\\productDetails.csv"));
		int noOfProducts=0;
		try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Games\\Work\\WileyEdge\\Codes\\Day9\\Shopping_application\\src\\shopping\\db\\productDetails.csv"))) {
	          while (reader.readLine() != null) noOfProducts++;
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
		return noOfProducts;		
	}
	
	// while calling function prodId = getNumberOfProducts+1 in argument
	
	public void addProduct(int prodID, String prodName, double rate,String description) throws IOException {
		Product p = new Product(prodID, prodName, rate, description);
		FileWriter fw = new FileWriter(new File("D:\\Games\\Work\\WileyEdge\\Codes\\Day9\\Shopping_application\\src\\shopping\\db\\productDetails.csv"));
		String s = "";
		s+=p.getProdId()+","+p.getProdName()+","+p.getRate()+","+p.getDescription()+"\n";
		fw.write(s);
		System.out.println("Product added");
	}
	
	public void removeProduct(int prodID) throws IOException {
		File csvFile = new File("D:\\Games\\Work\\WileyEdge\\Codes\\Day9\\Shopping_application\\src\\shopping\\db\\productDetails.csv");
        FileReader fileReader = new FileReader(csvFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Read all the records into a List
        List<String> allLines = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            allLines.add(line);
        }

        // Close the BufferedReader
        bufferedReader.close();

        // Remove the record you want to delete from the list
        int indexToDelete = prodID; // for example
        allLines.remove(indexToDelete);

        // Open the CSV file for writing
        FileWriter fileWriter = new FileWriter(csvFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Write all the remaining records to the CSV file
        for (String record : allLines) {
            bufferedWriter.write(record);
            bufferedWriter.newLine();
        }

        // Close the BufferedWriter
        bufferedWriter.close();
	}
	
	public void editProduct(int prodID, Product product) throws IOException {
		File csvFile = new File("D:\\Games\\Work\\WileyEdge\\Codes\\Day9\\Shopping_application\\src\\shopping\\db\\productDetails.csv");
        FileReader fileReader = new FileReader(csvFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Open a temporary file for writing
        File tempFile = new File("tempFile.csv");
        FileWriter fileWriter = new FileWriter(tempFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Read and write each line of the CSV file
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            // Split the line into fields using a comma separator
            String[] fields = line.split(",");

            // Modify the field(s) as needed
            if (fields[0].equals(Integer.toString(prodID))) {
                fields[1] = product.getProdName();
                fields[2] = Double.toString(product.getRate());
                fields[3] = product.getDescription();
            }

            // Join the fields into a line using a comma separator
            String modifiedLine = String.join(",", fields);

            // Write the modified line to the temporary file
            bufferedWriter.write(modifiedLine);
            bufferedWriter.newLine();
        }

        // Close the BufferedReader and BufferedWriter
        bufferedReader.close();
        bufferedWriter.close();

        // Delete the original CSV file
        csvFile.delete();

        // Rename the temporary file to the original CSV file name
        tempFile.renameTo(csvFile);
	}
	
	public void registerAdmin(String username, String password, String type) throws IOException {
		File csvFile = new File("D:\\Games\\Work\\WileyEdge\\Codes\\Day9\\Shopping_application\\src\\shopping\\db\\adminDetails.csv");
		FileReader fileReader = new FileReader(csvFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> adminAuth = new ArrayList<>();
		String line;
        while ((line = bufferedReader.readLine()) != null) {
            adminAuth.add(line);
        }
        String s = username+","+password+","+type;
        adminAuth.add(s);
        bufferedReader.close();
		FileWriter fileWriter = new FileWriter(csvFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String record : adminAuth) {
            bufferedWriter.write(record);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
	}
	
	public void loginAdmin(String username, String password) throws IOException{
		File csvFile = new File("D:\\Games\\Work\\WileyEdge\\Codes\\Day9\\Shopping_application\\src\\shopping\\db\\adminDetails.csv");
		FileReader fileReader = new FileReader(csvFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String line;
        int flag=0;
        while ((line = bufferedReader.readLine()) != null) {
            // Split the line into fields using a comma separator
            String[] fields = line.split(",");
            if(fields[0].equals(username) && fields[1].equals(password)) {
            	flag=1;
            }
        }
        
        bufferedReader.close();
        if(flag==0) {
        	System.out.println("Invalid credentials.");
        }
	}
	
	public static void main(String args[]) {
		
	}
}