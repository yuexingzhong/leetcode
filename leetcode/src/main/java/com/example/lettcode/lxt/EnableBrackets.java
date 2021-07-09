package com.example.lettcode.lxt;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2021/7/9 17:00
 * Version：1.0.0
 */
public class EnableBrackets {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     * <p>
     * 有效字符串需满足：
     * <p>
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     *
     * @param args
     */
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));

    }


    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Deque<Character> stack = new LinkedList<Character>() {{
        }};
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) stack.push(c);
            else if (map.get(stack.poll()) != c) return false;
        }
        return stack.size() == 0;

    }

    private static final Map<Character, Character> map = new HashMap<Character, Character>() {{
        put('{', '}');
        put('[', ']');
        put('(', ')');
        put('?', '?');
    }};
}
