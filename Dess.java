import java.io.*;
import javax.crypto.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.*;

class Dess
{
	public static void main(String a[])
	{
		try
		{
		String pt="hello";
		String pt1="hello";
		byte ptt[]=pt.getBytes();
		byte ptt1[]=pt1.getBytes();
		
		Cipher c=Cipher.getInstance("CFM");
		KeyGenerator kg=KeyGenerator.getInstance("CFM");	
		
		SecretKey k=kg.generateKey();
		SecretKey k1=kg.generateKey();
		
		//ENCRYPT_MODE key1
		c.init(c.ENCRYPT_MODE,k);
		byte ct[]=c.doFinal(ptt);
		System.out.println("Cipher text key1 is :-"+new String(ct));
		
		
		
		//DECRYPT key1
		c.init(Cipher.DECRYPT_MODE,k);
		byte de[]=c.doFinal(ct);
		System.out.println("plaint1 text is :-"+new String(de));
		
		//ENCRYPT_MODE key2
		c.init(c.ENCRYPT_MODE,k1);
		byte ct1[]=c.doFinal(ptt1);
		System.out.println("\nCipher text key2 is :-"+new String(ct1));
		//DECRYPT key2
		c.init(Cipher.DECRYPT_MODE,k1);
		byte de1[]=c.doFinal(ct1);
		System.out.println("plaint2 text is :-"+new String(de1));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}