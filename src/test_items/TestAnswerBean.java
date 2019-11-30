/*
 */
package test_items;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MP
 */
public class TestAnswerBean {
    
    private static List<String> answerList = new ArrayList<>();
    
    public static int numQuestions = 8; // Temporary.
    public static void setAnswerList() {
        
        answerList.add("Asia-South America-Africa-Antartica");
        answerList.add("Mediterranean-Indian-Caribbean-Baltic");
        answerList.add("Himalayas-Rocky Mountains-Alps-Carpathian Mountains");
        answerList.add("1912-1902-1916-1923");
        answerList.add("Avocado-Grapefruit-Orange-Apple");
        answerList.add("Charlie and the Chocolate Factory-Matilda-The Witches-The BFG");
        answerList.add("Harry Potter-Shannara-Dying Earth-Shades of Magic");
        answerList.add("Moorfield-Mile End-Mount Vernon-Maudsley");
    }
    
    public static String getAnswerList(int index) {
        
        return answerList.get(index);
    }
}
