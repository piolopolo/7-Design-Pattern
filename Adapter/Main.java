public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String web = "https://polban.ac.id";
        LayananWeb layanan = new LayananWeb(web);
        WebAdapter adapter = new WebAdapter();
        adapter.Hubungkan(layanan);
        WebKlien client = new WebKlien(adapter);
        client.lakukan();

    }

}