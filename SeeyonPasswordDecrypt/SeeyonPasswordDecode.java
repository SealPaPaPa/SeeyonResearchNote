import java.io.*;
import java.sql.*;
import java.util.*;
import com.seeyon.v3x.dbpool.util.TextEncoder;

public class SeeyonPasswordDecode {
    public static void main (String[] args) {
		if(args.length == 0){
			System.out.println("java -jar SeeyonPasswordDecode.jar [Encrypt_Password]");
			return;
		}
		System.out.println(TextEncoder.decode(args[0]));
    }
}
