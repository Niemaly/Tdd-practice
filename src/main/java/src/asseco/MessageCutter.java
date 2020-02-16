package src.asseco;

public class MessageCutter {

    public String solution(String message, int K) {
        if (K > message.length()-1){
            return message;
        }

        String msg1 = message.substring(0,K);
        String msg2 = message.substring(K);
        StringBuilder stringBuilder;

        if (msg1.charAt(msg1.length()-1)!= ' ' && msg2.charAt(0)!= ' '){

            msg1= msg1.substring(0,msg1.lastIndexOf(' '));

            stringBuilder = new StringBuilder(msg1);

            while (stringBuilder.charAt(stringBuilder.length()-1) == ' '){
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }

            return stringBuilder.toString();

        }else if(msg1.charAt(msg1.length()-1)== ' ' || msg2.charAt(0)==' ') {


            stringBuilder = new StringBuilder(msg1);
            while (stringBuilder.charAt(stringBuilder.length()-1) == ' '){
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }
            return stringBuilder.toString();
        }

        return message;

    }
}
