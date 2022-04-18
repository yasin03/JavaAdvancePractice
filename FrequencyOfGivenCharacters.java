package interviewQuestions6;

public class Q01_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */
    public static void main(String[] args) {
        String str = "AAABBCDDD";
        frekans(str);
    }

    private static void frekans(String str) {

        String output = "";
        for (int i = 0; i <str.length() ; i++){
            int sayac = 0;
            for (int j = i; j < str.length(); j++){
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)){
                    sayac++;
                }
            }
            if (!output.contains(str.substring(i,i+1))){
                output+=str.charAt(i)+""+sayac;
            }
        }
        System.out.println(output);
    }
}
