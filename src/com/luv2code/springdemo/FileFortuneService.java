package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;


@Component
public class FileFortuneService implements FortuneService {

	public String filename = "D:/fortunes.txt";
	
	List<String>fortunesList;
	
	private Random myRandom = new Random();
	
	public FileFortuneService() {
		System.out.println(">> Inside FileFortuneService constructor: ");
	}
	
	@PostConstruct
	public void loadTheFortuneFile() {
		System.out.println(">> Inside loadTheFortuneFile method: ");
		
		File file = new File(filename);
		
		System.out.println(">> Read fortunes from the file: " + file);
		System.out.println(">> The file exist: " + file.exists());
		
		// initializing the arrayList
		fortunesList = new ArrayList<String>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			// String to read the fortune
			String templine;
			
			// Reading the lines from the file
			while((templine = br.readLine()) != null) {
				fortunesList.add(templine);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	@Override
	public String getFortune() {
		// pick a random fortune from the arrayList
		int index = myRandom.nextInt(fortunesList.size());
		
		String fortune = fortunesList.get(index);
		return fortune;
	}

}
