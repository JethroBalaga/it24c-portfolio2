
package Abstract_color_lab_exercise;

public class Dog extends Pet {

    String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public void Color() {
        System.out.println(name + " is a black Dog");
    }
}