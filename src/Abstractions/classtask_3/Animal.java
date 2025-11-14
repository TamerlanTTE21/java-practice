package Abstractions.classtask_3;

abstract class Animal {
    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public void printInfo() {
        System.out.println(name);
        makeSound();
    }

}
