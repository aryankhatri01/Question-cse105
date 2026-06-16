package Config_Loader;

import java.io.*;

public class ConfigLoader {

    public static void main(String[] args) {

        File file = new File("config.txt");

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(file));

            System.out.println("Config loaded.");
            br.close();

        } catch (FileNotFoundException e) {

            try {

                BufferedWriter bw =
                        new BufferedWriter(
                                new FileWriter(file));

                bw.write("username=admin");
                bw.newLine();
                bw.write("theme=light");

                bw.close();

                System.out.println(
                        "Default config created.");

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
