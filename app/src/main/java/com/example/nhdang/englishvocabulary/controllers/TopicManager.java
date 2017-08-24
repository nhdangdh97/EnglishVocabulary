package com.example.nhdang.englishvocabulary.controllers;

import com.example.nhdang.englishvocabulary.models.Topic;
import com.example.nhdang.englishvocabulary.models.Vocabulary;

import java.util.ArrayList;

/**
 * Created by nhdan on 8/23/2017.
 */

public class TopicManager {

    private ArrayList<Topic> mTopicList;
    private ArrayList<Vocabulary> mVocabularyList;

    public TopicManager() {
        mTopicList = new ArrayList<>();
        mVocabularyList = new ArrayList<>();
    }

    public void load() {
        //fake data
        fakeData();
    }

    private void fakeData() {
        mTopicList.add(new Topic(1, "Topic 1"));
        mTopicList.add(new Topic(2, "Topic 2"));
        mTopicList.add(new Topic(3, "Topic 3"));

        mVocabularyList.add(new Vocabulary("Vocab11", "Pro11", "Mean11", 1));
        mVocabularyList.add(new Vocabulary("Vocab12", "Pro12", "Mean12", 1));
        mVocabularyList.add(new Vocabulary("Vocab21", "Pro21", "Mean21", 2));
        mVocabularyList.add(new Vocabulary("Vocab22", "Pro22", "Mean22", 2));
    }

    public ArrayList<Topic> getTopicList() {
        return mTopicList;
    }

    public ArrayList<Vocabulary> getVocabularyList(Topic topic) {
        ArrayList<Vocabulary> list = new ArrayList<>();
        for (Vocabulary vocabulary : mVocabularyList) {
            if (vocabulary.getTopicId() == topic.getId()) {
                list.add(vocabulary);
            }
        }
        return list;
    }
}
