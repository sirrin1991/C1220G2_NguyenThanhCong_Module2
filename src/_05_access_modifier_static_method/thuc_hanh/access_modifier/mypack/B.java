package _05_access_modifier_static_method.thuc_hanh.access_modifier.mypack;
import _05_access_modifier_static_method.thuc_hanh.access_modifier.mypackk.A;
//public class B {
//    public static void main(String args[]){
//
//        A obj = new A();//Compile Time Error
//
//        obj.msg();//Compile Time Error
//
//    }
//}
//class B extends A{
//
//    public static void main(String args[]){
//
//        B obj = new B();
//
//        obj.msg();
//
//    }
//
//}
class B{

    public static void main(String args[]){

        A obj = new A();

        obj.msg();

    }

}