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
    private static BufferedWriter bw;
    /**
     * The constructor for SingletonLogger. Set all necessary fields.
     *
     */
    private Logger() {
        String today = (new SimpleDateFormat("MMddyyyy")).format(new Date());
        String filename = "log" + today + ".log";
        FileWriter fw = new FileWriter(filename);
        bw = new BufferedWriter(fw);
    }

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
        try {
            bw.open();
            bw.write(log.toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}