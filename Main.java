public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.setFirstName("Chaitanya krishna");
        person.setLastName("Nallanukala");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getFullName());
        person.setAge(15);

        System.out.println(person.isTeen());
    }
}





















