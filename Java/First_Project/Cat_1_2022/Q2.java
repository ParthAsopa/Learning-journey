import java.util.Scanner;

class Transport {
    String TransportName;
    int TransportID;
    String CompanyAddress;
    double TotalFare;
    Scanner sc = new Scanner(System.in);

    void transport() {
        System.out.print("Enter Transport Name: ");
        TransportName = sc.nextLine();
        System.out.print("Enter Company Address: ");
        CompanyAddress = sc.nextLine();
        System.out.print("Enter Transport ID: ");
        TransportID = sc.nextInt();
    }

    void charges() {
        System.out.print("Enter basic fare: ");
        int basic = sc.nextInt();
        double gst = 0.05 * basic;
        double vat = 0.05 * basic;
        double insurance = 0.15 * basic;
        TotalFare = basic + gst + vat + insurance;
        sc.close();
    }

    void display() {
        System.out.println("Transport Name: " + TransportName);
        System.out.println("Transport ID: " + TransportID);
        System.out.println("Company Address: " + CompanyAddress);
        System.out.println("Total Fare: " + TotalFare);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Transport t1 = new Transport();
        System.out.println("Enter details of first transport:");
        t1.transport();
        t1.charges();
        t1.display();

        Transport t2 = new Transport();
        System.out.println("Enter details of second transport:");
        t2.transport();
        t2.charges();
        t2.display();

        Transport t3 = new Transport();
        System.out.println("Enter details of third transport:");
        t3.transport();
        t3.charges();
        t3.display();
    }
}
