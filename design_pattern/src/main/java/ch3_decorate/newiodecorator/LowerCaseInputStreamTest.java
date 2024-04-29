package ch3_decorate.newiodecorator;

import java.io.*;

public class LowerCaseInputStreamTest {
    public static void main(String[] args) {
        int c ;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/Users/kim/Desktop/study_source/design_pattern/design_pattern/src/main/resources/test.txt")
                    )
            );
            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
