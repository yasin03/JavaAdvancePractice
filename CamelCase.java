package Project.Projects_03;

import java.util.Arrays;
import java.util.Locale;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */
    public static void main(String[] args) {

        String str= "I lIVe in uSa";
        String arrStr[]= str.split(" ");
        String yeniStr="";
        System.out.println(Arrays.toString(arrStr));

        for (int i=0; i<arrStr.length; i++) {

                yeniStr+=arrStr[i].substring(0,1).toUpperCase(Locale.forLanguageTag("en"))+arrStr[i].substring(1).toLowerCase(Locale.forLanguageTag("en"))+" ";
        }


        str=Arrays.toString(arrStr);
        System.out.println(yeniStr.trim());
    }


}
