package mundopc;

import com.ar.mundopc.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.Calendar;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
/**
 *
 * @author octavio
 */
@SpringBootApplication
public class MundoPc {

    public static void main(String[] args) throws IOException, InterruptedException {

       
        
        String cron = "1 50 9 4 8 *";
        
        SimpleDateFormat cronFormat = new SimpleDateFormat("ss mm HH DD MM *");
	SimpleDateFormat outFormat = new SimpleDateFormat("Yhh dd HH:mm:ss");
	Date beginDate = null;
	try{
		beginDate = (Date)cronFormat.parse(cron);
		System.out.println("salida " + outFormat.format(beginDate));
	}catch(ParseException e){
		e.printStackTrace();
	}
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(beginDate);
                
        Calendar today = Calendar.getInstance();

        // Comparing the time
        boolean val = today.before(calendar);
        
        System.out.println("calendar"
                        + " comparison calndr1 is: "
                        + val);
        
        //CSVWriter.generateCSV(new File("/home/octavio/reporteTouchId/products.csv"),list);
        //fooSync.updateSchedule("1 06 05 1 12 *");
        /*//creacion de computadora Toshiba
        Monitor monitorToshi = new Monitor("Toshiba", 13);
        Teclado tecladoToshi = new Teclado("bluetooth", "Toshiba");
        Raton ratonToshi = new Raton("bluetooth", "Toshiba");
        Computadora compuToshiba = new Computadora("Computadora Toshiba", monitorToshi, tecladoToshi, ratonToshi);

        //creacion de computadora dell
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora compuDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //creacion de computadora armada
        Computadora compuArmada = new Computadora("Computadora Armada", monitorDell, tecladoToshi, ratonToshi);

        //Agregamos las computadoras a la orden 
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compuToshiba);
        orden1.agregarComputadora(compuDell);
        orden1.agregarComputadora(compuArmada);
        //Imprimimos la orden
        orden1.mostrarOrden();
        
        User[] list = new User[5];
        list[0] = new User("dvd", 24.99, 967, true);
        list[1] = new User("pen", 4.99, 162, false);
        list[2] = new User("ipad", 624.99, 234, true);
        list[3] = new User("crayons", 4.99,127, false);
        list[4] = new User("laptop", 1444.99, 997, true);
        //CSVWriter.generateCSV(new File("/home/octavio/reporteTouchId/products.csv"),list);

        Date date = new  Date(); // your date
// Choose time zone in which you want to interpret your Date
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        new ScheduledComponent();


        Runnable runnableTask = () -> System.out.println("Task executed at ->" + new Date());
        algo.addTaskToScheduler(1, runnableTask);*/
        /*Time algo = java.sql.Time.valueOf("10:30:00");
        //date.getCalendarDate().getMonth()
        System.out.println(algo);
        
        
        
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.ENGLISH).format(ldt));
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH).format(ldt));
        System.out.println("hola:"+ ldt);
        
        Date myDate = new Date();
        System.out.println(myDate);
        System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(myDate));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(myDate));
        System.out.println(myDate);

        //Agregamos una segunda orden
       Orden orden2 = new Orden();
        orden2.agregarComputadora(compuArmada);
        orden2.agregarComputadora(compuDell);
        System.out.println("");
        orden2.mostrarOrden();
        Set listFilesUsingFilesList = (Set) listFilesUsingFilesList("/home/octavio");
        System.out.println(listFilesUsingFilesList);*/
    }
    
    private static void imprimir(Object[] coleccion) {
        for (Object elemento: coleccion)  {
            System.out.println("elemento: " + elemento);
        }
        
        System.out.println("");
    }

    @Bean
    @Primary
    public TaskScheduler fooTaskScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setThreadNamePrefix("FOO_SYNC_SCHEDULER");
        scheduler.setPoolSize(5);
        scheduler.setAwaitTerminationSeconds(210);
        scheduler.setWaitForTasksToCompleteOnShutdown(true);
        scheduler.setRemoveOnCancelPolicy(true);
        scheduler.initialize();
        return scheduler;
    }
    
    public static List<String> listFilesUsingFilesList(String dirs) throws IOException {
        Path dir = Paths.get("/home/octavio/");
        List<String> selectResponseList = null;
        
        
        List<File> files = Files.list(dir)
            .filter(path -> path.toString().contains("ideaIU"))
            .map(Path::toFile)
            .collect(Collectors.toList());
        int i=0;
        for(File file: files) {
            System.out.println(file.getPath());
        }
        
        
        
        return selectResponseList;
        
        /*try (Stream stream = Files.list(Paths.get(dir))) {
            return stream
              .map(Path::getFileName)
              .map(Path::toString)
              .collect(Collectors.toSet());
        }*/
    }
    
    
    public static Time valueOf(String s) {
        int hour;
        int minute;
        int second;
        int firstColon;
        int secondColon;

        if (s == null) throw new java.lang.IllegalArgumentException();

        firstColon = s.indexOf(':');
        secondColon = s.indexOf(':', firstColon+1);
        if ((firstColon > 0) & (secondColon > 0) &
            (secondColon < s.length()-1)) {
            hour = Integer.parseInt(s.substring(0, firstColon));
            minute =
                Integer.parseInt(s.substring(firstColon+1, secondColon));
            second = Integer.parseInt(s.substring(secondColon+1));
        } else {
            throw new java.lang.IllegalArgumentException();
        }

        return new Time(hour, minute, second);
    }




}
