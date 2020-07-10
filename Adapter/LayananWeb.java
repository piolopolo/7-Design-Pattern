class LayananWeb {

    private String web;
    
    LayananWeb(String web) {
        this.web = web;
    }
    
    public Json request(Json result){
        Json json = new Json();
        /*
        ... statement yang dilakukan
        */
        System.out.println("Requesting to "+ web);
        return json;
    }
    
}