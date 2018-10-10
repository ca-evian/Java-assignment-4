package test;

public class user {
    private String userName;
    public song order;
    user(String uN,String na,String au,String du)
    {
        userName = uN;
        order = new song(na,au,du);
    }
}
