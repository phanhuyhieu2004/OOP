package bai4;

import java.util.Random;

public class Apple {
    private int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isEmpty() {
        return weight <= 0;
    }

    public void decreaseApple() {
        if (isEmpty()) {
            System.out.println("Táo đã hết rồi");
        } else {
            weight--;
        }
    }
}

 class Human {
    private String name;
    private int gender;
    private int weight;

    public Human(String name, int gender, int weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isMale() {
        return gender == 1;
    }

    public String getGender() {
        return isMale() ? "Male" : "Female";
    }

    public void say(String string) {
        System.out.println(string);
    }

    public boolean checkApple(Apple apple) {
        return apple.isEmpty();
    }

    public void eat(Apple apple) {
        if (apple.getWeight() > 0) {
            apple.decreaseApple();
            weight++;
        } else {
            System.out.println("Táo đã hết");
        }
    }

    public void getInfo() {
        System.out.println(name + " " + weight + " " + getGender());
    }
}

class Show {
    public static void main(String[] args) {
        Human adam = new Human("Adam", 1, 65);
        Human eva = new Human("Eva", 2, 55);
        Apple apple_1 = new Apple(10);

        adam.say("I am Adam");
        eva.say("I am Eva");

        Random rand = new Random();
        while (!apple_1.isEmpty()) {
            System.out.println("Adam ăn táo");
            adam.eat(apple_1);
            System.out.println("Quả táo còn:");
            System.out.println(apple_1.getWeight() + " đơn vị");
            System.out.println("Cân nặng của Adam là: " + adam.getWeight() + " đơn vị");

            System.out.println();

            System.out.println("Eva ăn táo");
            eva.eat(apple_1);
            System.out.println("Quả táo còn:");
            System.out.println(apple_1.getWeight() + " đơn vị");
            System.out.println("Cân nặng của Eva là: " + eva.getWeight() + " đơn vị");

            System.out.println();

            try {
                Thread.sleep(rand.nextInt(2000) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
