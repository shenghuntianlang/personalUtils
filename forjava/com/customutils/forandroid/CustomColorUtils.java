package com.customutils.fornormal;

import android.graphics.Color;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2018/2/13.
 */

public class CustomColorUtils {
    private Map<String, String> colorStringHashMap;

    public CustomColorUtils() {
        putCustomColorData();
    }

    private void putCustomColorData() {
        colorStringHashMap = new HashMap<>();
        colorStringHashMap.put("白色", "#FFFFFF");
        colorStringHashMap.put("红色", "#FF0000");
        colorStringHashMap.put("绿色", "#00FF00");
        colorStringHashMap.put("蓝色", "#0000FF");
        colorStringHashMap.put("牡丹红", "#FF00FF");
        colorStringHashMap.put("青色", "#00FFFF");
        colorStringHashMap.put("黄色", "#FFFF00");
        colorStringHashMap.put("黑色", "#000000");
        colorStringHashMap.put("海蓝", "#70DB93");
        colorStringHashMap.put("巧克力色", "#5C3317");
        colorStringHashMap.put("蓝紫色", "#9F5F9F");
        colorStringHashMap.put("黄铜色", "#B5A642");
        colorStringHashMap.put("亮金色", "#D9D919");
        colorStringHashMap.put("棕色", "#A67D3D");
        colorStringHashMap.put("青铜色", "#8C7853");
        colorStringHashMap.put("2号青铜色", "#A67D3D");
        colorStringHashMap.put("士官服蓝色", "#5F9F9F");
        colorStringHashMap.put("冷铜色", "#D98719");
        colorStringHashMap.put("铜色", "#B87333");
        colorStringHashMap.put("珊瑚红", "#FF7F00");
        colorStringHashMap.put("紫蓝色", "#42426F");
        colorStringHashMap.put("深棕", "#5C4033");
        colorStringHashMap.put("深绿", "#2F4F2F");
        colorStringHashMap.put("深铜绿色", "#4A766E");
        colorStringHashMap.put("深橄榄绿", "#4F4F2F");
        colorStringHashMap.put("深兰花色", "#9932CD");
        colorStringHashMap.put("深紫色", "#871F78");
        colorStringHashMap.put("深石板蓝", "#6B238E");
        colorStringHashMap.put("深铅灰色", "#2F4F4F");
        colorStringHashMap.put("深棕褐色", "#97694F");
        colorStringHashMap.put("深绿松石色", "#7093DB");
        colorStringHashMap.put("暗木色", "#855E42");
        colorStringHashMap.put("淡灰色", "#545454");
        colorStringHashMap.put("土灰玫瑰红色", "#856363");
        colorStringHashMap.put("长石色", "#D19275");
        colorStringHashMap.put("火砖色", "#8E2323");
        colorStringHashMap.put("森林绿", "#238E23");
        colorStringHashMap.put("金色", "#CD7F32");
        colorStringHashMap.put("鲜黄色", "#DBDB70");
        colorStringHashMap.put("灰色", "#C0C0C0");
        colorStringHashMap.put("铜绿色", "#527F76");
        colorStringHashMap.put("青黄色", "#93DB70");
        colorStringHashMap.put("猎人绿", "#215E21");
        colorStringHashMap.put("印度红", "#4E2F2F");
        colorStringHashMap.put("土黄色", "#9F9F5F");
        colorStringHashMap.put("浅蓝色", "#C0D9D9");
        colorStringHashMap.put("浅灰色", "#A8A8A8");
        colorStringHashMap.put("浅钢蓝色", "#8F8FBD");
        colorStringHashMap.put("浅木色", "#E9C2A6");
        colorStringHashMap.put("石灰绿色", "#32CD32");
        colorStringHashMap.put("桔黄色", "#E47833");
        colorStringHashMap.put("褐红色", "#8E236B");
        colorStringHashMap.put("中海蓝色", "#32CD99");
        colorStringHashMap.put("中蓝色", "#3232CD");
        colorStringHashMap.put("中森林绿", "#6B8E23");
        colorStringHashMap.put("中鲜黄色", "#EAEAAE");
        colorStringHashMap.put("中兰花色", "#9370DB");
        colorStringHashMap.put("中海绿色", "#426F42");
        colorStringHashMap.put("中石板蓝色", "#7F00FF");
        colorStringHashMap.put("中春绿色", "#7FFF00");
        colorStringHashMap.put("中绿松石色", "#70DBDB");
        colorStringHashMap.put("中紫红色", "#DB7093");
        colorStringHashMap.put("中木色", "#A68064");
        colorStringHashMap.put("深藏青色", "#2F2F4F");
        colorStringHashMap.put("海军蓝", "#23238E");
        colorStringHashMap.put("霓虹蓝", "#4D4DFF");
        colorStringHashMap.put("霓虹粉红", "#FF6EC7");
        colorStringHashMap.put("新深藏青色", "#00009C");
        colorStringHashMap.put("新棕褐色", "#EBC79E");
        colorStringHashMap.put("暗金黄色", "#CFB53B");
        colorStringHashMap.put("橙色", "#FF7F00");
        colorStringHashMap.put("橙红色", "#FF2400");
        colorStringHashMap.put("淡紫色", "#DB70DB");
        colorStringHashMap.put("浅绿色", "#8FBC8F");
        colorStringHashMap.put("粉红色", "#BC8F8F");
        colorStringHashMap.put("李子色", "#EAADEA");
        colorStringHashMap.put("石英色", "#D9D9F3");
        colorStringHashMap.put("艳蓝色", "#5959AB");
        colorStringHashMap.put("鲑鱼色", "#6F4242");
        colorStringHashMap.put("猩红色", "#BC1717");
        colorStringHashMap.put("海绿色", "#238E68");
        colorStringHashMap.put("半甜巧克力色", "#6B4226");
        colorStringHashMap.put("赭色", "#8E6B23");
        colorStringHashMap.put("银色", "#E6E8FA");
        colorStringHashMap.put("天蓝", "#3299CC");
        colorStringHashMap.put("石板蓝", "#007FFF");
        colorStringHashMap.put("艳粉红色", "#FF1CAE");
        colorStringHashMap.put("春绿色", "#00FF7F");
        colorStringHashMap.put("钢蓝色", "#236B8E");
        colorStringHashMap.put("亮天蓝色", "#38B0DE");
        colorStringHashMap.put("棕褐色", "#DB9370");
        colorStringHashMap.put("紫红色", "#D8BFD8");
        colorStringHashMap.put("石板蓝色", "#ADEAEA");
        colorStringHashMap.put("浓深棕色", "#5C4033");
        colorStringHashMap.put("淡浅灰色", "#CDCDCD");
        colorStringHashMap.put("紫罗兰色", "#4F2F4F");
        colorStringHashMap.put("紫罗兰红色", "#CC3299");
        colorStringHashMap.put("麦黄色", "#D8D8BF");
        colorStringHashMap.put("黄绿色", "#99CC32");
    }

    public int getColorWithInteger(String alpha, String key) {
        String s = new StringBuilder(colorStringHashMap.get(key)).insert(1, alpha).toString();
        Log.i("color", s);
        return Color.parseColor(s);
    }

    public Map<String, String> getColorStringHashMap() {
        return colorStringHashMap;
    }

    public void setColorStringHashMap(Map<String, String> colorStringHashMap) {
        this.colorStringHashMap = colorStringHashMap;
    }
}
