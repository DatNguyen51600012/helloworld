import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		
		static String filename = "input file : ";
    		public static void main(String[] args) {
		System.out.println("Hello world I'm TDTU");
		int count= 0;
                
		try{
		    Scanner sc = new Scanner(new FileReader(new File(filename)) );
		    while (sc.hasNext()){
			String line = sc.next();
			System.out.println("Helo world, I'm " + line);
			count++;
		    }

            
		} catch(IOException e){

		}
		System.out.println("Total " + count + " students");
    }
	}

}
