package cn.day10;
/**
 * 输出“helloworld”
 * @author xi
 *
 */
interface Inter{ void show();}
class Outer{
     static Inter method(){
         return new Inter(){
             public void show(){
                 System.out.println("Hello World");
             }
         };
     }
     }

public class OuterDemo{
    public static void main(String[] args){
        Outer.method().show();
    }
}