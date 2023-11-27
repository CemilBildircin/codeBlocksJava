package InheritanceTwo;

public class File {
    String fileName;
    double size;

    public File(String name, double size) {
        this.fileName = fileName;
        this.size = size;

    }
    public void openFile(){
        System.out.println("Opening " + fileName);
    }

    @Override
    public String toString() {
        return "File" +
                "\n\tFile Name: " + fileName +
                "\n\tSize: " + size;
    }
}
