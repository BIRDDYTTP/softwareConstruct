import java.io.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        File file = new File(System.getProperty("java.class.path")+ "test.txt");

        try {
            String cwd = System.getProperty("user.dir");
            try{
                System.out.println("Create new file : "+file.createNewFile());
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter writer = new BufferedWriter(fileWriter);

                writer.write((new Date().toString()) + ">>" +cwd);
                writer.newLine();
                writer.close();

            }
            catch (IOException e){
                e.printStackTrace();
            }

            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                String line = "";
                while ((line = reader.readLine()) != null){
                    System.out.println(line);
                }
                reader.close();

            } catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (EOFException e){
                e.printStackTrace();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
