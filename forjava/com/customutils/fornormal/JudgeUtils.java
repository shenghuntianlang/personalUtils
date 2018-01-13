package com.customutils.fornormal;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

public class JudgeUtils {
    public static Object judgeJsonIsNull(JSONObject infoJson, String key) throws JSONException {
        return infoJson.isNull(key) ? "暂无" : infoJson.get(key);
    }
}
