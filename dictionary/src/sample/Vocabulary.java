package sample;

public class Vocabulary {
    private String word;
    private String partOfSpeech;
    private String meaning;
    private String example;

    public Vocabulary(String word) {
        this.word = word;
        this.partOfSpeech = "";
        this.meaning = "";
        this.example = "";
    }

    public String getWord() {
        return word;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public void setWord(String word) {
        this.word = word;
    }


    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getExample() {
        return example;
    }
}
