import java.util.Stack;

class  Webhistroy{
    private String current_page;
    private Stack<String> bws,fws;

    public Webhistroy(){
        this.current_page="Home_page";
        bws= new Stack<>();
        fws = new Stack<>();

    }

    public void visit(String page){
        bws.push(current_page);
        current_page=page;
        fws.clear();
    }

    public void previous(){
        if (!bws.isEmpty()){
            fws.push(current_page);
            current_page= bws.pop();
        }
    }
    public String getCurrent_page(){
        return current_page;
    }
}
public class StackImplementation {
    public static void main(String[] args) {
        Webhistroy web = new Webhistroy();
        web.visit("Flipkart");
        web.visit("Flipkart HomePage");
        web.previous();
        System.out.println(web.getCurrent_page());

    }
}
