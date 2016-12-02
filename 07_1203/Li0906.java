import java.io.*;
public class Li0906 {
	// throwsで例外処理を省略しています
	// 実際の開発では正しく例外処理を行ってください
	public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(65);
        baos.write(66);
        byte[] data = baos.toByteArray();
        // dataは「65」「66」が入った要素数2のbyte型配列
        /* : */
				System.out.println("data[0]:"+data[0]);
				System.out.println("data[1]:"+data[1]);
    }   /* 参考：バイト配列から１バイトずつ読み込む */
}       /* ByteArrayInputStreamもある */
