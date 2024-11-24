package FileSystem;

public class FileSys implements FileSystem{
    
    String fileName;

    public FileSys(String name) {
        this.fileName = name;
    }

    public void ls() {
        System.out.println("File name is " + fileName);
    }
}
