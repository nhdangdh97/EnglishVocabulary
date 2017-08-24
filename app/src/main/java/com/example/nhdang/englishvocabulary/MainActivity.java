package com.example.nhdang.englishvocabulary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nhdang.englishvocabulary.controllers.TopicManager;
import com.example.nhdang.englishvocabulary.models.Topic;
import com.example.nhdang.englishvocabulary.models.Vocabulary;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopicManager topicManager = new TopicManager();
        topicManager.load();

        ArrayList<Topic> topics = topicManager.getTopicList();
        for (Topic topic : topics) {
            System.out.println(topic.toString());
        }
    }
}
