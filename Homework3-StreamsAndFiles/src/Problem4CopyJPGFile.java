import java.io.*;

public class Problem4CopyJPGFile {

    public static void main(String[] args) {
        try(
                BufferedInputStream bis = new BufferedInputStream(
                        new FileInputStream("resources/img.jpg"));
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream("resources/my-copied-picture.jpg"))
                ){
            byte[] buf = new byte[4096];
            while (true){
                int bytesRead =  bis.read(buf);
                if(bytesRead == - 1) {
                    break;
                }
                bos.write(buf, 0, bytesRead);
            }
        }
        catch (IOException io){
            System.err.print(io.toString());
        }
    }
}
