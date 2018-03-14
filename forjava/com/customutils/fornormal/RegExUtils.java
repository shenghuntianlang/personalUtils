package com.customutils.fornormal;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUtils {
    public List<String> findAll(Pattern pattern, String string) {
        Matcher matcher = pattern.matcher(string);
        List<String> result = new ArrayList<>();
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }
}
