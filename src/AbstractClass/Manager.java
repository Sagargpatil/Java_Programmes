/**
 * 
 */
package AbstractClass;


public interface Manager extends Admin,SrAdmin {
int id =12; // by default is public static final we cannot  put private or protected it gives CE
 abstract void m1(String name);
 String m2 (boolean flag);
}
