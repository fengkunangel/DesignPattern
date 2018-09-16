package com.fengkun.design_pattern.state.base2;

import java.io.IOException;
import java.util.*;

/**
 * Created by fengkunangel on 2018/9/16.
 */
public class Person {

   private Map<String, Mood> moods = new HashMap();

   private Mood currentMood;

    public Mood getCurrentMood() {
        return currentMood;
    }

    public void addMood(String moodName, Mood mood) {
       moods.put(moodName, mood);
   }

   public Person() {
       moods.put("default", new HappyMood());
   }

    //人的表现，在不同的心情下有不同的行为
    public void perform() throws IOException {
        currentMood = moods.get(getMoodName());
        if (currentMood == null) {
            currentMood = moods.get("default");
        }
        Mood currentMood_ = currentMood;
        currentMood_.perform();
    }

    private String getMoodName() throws IOException {
        Properties properties = new Properties();
        properties.load(this.getClass().getResourceAsStream("mood.properties"));
        return properties.getProperty("mood");
    }
}
