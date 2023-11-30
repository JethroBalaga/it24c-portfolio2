
package Abstract_color_lab_exercise;
public class Cat extends Pet {

    String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public void Color() {
        System.out.println(name + " is an orange Cat");
    }

}