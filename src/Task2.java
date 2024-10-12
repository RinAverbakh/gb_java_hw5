import java.util.Deque;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {

        BrowserHistory browserHistory = new BrowserHistory();
        
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");

        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.getHistory());

    }
}

class BrowserHistory{
    private Deque<String> bh = new LinkedList<>();

    public void visitSite(String site) {
        bh.addFirst(site);
    }

    public String back(int steps) {
        if (steps >= bh.size()) return null;
            return bh.stream().skip(steps).findFirst().orElse(null);
            
    }

    public Deque<String> getHistory() {
        return bh;
    }


}
