package StructuralDesignPatterns.Proxy.challenge;

interface Internet {
    void connect() throws Exception;
}
class RealInternet implements Internet{

    private String hostName;

    public RealInternet(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to: " + hostName);
    }

}
