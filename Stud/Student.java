
import com.sun.source.doctree.IdentifierTree;
import java.util.ArrayList;
import java.util.Scanner;

class Student {

    public static void main(String[] args) {
        ArrayList<Details> std = new ArrayList<>();

        Details s1 = new Details("Shama", 111, 8, "A", 2500);
        Details s2 = new Details("Demir", 222, 10, "B", 2700);
        Details s3 = new Details("Sana", 333, 6, "C", 2400);
        Details s4 = new Details("Aahid", 444, 5, "D", 2400);
        Details s5 = new Details("Hena", 555, 11, "C", 2800);
        Details s6 = new Details("Neha", 666, 12, "C", 3000);

        std.add(s1);
        std.add(s2);
        std.add(s3);

        

        std.add(s4);
        std.add(s5);
        std.add(s6);
        for (Details det : std) {
            System.out.println(det.getName() +" "+det.getId()+" "+det.getClassName()+" "+det.getSec()+" "+det.getFee());
        }

        
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the id to be searched: ");
         int n=sc.nextInt();
         sc.nextLine();
         System.out.println("enter the name to change : ");
         String ch=sc.nextLine();


        for (Details item: std) {
            if(item.getId()==n){
                item.setName(ch);
                System.out.println(item.getName() +" "+item.getId()+" "+item.getClassName()+" "+item.getSec()+" "+item.getFee());
            }
            else{
                 System.out.println(item.getName() +" "+item.getId()+" "+item.getClassName()+" "+item.getSec()+" "+item.getFee());
                }
                
        }

            
        System.out.println("All Students of section c are ");
        for (Details d : std) {
            if(d.getSec().equals("C")){
                System.out.println(d.getName()+" "+d.getId()+" "+d.getClassName()+" "+d.getSec()+" "+d.getFee());
            }
        }
     }
 }

class Details {
    private String name;
    private int id;
    private int className;
    private String sec;
    private int fee;

    public Details(String name, int id, int className, String sec, int fee) {
        this.name = name;
        this.id = id;
        this.className = className;
        this.sec = sec;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }    
    
}
