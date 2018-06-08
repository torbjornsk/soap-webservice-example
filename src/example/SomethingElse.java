package example;

/**
 * TODO: Javadoc
 */
public class SomethingElse {
    private String someOtherString;

    public String getSomeOtherString() {
        return someOtherString;
    }

    public void setSomeOtherString(final String someOtherString) {
        this.someOtherString = someOtherString;
    }

    @Override
    public String toString() {
        return "SomethingElse{" +
               "someOtherString='" + someOtherString + '\'' +
               '}';
    }
}
