package LoggerExercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger instance = new Logger();

    /**
     * The constructor for SingletonLogger. Set all necessary fields.
     *
     */
    private Logger() { }

    /**
     * @return A Logger instance of this class.
     */
    public static Logger getInstance() {
        return instance;
    }


    /**
     *
     * @param log
     *            The Object that will be logged in the file.
     */
    public void logInFile(Object log) {
        String today = (new SimpleDateFormat("MMddyyyy")).format(new Date());
        String filename = "log" + today + ".log";
        File file = new File(filename);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(log.toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}