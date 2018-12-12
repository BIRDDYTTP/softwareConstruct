package sample;

import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Vocabulary> arrayList;

    public Dictionary() {
        this.arrayList = new ArrayList<>();
    }

    public void addWord(Vocabulary vocabulary){
        arrayList.add(vocabulary);
    }

    public String wordDefine(String word){
        for (Vocabulary vocabulary : arrayList) {
            if (vocabulary.getWord().equals(word)){
                return "\"" + vocabulary.getWord() + "\"" +
                        "\nPart of speech:  " + vocabulary.getPartOfSpeech() +
                        "\nMeaning:  " + vocabulary.getMeaning() +
                        "\nExample:  " + vocabulary.getExample();
            }
        }
        return "Not have " + word + " in this Dictionary";
    }

    public ArrayList<String> getWordInDic(){
        ArrayList<String> words = new ArrayList<>();
        for (Vocabulary vocabulary : arrayList) {
            words.add(vocabulary.getWord());
        }
        return words;
    }

    public ArrayList<Vocabulary> getArrayList() {
        return arrayList;
    }
}
