package petshop.simulation;

import petshop.animals.*;
import petshop.holder.HolderClass;

import java.util.Random;

public class SimulationProcess {

    public void start() throws InterruptedException {
        boolean flag = true;
        while (flag) {
            if (HolderClass.getHolderStorage().getAnimals().size() == 0) {
                System.out.println("Storage is empty!");
                flag = false;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int key = new Random().nextInt(100);
            switch (key) {
                case 1: {
                    HolderClass.getSellBuy().buy(new Cat());
                    break;
                }
                case 2: {
                    HolderClass.getSellBuy().buy(new Dog());
                    break;
                }
                case 3: {
                    HolderClass.getSellBuy().buy(new Snake());
                    break;
                }
                case 4: {
                    HolderClass.getSellBuy().buy(new Turtle());
                    break;
                }
                case 5: {
                    Cat cat = new Cat();
                    if (HolderClass.getHolderStorage().getAnimals().contains(cat)) {
                        HolderClass.getSellBuy().sell(cat);
                    }

                    break;
                }
                case 6: {
                    Dog dog = new Dog();
                    if (HolderClass.getHolderStorage().getAnimals().contains(dog)) {
                        HolderClass.getSellBuy().sell(dog);
                    }

                    break;
                }
                case 7: {
                    Snake snake = new Snake();
                    if (HolderClass.getHolderStorage().getAnimals().contains(snake)) {
                        HolderClass.getSellBuy().sell(snake);
                    }

                    break;
                }
                case 8: {
                    Turtle turtle = new Turtle();
                    if (HolderClass.getHolderStorage().getAnimals().contains(turtle)) {
                        HolderClass.getSellBuy().sell(turtle);
                    }

                    break;
                }
                case 0:
                    if (HolderClass.getHolderStorage().getAnimals().size() > 0) {
                        HolderClass.getHolderStorage().getAnimals().remove(0);
                        System.out.println("Animal was run!");
                        break;
                    }
            }
        }
    }
}

