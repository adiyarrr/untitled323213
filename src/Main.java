class Smartphone {
    String brand;
    String model;
    int batteryLevel;

    public Smartphone(String brand, String model, int batteryLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    public void displayInfo() {
        System.out.println("Smartphone: " + brand + " " + model);
        System.out.println("Battery Level: " + batteryLevel + "%");
    }


    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
}

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для отображения информации о человеке
    public void displayInfo() {
        System.out.println("Person: " + name);
        System.out.println("Age: " + age + " years old");
    }

    public void sendMessage(String message, String recipient) {
        System.out.println("Sending message to " + recipient + ": " + message);
    }
}


public class Main {
    public static void main(String[] args) {

        Smartphone myPhone = new Smartphone("Iphone", "14 Pro", 80);
        Person person = new Person("Adiyar Bekber", 18);


        myPhone.displayInfo();
        person.displayInfo();

        myPhone.makeCall("123-456-789");
        person.sendMessage("Hello, how are you?", "Friend");
    }
}
