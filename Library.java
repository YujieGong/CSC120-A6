/* This is a stub for the Library class */
import java.util.Hashtable;
/**
  * extend the building class and add attributes
  */
public class Library extends Building{
  private Hashtable<String, Boolean> collection;
  /**
   * initialize the attributes of the Cafe object
   */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }
 /**
   * add book to the object
   */
    public void addTitle(String title){
      this.collection.put(title, true);
      System.out.println("The book that is added is" + title);
    }
  /**
   * remove book from the object collection
   * @return title of the book
   */
    public String removeTitle(String title){
      this.collection.remove(title, true);
      return title;
    }
  /**
   * change the value to the false when check out
   */ 
    public void checkOut(String title){
      this.collection.replace(title, false);
    }
  /**
   * change the value to the true when return the book
   */ 
    public void Return(String title){
      this.collection.replace(title, true);
    }
  /**
   * returns true if the title appears as a key in the Libary's collection, false otherwise
   * @return true/false
   */ 

    public boolean containsTitle(String title){
      return this.collection.containsKey(title);
    }
 /**
   * returns true if the title is currently available, false otherwise
   * @return true/false
   */ 

    public boolean isAvailable(String title){
      return this.collection.get(title);
      
    }
  /**
   * print out the entire collection
   */ 

    public void printCollection(){
      System.out.println(this.collection);
    }


    public static void main(String[] args) {
      Library neilson = new Library("neilson library", "smith college", 5);
      System.out.println(neilson);
      neilson.printCollection();
    }
  
  }