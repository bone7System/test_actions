public class TestJavaSonarQube {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant; target = -3. Is that really what's meant?
        target =+ num; // Noncompliant; target = 3
    }
    public void aa(String a,String b){
        if(1==1){
            System.out.println(a);
        }
        if(a.equals("bbb")){
            System.out.println(b);
        }
    }
}
