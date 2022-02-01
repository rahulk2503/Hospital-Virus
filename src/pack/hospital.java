package pack;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
// Testing phase of the patient
class Testing {
    public String name;
    public String city_name;
    public long number;
    public int doctor_charge;
    public int medicine_charge;
    public String disease ;
    public int test_charge;
    public int chemo_charge;
    public String test;
    public int surgery_charge;
    public int x_ray_charge;
    public int bed_charges;
    public int normal_test_charge;
    public int count;
    public long totalbill;
    Scanner sc=new Scanner(System.in);


     // chek the patient is normal or ab normal or Emergency
    public void Testing_phase(){
         System.out.println("Condition of the patient...");
         String condition = sc.nextLine();
         String condition2=condition.toLowerCase();
         if (condition2.equals("normal")) {
              normal();
         }else if (condition2.equals("abnormal")){
             abnormal();
         }else if(condition2.equals("emergency")){
             Emergency();
         }
     }
     // Normal patient
    public void normal() {
        System.out.println("Doctor Appointment........");
        System.out.println("Normal Test for the Patient..");
        System.out.println("which disease Conform in Normal Tests ");
        test = sc.nextLine();
        String test2 = test.toLowerCase();
        switch (test2) {

            case "normal":
                disease = "Just fever,cough,collins ";
                doctor_charge = 200;
                medicine_charge = 250;
                bill();
                break;
            case "caved":
                System.out.println("Admit The Patient ");
                System.out.println("How many Days Admit ");
                count=sc.nextInt();
                bed_charges = 1000*count;
                disease = "caved ";
                doctor_charge = 500;
                medicine_charge = 1000;
                normal_test_charge = 500;
                bill();
                break;
            case "dengue":
                System.out.println("Admit The Patient  ");
                System.out.println("How many Days Admit ");
                count=sc.nextInt();
                bed_charges = 1000*count;
                disease = "dengue ";
                bed_charges = 3000;
                medicine_charge = 1500;
                normal_test_charge = 500;
                bill();
                break;
            case "malaria":
                System.out.println("Admit The Patient");
                System.out.println("How many Days Admit ");
                count=sc.nextInt();
                bed_charges = 1000*count;
                disease = "Malaria ";
                doctor_charge = 500;
                medicine_charge = 700;
                normal_test_charge = 500;
                bill();
                break;
            case "pneumonia":
                System.out.println("Admit The Patient ");
                System.out.println("How many Days Admit ");
                count=sc.nextInt();
                bed_charges = 1000*count;
                disease = "pneumonia";
                doctor_charge = 500;
                medicine_charge = 3200;
                normal_test_charge = 500;
                bill();
                break;
            case "tayfiead":
                System.out.println("Admit The Patient ");
                System.out.println("How many Days Admit ");
                count=sc.nextInt();
                bed_charges = 1000*count;
                disease = "tyfiead";
                doctor_charge = 500;
                medicine_charge = 2500;
                normal_test_charge = 500;
                bill();
                break;
            default:
                System.out.println("you are Normal GO to Home ");
                System.out.println("Thanks for visit ");
        }
    }
        // Abnormal patient
        public void abnormal() {
            System.out.println("Specialist Doctor Appointment.......");
            System.out.println("Lab Test for Patient");
            test = sc.nextLine();
            String test2 = test.toLowerCase();
            // blood test and All disease in blood test is present
            if (test2.equals("blood test")){
                System.out.println("which disease is Conform in Blood Test ");
                String report = sc.nextLine();
                String report2 = report.toLowerCase();
                switch (report2) {
                    case "hiv":
                        disease = "HIV";
                        test_charge = 2000;
                        doctor_charge = 1000;
                        medicine_charge = 1200;
                        bill2();
                        break;
                    case "cancer":
                        System.out.println("which Cancer");
                        test = sc.nextLine();
                        switch (test) {
                            case "blood cancer":
                                System.out.println("Admit the patient Yes or No");
                                test = sc.nextLine();
                                if (test.equals("yes")) {
                                    System.out.println("You Can Inject The Blood cancer Chemo to Patient");
                                    String chemo = sc.nextLine();
                                    if (chemo.equals("yes")) {
                                        System.out.println("How many Days Admit ");
                                        count=sc.nextInt();
                                        bed_charges = 1000*count;
                                        System.out.println("Chemo Therapy is Done");
                                        chemo_charge = 200000;
                                    }
                                    disease = "Blood cancer";
                                    test_charge = 5000;
                                    bed_charges = 1000*count;
                                    doctor_charge = 3000;
                                    medicine_charge = 70000;
                                    bill2();
                                }
                                disease = "Blood cancer";
                                test_charge = 5000;
                                doctor_charge = 3000;
                                medicine_charge = 70000;
                                bill2();
                                break;
                            case "skin cancer":
                                System.out.println("Admit the patient Yes or No");
                                test = sc.nextLine();
                                if (test.equals("yes")) {
                                    System.out.println("You Can Inject The Skin cancer Chemo to Patient");
                                    String chemo =sc.nextLine();
                                    if (chemo.equals("yes")) {
                                        System.out.println("How many Days Admit ");
                                        count=sc.nextInt();
                                        bed_charges = 1000*count;
                                        System.out.println("Chemo Therapy is Done");
                                        chemo_charge = 400000;
                                    }
                                    disease = "Skin cancer";
                                    test_charge = 5000;
                                    doctor_charge = 4000;
                                    medicine_charge = 110000;
                                    bill2();
                                    break;
                                }
                                disease = "Skin cancer";
                                test_charge = 5000;
                                doctor_charge = 4000;
                                medicine_charge = 110000;
                                bill2();
                                break;
                            case "lung cancer":
                                System.out.println("Admit the patient Yes or No");
                                test = sc.nextLine();
                                if (test.equals("yes")) {

                                    System.out.println("You Can Inject The Lung cancer Chemo to Patient");
                                    String chemo = sc.nextLine();
                                    if (chemo.equals("yes")) {
                                        System.out.println("How many Days Admit ");
                                        count=sc.nextInt();
                                        bed_charges = 1000*count;
                                        System.out.println("Chemo Therapy is Done");
                                        chemo_charge = 500000;
                                    }
                                    disease = "lung cancer";
                                    test_charge = 5000;
                                    bed_charges = 1000*count;
                                    doctor_charge = 6000;
                                    medicine_charge = 120000;
                                    bill2();
                                    break;
                                }
                                disease = "lung cancer";
                                test_charge = 5000;
                                doctor_charge = 6000;
                                medicine_charge = 120000;
                                bill2();
                                break;
                            case "prostate cancer":
                                System.out.println("Admit the patient Yes or No");
                                test = sc.nextLine();
                                if (test.equals("yes")) {
                                    System.out.println("You Can Inject The prostate cancer Chemo to Patient");
                                    String chemo = sc.nextLine();
                                    if (chemo.equals("yes")) {
                                        System.out.println("How many Days Admit ");
                                        count=sc.nextInt();
                                        bed_charges = 1000*count;
                                        System.out.println("Chemo Therapy is Done");
                                        chemo_charge = 43000;
                                    }
                                    disease = "prostate cancer";
                                    test_charge = 5000;
                                    bed_charges = 1000*count;
                                    doctor_charge = 9000;
                                    medicine_charge = 10000;
                                    bill2();
                                    break;
                                }
                                disease = "prostate cancer";
                                test_charge = 5000;
                                doctor_charge = 9000;
                                medicine_charge = 10000;
                                bill2();
                                break;
                            case "brain tumor":
                                System.out.println("Admit the patient Yes or No");
                                test = sc.nextLine();
                                if (test.equals("yes")) {
                                    System.out.println("You Can Inject The brain tumor Chemo to Patient");
                                    String chemo = sc.nextLine();
                                    if (chemo.equals("yes")) {
                                        System.out.println("How many Days Admit ");
                                        count=sc.nextInt();
                                        bed_charges = 1000*count;
                                        System.out.println("Chemo Therapy is Done");
                                        chemo_charge = 500000;
                                    }
                                    disease = "brain tumor";
                                    test_charge = 8000;
                                    bed_charges = 1000*count;
                                    doctor_charge = 120000;
                                    medicine_charge = 30000;
                                    bill2();
                                    break;
                                }
                                disease = "brain tumor";
                                test_charge = 8000;
                                doctor_charge = 120000;
                                medicine_charge = 30000;
                                bill2();
                                break;

                            case "sugar":
                                System.out.println("Di-Bites Treatment ");
                                disease = "Di-bites";
                                test_charge = 1000;
                                doctor_charge = 500;
                                medicine_charge = 2000;
                                bill2();
                                break;

                            default:
                                System.out.println("patient is normal go home ");
                                System.out.println("Thanks to visit our Hospital");

                        }

                }
            }
            // x-y for the patient
            else if (test2.equals("x-ray")) {

                System.out.println("Which part X-Ray");
                String part = sc.nextLine();
                String part2 = part.toLowerCase();
                switch (part2) {

                    case "hand":
                        System.out.println("Working on X-Ray");
                        System.out.println("Hand is Broken or Not ");
                        test = sc.nextLine();
                        if (test.equals("yes")) {
                            System.out.println("Hand Surgery");
                            disease = "Hand Broken";
                            surgery_charge = 3000;
                            doctor_charge = 500;
                            x_ray_charge = 2200;
                            medicine_charge = 700;
                            bill3();
                            break;
                        }
                    case "leg":
                        System.out.println("Working on X-Ray");
                        System.out.println("Leg is Broken or Not ");
                        test = sc.nextLine();
                        if (test.equals("yes")) {
                            System.out.println("Leg Surgery");
                            disease = "Leg Broken";
                            surgery_charge = 3000;
                            doctor_charge = 500;
                            x_ray_charge = 2200;
                            medicine_charge = 1500;
                            bill3();
                            break;
                        }
                    case "shoulder blad":
                        System.out.println("Working on X-Ray");
                        System.out.println("Shoulder Blad is Broken or Not ");
                        test = sc.nextLine();
                        if (test.equals("yes")) {
                            System.out.println("Shoulder Surgery");
                            disease = "Shoulder Broken";
                            surgery_charge = 5000;
                            doctor_charge = 1200;
                            x_ray_charge = 2200;
                            medicine_charge = 1400;
                            bill3();
                            break;
                        }
                    case "chest":
                        System.out.println("Working on X-Ray");
                        System.out.println("Chest is Broken or Not ");
                        test = sc.nextLine();
                        if (test.equals("yes")) {
                            System.out.println("Chest Surgery");
                            disease = "Chest Broken";
                            surgery_charge = 7000;
                            doctor_charge = 1200;
                            x_ray_charge = 2200;
                            medicine_charge = 2000;
                            bill3();
                            break;
                        }
                    default:
                        System.out.println("You All Right go to Home ");
                        System.out.println("Thanks of Visit to Hospital ");
                }
            }
            // urine test
            else if (test2.equals("urine")){
                System.out.println("Which disease");
                test=sc.nextLine();
                if (test.equals("kidney")){
                    System.out.println("Admit the patient Yes or No");
                    test = sc.nextLine();
                    if (test.equals("yes")) {
                        System.out.println("How many Days Admit ");
                        count = sc.nextInt();
                        System.out.println("Treatment The patient ");
                        disease="Kidney Disease";
                        doctor_charge=1000;
                        test_charge=700;
                        medicine_charge=1200;
                        bed_charges=1000*count;
                        bill2();
                    }
                }
                else {
                    System.out.println("patient is Normal go to Home ");
                    doctor_charge=1000;
                    test_charge=700;
                    bill3();
                }

            }
        }
    // Emergency  ward
    public void Emergency(){
        System.out.println("Accident Case ");
        System.out.println("Admit to ICU ward");
        System.out.println("How many Days Admit ");
        count=sc.nextInt();
        disease="Accident Case";
        doctor_charge =10000;
        surgery_charge=10000;
        test_charge=5000;
        bed_charges=3000*count;
        medicine_charge=12000;
        bill4();
     }

