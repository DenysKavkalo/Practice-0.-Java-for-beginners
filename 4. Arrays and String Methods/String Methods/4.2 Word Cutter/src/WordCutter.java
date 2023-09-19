public class WordCutter
{
    public static String cutInHalf(String a){
        String firstHalf;
        firstHalf = a.substring(0,a.length()/2);
        return firstHalf;
    }

    public static void main(String[] args) {
        System.out.println(cutInHalf("Hola mundo"));
    }
}