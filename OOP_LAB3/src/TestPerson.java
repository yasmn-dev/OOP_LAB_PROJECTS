public class TestPerson{
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Selim");
        p.setAge(16);

        System.out.println("Person Name: " + p.getName());
        System.out.println("Person Age: " + p.getAge());
        System.out.println("Person id: " + p.getId());
    }
}

