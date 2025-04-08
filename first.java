;

public class first {
    public static void main(String[] args) {
//        int x= 10;
//        int y= 4;
//        int z= x-y;
        String srt ="hello";
        String srt1 ="hello";
        String srtt = new String("hello");
        String srtt1 = new String("hello");


        System.out.println(srt.equals(srt1));//true
        System.out.println(srt ==srt1);//false
        System.out.println(srt.equals(srtt));//true
        System.out.println(srtt1.equals(srtt));
        System.out.println(srtt ==srt1);//false


    }
}
