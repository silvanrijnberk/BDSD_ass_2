package com.company;

public class Main {

    public static void main(String[] args) {
        String[] paths_nl = {"src/data_files/NL_book_1", "src/data_files/NL_book_2", "src/data_files/NL_book_3", "src/data_files/NL_book_4", "src/data_files/NL_book_5"};
        String[] paths_en = {"src/data_files/EN_book_1", "src/data_files/EN_book_2", "src/data_files/EN_book_3", "src/data_files/EN_book_4", "src/data_files/EN_book_5"};
        Classifier classifier = new Classifier();
        for (String path: paths_nl) {
            classifier.Classify(path, "NL");
        }
        for (String path: paths_en) {
            classifier.Classify(path, "EN");
        }
        classifier.Eveluate("src/data_files/eveluate_text");
    }
}
