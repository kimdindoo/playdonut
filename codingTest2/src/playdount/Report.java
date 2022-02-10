package playdount;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Report {
    List<String> reports;

    public Report() {
        this.reports = new ArrayList<String>();
    }

    public void write(String item) {
        String log = (reports.size() + 1) + ". " + item + " 1개 ";
        reports.add(log);
    }

    public void print() {
        System.out.println("======  사용자의 구매 이력  =======");
        for (String report : reports) {
            System.out.println(report);
        }
        System.out.println("=================================");
    }

}