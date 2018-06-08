package example;

/**
 * TODO: Javadoc
 */
public class Something {
    private String someString;
    private Integer someInteger;
    private Boolean someBoolean;
    private SomethingElse somethingElse;

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(final String someString) {
        this.someString = someString;
    }

    public Integer getSomeInteger() {
        return someInteger;
    }

    public void setSomeInteger(final Integer someInteger) {
        this.someInteger = someInteger;
    }

    public Boolean getSomeBoolean() {
        return someBoolean;
    }

    public void setSomeBoolean(final Boolean someBoolean) {
        this.someBoolean = someBoolean;
    }

    public SomethingElse getSomethingElse() {
        return somethingElse;
    }

    public void setSomethingElse(final SomethingElse somethingElse) {
        this.somethingElse = somethingElse;
    }

    @Override
    public String toString() {
        return "Something{" +
               "someString='" + someString + '\'' +
               ", someInteger=" + someInteger +
               ", someBoolean=" + someBoolean +
               ", somethingElse=" + somethingElse +
               '}';
    }
}
