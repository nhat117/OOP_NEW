package WK5.Conversion;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

//Convert bracket from Allison to Ritchie
public class AllitoRitch {
    public static void main(String[] args) {

        //Check Commandlline Argumnet
        if (args.length != 2) {
            System.out.println("Argument incorrect");
            System.exit(1);
        }
        String path = args[0];
        //Create 2 file object
        File src = new File(path);
        File dest = new File(args[1]);
        //Check existence of the file
        if (!src.exists()) {
            System.out.println("file" + args[0] + "or" + args[1] + "error");
            System.exit(2);
        }
        //Try catch
        try {
            String srcString = Files.readString(Path.of(src.getPath()));
            //Using regex to replace the patter
            String pattern = "\\s+\\{";
            String replacementPattern = "{";
            //Use regex to replace the pattern with replacement pattern
            String destString = srcString.replaceAll(pattern, replacementPattern);
            //Write to a new file
            PrintWriter prt = new PrintWriter(dest);
            //Print out the content
            System.out.println(prt);
            prt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Finish conversion");
        System.exit(0);
    }
}
