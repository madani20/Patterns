package proxy;

public class Proxy implements Subject{
    private RealSubject realSubject;
    public Proxy(){
        realSubject = new RealSubject();
    }
    @Override
    public String GET(String url) {
        String result ="";
        if (url.contains("free.fr"))
            result = realSubject.GET(url);
        else
            result = "fail";
        return result;


    }
}
