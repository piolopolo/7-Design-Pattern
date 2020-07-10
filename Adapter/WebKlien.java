public class WebKlien {

    private Requester webRequester;

    public WebKlien(Requester webRequester) {
        this.webRequester = webRequester;
    }

    private Object buatObjek() {
        Object object = new Object();
    // ... beberapa statement untuk objek yang dibuat.
        return object;
    } 

    public void lakukan() {
        Object object = buatObjek();
        int status = webRequester.Minta(object);
        if (status == 200) {
            System.out.println("OK");
        } else {
            System.out.println("Error");
        }
    }
}