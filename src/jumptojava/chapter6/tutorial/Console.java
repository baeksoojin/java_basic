package jumptojava.chapter6.tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Console {

    public InputStream in = System.in;

    public void inputStream() throws IOException {

        int a = in.read();
        System.out.println(a);
    }// 1 byte만 읽고 byte 자료형으로 저장되지 않고 read 메서드를 통해서 int 자료형으로 저장된다.

    public void inputStream2() throws IOException{
        byte[] a = new byte[3];
        in.read(a);
        System.out.println(a[0]+a[1]+a[2]);
    }

    public void inputStreamReader() throws IOException {

        InputStreamReader reader = new InputStreamReader(in);
        char[] a = new char[3];
        reader.read(a);

        System.out.println(a);
    }//바이트단위로 입력값을 읽지 않고 입력한 문자값을 그래도 읽기 위해서는 문자로 stream을 처리

    public void BufferReader() throws IOException {

        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine();
        System.out.println(a);
    }//고정된 길이로 읽는 것이 아닌 사용자의 입력값을 전부 받아들일 때 사용


    /*
    InputStream - byte
    InputStreamReader - character
    BufferedReader - String
    **/


    // java.util.Scanner 를 사용해서 콘솔입력을 편하게 처리

    public void scanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
    }

    /*
    next - 단어
    nextLine - 라인
    nextInt - 정수
     */
}

