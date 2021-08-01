public class StringComparator {
	/*
	 * 这个class主要用于写string comparator
	 */

	public String str1 = "ABCD";
	public String str2 = "Peter";
	public String str3 = "Thor";
	public String str4 = "Yuan";
	
	public boolean equals(String str1, String str2) {
		/*
		 * 先来一个if结构判断字符串的长度是否一致
		 * 如果长度都不一致的话，那么直接return false。
		 */
		if (str1.length()!=str2.length()) {
			return false;
		}
		/*需要考虑到new出来的地址一致性问题：
		 * String str5 = new String("BB");
		 * String str6 = new String("BB");
		 * 因此接下来if结构比较他们的地址是否一致：
		 */
		if (str1 == str2) {
			return true;
		}
		/*接下来如果连长度也一致的话，那么就使用.charAt()功能将
		 * 字符串转换为char类型一个个得进行比较
		 * 
		 */
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
	
	
	public static void main(String[] arg) {
		StringComparator test = new StringComparator();
		/**
		 * Object.class中的源码：
		 * 
		 * public boolean equals(Object obj) {
        		return (this == obj);
    		}
		 * 
		 * 
		 * String.class中的源码：
		 * 
		 *  public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String aString = (String)anObject;
            if (coder() == aString.coder()) {
                return isLatin1() ? StringLatin1.equals(value, aString.value)
                                  : StringUTF16.equals(value, aString.value);
            }
        }
        return false;
    }
		 * 
		 * 所以从上面的源码中可以得出
		 * String 中已经将.equals方法override过了所以也只有String的对象
		 * 可以直接调用.equals方法
		 */
		if (test.str1.equals(test.str2)) {
			
			System.out.println ("the str1 equals str2!");
		}
		else {
			System.out.println ("the str1 did not equal str2!");
		}
		/**
		 * 测试上面重写的比较器：
		 * 如下所示：
		 */
		String str5 = new String("BB");
		String str6 = new String("BB");
		System.out.println(test.equals(test.str1, test.str2));
		System.out.println("   ");
		/*
		 * 测试上面重写的比较器：
		 * 如下所示：
		 * 
		 */
		System.out.println(test.equals("AA", "AA"));
		System.out.println(test.equals("ABddddd", "ABC"));
		/*
		 * 测试上面写的地址一致性问题：
		 */
		System.out.println(test.equals(str5, str6));
	}
	
}
