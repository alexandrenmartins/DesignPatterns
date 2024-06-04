package estruturais.decorator;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        String dir = System.getProperty("user.dir");
        String file = dir + "\\src\\estruturais\\decorator\\OutputDemo.txt";
        System.out.println("DIR=" + dir);
        System.out.println("FILE=" + file);
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(file)));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource(file);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
