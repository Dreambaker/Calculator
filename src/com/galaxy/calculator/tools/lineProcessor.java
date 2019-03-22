package com.galaxy.calculator.tools;
import com.galaxy.calculator.beans.romanNum;
import com.galaxy.calculator.beans.goods;
import com.galaxy.calculator.beans.orders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lineProcessor {
   private List<goods> goods; //goods_spec
   private HashMap<String,String> relations;

   public lineProcessor() {
      goods = new ArrayList<>();
      relations = new HashMap<>();
   }

   public void processLine(String line) {

      if (line.startsWith("how many Credits is")) {
         String subLine = line.substring(20, line.length() - 2);
         String[] names = subLine.split(" ");
         String roman = alienWordsToRoman(subLine, this.relations);
         String goods_name = names[names.length - 1];
         goods goods_in = new goods();
         for (goods goods_spec : goods) {
            if (goods_spec.getName().equals(goods_name)) {
               goods_in = goods_spec;
            }
         }
         HashMap<goods, Integer> goods_map = new HashMap();
         goods_map.put(goods_in, new romanNum(roman).getarabic());
         System.out.println(subLine + goods_in.getName() + " is " + new orders(goods_map).getTotalCredits() + " Credits");
      }

      else if (line.startsWith("how much is")) {
         String subLine = line.substring(12);
         String roman = alienWordsToRoman(subLine, this.relations);

         System.out.println(line.substring(12, line.length() - 1) + "is " + new romanNum(roman).getarabic());
      }

      else if (line.contains("is") && !line.contains("Credits")) {
         String[] names = line.split(" ");
         relations.put(names[0], names[2]);
      }

      else if (!line.startsWith("how many Credits is") && line.contains("is") && line.contains("Credits")) {
         String[] names = line.split(" ");
         String roman = "";
         for (int i = 0; i < names.length; i++) {
            if (names[i].equals("is")) {
               goods goods_spec = new goods(names[i - 1], Integer.parseInt(names[i + 1]) / new romanNum(roman).getarabic());
               goods.add(goods_spec);
               break;
            } else if (!names[i + 1].equals("is")) {
               roman += relations.get(names[i]);
            }
         }
      }

      else {
         System.out.println("I don't know what you are talking about.");
      }
   }

   private static String alienWordsToRoman(String words, HashMap relations){

      String[] names = words.split(" ");
      String roman = "";

      for (int i = 0; i < names.length; i++) {
         roman += relations.get(names[i]);
      }
      return roman;
   }
}

