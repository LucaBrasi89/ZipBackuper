package controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;


public class CfgParser {

	public Ini ini = null;
	private List<CfgElem> cfgElemets = new ArrayList<CfgElem>();
	
	
	public CfgParser(String cfgFile) {
			
		
		try {
			this.ini = new Ini(new File(cfgFile));
		} catch (InvalidFileFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 * First section is [DEFAULT], so we passed throw it.
	 * */
	
	
	public void fillElements() {
		
		
		// list section names
		int i = 0;
		for (String sName : ini.keySet()) {
			if (!sName.equals("DEFAULT")) {
		    	CfgElem cfgElem = new CfgElem(
		    			ini.get(sName).get("name", i).toString(),
		    			ini.get(sName).get("source", i).toString(),
		    			ini.get(sName).get("destination", i).toString(),
		    			Boolean.parseBoolean(ini.get(sName).get("marked", i).toString())
		    			);
		    	cfgElemets.add(cfgElem);
		    }
		}
		

		
	}
	public void printElements() {
		System.out.println("Hmmm");
		for (CfgElem cfgElem : cfgElemets) {
			System.out.println(cfgElem);
		}
		
		
		
	}

	public List<CfgElem> getCfgElemets() {
		return cfgElemets;
	}
	
	
	

}
