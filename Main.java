
public class Main {


    public static void main(String[] args) {

        Functions.example1();
        Functions.example2();    
        Functions.example3();  

        //TASK 1: ADDBEFORE
        //TASK 2: DELETEBEFORE
        //INCLUDES: ADDFIRST, ADDLAST
        //          REMOVEFIRST, REMOVELAST  
        Functions.example4();    
        
        //COMPLETE TEST OF MYLINKEDLIST
        //   INCLUDES: CONTAINS, GET, INDEXOF
        //             LASTINDEXOF SET
        Functions.testMyList();
        

        System.out.println("\n\nDECLARING A LINKED LIST WITH PERSON OBJECTS\n");

        MyLinkedList<Person> people = new MyLinkedList<Person>();

        people = Functions.loadData(people);
        for (Person p : people)
            System.out.println(p);
        
    }
}
