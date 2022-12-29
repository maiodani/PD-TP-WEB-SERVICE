package pt.isec.pd.boxoffice.web_service.database;

public class DataBaseManager {
    private static final String dbUrl = "jdbc:sqlite:C:/ISEC/OneDrive - ISEC/2022-2023/1 Semestre/PD/pd_tp_web_service/src/main/java/../../../../PD-TP/src/pt/isec/pd/boxoffice/res/DB-5001";

    public boolean login(String username, String password){
        if(username.equals("Daniel") && password.equals("1234")){
            return true;
        }
        return false;
    }

    public String shows(String dateStart, String dateFinal){
        return null;
    }
}
