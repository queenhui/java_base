package com.string;

public class E5_3 {
	

	public static void main(String[] args) {
		String str="j承176a蒙3636v关6569a照";
		char[] charArray=str.toCharArray();
		System.out.print("将字符串转为字符数组的遍历结果:");
		for(int i=0; i<charArray.length;i++) {
			if(i !=charArray.length-1) {
				System.out.print(charArray[i]+",");
			}else {
				System.out.println(charArray[i]);
			}
		}
		System.out.print("\n字符串的数字是:");
		for(char zf:charArray) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		System.out.print("\n字符串的汉字是:");
		for(char zf:charArray) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf);
			}
		}
		System.out.println("将int值转换为String类型之后的结果:"+String.valueOf(12));
		System.out.println("将字符串转换成大写之后的结果"+str.toUpperCase());
	}

}