package dubbodemo.demo.builder;


/**
 * @author wj
 * @date 2020/9/6 - 21:47
 */
public class DogBuilder implements AnimalBuilder<Dog> {

    private Dog dog = new Dog();

    public DogBuilder setName(String name) {
        dog.setName(name);
        return this;
    }

    public DogBuilder setAge(Integer age) {
        dog.setAge(age);
        return this;
    }

    public DogBuilder setColor(String color) {
        dog.setColor(color);
        return this;
    }

    @Override
    public Dog builder() {
        return dog;
    }

    public static void main(String[] args) {
        DogBuilder dogBuilder = new DogBuilder().setName("哈士奇").setAge(3).setColor("白黑色");
        Dog builder = dogBuilder.builder();
        System.out.println(builder);
    }
}
