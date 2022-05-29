class Mother {
    void run() {
        System.out.println("Hello JUET");
    }
}

class second extends Mother {
    public static void main(String args[]) {
        second obj = new second();
        obj.run();
    }
}