import java.util.*;

public class UserInterface {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the no of vessels : ");
        int n = in.nextInt();
        in.nextLine(); // consume newline

        List<Vessel> vesselList = new ArrayList<>();

        System.out.println("Enter vessel details");
        while (n > 0) {
            String V = in.nextLine();
            String Info[] = V.split(":");

            Vessel v = new Vessel(
                    Info[0],
                    Info[1],
                    Double.parseDouble(Info[2]),
                    Info[3]
            );

            vesselList.add(v);
            n--;
        }

        System.out.println("Enter the Vessel Id to check speed ");
        String vesselSearch = in.nextLine();

        VesselUtil vs = new VesselUtil(vesselList);

        Vessel found = vs.getVesselById(vesselSearch);
        if (found != null) {
            System.out.println(found.vesselId+" | "+found.vesselName+" | "+found.vesselType+" | "+found.averageSpeed);
        } else {
            System.out.println("VesselId "+ vesselSearch+" not found");
        }

        System.out.println("High performance vessels are ");
        List<Vessel> highPerf = vs.getHighPerformanceVessels();
        for (Vessel v : highPerf) {
            System.out.println(v.vesselId+" | "+v.vesselName+" | "+v.vesselType+" | "+v.averageSpeed);
        }

        in.close();
    }
}
