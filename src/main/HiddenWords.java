package main;

public class HiddenWords {

    public String decodeWord(int number){

        String decryptedWord = "";
        String numberString = Integer.toString(number);

        if(number > 0){
            for(int i=0; i < numberString.length(); i++){
                decryptedWord = decryptedWord.concat(decodeLetter(numberString.charAt(i)));
            }
            return decryptedWord;
        }
        return "";
    }

    String[] numberValues = new String[]{"o","b","l","i","e","t","a","d","n","m"};

    private String decodeLetter(char number){
        for(int i=0; i < numberValues.length; i++){
            if(i == Integer.parseInt(String.valueOf(number))){
                return numberValues[i];
            }
        }
        return String.valueOf(number);
    }
}
