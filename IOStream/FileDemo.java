import java.io.File;
import java.util.Date;

class FileDemo {
    public static void main(String[] args) {
        File f = new File("FileDemo.java");

        System.out.println("File exists: " + f.exists());
        System.out.println("Is a file: " + f.isFile());
        System.out.println("Is a directory: " + f.isDirectory());
        System.out.println("Is writable: " + f.canWrite());
        System.out.println("Is readable: " + f.canRead());
        System.out.println("File path: " + f.getPath());
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("File length: " + f.length() + " bytes");
        System.out.println("Parent directory: " + f.getParent());
        System.out.println("Last modified: " + new Date(f.lastModified()));
        System.out.println("File name: " + f.getName());
    }
}
