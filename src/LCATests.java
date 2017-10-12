import static org.junit.Assert.*;

import org.junit.Test;


public class LCATests {

	@Test
	public void testConstructor() {
		new binaryTree<Integer, Integer>();
	}


	@Test
	public void testPutGet(){
		binaryTree<Integer, Integer> testBT = new binaryTree<Integer, Integer>();
		int testValue = 7;

		assertEquals("Test get on empty binary tree", null, testBT.get(testValue));

		testBT.put(testValue,testValue);

		assertEquals("Test get on binary tree with only a root", (Integer)testValue, testBT.get(testValue));

		testBT.put(testValue, testValue+1, testValue+1);
		testBT.put(testValue+1, testValue+2, testValue+2);

		assertEquals("Test get on binary tree with multiple node", (Integer)(testValue+1), testBT.get(testValue+1));
		assertEquals("Test get on a binary tree for a value it doesn't have", null, testBT.get(testValue-1));
	}

	@Test
	public void testLCA(){
		binaryTree<Integer, Integer> testBT = new binaryTree<Integer, Integer>();


		testBT.put(1,1);
		testBT.put(1,5,5);
		testBT.put(5,3,3);
		testBT.put(3,14,14);
		testBT.put(12,5,5);
		testBT.put(7,12,12);
		testBT.put(9,7,7);
		assertEquals("Testing Lowest Common Ancestor", (Integer)5, testBT.LCA(3, 9));


	}


}
