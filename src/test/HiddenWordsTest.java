package test;

import main.HiddenWords;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HiddenWordsTest {

    HiddenWords hiddenWords;

    @Before
    public void initialize(){
        hiddenWords = new HiddenWords();
    }

    @Test
    public void negative_numbers_should_return_empty(){
        Assert.assertEquals("", hiddenWords.decodeWord(-1));
    }

    @Test
    public void decode_word_should_return_a_word(){
        Assert.assertEquals("a", hiddenWords.decodeWord(6));
        Assert.assertEquals("tbe", hiddenWords.decodeWord(514));
        Assert.assertEquals("leanmind", hiddenWords.decodeWord(24689387));
    }
}
