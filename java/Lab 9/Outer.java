// The variable s needs to be made static in order for the program to compile.
// This is because static nested classes can only reference static outer variables.
public class Outer {
	static String s;
	
	static class Inner {
		void testMethod() {
			s = "Inner";
		}
	}
}
