package Lab2;

interface PassangersAuto {
    void transportPassangers();
}
interface CargoAuto {
    void transportCargo();
}
class Sedan implements PassangersAuto {
    public void transportPassangers() {
        System.out.println("Р’РµР·Сѓ РїР°СЃСЃР°Р¶РёСЂРѕРІ");
    }
}
class Pickup implements CargoAuto, PassangersAuto {
    public void transportCargo() {
        System.out.println("Р’РµР·Сѓ РіСЂСѓР·");
    }
class Truck implements CargoAuto {
    public void transportCargo() {
        System.out.println("Р’РµР·Сѓ РіСЂСѓР·");
    }
}

    public void transportPassangers() {
        System.out.println("Р’РµР·Сѓ РїР°СЃСЃР°Р¶РёСЂРѕРІ");
    }
}
public class Interface {
    public static void main(String[] args) {
        System.out.println("This is truck:");
        Truck truck = new Truck();
        truck.transportCargo();
        System.out.println("This is sedan:");
        Sedan sedan = new Sedan();
        sedan.transportPassangers();
        System.out.println("This is pickup:");
        Pickup pickup = new Pickup();
        pickup.transportCargo();
        pickup.transportPassangers();
    }
}
