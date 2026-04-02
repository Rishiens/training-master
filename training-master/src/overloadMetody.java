
public class overloadMetody {
    public static void main(String[] args) {

    String sport = cardio("behanie");
        //String sport = cardio("behanie" + "bicykel");
        //String sport = cardio("behanie" + "bicykel" + "plávanie");

        System.out.print(sport);


}
    static String cardio(String zaciatocnik){
        return zaciatocnik + " to bude makačka!";
    }
    static String cardio(String zaciatocnik, String pokrocily){
        return zaciatocnik + " " + pokrocily + " to bude makačka!";
    }
    static String cardio(String zaciatocnik, String pokrocily, String expert){
        return zaciatocnik + " " + pokrocily + " " + expert + " to bude makačka!";
    }}



