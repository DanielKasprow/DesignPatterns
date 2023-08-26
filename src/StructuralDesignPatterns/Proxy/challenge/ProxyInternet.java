package StructuralDesignPatterns.Proxy.challenge;

import java.util.ArrayList;
import java.util.List;

class ProxyInternet implements Internet{

    private static List<String> restrictedSited;
    static{
        restrictedSited = new ArrayList<String>();
        restrictedSited.add("www.tiktok.com");
        restrictedSited.add("www.youtube.com");
    }

    RealInternet realInternet;
    private String hostName;

    public ProxyInternet(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public void connect() throws Exception {
        if (realInternet == null) {
            realInternet = new RealInternet(hostName);
        }
        if(restrictedSited.contains(hostName.toLowerCase())){
            throw new Exception("Access Denied");
        }
        realInternet.connect();
    }
}
