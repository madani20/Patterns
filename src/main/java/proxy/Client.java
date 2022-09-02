package proxy;

public class Client {
    public static void main(String[] args) {
       //La requete

            Proxy proxy = new Proxy();
            System.out.println(proxy.GET("https://www.google.fr"));
            System.out.println(proxy.GET("https://www.requete@anonymous.fr"));
            System.out.println(proxy.GET("https://www.amthousiasme@free.fr"));

        }
    }



