package compsite;



public class FileSystem {
	
		
		private static FileSystem instance = null;
		Directory rootDir;
		public static FileSystem getInstance(){ 
			if(instance==null){
				instance = new FileSystem ();
			}	
		return instance;
		}
		
	// Creating a recursive method to print all directory inside root directory
	void showAllElements(Directory root){
		rootDir = root;
	
			System.out.println(rootDir.getName());
			for(FSElement element: rootDir.children){
				if(!element.isLeaf()){
					Directory directory = (Directory)element;
					Directory.filesystem.showAllElements(directory); 
				 }
				else{
					System.out.println(element.getName());
					System.out.println(element.getInfo());
				}
				
				}
			
}
	public static void main(String[] args){
		
		//creating a new directory
		Directory rootDirectory= new Directory(null,"root","Gajanan Maharaj", 300);
		//Creating a sub directory
		Directory Gaurav = new Directory(rootDirectory ,"bhajan", "Gajanan Maharaj", 45);
		// creating new files
		File A1 = new File(Gaurav, "A1","Gajanan Maharaj",3);
		File A2 = new File(Gaurav, "A2","Gajanan Maharaj",3);
		//creating another directory Ajay
		Directory Ajay = new Directory(rootDirectory,"Dohe", "Gajanan Maharaj",80);
	    File B1 = new File(Ajay, "B1", "Gajanan Maharaj", 4);
	    File B2 = new File(Ajay, "B2", "Gajanan Maharaj", 4);
	    //creating another sub directory
	    Directory Ram = new Directory(rootDirectory,"Shyam", "Gajanan Maharaj", 50);
	    File C1 = new File(Ram, "C1", "Gajanan Maharaj", 5);
	    File C2 = new File(Ram, "C2", "Gajanan Maharaj", 5);
	    
	    
	    
	    //Printing all Directories inside root Directory
	    System.out.println("***********LIST OF ALL DIRECTORIES FROM ROOT************"); 
	    Directory.filesystem.showAllElements(rootDirectory);
	    System.out.println();
	    System.out.println("****************ROOT DIRECTROY DETAILS***************");
	    System.out.println("The Owner of Root Directory is: " + rootDirectory.owner);
	    System.out.println("Size of Root Directory is: "+rootDirectory.size);
	    //Now printing the sub directories 
	    System.out.println();
	    System.out.println("****************SUB DIRECTORY DETAILS***************** ");
	    System.out.println("sub directory: "+Gaurav.getName()+ ", Owner is: "+rootDirectory.getOwner()+ ", size is "+Gaurav.getSize());
	    System.out.println("sub directory: "+Ajay.getName()+ ", Owner is: "+rootDirectory.getOwner()+ ", size is "+Ajay.getSize());
	    System.out.println("sub directory: "+Ram.getName()+ ", Owner is: "+rootDirectory.getOwner()+ ", size is "+Ram.getSize());
	    
	    
	    
	    
	    
	}

		

		
		
		

	
	
	
}
