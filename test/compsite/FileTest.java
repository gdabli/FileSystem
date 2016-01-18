package compsite;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;


public class FileTest {

	ArrayList<FSElement> children = new ArrayList<FSElement>();
	Directory fs_Element = new Directory(null,"Directory1","DABLI", 50);
	Directory newFs_Element = new Directory(fs_Element, "Directory2","DABLI2", 40);
	File file1 = new File(newFs_Element,"file1","Yogi",60);
	@Test
	public void testIsLeaf() {

		assertTrue(file1.isLeaf());
	}

	@Test
	public void testGetSize() {

		assertEquals(60, file1.getSize());
	}
}
