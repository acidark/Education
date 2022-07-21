import java.util.ArrayList;
import java.util.List;

public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        ArrayList<Person> empleados = new ArrayList<>();
        empleados.add(new Person("pedro", Education.PHD));
        empleados.add(new Person("Juan", Education.MA));
        empleados.add(new Person("John", Education.BA));
        empleados.add(new Person("sara", Education.HS));
        Employees trabajan = new Employees();
        trabajan.add(empleados);

        //trabajan.add(new Person("ury", Education.PHD));
        //trabajan.add(new Person("sara", Education.BA));

        //trabajan.print();
        //trabajan.fire(Education.PHD);
        trabajan.print(Education.PHD);
        //System.out.println(empleados);
    
    }
}
