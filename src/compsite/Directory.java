package compsite;

import java.util.Date;
import java.util.ArrayList;


public class Directory extends FSElement {

	ArrayList<FSElement> children = new ArrayList<FSElement>();
	static FileSystem filesystem = FileSystem.getInstance();
	
	public Directory(Directory parent, String name, String owner, int size) {
		super(parent,new Date());
		this.name = name;
		this.owner = owner;
		this.size = size;
		this.type = "Directory";
		
	}

	
	public void appendChild(FSElement fsElement) {
		children.add(fsElement);
	}
	ArrayList<FSElement> getChildren(){
		return this.children;
	}

	@Override
	int getSize() {
		this.size=0;
		for(FSElement child: children){
			size= size+child.getSize();
		}
	    	return size;
	}

	@Override
	boolean isLeaf() {
		if(this.children!=null)
			return false;
		else
			return true;
	
	}
	

}
