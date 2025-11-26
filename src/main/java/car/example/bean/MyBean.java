package car.example.bean;

public class MyBean {
    private String name;

    public void setName(String name) {
        this.name =  name;
    }

    public void showMessage(){
        System.out.println("Name "+name);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
