package Program.Classes;

public class Donkey extends Pack {
    
    public Donkey(int id, String name, String birthday, String commands) {
        super(id, name, birthday, commands, "Donkey");
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
        return "[Осел] ID:" + this.id + ", Имя: " + this.name + ", День рождения: " + this.birthday + ", Команды: " + this.commands;
    }

}
