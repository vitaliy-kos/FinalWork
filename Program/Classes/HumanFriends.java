package Program.Classes;

import Program.Interfaces.Eat;
import Program.Interfaces.Sleep;
import Program.Interfaces.Voice;

public abstract class HumanFriends implements Voice, Sleep, Eat {
    protected int id;
    protected String name;
    protected String birthday;
    protected String commands;
    protected String type;

    public HumanFriends(int id, String name, String birthday, String commands, String type) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCommands() {
        return commands;
    }

    public String getType() {
        return type;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }


}
