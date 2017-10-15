/*
Implemented to solve the problem of finding the lowest common ancestor
Assumed therefore that the user cares about the 'parent' of a value at the time of adding it to the tree
Thus this is not a Binary Search Tree, and new nodes are inserted based on who their parent should be
In the event that two equal Keys are inserted under equal parents, the first key found is returned
*/
//TODO:

public class binaryTree<Key extends Comparable<Key>, Value> {

    private Node root;

    private class Node{
      private Key key;              //sorted by key
      private Value value;          //associated data
      private Node left, right, parent;     //leftChild and rightChild

      public Node(Node parent, Key key, Value value){
        this.key = key;
        this.value = value;
        this.parent = parent;
      }
    }

    public boolean isEmpty(){
      return (root == null);
    }

    public Value get(Key key){
    	return get(root, key);
    }
    
    private Value get(Node x, Key key) {
    	
    	Value result = null;
    	
    	if(x == null) {
    		result = null;
    	}
    	
    	else {
    		if(x.key.compareTo(key) == 0) {
    			result = x.value;
    		}
    		
    		else {
    			result = get(x.left, key);
    			
    			if(result == null) {
    				result = get(x.left, key);
    			}
    		}
    	}
    	return result;
    }

    /**
     *  Insert key-value pair into BST.
     *  If key already exists under same parent, update with new value.
     *
     *  @param parent the key under which to insert the new key (set to null if new key is to be set as root)
     *  @param key the key to insert
     *  @param val the value associated with key
     *
     *  TODO: tidy up and make functions
     */

    public boolean put(Key parent, Key key, Value value){

      boolean success = false;
      //if{
        // if (value == null){
          //success = delete(key);                TODO implement delete function
        // }

      //set as root ----TODO change to else if once delete is implemented----
      if(parent == null){
        //if root is empty, create new root
        if (root == null){ root = new Node(null, key, value); }
        //else update key and value of old root
        else{
          root.key = key;
          root.value = value;
        }
        success = true;
        return success;
      }

      Node target = search(root, parent);
      Node newNode = new Node(target, key, value);

      //null meaning not found
      if(target == null){
        success = false;
      }
      else{
      //if the left node is empty, set left to be newNode
          if(target.left == null){
            target.left = newNode;
            success = true;
          }
          //if left node is not empty, but shares newNode's key, update the value of the left node
          else if(target.left.key.compareTo(newNode.key) == 0){
            target.left.value = value;
            success = true;
          }
          //if the right node is empty
          else if(target.right == null){
            target.right = newNode;
            success = true;
          }
          //if the right node is not empty, but shares newNode's key, update the value of right node
          else if(target.right.key.compareTo(newNode.key) == 0){
            target.right.value = value;
            success = true;
          }
          //in the case of there being no empty child or child of equal key
          else{ success = false;}
        }
      return success;
    }

    private Node search(Node x, Key key){
      if(x == null){ return null; }

      else{
        //check if key has been found, returning node is so
        if(x.key.compareTo(key) == 0){
          return x;
        }
        else{
          //search left child for key, returning result if found
          Node leftSearch = search(x.left, key);
          if(leftSearch != null){ return leftSearch; }

          //search right child for key, returning result if found
          Node rightSearch = search(x.right, key);
          if(rightSearch != null){ return rightSearch; }
        }
      }
      return null;
    }

    public Value LCA(Key key1, Key key2){
    	return null;
    }
}
