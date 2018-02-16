public class Library {
	private Book[] entries;
	private int size;
	private int maxEntriesLength = 1;
	public Library( ) {
	entries = new Book[maxEntriesLength0];
}
	public void add( String title, String number ) {
		System.out.println("Size: " + size + " , " + maxEntriesLength);
		if ( size == entries.length ) {
			System.out.println("Doubling");
			maxEntriesLength = 2 * maxEntriesLength;
			Book[] temp = new Book[ maxEntriesLength ];
			System.arraycopy( entries, 0, temp, 0, entries.length );
			entries = temp;
		}
	entries[size] = new Book( name, number );
	System.out.println("Adding : " + name);
	size++;
	System.out.println("Size: " + size + " , " + maxEntriesLength);
	}
	public String barcodeFor( String iTitle ) {
		for (int i = 0; i < size; ++i) {
			if ( list[i].getName().equals(name) ) {
				return list[i].getNumber();
			}
		}
		return "NOT FOUND";
	}
}