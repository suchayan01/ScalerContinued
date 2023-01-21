public class lambo {
    public String create(){
        return new CarFactory().toString();
    }

    public static void main(String[] args) {
        System.out.println(new lambo().create());
    }

}
