package mainifest.chapter2;

/**
 * <p></p>
 *
 * @author Jazin
 * @version 1.0
 * @date 2024/3/13 20:27 by miaojz
 */
public class SUT {
    private String message;

    public SUT(String message) {
        this.message = message;
    }

    public SUT() {

    }

    @Override
    public String toString() {
        return "SUT{" +
                "message='" + message + '\'' +
                '}';
    }

    public void close() {
        System.out.println(getClass() + this.message);
    }

    public boolean canReceiveAdditionWork() {

        return true;
    }

    public boolean canReceiveRegularWork() {
        return false;
    }

    public String hello() {
        return "hello";
    }

    public String talk() {
        return "How are you?";
    }

    public String bye() {
        return "Bye";
    }
}
