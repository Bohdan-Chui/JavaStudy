package FirstLection;

public class Model {

    private String sentence;

    // The Program logic

    public String getSentence() {
        return sentence;
    }
    public void setFirstWord(String word) {
        this.sentence = word;
    }
    public void setSecondWord(String word) {
        this.sentence += word;
    }
}
