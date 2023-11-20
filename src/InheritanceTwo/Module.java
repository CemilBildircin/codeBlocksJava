package InheritanceTwo;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Module {
    ArrayList<String> files = new ArrayList<>();

    public Module(ArrayList<String> files) {
        this.files = files;
    }

    public void addFile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String file = scanner.next();
        files.add(file);
    }

    public void removeFile(File file){
        files.remove(file);
    }
}

