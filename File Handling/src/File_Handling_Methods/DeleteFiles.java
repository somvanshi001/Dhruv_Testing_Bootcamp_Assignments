package File_Handling_Methods;

import java.io.File;

public class DeleteFiles {
	public static void main(String[] args) {
		
		try {
			File myObj = new File("E:\\Files");
			if(myObj.delete()) {
				System.out.println("deleted the file ...");
			}else {
				System.out.println("Failed to delete ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}


}
