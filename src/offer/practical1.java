package offer;
/*1.为MyString类，添加赋值运算符函数*/
public class practical1 {
	public static class MyString{
		/*MyString类的属性*/
        private String data;
        public MyString(String data) {
            this.data = data;
        }
        /*方法：赋值运算符函数*/
        public MyString assign(final MyString another){
            if(this==another || this.data.equals(another.data))
                return this;
            else{
                this.data = another.data;
                return this;
            }
        }
        /*输出*/
        public String toString() {
            return "MyString{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        MyString s1 = new MyString("a");
        MyString s2 = new MyString("b");
        MyString s3 = new MyString("c");
        System.out.println(s1.assign(s2).assign(s3));
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println("s3:" + s3);
    }
}
