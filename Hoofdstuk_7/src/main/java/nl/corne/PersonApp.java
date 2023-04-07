package nl.corne;

public class PersonApp {

    public static void main(String[] args) throws ClassNotFoundException {

        Person person1 = new Person("Jan", 50);
        person1.setGender(Gender.MALE);
        Person person2 = new Person("Jan", 50);
        person2.setGender(Gender.MALE);

//        System.out.println(person1.equals(person2));

//        Person.getFields();
//        Person.getMethods();


        person1.addHistory("snoepje gejat");
        person1.addHistory("voor de rechter gekomen");
        person1.addHistory("naar de gevangenis gegaan");
        person1.addHistory("vrijgelaten");
        person1.addHistory("nooit meer een snoepje gejat");

        person1.printHistory();

        System.out.println(person1.createSubhuman().greet());
//        System.out.println(person1.getGenderDescription());
//        person1.setGender(Gender.MALE);
//        System.out.println(person1.getGenderDescription());
//        try {
//            person1.haveBirthday();
//        } catch (PersonDiedException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(person1.getAge());
//        System.out.println(Person.universalRights);
//        System.out.println(person1.greet());

//        Android android1 = new Android();

//        Employee employee1 = new Employee();
//        System.out.println(employee1.greet());
//
//        Teacher teacher1 = new Teacher();
//        teacher1.setName("Truus");
//        System.out.println(teacher1.greet());
//
//        System.out.println(teacher1.charge(20));
//        System.out.println(android1.greet());
//        android1.charge(30);
//        System.out.println(android1.greet());
    }


}
