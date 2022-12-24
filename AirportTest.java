import model.Plane;
import service.PlaneService;

import java.util.Arrays;

public class AirportTest {

    public static void main(String[] args) {

        PlaneService service = new PlaneService();

        Plane[] arr = {service.cratePlane(), service.cratePlane(), service.cratePlane()};

//        Plane[] arr = {
//                new Plane("mod1", "c1", 1985, 9595, true, 95555, 52, 1500000, 42, 500000),
//                new Plane("mod2", "c2", 2052, 1600, false, 1656, 14, 1500, 52, 1000),
//                new Plane("mod3", "c3", 1905, 199999, true, 160500, 42, 10000, 500, 9999)
//        };

        System.out.println("task1");
        service.task1(arr[0]);
        System.out.println("task2");
        service.task2(arr[0]);
        System.out.println("task3");
        service.task1(service.task3(arr[0], arr[1]));
        System.out.println("task4");
        service.task1(service.task4(arr[0], arr[1]));
        System.out.println("task5");
        service.task1(service.task5(arr[0], arr[1], arr[2]));
        System.out.println("task6");
        service.task6(arr);
        System.out.println("task7");
        service.task7(arr);
        System.out.println("task8");
        service.task1(service.task8(arr));
        System.out.println("task9");
        service.task1(service.task9(arr));
        System.out.println("task10");
        service.task10(arr);

        for (Plane p : arr) {
            System.out.println(2022 - p.getYear());
        }

    }
}
