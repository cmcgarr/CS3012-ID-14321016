import static org.junit.Assert.*;

import org.junit.Test;


public class LCATests {

	@Test
	public void testConstructor() {
		new binaryTree<Integer, Integer>();
	}

	@Test
	public void testIsEmpty(){

		binaryTree<Integer, Integer> testBT = new binaryTree<Integer, Integer>();
		assertEquals("Testing isEmpty on an empty tree", true, testBT.isEmpty());
		testBT.put(null, 8, 8);
		assertEquals("Testing isEmpty on a non-empty tree", false, testBT.isEmpty());
	}

	@Test
	public void testPut() {
		binaryTree<Integer, Integer> testBT = new binaryTree<Integer, Integer>();

		assertEquals("Testing put function into empty binary tree", true, testBT.put(null, 7,7));
		assertEquals("Testing put function into non-empty tree", true, testBT.put(7,8,8));
		assertEquals("Testing put function for replacing old value", true, testBT.put(7,8,9));
		assertEquals("Testing put function into non-empty tree for non-existent parent", false, testBT.put(10,8,8));
	}

	@Test
	public void testGet(){
		binaryTree<Integer, Integer> testBT = new binaryTree<Integer, Integer>();
		int testValue = 7;

		assertEquals("Test get on empty binary tree", null, testBT.get(testValue));

		testBT.put(null,testValue,testValue);

		assertEquals("Test get on binary tree with only a root", (Integer)testValue, testBT.get(testValue));

		testBT.put(testValue, testValue+1, testValue+1);
		testBT.put(testValue+1, testValue+2, testValue+2);

		assertEquals("Test get on binary tree with multiple node", (Integer)(testValue+1), testBT.get(testValue+1));
		assertEquals("Test get on a binary tree for a value it doesn't have", null, testBT.get(testValue-1));
	}

	@Test
	public void testLCA(){
		binaryTree<Integer, Integer> testBT = new binaryTree<Integer, Integer>();


		testBT.put(null,1,1);
		testBT.put(1,5,5);
		testBT.put(5,3,3);
		testBT.put(3,14,14);
		testBT.put(12,5,5);
		testBT.put(7,12,12);
		testBT.put(9,7,7);
		assertEquals("Testing Lowest Common Ancestor", (Integer)5, testBT.LCA(3, 9));


	}


}
