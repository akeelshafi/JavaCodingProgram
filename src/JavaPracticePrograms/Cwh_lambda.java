package JavaPracticePrograms;

@FunctionalInterface
interface Animal2{
    void bark1();

}
public class Cwh_lambda {
    public static void main(String[] args) {
//       Animal2 dog = new Animal2() {
//           @Override
//           public void bark1() {
//               System.out.println("I am a dog");
//           }
//       };
//        dog.bark1();

        Animal2 dog = ()->{System.out.println("I am a dog");};
        dog.bark1();
    }
}
