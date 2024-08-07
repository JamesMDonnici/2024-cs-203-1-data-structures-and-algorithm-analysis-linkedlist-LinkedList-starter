# Mission

Complete the methods below in the `LinkedList` that we worked on in our class. You will find the `LinkedList` inside of the `src/main/java` folder. You will also find the tests that will run against your `LinkedList` inside of the `src/test/java` folder.

```
/** 
* Removes the first matched object and
* returns the position of the removed object
* from the LinkedList.
* 
* @param   obj  represents the object the user wants to remove
* @return       position of the removed object
*/
public int remove(Object obj) {

}

/**
* Removes the object given its position and
* returns the removed object (not Node) from the LinkedList.
* 
* @param   position  represents the position of the object
*                    to be removed
* @return            the item that was removed
*/
public Object remove(int position) {

}

/**
* Adds the object given its position in the LinkedList.
* 
* @param   obj       represents the object to be added
* @param   position  represents the position of the object
*                    to be added in the LinkedList
*/
public void add(Object obj, int position) {

}
```

# Note

Remember that a `Node` and `Object` are two different things: in our case, every `Node` contains an item (type `Object`) and a reference to another `Node`. So, to return the item (object) from the `LinkedList`, you 

1. find the `Node` which has an item that equals to the object you are looking for, then
2. you save that item in a temporary variable of type `Object`,
3. remove the found `Node` from the `LinkedList` by changing the `next` references accordingly, and finally
4. return that temporary variable where you saved the found object.
