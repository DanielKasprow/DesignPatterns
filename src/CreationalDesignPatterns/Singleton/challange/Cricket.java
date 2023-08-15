package CreationalDesignPatterns.Singleton.challange;

class Cricket {
    private String captain1 = "";
    private String captain2 = "";

    private Cricket(){}
    private static class cricketHelper{
        private static final Cricket uniqueInstance = new Cricket();
    }
    public static Cricket getInstance(){
        return cricketHelper.uniqueInstance;
    }

    public String getCaptain1() {
        return captain1;
    }

    public void setCaptain1(final String captain1) {
        System.out.println("Trying to make a captain for our team");
        if(!captain1.equals(this.captain2)) {
            this.captain1 = captain1;
            System.out.println("New Captain selected");
        } else {
            System.out.println("c1 and c2 are the same instance");
        }
    }

    public String getCaptain2() {
        return captain2;
    }

    public void setCaptain2(final String captain2) {
        System.out.println("Trying to make a captain");
        if(!captain2.equals(this.captain1)) {
            this.captain2 = captain2;
            System.out.println("New Captain selected");
        } else {
            System.out.println("c1 and c2 are the same instance");
        }
    }
}
