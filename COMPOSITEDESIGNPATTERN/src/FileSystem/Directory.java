package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    
    String dirName;
    List<FileSystem> list;

    public Directory(String name) {
        this.dirName = name;
        list = new ArrayList<>();
    }

    public void addFileSystem(FileSystem file) {list.add(file);}

    public void ls() {
        System.out.println("Directory name is " + dirName);
        for (FileSystem fileSystem : list) {
            fileSystem.ls();
        }
    }
}
