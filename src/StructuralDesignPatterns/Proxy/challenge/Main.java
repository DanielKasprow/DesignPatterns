package StructuralDesignPatterns.Proxy.challenge;



class Main {
    public static void main(String[] args) throws Exception {
        Internet internet  = new ProxyInternet("www.udemy.com");
        Internet internet2  = new ProxyInternet("www.tiktok.com");

        try {
            internet.connect();
            System.out.println("");

            internet2.connect();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
