package nyc.c4q.leighdouglas;

public class Exercises {

    public static void twitterMentions(String tweet){
        String[] words = tweet.split(" ");
        String mentions = "Mentions: ";
        String hashtags = "Hashtags:";
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(word.charAt(0) == '#'){
                hashtags += word + " ";
            }else if(word.charAt(0) == '@'){
                mentions += word + " ";
            } else{
                continue; //
            }
        }
        System.out.println(mentions);
        System.out.println(hashtags);
    }

    public static void drawTriangle (int size) {
        String triangleString = "";
        for (int i = 0; i < size; i++) {
            triangleString += "#";
            System.out.println(triangleString);
        }
    }



    public static void main(String[] args) {

        drawTriangle(4);
        twitterMentions("@MMViverito @C4QNYC @PerScholas launch task force on diversity, inclusion & equity in NYC's tech sector http://bit.ly/2bcfygs #NYCCLabs");

    }

}

