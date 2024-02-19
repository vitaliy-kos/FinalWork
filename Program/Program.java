package Program;

import Program.Classes.*;
import Program.View.View;

import java.util.ArrayList;

public class Program {

    static DatabaseWorker DatabaseWorker = new DatabaseWorker();

    public static void main(String[] args) {

        ArrayList<HumanFriends> animals = DatabaseWorker.getAllAnimals();

        while (true) {
            Integer userChoice = View.startMenu();

            if (userChoice == 1) {
                Integer uc = View.watchListAnimalsMenu(animals);
                if (uc > 0) {
                    Integer found = null;

                    for (HumanFriends animal : animals) {
                        if (uc == animal.getId()) {
                            found = uc;
                            Integer ucShowAnimal = View.showAnimalMenu(animal);
                            if (ucShowAnimal == 1) {
                                String newCommand = View.showAddCommandAnimalMenu();
                                animal.setCommands(animal.getCommands() + ", " + newCommand);
                                DatabaseWorker.updateBase(animals);
                                System.out.println("Данные успешно обновлены.");
                            }
                        }
                    }

                    if (found == null) System.out.println("!!! Животное с таким ID отcутствует в базе!");
                }

            } else if (userChoice == 2) {

                try (Counter counter = new Counter()) {
                    HumanFriends newAnimal = View.createAnimalMenu(DatabaseWorker.getLastId());
                    animals.add(newAnimal);
                    counter.add();
                    DatabaseWorker.updateBase(animals);
                    System.out.println("-------------\nЖивотное успешно добавлено в систему.");
                } catch (Exception e) {
                    System.out.println(e);
                } 
                
            } else {
                System.out.println("-------------\n!!! Указана недействительная команда!");
            }


        }
        
    }
    
}
