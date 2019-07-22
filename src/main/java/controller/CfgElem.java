package controller;

public class CfgElem {
	
	private String name;
	private String source;
	private String destination;
	private boolean marked;
	
	
	
	
	public CfgElem(String source, String name, 
			String destination, Boolean marked) {
		
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.marked = marked;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public boolean isMarked() {
		return marked;
	}

	@Override
	public String toString() {
		return "CfgElem [name=" + name + ", source=" + source + ", destination=" + destination + ", marked=" + marked
				+ "]";
	}
	
	
	

}
