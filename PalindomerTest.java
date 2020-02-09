public class PalindomerTest{
    public static void main(String args[]){
        String word = "02022020";
        
        for(int i=0, j= word.length()-1; i<(word.length()/2); i++, j-- ){
            if(word.charAt(i) != word.charAt(j)){
                 throw new RuntimeException(word + "isn't a palindomer");
             }
        }

        System.out.printf("\n The word %S is a palindomer \n", word);
    }
}