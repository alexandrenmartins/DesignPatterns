package criacionais.abstractFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static ClientApplication configureApplication() {
        ClientApplication app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new ClientApplication(factory);
        return app;
    }

    public static void main(String[] args) {
        ClientApplication app = configureApplication();
        app.paint();
    }

}
