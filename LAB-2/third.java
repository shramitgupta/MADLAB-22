class Mother {
    void run() {
        System.out.println("hello");
    }
}

class third extends Mother {
    void run() {
        System.out.println("JUET");
    }

    public static void main(String args[]) {
        Mother b = new third();
        b.run();
    }
}