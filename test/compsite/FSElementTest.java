package compsite;

import static org.junit.Assert.*;
import org.junit.Test;


public class FSElementTest {

	FSElement fs_element = new Directory(null,"Gaurav","Dabli", 30);
	@Test
	public void testGetParent() {
		assertNull(fs_element.getParent());
	}

	@Test
	public void testIsLeaf() {
		assertFalse(fs_element.isLeaf());
	}
	
	@Test
	public void testGetName() {
		assertEquals("Gaurav",fs_element.getName());
	}

	@Test
	public void testGetSize() {

		assertEquals(0,fs_element.getSize());
	}

	@Test
	public void testGetType() {
		assertEquals("Directory",fs_element.getType());
	}
	
	@Test
	public void testGetInfo() {
		assertEquals("File system of type: Directory" +"Owner: Dabli"+ "size: " +"0",fs_element.getInfo());
	}

}
