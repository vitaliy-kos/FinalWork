package Program.Classes;

public class Hamster extends Pet {
    
    public Hamster(int id, String name, String birthday, String commands) {
        super(id, name, birthday, commands, "Hamster");
    }

    @Override
    public void voice() {
        throw new UnsupportedOperationException("Unimplemented method 'voice'");
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

    @Override
    public String toString() {
        return "[Хомяк] ID:" + this.id + ", Имя: " + this.name + ", День рождения: " + this.birthday + ", Команды: " + this.commands;
    }

}
