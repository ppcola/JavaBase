package cn.day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		String[] colors = {"♠","♥","♣","♦"};
		String[] numbers = {"3","4","5","6","7","8","10","J","Q","K","A","2"};
		
		int index = 0;
		
		for(String number:numbers) {
			for(String color : colors) {
				String poker = color.concat(number);
				hm.put(index, poker);
				array.add(index);
				index++;
				
			}
		}
		hm.put(index, "小王");
		array.add(index);
		index++;
		hm.put(index, "大王");
		array.add(index);
		
		Collections.shuffle(array);
		
		TreeSet<Integer> player1 = new TreeSet<Integer>();
		TreeSet<Integer> player2 = new TreeSet<Integer>();
		TreeSet<Integer> player3 = new TreeSet<Integer>();
		TreeSet<Integer> diPai = new TreeSet<Integer>();
		
		for(int i = 0 ;i <array.size();i++) {
			if(i>=array.size()-3) {
				diPai.add(array.get(i));
			}else if(i%3 == 0 ) {
				player1.add(array.get(i));
			}else if(i%3 == 1) {
				player2.add(array.get(i));
			}else if(i%3 == 2) {
				player3.add(array.get(i));
			}
		}
		
		
		lookPoker("player1",player1,  hm);
		lookPoker("player1",player2,  hm);
		lookPoker("player1",player3,  hm);
		
	}
	public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm ) {
		System.out.println(name+"的牌是:");
		for(Integer key:ts) {
			String value = hm.get(key);
			System.out.println(value+ " ");
			
		}
		System.out.println();
	}
}
