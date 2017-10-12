/*
Implemented to solve the problem of finding the lowest common ancestor
Assumed therefore that the user cares about the 'parent' of a value at the time of adding it to the tree
Thus this is not a Binary Search Tree, and new nodes are inserted based on who their parent should be
In the event that two equal Keys are inserted under equal parents, the first key found is returned

*/
//TODO: add documentation

public class binaryTree<Key extends Comparable<Key>, Value> {

    public Value get(Key key){
    	
    	return null;
    }

    public void put(Key key, Value value){

    }

    public void put(Key parent, Key key, Value value){

    }

    public Value LCA(Key key1, Key key2){
      
    	return null;
    }

}
