import java.util.*;
import java.text.SimpleDateFormat;

public class LoadingUnloading{
    public static Boolean canUnloadAll(Collection<UnloadingTime> unloadingTimes) {

        Iterator<UnloadingTime> iterator = unloadingTimes.iterator();

        for (UnloadingTime ut : unloadingTimes) {
            if (iterator.hasNext()){
                UnloadingTime next = iterator.next();
                if (ut.getEnd().after(next.getStart()) || ut.getStart().before(next.getEnd())){
                    return true;
                }
            }


        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<UnloadingTime> unloadingTimes = new ArrayList<UnloadingTime>();
        unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 19:00"), sdf.parse("03/04/2019 20:30")));
        unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 22:10"), sdf.parse("03/04/2019 22:30")));
        unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 20:30"), sdf.parse("03/04/2019 22:00")));

        System.out.println(LoadingUnloading.canUnloadAll(unloadingTimes));
    }
}

class UnloadingTime {
    private Date start, end;

    public UnloadingTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}