        public void bill(){}
        public void bill2 (){}
        public void bill3 (){}
        public void bill4(){}
    }
    class patient_info extends Testing {
      // store the patient information.
        public void patient_information() {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the patient name =>");
            this.name = sc.nextLine();
            System.out.println("Enter the patient city =>");
            this.city_name = sc.nextLine();
            System.out.println("Enter the patient mobile no.=>");
            this.number = sc.nextLong();
            LocalDate d = LocalDate.now();
            System.out.println("Date = " + d);
        }
    }
    class billing extends patient_info{

        // All Bills for the Hopital
        public void bill () {
            System.out.println("Hospital Bill");
            System.out.println("Patient Name :-" + name);
            System.out.println("Patient CityName :-" + city_name);
            System.out.println("Patient Mobile Number :-" + number);
            System.out.println("Disease Name :-"+disease);
            System.out.println("Normal Test Charge :-"+normal_test_charge + "Rs");
            System.out.println("Doctor Charges :-" + doctor_charge + "Rs");
            System.out.println("Medicine Charges :-" + medicine_charge + "Rs");
            System.out.println("Bed charges :-"+bed_charges + "Rs");
            totalbill = doctor_charge + medicine_charge+normal_test_charge+bed_charges;
            System.out.println("Total bill of Hospital :-" + totalbill + "Rs");
            System.out.println("Thanks for visit the Hospital");
        }
        public void bill2 () {
            System.out.println("Hospital Bill");
            System.out.println("Patient Name :-" + name);
            System.out.println("Patient CityName :-" + city_name);
            System.out.println("Patient Mobile Number :-" + number);
            System.out.println("patient Disease :-" + disease);
            System.out.println("Doctor charges :-" + doctor_charge + "Rs");
            System.out.println("Medicine Charges :-" + medicine_charge + "Rs");
            System.out.println("Test charge :-" + test_charge + "Rs");
            System.out.println("ChemoCharge :- " + chemo_charge + "Rs");
            System.out.println("Bed Charge :-"+bed_charges + "Rs");
            totalbill = doctor_charge + medicine_charge + test_charge + chemo_charge+bed_charges;
            System.out.println("Total bill of Hospital :-" + totalbill + "Rs");
            System.out.println("Thanks for visit the Hospital");
        }
        public void bill3 () {
            System.out.println("Hospital Bill");
            System.out.println("Patient Name :-" + name);
            System.out.println("Patient CityName :-" + city_name);
            System.out.println("Patient Mobile Number :-" + number);
            System.out.println("Broken Part :-" + disease);
            System.out.println("X-ray Charge :-" + x_ray_charge + "Rs");
            System.out.println("Doctor Charges :-" + doctor_charge + "Rs");
            System.out.println("Surgery Charge :-" + surgery_charge + "Rs");
            System.out.println("Medicine Charges :-" + medicine_charge + "Rs");
            totalbill = doctor_charge + medicine_charge + surgery_charge + x_ray_charge;
            System.out.println("Total bill of Hospital :-" + totalbill + "Rs");
            System.out.println("Thanks for visit the Hospital");
        }
        public void bill4() {
            System.out.println("Hospital Bill");
            System.out.println("Patient Name :-" + name);
            System.out.println("Patient CityName :-" + city_name);
            System.out.println("Patient Mobile Number :-" + number);
            System.out.println("Condition :- "+ disease);
            System.out.println("Test Charges:-" + test_charge + "Rs");
            System.out.println("Doctor Charges :-" + doctor_charge + "Rs");
            System.out.println("Surgery Charge :-" + surgery_charge + "Rs");
            System.out.println("Medicine Charges :-" + medicine_charge + "Rs");
            System.out.println("Bed Charge :-"+bed_charges + "Rs");
            totalbill = doctor_charge + medicine_charge + surgery_charge + test_charge+bed_charges;
            System.out.println("Total bill of Hospital :-" + totalbill + "Rs");
            System.out.println("Thanks for visit the Hospital");
        }
    }
