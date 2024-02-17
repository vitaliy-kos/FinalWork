package Program.Classes;

public class AnimalFactory {
    
    public static HumanFriends generateAnimal(int id, String name, String birthday, String commands, String type){

        return switch (type) {
            case "Cat"      -> new Cat(id, name, birthday, commands);
            case "Dog"      -> new Dog(id, name, birthday, commands);
            case "Hamster"  -> new Hamster(id, name, birthday, commands);
            case "Camel"    -> new Camel(id, name, birthday, commands);
            case "Horse"    -> new Horse(id, name, birthday, commands);
            case "Donkey"   -> new Donkey(id, name, birthday, commands);
            default         -> new Cat(id, name, birthday, commands);
        };

    }

}
