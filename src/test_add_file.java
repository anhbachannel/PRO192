import java.util.Scanner;

public class test_add_file {
public static void main(String[] args) {
	int a, b;
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	if(a>b) {
		System.out.println("a lớn hơn b");
	}else {
		System.out.println("a bé hơn hoặc bằng b");
	}
}
}
