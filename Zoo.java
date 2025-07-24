import java.util.ArrayList;
import java.util.List;

import Lib.Animal;
import Lib.Dolphin;
import Lib.Eagle;
import Lib.Flyable;
import Lib.Lion;
import Lib.Penguin;
import Lib.Swimmable;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> test = new ArrayList<>( );
        test.add(new Lion("สิงโต"));
        test.add(new Eagle("อินทรี"));
        test.add(new Penguin("เพนกวิน"));
        test.add(new Dolphin("โลมา"));

        System.out.println("------------สัตว์--------------");
        for(Animal sus : test){
            System.out.println(sus.getName());
            System.out.println(sus.makeSound());
            System.out.println("-------------------------------");
        }

        System.out.println();
        
        System.out.println("------------พลังพิเศษ--------------");
        for(Animal sus : test){
            System.out.println(sus.getName());
            if(sus instanceof Flyable){
                Flyable ability = (Flyable)sus;
                System.out.println(ability.fly());
            } else if(sus instanceof Swimmable){
                Swimmable ability = (Swimmable)sus;
                System.out.println(ability.swim());
            } else {
                System.out.println("ตัวนี้แม่งเดิน");
            }
            System.out.println("--------------------------");
        }
    }
}
