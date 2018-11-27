package study;

public class DuoTaiTest {


    public static void main(String[] args) {
        DuoTaiTest duoTaiTest = new DuoTaiTest();
        duoTaiTest.func( new Animal());
        duoTaiTest.func(new Dog());
        duoTaiTest.func(new Cat());


    }

    public  void func(Animal animal){
        animal.eat();
        animal.jump();
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.shout();
        }
    }






    static class Animal{
        String name;

        public void eat(){
            System.out.println("吃");

        }
        public void jump(){
            System.out.println("跳");
        }
    }


    static class Dog extends Animal{
        String name;

        public void eat(){
            System.out.println("狗吃屎");

        }
        public void jump(){
            System.out.println("狗急跳墙");
        }
        public void shout(){
            System.out.println("老狗乱吠");
        }
    }

    static class Cat extends Animal{
        @Override
        public void eat() {
            System.out.println("猫吃鱼");
        }

        @Override
        public void jump() {
            System.out.println("猫爬树");
        }
    }


}
