import static org.junit.Assert.*;

import org.junit.Test;


public class LCATests {

	@Test
	public void testConstructor() {
		new binaryTree();
	}

	@Test
	public void testPut(){

		binaryTree<Integer, Integer> testBT = new binaryTree<Integer, Integer>();

		binaryTree.put(7, 7);

		binaryTree.put(7, 14, 14);

		binaryTree.put(14, 12, 12);
	}

	@Test
	public void testGet(){
		binaryTree<Integer, Integer> testBT = new binaryTree<Integer, Integer>();
		int testValue = 7;

		assertEquals("Test get on empty binary tree", null, testBT.get(testValue));

		testBT.put(testValue,testValue);

		assertEquals("Test get on binary tree with only a root", testValue, testBt.get(testValue));

		testBT.put(testValue, testValue+1, testValue+1);
		testBT.put(testValue+1, testValue+2, testValue+2);

		assertEquals("Test get on binary tree with multiple node", testValue+1, testBT.get(testValue+1));
		assertEquals("Test get on a binary tree for a value it doesn't have", null, testBT.get(testValue-1));
	}

	@Test
	public void testLCA(){
		binaryTree<Integer, Integer> testBT = new binaryTree<Integer, Integer>();


		binaryTree.put(1,1);
		binaryTree.put(1,5,5);
		binaryTree.put(5,3,3);
		binaryTree.put(3,14,14);
		binaryTree.put(12,5,5);
		binaryTree.put(7,12,12);
		binaryTree.put(9,7,7);
		assertEquals("Testing Lowest Common Ancestor", 5, binaryTree.LCA(3, 9));


	}


}
