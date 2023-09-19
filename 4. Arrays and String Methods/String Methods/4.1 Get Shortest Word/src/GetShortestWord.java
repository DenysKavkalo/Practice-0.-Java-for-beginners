public class GetShortestWord
{
    //code the method getShortestWord that accepts two words and returns the shortest one
    public static String getShortestWord(String a, String b){
        if (a.length() <= b.length()){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(getShortestWord("Hola ","Mundo"));
    }
}