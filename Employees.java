import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Employees {
    private ArrayList<Person> Employees;
    public Employees(){
        this.Employees = new ArrayList<>();
    }
    public void add(Person person){
        this.Employees.add(person);
    }
    public void add(List<Person> peopleToAdd){
        Iterator<Person> person = peopleToAdd.iterator();
        while(person.hasNext()){
            this.Employees.add(person.next());
        }
    }
    public void print(){
        //this.Employees.stream().forEach(s->{System.out.println(s);});
        Iterator<Person> persons = this.Employees.iterator();
        while(persons.hasNext()){
            System.out.println(persons.next());
        }
    }
    public void print(Education edu){
        Iterator<Person> persons = this.Employees.iterator();
        while(persons.hasNext()){
            Person persona = persons.next();
            if(persona.getEducation()==edu){
                //System.out.println(thi);
                System.out.println(persona);
            }
        }
        //this.Employees.stream().filter(s->s.getEducation()==edu).forEach(s->{System.out.println(s);});
    }

    public void fire(Education edu){
        Iterator<Person> persons = this.Employees.iterator();
        while(persons.hasNext()){
            if(persons.next().getEducation()== edu){
                persons.remove();
            }
        }
    }
}
