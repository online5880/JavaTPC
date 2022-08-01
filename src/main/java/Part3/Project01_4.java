package Part3;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Project01_4 {
    public static void main(String[] args) {

        String apiURL = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=";
        String client_id = "py3bgu29ae";
        String client_secret = "EMjrUK2LD475NCbZuNTmzvY4TeD2uOSqLvMJUX0O";
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("주소를 입력하세요: ");
            String address = io.readLine();
            String addr = URLEncoder.encode(address, StandardCharsets.UTF_8);
            String reqURL = apiURL+addr;

            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID",client_id);
            conn.setRequestProperty("X-NCP-APIGW-API-KEY",client_secret);
            BufferedReader br;
            int responseCode = conn.getResponseCode();
            if(responseCode == 200){
                br = new BufferedReader(new InputStreamReader(conn.getInputStream(),StandardCharsets.UTF_8));
            }else{
                br = new BufferedReader(new InputStreamReader(conn.getErrorStream(),StandardCharsets.UTF_8));
            }
            String line;
            StringBuffer response = new StringBuffer();
            while ((line = br.readLine()) != null){
                response.append(line);
            }
            br.close();

            JSONTokener tokener = new JSONTokener(response.toString());
            JSONObject object = new JSONObject(tokener);
            System.out.println(object.toString(2));

            JSONArray arr = object.getJSONArray("addresses");
            for(int i = 0; i<arr.length(); i++){
                JSONObject temp = (JSONObject) arr.get(i);
                System.out.println("address : " + temp.get("roadAddress"));
                System.out.println("jibunAddress : " + temp.get("jibunAddress"));
                System.out.println("경도 : " + temp.get("x"));
                System.out.println("위도 : " + temp.get("y"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
