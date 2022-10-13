import java.io.IOException;
import java.io.RandomAccessFile;

public class raf1 {

	public static void main(String[] args) {
		RandomAccessFile raf = null;
		
		try {
			raf = new RandomAccessFile("zahlen.txt","rw");
			for(int i = 1; i<=100;i++) {
				raf.writeInt(i*i);
			}
			
			raf.seek(0);
			for (int i = 1; i <= 10; i++) {
                System.out.print("an Dateiposition " + raf.getFilePointer());
                System.out.println(" beginnt " + raf.readInt());
            }
			
			raf.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(raf!=null) {
				try {
					raf.close();
				}catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		
		

	}

}
