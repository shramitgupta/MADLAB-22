class Mother {
    int x;
   
    void show(){
       System.out.println("Show() Method was called");
       
   }
}

class Child extends Mother {
   
}

class Main{
   
   public static void main(String[] args) {
       Mother m = new Mother();
       m.show();
       Child ch = new Child();
       ch.show();
   }
}