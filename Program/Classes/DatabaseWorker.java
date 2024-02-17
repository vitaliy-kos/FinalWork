package Program.Classes;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class DatabaseWorker {

    String fileName = "Program/db.txt";

    public ArrayList<HumanFriends> getAllAnimals() {

        String content = this.readDatabase();
        HashMap<String, String> objData = new HashMap<>();
        ArrayList<HumanFriends> animals = new ArrayList<>();
        
        String[] array = content.lines().toArray(String[]::new);
        for (String str : array) {
            String[] obj = str.split(";");
            
            if (obj.length > 1) {

                for (String parametr : obj) {
                    String[] param = parametr.split(":");
                    objData.put(param[0], param[1]);
                }

                HumanFriends hf = AnimalFactory.generateAnimal(
                    Integer.parseInt(objData.get("id")), 
                    objData.get("name"),
                    objData.get("birthday"),
                    objData.get("commands"),
                    objData.get("type")
                );

                animals.add(hf);

            }
        }

        return animals;

    }
    
    public Boolean updateBase(ArrayList<HumanFriends> animals) {

        try (FileWriter writer = new FileWriter(fileName, false)) {

            for (HumanFriends animal : animals) {
                writer.write("id:" + (this.getLastId() + 1) + ";");
                writer.write("name:" + animal.getName() + ";");
                writer.write("type:" + animal.getType() + ";");
                writer.write("birthday:" + animal.getBirthday() + ";");
                writer.write("commands:" + animal.getCommands() + "\n");
                writer.flush();
            }

            return true;

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return false;

    }

    public int getLastId() {

        Integer lastId = 0;
        String content = this.readDatabase();
        
        String[] array = content.lines().toArray(String[]::new);
        for (String str : array) {
            String[] obj = str.split(";");
            
            for (String parametr : obj) {
                String[] param = parametr.split(":");

                if (param[0].equals("id")) {
                    
                    Integer curId = Integer.parseInt(param[1]);
                    if (curId > lastId) {
                        lastId = curId;
                    }
                }
            }
        }

        return (int)lastId;

    }

    protected String readDatabase() {

        String content = null;
        File file = new File(fileName);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return content;
    }

    



}
