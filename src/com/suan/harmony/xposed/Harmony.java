package com.suan.harmony.xposed;

import android.graphics.Paint;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;

public class Harmony implements IXposedHookZygoteInit {

  // Hodor
  private static final String BIAO = "婊";
  private static final String BIAO_BIAO = "\\w+";
  private static final String BIAO_BIAO_BIAO = "setText";
  private static final String BIAO_BIAO_BIAO_BIAO = "android.view.GLES20Canvas";
  private static final String BIAO_BIAO_BIAO_BIAO_BIAO = "drawText";
  private static final String HODOR_HODOR_HODOR_HOOODOOOOOR = "setHint";
  private static final int HOOODOOOR = 0;

  @Override
  public void initZygote(StartupParam startupParam) throws Throwable {

    XC_MethodHook biaoBiaoBiaoBiao = new XC_MethodHook() {
      @Override
      protected void beforeHookedMethod(MethodHookParam biaoBiaoBiao) throws Throwable {
        CharSequence biaoBiao = (CharSequence) biaoBiaoBiao.args[HOOODOOOR];
        if (biaoBiao != null) {
          try {
            int length = biaoBiao.toString().length();
            if (length < 8) {
              biaoBiaoBiao.args[HOOODOOOR] = parseName(biaoBiao.toString());
            } else if (length > 20 && length < 30) {
              // biaoBiaoBiao.args[HOOODOOOR] = "该复习了期末才考了59!!";
              biaoBiaoBiao.args[HOOODOOOR] = harmonyContent;
            } else {
              // biaoBiaoBiao.args[HOOODOOOR] = "该复习了期末才考了59!!";
              biaoBiaoBiao.args[HOOODOOOR] = parseShortContent(biaoBiao.toString());
            }
          } catch (Exception e) {
            e.printStackTrace();
            Log.e("BIAO", "exception " + e);
          }
        }
      }
    };

    findAndHookMethod(TextView.class, BIAO_BIAO_BIAO, CharSequence.class,
        TextView.BufferType.class,
        boolean.class, int.class, biaoBiaoBiaoBiao);
    findAndHookMethod(TextView.class, HODOR_HODOR_HODOR_HOOODOOOOOR, CharSequence.class,
        biaoBiaoBiaoBiao);
    findAndHookMethod(BIAO_BIAO_BIAO_BIAO, null, BIAO_BIAO_BIAO_BIAO_BIAO, String.class,
        float.class,
        float.class, Paint.class, biaoBiaoBiaoBiao);
  }

  private String parseName(String input) {
    if (input.length() >= 2) {
      String startFirst = input.substring(0, 1);
      String startFirstTwo = input.substring(0, 2);
      if (mapOne.containsKey(startFirst)) {
        return startFirst + harmonyArray[(int) (Math.random() * 12.0f)];
      } else if (mapTwo.containsKey(startFirstTwo)) {
        return startFirstTwo + harmonyArray[(int) (Math.random() * 12.0f)];
      } else {
        return input;
      }
    } else if (input.length() == 1) {
      String startFirst = input.substring(0, 1);
      if (mapOne.containsKey(startFirst)) {
        return startFirst + harmonyArray[(int) (Math.random() * 12.0f)];
      }
    }
    return input;
  }

  private String parseShortContent(String input) {
    return maoArray[(int) (Math.random() * (float) maoArray.length)] + "—— " + input;
  }

  private String parseLongContent(String input) {
    for (int i = 0; i < replacementKeyworkds.size(); i++) {
      String currentKey = replacementKeyworkds.get(i);
      if (input.contains(currentKey)) {
        input = input.replaceAll(currentKey, mapReplacement.get(currentKey));
      }
    }
    return input;
  }

  private static HashMap<String, String> mapOne = new HashMap<>();
  private static HashMap<String, String> mapTwo = new HashMap<>();
  private static HashMap<String, String> mapReplacement = new HashMap<>();
  private static List<String> replacementKeyworkds = new ArrayList<>();
  private static String harmonyContent = "";

