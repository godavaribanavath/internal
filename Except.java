public class Except{
    public static void main(String args[]){
          int i=0;
          try{
                int j=5/i;
          }
          catch(ArithmeticException ar){
            System.out.println(" arithmetic exception occured yah!"+ar);
          }
           catch(ArrayIndexOutOfBoundsException a){
            System.out.println("array index out of bound exception occured yah!"+a);
          }
           catch(NullPointerException n){
            System.out.println("null pointer exception occured yah!"+n);
          }
          catch(Exception e){
            System.out.println("exception occured yah!"+e);
          }
          
          

    }
    
}
