
import java.util.Scanner;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPatient Info:");
        System.out.println("\nPatient 1: (Diarrhea, Hives)");
        System.out.print("\nEnter your name: ");
        String patient = sc.nextLine();
        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.println("\nPatient diagnostic: ");
        ReasontoVisit(sc, patient);

        System.out.println("\nPatient 2: (Hallucination, Wheezing)");
        System.out.print("\nEnter your name: ");
        String patient1 = sc.nextLine();
        System.out.print("Enter your address: ");
        String address1 = sc.nextLine();

        System.out.println("\nPatient diagnostic: ");
        ReasontoVisit1(sc1, patient1);
    }

    static void ReasontoVisit(Scanner sc, String patient) {

        System.out.print("\nPatient reason for visit: ");
        String reason = sc.nextLine();

        if (reason.equals("Diarrhea") || reason.equals("diarrhea")) {
            System.out.print("Doctor Diagnostic: lactose Tolerance"
                    + "\nDoctor Prescription: take lactase enzyme tablets or drops before you eat or drink milk products");

            System.out.println("\n\n" + patient + " visited a doctor for " + reason + " The doctor said that " + patient
                    + " is diagnosed with lactose tolerance\nso the doctor prescribed "
                    + "to take lactase enzyme tablets or drops before you eat or drink milk products.\n");
        } else if (reason.equals("Hives") || reason.equals("hives")) {
            System.out.print(
                    "Doctor Diagnostic: Allergy on something, it could be allergic in food, medication, pollen, etc."
                            + "\nDoctor Prescription: apply cold washcloth, take a comfortably cool bath and also take a Antihistamine medicine.");

            System.out.println("\n\n" + patient + " visited a doctor for " + reason + " The doctor said that " + patient
                    + " is diagnosed with allergens\nso the doctor prescribed "
                    + "to apply cold washcloth, take a comfortably cool bath and \nalso take a Antihistamine medicine.\n");
        } else {
            System.out.print("\nWrong input, please try again\n");
            ReasontoVisit(sc, patient);
        }

    }

    static void ReasontoVisit1(Scanner sc, String patient1) {
        System.out.print("\nPatient reason for visit: ");
        String reason1 = sc.nextLine();

        if (reason1.equals("hallucination") || reason1.equals("Hallucination")) {
            System.out.print("Doctor Diagnostic: Migraine"
                    + "\nDoctor Prescription: Use a heating Pad or hot Compress, Get Some Caffeine and take ibuprofen every four to six hours");

            System.out.println("\n\n" + patient1 + " visited a doctor for " + reason1 + " The doctor said that "
                    + patient1 + " is diagnosed with migraine\nso the doctor prescribed "
                    + "to used a heating Pad or hot Compress, Get Some Caffeine \nand take ibuprofen every four to six hours.\n");
        } else if (reason1.equals("Wheezing") || reason1.equals("wheezing")) {
            System.out.print("Doctor Diagnostic: Asthma"
                    + "\nDoctor Prescription: Used inhaler to relieve mild symptoms of asthma");

            System.out.println("\n\n" + patient1 + " visited a doctor for " + reason1 + " The doctor said that "
                    + patient1 + " is diagnosed with asthma\nso the doctor prescribed "
                    + "to Used inhaler to relieve mild symptoms of asthma.\n");
        } else {
            System.out.print("\nWrong input, please try again\n");
            ReasontoVisit(sc, patient1);
        }

    }
}
