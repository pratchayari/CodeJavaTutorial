public class StringMethods {
    public static void main(String[] args){
        String message = "Java is Great Fun";
        /*
         เมดธอดพื้นฐาน
         1.toUperCase() ปรับค่าข้อความให้เป็นตัวพิมพ์ใหญ่
         2.toLowerCase()ปรับค่าข้อความให้เป็นตัวพิมพ์เล็ก
         3.length() เก็บความของสตริง
         4.charAt(2) บอกให้เก็บตัวอักษรในตำแหน่งที่ระบุ
         */
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        char letter = message.charAt(3);
        int stringSize = message.length();
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(letter);
        System.out.println(stringSize);

    }
}
