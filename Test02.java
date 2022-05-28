import java.util.*;
public class Test02 {
    public static void main(String[] args) {
        String[] str = new String[3];
        input(str);
        print(str);
        sort(str);
        print(str);
    }
    //输入函数
    public static void input(String[] str) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个字符串:");
        for(int i=0;i<str.length;i++) {
            str[i] = sc.nextLine();
        }
        sc.close();
    }
    //输出函数
    public static void print(String[] str) {
        for(int i=0;i<str.length;i++) {
            System.out.print(str[i]+" ");
        }
        System.out.println();
    }
    //排序函数
    public static void sort(String[] str) {
        for(int i=0;i<str.length-1;i++) {
            for(int j=i+1;j<str.length;j++) {
                if(str[i].compareTo(str[j])>0)
                    swap(str,i,j);
            }
        }
    }
    //交换函数
    public static void swap(String[] str,int i,int j) {
        String s=str[i];
        str[i]=str[j];
        str[j]=s;
    }
}

