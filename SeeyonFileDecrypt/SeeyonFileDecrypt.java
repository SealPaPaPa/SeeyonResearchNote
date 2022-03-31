import java.io.*;
import com.seeyon.ctp.common.encrypt.CoderFactory;

public class SeeyonFileDecrypt {
    public static void decrypt(String input, String output) throws Exception {
        FileOutputStream fop = null;
        FileInputStream fin = null;
        try {
            fop = new FileOutputStream(output);
            fin = new FileInputStream(input);
            CoderFactory.getInstance().download(fin, fop);
            fop.flush();
            fop.close();
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (fop != null) {
                    fop.close();
                }
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {

            }
        }
    }
	
    public static void main (String[] args) {
		try{
			int argc = args.length;
			if(argc < 2){
				System.out.println("java.exe -cp seeyon-ctp-core.jar;commons-logging.jar;. SeeyonFileDecrypt [input] [output]");
				return;
			}
			
			decrypt(args[0], args[1]);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}