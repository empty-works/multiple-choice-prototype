/*
 */
package test_items;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MP
 */
public class TestQuestionBean {
    
    private static List<String> questionList = new ArrayList<>();
    
    public static List<String> getQuestionList() {
        
        questionList.add("By area, which is the largest continent on the planet?");
        questionList.add("Cyprus is an island in which sea?");
        questionList.add("The K2 mountain of Pakistan is situated in which mountain riange?");
        questionList.add("In which year did the Titanic sink during its' maiden voyage?");
        questionList.add("In the US it's known as an 'alligator pear', what's it known as in the UK?");
        questionList.add("Which Roald Dahl book begins 'These two very old people are the father and mother of Mr. Bucket'?");
        questionList.add("The 'Peverell brothers' and Peter Pettigrew exist in which series of books?");
        questionList.add("Which 'M' is Britain's leading hospital specialising in eye injuries?");
        return questionList;
    }
}
