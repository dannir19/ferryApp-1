package pl.exercise.ferry.Voyage;

public class PassengerVoyage {

    private String name;
    private String surname;
    private int age;

    public PassengerVoyage(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PassengerVoyage{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
