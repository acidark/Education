public class Person {
    private String name;
    private Education education;

    public Person(String name,Education edu){
        this.name = name;
        this.education = edu;
    }
    public Education getEducation(){
        return this.education;
    }
    public String toString(){
        return this.name+", "+this.getEducation();
    }
}
