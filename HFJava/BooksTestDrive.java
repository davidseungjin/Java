class Books{
	String title;
	String author;
}

/* 
This might be an example that was NOT compilied. page 63 of the text.
Why. You Must Figure something out.
*/

/*
the reason that didn't compile was myBooks[index] should also be created by using new Books()
*/

class BooksTestDrive{
	public static void main(String[] args){

		Books[] myBooks = new Books[3];
		int x = 0;
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();

		myBooks[0].title = "The Grapes of Java ";
		myBooks[1].title = "The JAVA Gatsby ";
		myBooks[2].title = "The Java Cook Book ";
		
		myBooks[0].author = "David ";
		myBooks[1].author = "Abraham ";
		myBooks[2].author = "Amellia ";

		while(x < 3){
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x += 1;
		}
	}
}