  private static String[] harmonyArray = {
      "富强", "民主", "文明", "和谐",
      "自由", "平等", "公正", "法制",
      "爱国", "敬业", "诚信", "友善"};

  static {
    for (String content : harmonyArray) {
      harmonyContent += (content + ", ");
    }
    mapReplacement.put("绿茶", "绿茶婊");
    mapReplacement.put("心机", "心机婊");
    mapReplacement.put("苹果", "苹果婊");
    mapReplacement.put("矫情", "矫情逼");

    replacementKeyworkds.addAll(mapReplacement.keySet());

    mapOne.put("赵", "");
    mapOne.put(
        "钱", "");
    mapOne.put(
        "孙", "");
    mapOne.put(
        "李", "");
    mapOne.put(
        "周", "");
    mapOne.put(
        "吴", "");
    mapOne.put(
        "郑", "");
    mapOne.put(
        "王", "");
    mapOne.put(
        "冯", "");
    mapOne.put(
        "陈", "");
    mapOne.put(
        "褚", "");
    mapOne.put(
        "卫", "");
    mapOne.put(
        "蒋", "");
    mapOne.put(
        "沈", "");
    mapOne.put(
        "韩", "");
    mapOne.put(
        "杨", "");
    mapOne.put(
        "朱", "");
    mapOne.put(
        "秦", "");
    mapOne.put(
        "尤", "");
    mapOne.put(
        "许", "");
    mapOne.put(
        "何", "");
    mapOne.put(
        "吕", "");
    mapOne.put(
        "施", "");
    mapOne.put(
        "张", "");
    mapOne.put(
        "孔", "");
    mapOne.put(
        "曹", "");
    mapOne.put(
        "严", "");
    mapOne.put(
        "华", "");
    mapOne.put(
        "金", "");
    mapOne.put(
        "魏", "");
    mapOne.put(
        "陶", "");
    mapOne.put(
        "姜", "");
    mapOne.put(
        "戚", "");
    mapOne.put(
        "谢", "");
    mapOne.put(
        "邹", "");
    mapOne.put(
        "喻", "");
    mapOne.put(
        "柏", "");
    mapOne.put(
        "水", "");
    mapOne.put(
        "窦", "");
    mapOne.put(
        "章", "");
    mapOne.put(
        "云", "");
    mapOne.put(
        "苏", "");
    mapOne.put(
        "潘", "");
    mapOne.put(
        "葛", "");
    mapOne.put(
        "奚", "");
    mapOne.put(
        "范", "");
    mapOne.put(
        "彭", "");
    mapOne.put(
        "郎", "");
    mapOne.put(
        "鲁", "");
    mapOne.put(
        "韦", "");
    mapOne.put(
        "昌", "");
    mapOne.put(
        "马", "");
    mapOne.put(
        "苗", "");
    mapOne.put(
        "凤", "");
    mapOne.put(
        "花", "");
    mapOne.put(
        "方", "");
    mapOne.put(
        "俞", "");
    mapOne.put(
        "任", "");
    mapOne.put(
        "袁", "");
    mapOne.put(
        "柳", "");
    mapOne.put(
        "酆", "");
    mapOne.put(
        "鲍", "");
    mapOne.put(
        "史", "");
    mapOne.put(
        "唐", "");
    mapOne.put(
        "费", "");
    mapOne.put(
        "廉", "");
    mapOne.put(
        "岑", "");
    mapOne.put(
        "薛", "");
    mapOne.put(
        "雷", "");
    mapOne.put(
        "贺", "");
    mapOne.put(
        "倪", "");
    mapOne.put(
        "汤", "");
    mapOne.put(
        "滕", "");
    mapOne.put(
        "殷", "");
    mapOne.put(
        "罗", "");
    mapOne.put(
        "毕", "");
    mapOne.put(
        "郝", "");
    mapOne.put(
        "邬", "");
    mapOne.put(
        "安", "");
    mapOne.put(
        "常", "");
    mapOne.put(
        "乐", "");
    mapOne.put(
        "于", "");
    mapOne.put(
        "时", "");
    mapOne.put(
        "傅", "");
    mapOne.put(
        "皮", "");
    mapOne.put(
        "卞", "");
    mapOne.put(
        "齐", "");
    mapOne.put(
        "康", "");
    mapOne.put(
        "伍", "");
    mapOne.put(
        "余", "");
    mapOne.put(
        "元", "");
    mapOne.put(
        "卜", "");
    mapOne.put(
        "顾", "");
    mapOne.put(
        "孟", "");
    mapOne.put(
        "平", "");
    mapOne.put(
        "黄", "");
    mapOne.put(
        "和", "");
    mapOne.put(
        "穆", "");
    mapOne.put(
        "萧", "");
    mapOne.put(
        "尹", "");
    mapOne.put(
        "姚", "");
    mapOne.put(
        "邵", "");
    mapOne.put(
        "湛", "");
    mapOne.put(
        "汪", "");
    mapOne.put(
        "祁", "");
    mapOne.put(
        "毛", "");
    mapOne.put(
        "禹", "");
    mapOne.put(
        "狄", "");
    mapOne.put(
        "米", "");
    mapOne.put(
        "贝", "");
    mapOne.put(
        "明", "");
    mapOne.put(
        "臧", "");
    mapOne.put(
        "计", "");
    mapOne.put(
        "伏", "");
    mapOne.put(
        "成", "");
    mapOne.put(
        "戴", "");
    mapOne.put(
        "谈", "");
    mapOne.put(
        "宋", "");
    mapOne.put(
        "茅", "");
    mapOne.put(
        "庞", "");
    mapOne.put(
        "熊", "");
    mapOne.put(
        "纪", "");
    mapOne.put(
        "舒", "");
    mapOne.put(
        "屈", "");
    mapOne.put(
        "项", "");
    mapOne.put(
        "祝", "");
    mapOne.put(
        "董", "");
    mapOne.put(
        "梁", "");
    mapOne.put(
        "杜", "");
    mapOne.put(
        "阮", "");
    mapOne.put(
        "蓝", "");
    mapOne.put(
        "闵", "");
    mapOne.put(
        "席", "");
    mapOne.put(
        "季", "");
    mapOne.put(
        "麻", "");
    mapOne.put(
        "强", "");
    mapOne.put(
        "贾", "");
    mapOne.put(
        "路", "");
    mapOne.put(
        "娄", "");
    mapOne.put(
        "危", "");
    mapOne.put(
        "江", "");
    mapOne.put(
        "童", "");
    mapOne.put(
        "颜", "");
    mapOne.put(
        "郭", "");
    mapOne.put(
        "梅", "");
    mapOne.put(
        "盛", "");
    mapOne.put(
        "林", "");
    mapOne.put(
        "刁", "");
    mapOne.put(
        "钟", "");
    mapOne.put(
        "徐", "");
    mapOne.put(
        "邱", "");
    mapOne.put(
        "骆", "");
    mapOne.put(
        "高", "");
    mapOne.put(
        "夏", "");
    mapOne.put(
        "蔡", "");
    mapOne.put(
        "田", "");
    mapOne.put(
        "樊", "");
    mapOne.put(
        "胡", "");
    mapOne.put(
        "凌", "");
    mapOne.put(
        "霍", "");
    mapOne.put(
        "虞", "");
    mapOne.put(
        "万", "");
    mapOne.put(
        "支", "");
    mapOne.put(
        "柯", "");
    mapOne.put(
        "昝", "");
    mapOne.put(
        "管", "");
    mapOne.put(
        "卢", "");
    mapOne.put(
        "莫", "");
    mapOne.put(
        "柯", "");
    mapOne.put(
        "房", "");
    mapOne.put(
        "裘", "");
    mapOne.put(
        "缪", "");
    mapOne.put(
        "干", "");
    mapOne.put(
        "解", "");
    mapOne.put(
        "应", "");
    mapOne.put(
        "宗", "");
    mapOne.put(
        "丁", "");
    mapOne.put(
        "宣", "");
    mapOne.put(
        "贲", "");
    mapOne.put(
        "邓", "");
    mapOne.put(
        "郁", "");
    mapOne.put(
        "单", "");
    mapOne.put(
        "杭", "");
    mapOne.put(
        "洪", "");
    mapOne.put(
        "包", "");
    mapOne.put(
        "诸", "");
    mapOne.put(
        "左", "");
    mapOne.put(
        "石", "");
    mapOne.put(
        "崔", "");
    mapOne.put(
        "吉", "");
    mapOne.put(
        "钮", "");
    mapOne.put(
        "龚", "");
    mapOne.put(
        "程", "");
    mapOne.put(
        "嵇", "");
    mapOne.put(
        "邢", "");
    mapOne.put(
        "滑", "");
    mapOne.put(
        "裴", "");
    mapOne.put(
        "陆", "");
    mapOne.put(
        "荣", "");
    mapOne.put(
        "翁", "");
    mapOne.put(
        "荀", "");
    mapOne.put(
        "羊", "");
    mapOne.put(
        "于", "");
    mapOne.put(
        "惠", "");
    mapOne.put(
        "甄", "");
    mapOne.put(
        "曲", "");
    mapOne.put(
        "家", "");
    mapOne.put(
        "封", "");
    mapOne.put(
        "芮", "");
    mapOne.put(
        "羿", "");
    mapOne.put(
        "储", "");
    mapOne.put(
        "靳", "");
    mapOne.put(
        "汲", "");
    mapOne.put(
        "邴", "");
    mapOne.put(
        "糜", "");
    mapOne.put(
        "松", "");
    mapOne.put(
        "井", "");
    mapOne.put(
        "段", "");
    mapOne.put(
        "富", "");
    mapOne.put(
        "巫", "");
    mapOne.put(
        "乌", "");
    mapOne.put(
        "焦", "");
    mapOne.put(
        "巴", "");
    mapOne.put(
        "弓", "");
    mapOne.put(
        "牧", "");
    mapOne.put(
        "隗", "");
    mapOne.put(
        "山", "");
    mapOne.put(
        "谷", "");
    mapOne.put(
        "车", "");
    mapOne.put(
        "侯", "");
    mapOne.put(
        "宓", "");
    mapOne.put(
        "蓬", "");
    mapOne.put(
        "全", "");
    mapOne.put(
        "郗", "");
    mapOne.put(
        "班", "");
    mapOne.put(
        "仰", "");
    mapOne.put(
        "秋", "");
    mapOne.put(
        "仲", "");
    mapOne.put(
        "伊", "");
    mapOne.put(
        "宫", "");
    mapOne.put(
        "宁", "");
    mapOne.put(
        "仇", "");
    mapOne.put(
        "栾", "");
    mapOne.put(
        "暴", "");
    mapOne.put(
        "甘", "");
    mapOne.put(
        "钭", "");
    mapOne.put(
        "历", "");
    mapOne.put(
        "戎", "");
    mapOne.put(
        "祖", "");
    mapOne.put(
        "武", "");
    mapOne.put(
        "符", "");
    mapOne.put(
        "刘", "");
    mapOne.put(
        "景", "");
    mapOne.put(
        "詹", "");
    mapOne.put(
        "束", "");
    mapOne.put(
        "龙", "");
    mapOne.put(
        "叶", "");
    mapOne.put(
        "幸", "");
    mapOne.put(
        "司", "");
    mapOne.put(
        "韶", "");
    mapOne.put(
        "郜", "");
    mapOne.put(
        "黎", "");
    mapOne.put(
        "蓟", "");
    mapOne.put(
        "溥", "");
    mapOne.put(
        "印", "");
    mapOne.put(
        "宿", "");
    mapOne.put(
        "白", "");
    mapOne.put(
        "怀", "");
    mapOne.put(
        "蒲", "");
    mapOne.put(
        "邰", "");
    mapOne.put(
        "从", "");
    mapOne.put(
        "鄂", "");
    mapOne.put(
        "索", "");
    mapOne.put(
        "咸", "");
    mapOne.put(
        "籍", "");
    mapOne.put(
        "赖", "");
    mapOne.put(
        "卓", "");
    mapOne.put(
        "蔺", "");
    mapOne.put(
        "屠", "");
    mapOne.put(
        "蒙", "");
    mapOne.put(
        "池", "");
    mapOne.put(
        "乔", "");
    mapOne.put(
        "阳", "");
    mapOne.put(
        "郁", "");
    mapOne.put(
        "胥", "");
    mapOne.put(
        "能", "");
    mapOne.put(
        "苍", "");
    mapOne.put(
        "双", "");
    mapOne.put(
        "闻", "");
    mapOne.put(
        "莘", "");
    mapOne.put(
        "党", "");
    mapOne.put(
        "翟", "");
    mapOne.put(
        "谭", "");
    mapOne.put(
        "贡", "");
    mapOne.put(
        "劳", "");
    mapOne.put(
        "逄", "");
    mapOne.put(
        "姬", "");
    mapOne.put(
        "申", "");
    mapOne.put(
        "扶", "");
    mapOne.put(
        "堵", "");
    mapOne.put(
        "冉", "");
    mapOne.put(
        "宰", "");
    mapOne.put(
        "郦", "");
    mapOne.put(
        "雍", "");
    mapOne.put(
        "却", "");
    mapOne.put(
        "璩", "");
    mapOne.put(
        "桑", "");
    mapOne.put(
        "桂", "");
    mapOne.put(
        "濮", "");
    mapOne.put(
        "牛", "");
    mapOne.put(
        "寿", "");
    mapOne.put(
        "通", "");
    mapOne.put(
        "边", "");
    mapOne.put(
        "扈", "");
    mapOne.put(
        "燕", "");
    mapOne.put(
        "冀", "");
    mapOne.put(
        "浦", "");
    mapOne.put(
        "尚", "");
    mapOne.put(
        "农", "");
    mapOne.put(
        "温", "");
    mapOne.put(
        "别", "");
    mapOne.put(
        "庄", "");
    mapOne.put(
        "晏", "");
    mapOne.put(
        "柴", "");
    mapOne.put(
        "瞿", "");
    mapOne.put(
        "阎", "");
    mapOne.put(
        "充", "");
    mapOne.put(
        "慕", "");
    mapOne.put(
        "连", "");
    mapOne.put(
        "茹", "");
    mapOne.put(
        "习", "");
    mapOne.put(
        "宦", "");
    mapOne.put(
        "艾", "");
    mapOne.put(
        "鱼", "");
    mapOne.put(
        "容", "");
    mapOne.put(
        "向", "");
    mapOne.put(
        "古", "");
    mapOne.put(
        "易", "");
    mapOne.put(
        "慎", "");
    mapOne.put(
        "戈", "");
    mapOne.put(
        "廖", "");
    mapOne.put(
        "庾", "");
    mapOne.put(
        "终", "");
    mapOne.put(
        "暨", "");
    mapOne.put(
        "居", "");
    mapOne.put(
        "衡", "");
    mapOne.put(
        "步", "");
    mapOne.put(
        "都", "");
    mapOne.put(
        "耿", "");
    mapOne.put(
        "满", "");
    mapOne.put(
        "弘", "");
    mapOne.put(
        "匡", "");
    mapOne.put(
        "国", "");
    mapOne.put(
        "文", "");
    mapOne.put(
        "寇", "");
    mapOne.put(
        "广", "");
    mapOne.put(
        "禄", "");
    mapOne.put(
        "阙", "");
    mapOne.put(
        "东", "");
    mapOne.put(
        "欧", "");
    mapOne.put(
        "殳", "");
    mapOne.put(
        "沃", "");
    mapOne.put(
        "利", "");
    mapOne.put(
        "蔚", "");
    mapOne.put(
        "越", "");
    mapOne.put(
        "夔", "");
    mapOne.put(
        "隆", "");
    mapOne.put(
        "师", "");
    mapOne.put(
        "巩", "");
    mapOne.put(
        "厍", "");
    mapOne.put(
        "聂", "");
    mapOne.put(
        "晁", "");
    mapOne.put(
        "勾", "");
    mapOne.put(
        "敖", "");
    mapOne.put(
        "融", "");
    mapOne.put(
        "冷", "");
    mapOne.put(
        "訾", "");
    mapOne.put(
        "辛", "");
    mapOne.put(
        "阚", "");
    mapOne.put(
        "那", "");
    mapOne.put(
        "简", "");
    mapOne.put(
        "饶", "");
    mapOne.put(
        "空", "");
    mapOne.put(
        "曾", "");
    mapOne.put(
        "毋", "");
    mapOne.put(
        "沙", "");
    mapOne.put(
        "乜", "");
    mapOne.put(
        "养", "");
    mapOne.put(
        "鞠", "");
    mapOne.put(
        "须", "");
    mapOne.put(
        "丰", "");
    mapOne.put(
        "巢", "");
    mapOne.put(
        "关", "");
    mapOne.put(
        "蒯", "");
    mapOne.put(
        "相", "");
    mapOne.put(
        "查", "");
    mapOne.put(
        "后", "");
    mapOne.put(
        "荆", "");
    mapOne.put(
        "红", "");
    mapOne.put(
        "游", "");
    mapOne.put(
        "竺", "");
    mapOne.put(
        "权", "");
    mapOne.put(
        "逮", "");
    mapOne.put(
        "盍", "");
    mapOne.put(
        "益", "");
    mapOne.put(
        "桓", "");
    mapOne.put(
        "公", "");
    mapOne.put(
        "万俟", "");
    mapTwo.put(
        "司马", "");
    mapTwo.put(
        "上官", "");
    mapTwo.put(
        "欧阳", "");
    mapTwo.put(
        "夏侯", "");
    mapTwo.put(
        "诸葛", "");
    mapTwo.put(
        "闻人", "");
    mapTwo.put(
        "东方", "");
    mapTwo.put(
        "赫连", "");
    mapTwo.put(
        "皇甫", "");
    mapTwo.put(
        "尉迟", "");
    mapTwo.put(
        "公羊", "");
    mapTwo.put(
        "澹台", "");
    mapTwo.put(
        "公冶", "");
    mapTwo.put(
        "宗政", "");
    mapTwo.put(
        "濮阳", "");
    mapTwo.put(
        "淳于", "");
    mapTwo.put(
        "单于", "");
    mapTwo.put(
        "太叔", "");
    mapTwo.put(
        "申屠", "");
    mapTwo.put(
        "公孙", "");
    mapTwo.put(
        "仲孙", "");
    mapTwo.put(
        "轩辕", "");
    mapTwo.put(
        "令狐", "");
    mapTwo.put(
        "徐离", "");
    mapTwo.put(
        "宇文", "");
    mapTwo.put(
        "长孙", "");
    mapTwo.put(
        "慕容", "");
    mapTwo.put(
        "司徒", "");
    mapTwo.put(
        "司空", "");
    mapTwo.put(
        "亓官", "");
    mapTwo.put(
        "司寇", "");
    mapTwo.put(
        "仉督", "");
    mapTwo.put(
        "子车", "");
    mapTwo.put(
        "颛孙", "");
    mapTwo.put(
        "端木", "");
    mapTwo.put(
        "巫马", "");
    mapTwo.put(
        "公西", "");
    mapTwo.put(
        "漆雕", "");
    mapTwo.put(
        "乐正", "");
    mapTwo.put(
        "壤驷", "");
    mapTwo.put(
        "公良", "");
    mapTwo.put(
        "拓拔", "");
    mapTwo.put(
        "夹谷", "");
    mapTwo.put(
        "宰父", "");
    mapTwo.put(
        "谷梁", "");
    mapTwo.put(
        "晋楚", "");
    mapTwo.put(
        "闫法", "");
    mapTwo.put(
        "汝鄢", "");
    mapTwo.put(
        "涂钦", "");
    mapTwo.put(
        "段干", "");
    mapTwo.put(
        "百里", "");
    mapTwo.put(
        "东郭", "");
    mapTwo.put(
        "南门", "");
    mapTwo.put(
        "呼延", "");
    mapTwo.put(
        "归海", "");
    mapTwo.put(
        "羊舌", "");
    mapTwo.put(
        "微生", "");
    mapTwo.put(
        "岳帅", "");
    mapTwo.put(
        "缑亢", "");
    mapTwo.put(
        "况后", "");
    mapTwo.put(
        "有琴", "");
    mapTwo.put(
        "梁丘", "");
    mapTwo.put(
        "左丘", "");
    mapTwo.put(
        "东门", "");
    mapTwo.put(
        "西门", "");
    mapTwo.put(
        "商牟", "");
    mapTwo.put(
        "佘佴", "");
    mapTwo.put(
        "伯赏", "");
    mapTwo.put(
        "南宫", "");
  }

