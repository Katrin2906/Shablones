package Fasade;

public class Fasade {
    public static void main(String[] args) {
        NewStart newStart = new NewStart();
        newStart.newStart();

    }
}

class NewStart {
    Car car = new Car();
    Engine engine = new Engine();
    Starter starter = new Starter();

    void newStart() {
        car.start();
        engine.hasStart();
        starter.findEngine(engine);
    }
}

class Car {
    void start() {
        System.out.println("Машина едет");
    }

    void stop() {
        System.out.println("Машина не едет");
    }
}

class Engine {
    private boolean start = true;

    public boolean hasStart() {
        return start;
    }

    void load() {
        start = true;
    }

    void unload() {
        start = false;
    }
}

class Starter {
    void findEngine(Engine engine) {
        if (engine.hasStart()) {
            System.out.println("Поехали");
        } else {
            System.out.println("Заводимся");
        }
    }

}


