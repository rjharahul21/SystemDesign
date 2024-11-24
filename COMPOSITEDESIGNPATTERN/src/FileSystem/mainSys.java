package FileSystem;

public class mainSys {
    
    public static void main(String[] args) throws Exception{
        System.out.println("This is good.");

        FileSys file = new FileSys("Rahul.pdf");
        Directory folder = new Directory("CV_folder");
        FileSys file2 = new FileSys("CV.pdf");
        folder.addFileSystem(file2);

        file.ls();
        folder.ls();
    }
}
