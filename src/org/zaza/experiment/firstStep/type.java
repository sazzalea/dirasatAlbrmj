public class type {
	public static void main(String []arg) {
		byte b; //1 byte --> 2^8  --> -128 to 127
		short s; //2 byte --> 2^16  --> -32768 to 32767
		int i;  //4 byte --> 2^32 --> -2147483648 to 2147483647
		long l; //8 byte --> 2^64 --> -9,223,372,036,854,775,808 to 9223372036854775807
		
		b = 126;
		System.out.println(b);
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);
		b++;
		System.out.println("================");
		i = 2147483646;
		System.out.println(i);
		i++;
		System.out.println(i);
		i++;
		System.out.println(i);
		i++;
		System.out.println(i);
		i++;
		System.out.println("================");
		l = 9223372036854775806L;
		System.out.println(l);
		l++;
		System.out.println(l);
		l++;
		System.out.println(l);
		l++;
		System.out.println(l);
		l++;
		
		

	}
}