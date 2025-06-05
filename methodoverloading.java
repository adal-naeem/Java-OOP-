public class methodoverloading {
    void show() {
    System.out.println("No parameters");
}

void show(String name) {
    System.out.println("Hello " + name);
}

void show(int age, String name) {
    System.out.println(name + " is " + age + " years old");
}
    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        obj.show();
        obj.show("Adil");
        obj.show(20,"Adil");
    }

}
