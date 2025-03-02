package Constructordemo;

public class Parent {

      int id;
      String name;
      
      Parent(int id, String name){
    	  this.id = id;
    	  this.name = name;
      }
      
      void display() {
    	  System.out.println("Parent id"+ id);
    	  System.out.println("Parent name "+name);
      }
}
