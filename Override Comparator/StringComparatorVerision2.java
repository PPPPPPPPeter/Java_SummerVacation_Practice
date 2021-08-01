package objectsComparator;
/**
 * 
 * @author peterwong
 *目标是写一个class可以实现：
 *String xxx；
 *String bbb;
 *xxx.compareTo(bbb);
 *就可以实现比较功能
 *但是好像有些不现实
 *主要原因是没有办法写另一个名字为
 *String的类。
 */
public class StringComparatorVerision2 {
	
	private String str1;
	
	public StringComparatorVerision2 (String str1) {
		this.str1 = str1;
	}
	
	
	public boolean compareTo(String str2) {
		if (str2 == this.str1) {
			return true;
		}
		if (str2.length() != this.str1.length()) {
			return false;
		}
		else if (str2.length() != this.str1.length()) {
			int i = str1.length();
			int count = 0;
			while (count < i) {
				if (str2.charAt(count) == this.str1.charAt(count)) {
					count++;
				}
				else {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringComparatorVerision2 test = new StringComparatorVerision2("AAAA");
		System.out.println(test.compareTo("AAAA"));
		
		/*
		 * 
		 */
		StringComparatorVerision2 test2 = new StringComparatorVerision2("cc");
		System.out.println(test2.compareTo("cc"));
		
	}

}
