package Delegator;

public class Delegator {
    public static void main(String[] args) {
        Healing healing=new Healing();
        healing.setDoctor(new Surgeon());
        healing.heal();
        healing.setDoctor(new Therapist());
        healing.heal();
        healing.setDoctor(new Homeopathist());
        healing.heal();
    }

}

interface Doctor {
    void heal();
}

class Surgeon implements Doctor {
    public void heal() {
        System.out.println("Make an operation!");
    }
}

class Therapist implements Doctor {
    public void heal() {
        System.out.println("Give a pill!");
    }
}

class Homeopathist implements Doctor {
    public void heal() {
        System.out.println("It will pass by itself...");
    }
}

class Healing {//делегируем ему атрибут общий и создаем метод для доступа к каждому классу
    Doctor doctor;

    void setDoctor(Doctor d) {//метод мутатор
        doctor = d;
    }

    void heal() {
        doctor.heal();
    }
}