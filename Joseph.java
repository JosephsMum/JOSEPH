import java.util.Random;

public class Joseph {
    private final String[] vocabulary = new String[]{"Damn that's crazy bro", "You should drink more", "How you doin bro?", "fr on god no cap", "bro that sucks ass"};

    public String speak() {
        int i = (new Random()).nextInt(5);
        return vocabulary[i];
    }

}