package mainifest.chapter2;

/**
 * <p></p>
 *
 * @author Jazin
 * @version 1.0
 * @date 2024/3/13 20:26 by miaojz
 */
public class ResourceForAllTests {

   private String message;

   public ResourceForAllTests(String message) {
      this.message = message;
   }

   @Override
   public String toString() {
      return "ResourceForAllTests{" +
              "message='" + message + '\'' +
              '}';
   }

   public void close() {
      System.out.println(getClass() + this.message);
   }
}