public class hospital {

    public static void main(String[] args){
        billing t=new billing();
        t.patient_information();
        t.Testing_phase();
        // Creating the file
        File myfile=new File("Hospital-virus.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("File not find");
            e.printStackTrace();
        }
        // write in file they will create and store the information of patient and patient Hospital Bill
        try {
            FileWriter fileWriter=new FileWriter("Hospital-virus.txt");
            fileWriter.write("patient Information inter in Hospital Time \n");
            fileWriter.write("patient name = >"+t.name+"\n");
            fileWriter.write("patient city = >"+t.city_name+"\n");
            fileWriter.write("patient mo.number = >"+t.number +"\n");
            fileWriter.write("\n");
            fileWriter.write("Hospital Bill ");
            fileWriter.write("patient name = >"+t.name+"\n");
            fileWriter.write("patient city = >"+t.city_name+"\n");
            fileWriter.write("patient mo.number = >"+t.number +"\n");
            fileWriter.write("condition or disease patient = >" +t.disease+"\n");
            fileWriter.write("normal test charge = >"+t.normal_test_charge + "Rs"+"\n");
            fileWriter.write("critical test charge = >"+t.test_charge + "Rs"+"\n");
            fileWriter.write("X-ray charge = >"+t.x_ray_charge + "Rs"+"\n");
            fileWriter.write("Surgery charge = >" +t.surgery_charge+ "Rs"+"\n");
            fileWriter.write("Bed Charge "+t.bed_charges + "Rs"+"\n");
            fileWriter.write("Doctor charges = > "+t.doctor_charge + "Rs"+"\n");
            fileWriter.write("Medicine Charge = > "+t.medicine_charge + "Rs"+"\n");
            fileWriter.write("Total Bill = >"+t.totalbill + "Rs" +"\n");
            fileWriter.write("Thanks for visit ");
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
    }
}
