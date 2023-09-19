public class Sheep
{
    public static int count = 0; //don't set as private for internal reasons

    //code the constructor so that every time a Sheep is instantiated, it adds 1 to the count
    public Sheep(){
        count += 1;
    }

    public static void main(String[] args){
        Sheep sheep1 = new Sheep();
        Sheep sheep2 = new Sheep();
        Sheep sheep3 = new Sheep();
        Sheep sheep4 = new Sheep();
        System.out.println(count);
    }
}
