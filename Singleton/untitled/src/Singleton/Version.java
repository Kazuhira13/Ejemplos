package Singleton;

public class Version {
    private final int major;
    private final int minor;
    private final int revision;

    //creamos una unica stancia
    private static final Version INSTANCE = new Version();

    private Version(){
        this.major = 1;
        this.minor = 0;
        this.revision = 0;
    }
    public static Version getInstance(){
        return INSTANCE;
    }

    @Override
    public String toString() {return  major + "." + minor + "." + revision;}
}
