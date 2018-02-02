public class Scope {
	public static void main( String args[] ) {
		int x = 10;
		for( int q = 0; q < 10; q++ ){
			x+=q;
		}
		System.out.println( x ); // AT THIS POINT - Only x available
		//System.out.println( q );// q is out of scope and you get a compilation error w0w amaze, bcs it's out of brackets.
		/*  a
			y
			y */

	}
}