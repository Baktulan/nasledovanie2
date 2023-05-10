public class Programmer extends Person {
    private String comapanyName;

    public Programmer(String name, String designation, String comapanyName) {
        super(name, designation);
        this.comapanyName = comapanyName;


    }

    public String getComapanyName() {
        return comapanyName;
    }

    public void setCoding(String comapanyName) {
        this.comapanyName = comapanyName;
    }

    public void coding() {
        System.out.println(getName()+" writes great codes");
        super.Learn();
        super.Walk();
        super.Eat();
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "comapanyName='" + comapanyName + '\'' +
                '}';
    }
}
