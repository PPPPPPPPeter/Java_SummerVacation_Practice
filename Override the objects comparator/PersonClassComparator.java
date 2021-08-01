package objectsComparator;
/**
 * 
 * @author peterwong
 *this class is used to practice the complicated 
 *objects comparator 
 *主要是使用了递归的方法实现的
 *通用比较器应该是很难实现的啦！！！
 *此处先写一个person class comparator！
 *
 */

public class PersonClassComparator {
	
	Person a;
	
	public PersonClassComparator(Person a) {
		this.a = a;
	}
	
	public boolean compareTo(Person b) {
		if (this.a == b) {
			return true;
		}
		boolean compareName = this.compareTwoStrings(this.a.getName(), b.getName());
		boolean compareSexy = this.compareTwoStrings(this.a.getSexy(), b.getSexy());
		boolean comparePC = this.compareTwoStrings(this.a.getPC().getBrand(), b.getPC().getBrand());
		
		if (compareName == false || compareSexy == false || comparePC == false) {
			return false;
		}
		if (this.a.getAge() != b.getAge()) {
			return false;
		}
		return true;
	}
	/*
	 * 接下来复习并重写一下string的比较器
	 * 
	 * 日常使用.equals或者dry原则直接继承或者组装就行！
	 */
	
	public boolean compareTwoStrings(String str1, String str2){
		if (str1.length()!=str2.length()) {
			return false;
		}
		if (str1 == str2) {
			return true;
		}
		else if (str1.length()==str2.length()){
			int i = str1.length();
			int count = 0;
			while (count<i) {
				if (str1.charAt(count) == str2.charAt(count)) {
					count++;
				}
				else {
					return false;
				}
			}
		}
		return true;
	}
}
