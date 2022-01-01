package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checker {
    private final String FOLDER_PATH = "Test/Files/";

    public boolean integerChecker(String fileOut,String fileAns) throws FileNotFoundException {
        Scanner outFileScanner = new Scanner(new File(FOLDER_PATH+fileOut));
        Scanner ansFileScanner = new Scanner(new File(FOLDER_PATH+fileAns));
        while (outFileScanner.hasNextLong())
        {
            if(!ansFileScanner.hasNextLong())
                return false;
            long ansVal = ansFileScanner.nextLong();
            long outVal= outFileScanner.nextLong();
            if(ansVal != outVal)
                return false;
        }
        if(ansFileScanner.hasNextLong())
            return false;
        return  true;
    }

}
