package compsite;
import java.util.Date;

public abstract class FSElement {

	protected String name;
	protected String owner;
	protected Date created;
	protected Date lastModified;
	protected int size;
	protected Directory parent;
	protected String type;
	
    public FSElement(Directory parent, Date created){
		this.parent=parent;
		if(parent!=null){
			parent.appendChild(this);
		}
		this.created=created;
	    		
	}
	
	public String getName(){
		return name;
	}
	public String getOwner(){
		return owner;
	}
	
	public Directory getParent(){
		return parent;
	}
	
	public void getDetails(){
		System.out.println("Parent Directory Name: "+parent);
		System.out.println("Owner Name: "+owner);
		System.out.println("File Size: "+size);
	}
	abstract int getSize();
	abstract boolean isLeaf();
	String getInfo(){
		String s= "File system element of type: "+type +", Owner: "+owner+", size: " + size;
		return s;
	}
	public String getType(){
		return this.type;
	}
	
	
}
