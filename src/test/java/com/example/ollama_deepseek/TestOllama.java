package com.example.ollama_deepseek;

import org.junit.jupiter.api.Test;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * TestOllama
 * @author d3y1
 */
@SpringBootTest
//@SpringBootTest(classes = OllamaDeepseekApplication.class)
public class TestOllama {

    @Autowired
    private OllamaChatModel ollamaChatModel;

    @Test
    public void testChatModel() {
        // String prompt = "请将以下英文翻译成中文：";
        String prompt = "请将以下莎士比亚十四行诗翻译成中文：";

        // String message = "Trump says US tariffs on EU will happen, but tells BBC a UK deal 'could be worked out'";
        // 英国威廉·莎士比亚创作的十四行诗《你的长夏永不凋谢》
        String message = "Shall I compare thee to a summer's day?\n" +
                "Thou art more lovely and more temperate.\n" +
                "Rough winds do shake the darling buds of May,\n" +
                "And summer's lease hath all too short a date.\n" +
                "Sometime too hot the eye of heaven shines,\n" +
                "And often is his gold complexion dimm'd;\n" +
                "And every fair from fair sometime declines,\n" +
                "By chance or nature's changing course untrimm'd;\n" +
                "But thy eternal summer shall not fade,\n" +
                "Nor lose possession of that fair thou ow'st;\n" +
                "Nor shall Death brag thou wand'rest in his shade,\n" +
                "When in eternal lines to time thou grow'st:\n" +
                "So long as men can breathe or eyes can see,\n" +
                "So long lives this, and this gives life to thee.";

        String result = ollamaChatModel.call(prompt + " " + message);
        System.out.println(result);
    }
}