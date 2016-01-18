package compsite;
import java.util.Date;

public class File extends FSElement {

	public File(Directory parent, String name, String owner, int size) {
		super(parent,new Date());
		// TODO Auto-generated constructor stub
		this.name = name;
		this.owner = owner;
		this.size = size;
		this.type = "File";
	}

	@Override
	int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	boolean isLeaf() {
		// TODO Auto-generated method stub
		return true;
	}

}
