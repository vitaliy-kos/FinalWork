package Program.View;

import java.util.ArrayList;
import java.util.Scanner;

import Program.Classes.AnimalFactory;
import Program.Classes.HumanFriends;

public class View {

    static Scanner input = new Scanner(System.in);
    
    public static Integer startMenu(){

        System.out.print("-------------\nВы находитесь в главном меню нашего питомника! \n 1 -> Посмотреть список всех животных\n 2 -> Добавить животное в базу\nВведите в консоль номер команды, которую вы хотите исполнить: ");
        Integer userChoice = Integer.parseInt(input.next());

        return userChoice;
    }

    public static Integer watchListAnimalsMenu(ArrayList<HumanFriends> animals){

        System.out.println("-------------\nСписок зарегистрированных животных:");
        if (animals.size() > 0) {
            for (HumanFriends hf : animals) {
                System.out.println(hf);
            }
        } else {
            System.out.println("!!! Животные еще не созданы");
        }

        System.out.print("-------------\nВведите:\nid -> Чтобы перейти в профиль животного\n0  -> Вернуться в главное меню\nВведите в консоль номер команды, которую вы хотите исполнить: ");
        Integer userChoice = input.nextInt();

        return userChoice;
    }

    public static Integer showAnimalMenu(HumanFriends animal){

        System.out.println("-------------\nИнформация о животном\nID: " + animal.getId() + "\nТип: " + animal.getType() + "\nДР: " + animal.getBirthday() + "\nКомманды: " + animal.getCommands());
        System.out.print("-------------\nВведите:\n1 -> Чтобы добавить команду животному\n0 -> Вернуться в главное меню\nВведите в консоль номер команды, которую вы хотите исполнить: ");
        Integer userChoice = input.nextInt();

        return userChoice;
    }

    public static String showAddCommandAnimalMenu() {

        System.out.print("-------------\nДопишите через запятую какие еще команды умеет выполнять животное: ");
        String userInput = input.next();

        return userInput;
    }

    public static HumanFriends createAnimalMenu(Integer id) {

        Integer type = Integer.parseInt(prompt("Введите номер типа создаваемого животного(1-Cat, 2-Dog, 3-Hamster, 4-Camel, 5-Horse, 6-Donkey): "));
        String name = prompt("Введите имя животного: ");
        String birth = prompt("Введите дату рождения животного(в формате ГГГГ-MM-ДД): ");
        String commands = promptWords("Введите через запятую команды выполняемые животным: ");
        
        String typeStr = "";
        switch (type) {
            case 1 -> typeStr = "Cat";
            case 2 -> typeStr = "Dog";
            case 3 -> typeStr = "Hamster";
            case 4 -> typeStr = "Camel";
            case 5 -> typeStr = "Horse";
            case 6 -> typeStr = "Donkey";
        };

        HumanFriends hf = AnimalFactory.generateAnimal( id, name, birth, commands, typeStr);

        return hf;

    }

    private static String prompt(String message){
        System.out.print(message);
        return input.next();
    }

    private static String promptWords(String message){
        System.out.print(message);
        input.skip("[\r\n]+");
        return input.nextLine();
    }
}
