package nl.corne;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class Person extends Human implements Chargeable {


    public final static String universalRights = "All humans are created equal.";
    private static final int MAX_AGE = 130;
    private String name;
    private int age;
    private Gender gender;
    private int energy = 50;
    private HistoryRecord[] histories = new HistoryRecord[10];

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.UNKNOWN;
    }

    public Person() {
        this("anoniem", 25);
    }

    private class HistoryRecord {
        String description;

        public HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return this.description;
        }
    }

    public void addHistory(String descr) {
        for (int i = 0; i < histories.length; i++) {
            if (histories[i] == null) {
                histories[i] = new HistoryRecord(descr);
                return;
            }
        }
    }

    public void printHistory() {
        for (int i = 0; i < histories.length; i++) {
            if (histories[i] == null) {
                return;
            }
            System.out.println(histories[i].toString());
        }
    }

    public Human createSubhuman() {
        return new Human() {
            @Override
            public String greet() {
                return "Sub is the best...";
            }
        };
    }

    @Override
    public String greet() {
        return "Hello, my name is " + this.getName() + ". Nice to meet you!";
    }

    public boolean isMaxAge() {
        if (this.age > MAX_AGE) {
            return true;
        } else {
            return false;
        }
    }

    public void haveBirthday() throws PersonDiedException {
        setAge(++this.age);
    }

    public String getGenderDescription() {
        return gender.getDescription();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getEnergy() {
        return energy;
    }

    public void setAge(int age) throws PersonDiedException {
        if (isMaxAge()) {
            throw new PersonDiedException("Your person died");
        }
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HistoryRecord getHistories(int index) {
        return histories[index];
    }

    @Override
    public int charge(int amount) {
        energy += amount;
        return this.energy;
    }

    @Override
    public String toString() {
        return name + " (" + age + ") is " + getGenderDescription();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    public static void getFields() {
        Field fields[] = Person.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field name: " + field.getName());
        }
    }

    public static void getMethods() throws ClassNotFoundException {
        Method methods[] = Class.forName("nl.corne.Person").getMethods();
        for (Method method : methods) {
            System.out.println("method name: " + method.getName());
        }
    }


}
