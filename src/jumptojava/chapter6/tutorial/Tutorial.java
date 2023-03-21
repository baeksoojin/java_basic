package jumptojava.chapter6.tutorial;

import java.io.IOException;

public class Tutorial {

    public void console() throws IOException {

        Console console = new Console();
        //InputStream
        console.inputStream();
        //InputStream use byte[]
        console.inputStream2();
        //InputStreamReader
        console.inputStreamReader();
        //BufferReader
        console.BufferReader();
        //Scanner
        console.scanner();

    }
}
