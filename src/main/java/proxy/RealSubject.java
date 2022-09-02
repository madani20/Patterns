package proxy;

public class RealSubject implements Subject{
    Proxy proxy;

    public RealSubject(){

    }
    @Override
    public String GET(String url) {
        System.out.println("URL : " + url);
       return "succes ";
    }
}
