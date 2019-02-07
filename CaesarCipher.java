public class CaesarCipher {
    public static String encryptCaesarCipher(String plaintext, int offset){

        String s ="";

        if(offset >=26)
            offset = offset - 26;

        else{

            for(int i = 0; i < plaintext.length();i++) {

                if(plaintext.charAt(i) != ' '){
                    int chNum = plaintext.charAt(i);
                    int num = chNum+offset;
                    char ch = (char) num;

                    s+=ch;

                }
                else{
                    s += " ";
                }

            }




       }

        return s;
    }
}
