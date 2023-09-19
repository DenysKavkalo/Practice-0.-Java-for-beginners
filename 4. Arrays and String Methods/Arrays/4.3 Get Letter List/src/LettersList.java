public class LettersList
{
    public static int stringLength;
    public static String[] getLettersList(String a){
        stringLength = a.length();
        String[] array = new String[stringLength];
        for (int i=0;i<stringLength;i++){
            array[i] = a.substring(i,i+1);
        }
        return array;
    }

    public static void main(String[] args) {
        String[] arrayOfStrings = getLettersList("Hola mundo");
        for (int i=0;i<arrayOfStrings.length;i++){
            System.out.println(arrayOfStrings[i]);
        }
    }
}