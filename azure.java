{\rtf1\ansi\deff0\nouicompat{\fonttbl{\f0\fnil\fcharset0 Calibri;}}
{\*\generator Riched20 10.0.22621}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22\lang9 public class StringExample\par
\{\tab public static void main(String[] args)\par
\tab\{\tab String s1 = "Computer Science";\par
\tab\tab int x = 307;\par
\tab\tab String s2 = s1 + " " + x;\par
\tab\tab String s3 = s2.substring(10,17);\par
\tab\tab String s4 = "is fun";\par
\tab\tab String s5 = s2 + s4;\par
\tab\tab\par
\tab\tab System.out.println("s1: " + s1);\par
\tab\tab System.out.println("s2: " + s2);\par
\tab\tab System.out.println("s3: " + s3);\par
\tab\tab System.out.println("s4: " + s4);\par
\tab\tab System.out.println("s5: " + s5);\par
\tab\tab\par
\tab\tab //showing effect of precedence\par
\tab\tab\par
\tab\tab x = 3;\par
\tab\tab int y = 5;\par
\tab\tab String s6 = x + y + "total";\par
\tab\tab String s7 = "total " + x + y;\par
\tab\tab String s8 = " " + x + y + "total";\par
\tab\tab System.out.println("s6: " + s6);\par
\tab\tab System.out.println("s7: " + s7);\par
\tab\tab System.out.println("s8: " + s8);\par
\tab\}\par
\}\par
}
 import java.math.BigInteger;
import java.util.Random;

public class PrimeEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printTest(10, 4);
		printTest(2, 2);
		printTest(54161329, 4);
		printTest(1882341361, 2);
		printTest(36, 9);

		System.out.println(isPrime(54161329) + " expect false");
		System.out.println(isPrime(1882341361) + " expect true");
		System.out.println(isPrime(2) + " expect true");
		int numPrimes = 0;
		Stopwatch s = new Stopwatch();
		s.start();
		for(int i = 2; i < 10000000; i++) {
			if(isPrime(i)) {
				numPrimes++;
			}
			
			
			END OF THE CODE 