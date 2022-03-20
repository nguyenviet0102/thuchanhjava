import java.util.Scanner;

public class Person {
    //data class person
    private String PersonID, PersonName, Address;
    private boolean Gender;

    //method class Person
    
    Scanner sc = new Scanner(System.in);

    public void EnterPersonInFor(){

        System.out.print("Moi nhap PersonID: ");
        PersonID = sc.nextLine();
        System.out.print("Moi nhap PersonName: ");
        PersonName = sc.nextLine();
        System.out.print("Moi nhap Address: ");
        Address = sc.nextLine();

    }

    public void ShowInformation(){
        System.out.println("PersonID : " +PersonID );
        System.out.println("PersonName : " +PersonName);
        System.out.println("Address : " +Address);



    }



}
