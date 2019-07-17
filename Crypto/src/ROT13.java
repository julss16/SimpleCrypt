import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    public int rotation;

    ROT13(Character cs, Character cf) {

        this.rotation= cf-cs;
    }

    ROT13() {
        this.rotation= 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {

        s= "";
        for(int i=0; i < s.length(); i++){
            c= s.charAt(i);
            if(c >= 'a' && c<= 'm'){
                c+= 13;
            }else if(c >= 'A' && c<= 'M'){
                c+=13;
            }else if (c >= 'n' && c <= 'z'){
                c -= 13;
            }else if(c >= 'N' && c <= 'Z'){
                c -= 13;
            }
        }

        return s;
    }

}
