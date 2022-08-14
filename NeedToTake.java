package prereqchecker;

import java.util.*;

public class NeedToTake {
    public static void main(String[] args) {

        if ( args.length < 3 ) {
            StdOut.println("Execute: java prereqchecker.NeedToTake <adjacency list INput file> <need to take INput file> <need to take OUTput file>");
            return;
        }

        PrereqNeedtoTake Map = new PrereqNeedtoTake(args[0]);
        Map.requiredPrereq(args[1], args[2]);

        
   }
   
}