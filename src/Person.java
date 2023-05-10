public class Person {
   private String name;
   private String dsignation;

    public Person(String name, String dsignation) {
        this.name = name;
        this.dsignation = dsignation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDsignation() {
        return dsignation;
    }

    public void setDsignation(String dsignation) {
        this.dsignation = dsignation;
    }
    public void Learn(){
        System.out.println(getName()+" "+ " learns every day");
    }
    public void Walk(){
        System.out.println(getName()+" "+getDsignation()+" walks when they have free time");
    }
    public void Eat(){
        System.out.println(getName()+" "+getDsignation()+" loves to eat candy chocalate");
    }

    @Override
    public String toString() {
        return "Person:" +
                "name :" + name +
                ", dsignation :" + dsignation;
    }
}
