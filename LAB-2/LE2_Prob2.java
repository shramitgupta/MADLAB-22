class Mother {
    int x;
   
    int show(){
       System.out.println("Hello World");
       return 0;    
   }
}

class Child extends Mother {
   int show(){
       System.out.println("Hello JUET");
       return 0;
   }
}

class Main{
   
   public static void main(String[] args) {
       Mother m = new Mother();
       m.show();
       Child ch = new Child();
       ch.show();
   }
}