package compsite;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class DirectoryTest {
	
	ArrayList<FSElement> children = new ArrayList<FSElement>();
	Directory fs_Element = new Directory(null,"Directory1","DABLI", 50);
	Directory newFs_Element = new Directory(fs_Element, "Directory2","DABLI2", 40);
	FSElement element = new File(null, "Directory1", "DABLI", 60);
	
	
	@Test
	public void testGetChildren() {
		assertTrue(fs_Element.getChildren().contains(newFs_Element));
		
	}
	@Test
	public void testAppendChild() {
		fs_Element.appendChild(element);
		assertTrue(fs_Element.getChildren().contains(element));
		assertTrue(fs_Element.getChildren().contains(newFs_Element));
	}
	
	@Test
	public void testIsLeaf() {
		assertTrue(element.isLeaf());
		assertFalse(newFs_Element.isLeaf());
		assertFalse(fs_Element.isLeaf());
	}
	
	@Test
	public void testGetSize() {
		fs_Element.appendChild(element);
		assertEquals(60, fs_Element.getSize());
	}
	
}
