import java.util.concurrent.TimeUnit;

public class file1 {

    public static file2 file2;

    public static void main(String[] args) {
        file2 = new file2();
        
        while(true) {

        file2.Deck();

        file2.Combine();

        try { TimeUnit.SECONDS.sleep(1); } 
            catch (InterruptedException e) {
                throw new RuntimeException(e);
              }
        }
    }
}
