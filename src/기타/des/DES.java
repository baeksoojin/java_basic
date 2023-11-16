package 기타.des;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DES {

    private static final String INPUT_FILEPATH = "/Users/baeksujin/Desktop/JavaStudy/java_basic/src/기타/des/roundinput.txt";
    private static final String KEY_FILEPATH = "/Users/baeksujin/Desktop/JavaStudy/java_basic/src/기타/des/roundkey.txt";
    private static final String OUT_FILEPATH = "/Users/baeksujin/Desktop/JavaStudy/java_basic/src/기타/des/output.txt";
    private static final int[] E_BIT_TABLE = {32, 1, 2,3,4,5,4,5, 6,7,8,9,8,9,10,11, 12,13,12,13,14,15,16,17, 16,17,18,19,20,21,20,21, 22,23,24,25,24,25,26,27, 28,29,28,29,30,31,32,1};

    private static final int[][] SubstitutionTable = {
            {
                14,4,13,1,2,15,11,8,3,10,6,12,5,9,0,7
            },
            {
                0,15,7,4,14,2,13,1,10,6,12,11,9,5,3,8
            },
            {
                4,1,14,8,13,6,2,11,15,12,9,7,3,10,5,0
            },
            {
                15,12,8,2,4,9,1,7,5,11,3,14,10,0,6,13
            }
    };

    private static final int[] PermutationTable = {
            16,7,20,21,29,12,28,17,1,15,23,26,5,18,31,10,2,8,24,14,32,27,3,9,19,13,30,6,22,11,4,25
    };

    private static List<String> getKeys(){
        List<String> result = new ArrayList<>();
        try {
            // 파일을 읽기 위한 FileReader 객체 생성
            FileReader inputFileReader = new FileReader(INPUT_FILEPATH);
            FileReader keyFileReader = new FileReader(KEY_FILEPATH);


            // BufferedReader를 사용하여 파일 내용을 읽어옴
            BufferedReader inputBufferedReader = new BufferedReader(inputFileReader);
            BufferedReader keyBufferedReader = new BufferedReader(keyFileReader);

            String input, roundKey;
            while ((input = inputBufferedReader.readLine()) != null) {
                // 파일에서 한 줄씩 읽어서 처리
                System.out.println("inputKey -> " + input);
                result.add(input);
            }
            while ((roundKey = keyBufferedReader.readLine()) != null) {
                // 파일에서 한 줄씩 읽어서 처리
                System.out.println("roundKey -> " + roundKey);
                result.add(roundKey);
            }

            // 파일과 스트림을 닫음
            inputBufferedReader.close();
            inputFileReader.close();
            keyBufferedReader.close();
            keyFileReader.close();

            return result;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static String xorBinaryStrings(String s1, String s2){

        String result = "";
        for(int i=0; i<s1.length(); i++){
            result = result.concat((s1.charAt(i) == s2.charAt(i)) ? result.concat("0") : result.concat("1"));
        }
        System.out.println("xorBinaryStrings result -> " + result);
        return result;
    }

    private static String convertTo48BitByUsingEBitTable(String right){

        String result ="";

        for(int i=0; i<48; i++){
            int temp = E_BIT_TABLE[i];
            result = result.concat(String.valueOf(right.charAt(temp-1)));
        }

        System.out.println("convertTo48BitByUsingEBitTable result -> " + result);

        return result;
    }

    private static String substitution(String input){

        String result ="";

        for(int i=0; i<48; i= i+6){// 6개씩 8번 반복

            String subBinary = input.substring(i, i+6);
            String rowBinary = String.valueOf(subBinary.charAt(0)) + subBinary.charAt(5);
            String columnBinary = subBinary.substring(1,5);
            int row = Integer.parseInt(rowBinary, 2); // binary to decimal!
            int column = Integer.parseInt(columnBinary, 2); // binary to decimal!
            int substitutionTemp = SubstitutionTable[row][column];
            // 4비트로 변경
            String substitutionTempBinary = Integer.toBinaryString(substitutionTemp);
            if (substitutionTempBinary.length() < 4) {
                int leadingZeros = 4 - substitutionTempBinary.length();
                for (int j = 0; j < leadingZeros; j++) {
                    substitutionTempBinary = "0" + substitutionTempBinary;
                }
            }
            result = result.concat(substitutionTempBinary); // 4비트로 변경됨 (6비트가 4비트로 변경 -> 총 32비트로)// 4비트로 변경됨 (6비트가 4비트로 변경 -> 총 32비트로)
        }

        System.out.println("substitution result -> " + result);
        return result;
    }

    private static String permutation(String input){

        String result = "";

        for(int i=0; i<32; i++){
            result = result.concat(String.valueOf(input.charAt(PermutationTable[i]-1)));
        }

        System.out.println("permutation result -> " + result);
        return result;
    }
    public static void main(String[] args) {

        List<String> keys = DES.getKeys();

        String input = keys.get(0);
        String roundKey = keys.get(1);

        // step 1. 분리
        String left = input.substring(0,32);
        String right = input.substring(32);

        System.out.println("input key를 나눈 값 -> 왼쪽 : " + left + " 오른쪽 : " + right);


        // step2. R (32 -> 48) by using E-bit-Table

        String convertRightTo48Bit = DES.convertTo48BitByUsingEBitTable(right);

        // step3. roundKey와 convertRightTo48Bit의 xor연산
        String xorResultBit = DES.xorBinaryStrings(convertRightTo48Bit, roundKey);

        // step4. substitution

        String substitutionResultBit = DES.substitution(xorResultBit);

        // step5. permutation

        String permutationResultBit = DES.permutation(substitutionResultBit);

        // step6. left와 permutationResultBit 의 xor연산
        String changeRightBit = DES.xorBinaryStrings(left, permutationResultBit);

        // final
        String roundResult = right.concat(changeRightBit);
        System.out.println(" ----- 0번째 round result ------->  " + roundResult);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(OUT_FILEPATH));
            writer.write(roundResult);
            writer.close();
            System.out.println("데이터가 " + OUT_FILEPATH + " 파일에 성공적으로 쓰였습니다.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("파일에 쓰기 실패: " + e.getMessage());
        }


    }
}