  static String[] maoArray = {
      "不管风吹浪打,胜似闲庭信步",
      "不打无准备之战。",
      "不是东风压倒西风,就是西风压倒东风",
      "不到长城非好汉",
      "榜样的力量是无穷的",
      "兵民是胜利之本。",
      "把别人的经验变成自己的,他的本事就大了。",
      "彻底的唯物主义是无所畏惧的",
      "陈毅是个好同志,他对zg革命和世界革命所作的贡献,是已经下了结论的。",
      "打得赢就打,打不赢就走。",
      "党外无党,帝王思想,党内无派,千奇百怪.",
      "戴高乐上台也有好处，他喜欢跟英美闹别扭",
      "敌进我退,敌驻我扰,敌疲我打,敌退我追 ",
      "敌人一天天烂下去,我们一天天好起来 ",
      "敌人有的，我们要有，敌人没有的，我们也要有。原子弹要有，氢弹也要快。管他什么国，管他什么弹，原子弹、氢弹，我们都要超过。",
      "多少事，从来急，天地转，光阴迫，一万年太久，只争朝夕。 ",
      "帝国主义是纸老虎",
      "对立统一规律是宇宙的根本规律。",
      "夺取全国胜利这只是万里长征走完了第一步.",
      "另起炉灶,打扫干净屋子再请客,一边倒",
      "二十年后，法国人将有一番大大的头痛",
      "发展体育运动,增强人民体质",
      "凡是敌人反对的，我们就要拥护；凡是敌人拥护的，我们就要反对。",
      "妇女要顶半边天",
      "搞一点原子弹、氢弹、洲际导弹，我看十年完全可能",
      "高峡出平湖",
      "革命不是请客吃饭，不是做文章，不是绘画绣花，不能那样雅致，那样从容不迫，“文质彬彬”，那样“温良恭俭让”。革命就是暴动，是一个阶级推翻一个阶级的暴烈的行动。",
      "高贵者最愚蠢,卑贱者最聪明! ",
      "古为今用,洋为中用,百花齐放,推陈出新",
      "国共和谈谈拢的希望一丝一毫也没有",
      "核潜艇一万年也要搞出来",
      "核战争打不起来",
      "好好学习，天天向上",
      "孩儿立志出乡关，学不成名誓不还",
      "基本粒子也是可分的",
      "教育者必须先受教育",
      "加强纪律性,革命无不胜。",
      "决定战争胜负的是人,而不是物",
      "老人知事百事通",
      "牢骚太盛防肠断,风物长宜放眼量。",
      "历史是人民创造的。",
      "历史的发展是不以人的意志为转移的",
      "农村是一个广阔的天地,在那里是可以大有作为的",
      "农村包围城市,武装夺取政权",
      "路线是个纲,纲举目张",
      "罗斯福将会使美国参加二战",
      "马克思主义的道理千条万续，归根结底就是一句话，造反有理！",
      "没有调查就没有发言权",
      "没有文化的军队是愚蠢的军队……",
      "没有资产,就是最大的资产。",
      "没有正确的政治观点,就等于没有灵魂。",
      "美帝国主义想打多久,我们就打多久!",
      "美国可能对zg实行和平演变",
      "南下是没有出路的，我相信，一年之后，你们会回来的",
      "哪里有压迫,哪里就有反抗",
      "你办事，我放心"
  };
}
