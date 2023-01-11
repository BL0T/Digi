import model.Animal;
import service.AnimalService;

public class Main {
    public static void main(String[] args) {

        AnimalService service = new AnimalService();

        Animal a1 = service.crateAnimal();
        Animal a2 = service.crateAnimal();
        Animal a3 = service.crateAnimal();

        service.printInfo(service.minAge(a1, a2, a3));
        service.printInfo(service.maxAge(a1, a2, a3));
        service.printInfo(service.maxWeight(a1, a2, a3));
        service.printInfo(service.minWeight(a1, a2, a3));
        service.printInfo(service.minAgePet(a1, a2, a3));
    }
}