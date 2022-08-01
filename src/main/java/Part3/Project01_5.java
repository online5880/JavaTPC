package Part3;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class Project01_5 {
    static String client_id = "py3bgu29ae";
    static String client_secret = "EMjrUK2LD475NCbZuNTmzvY4TeD2uOSqLvMJUX0O";

    public static void map_service(String point_x, String point_y, String address){
        String URL_STATICMAP = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
        try{
            String pos = URLEncoder.encode(point_x+" "+point_y,StandardCharsets.UTF_8);
            String url = URL_STATICMAP;
            url+= "center=" +point_x +","+point_y;
            url+="&level=16&w=700&h=500";
            url+="&markers=type:t|size:mid|pos:"+pos+"|label:"+URLEncoder.encode(address,StandardCharsets.UTF_8);
            URL u = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID",client_id);
            conn.setRequestProperty("X-NCP-APIGW-API-KEY",client_secret);
            int responseCode = conn.getResponseCode();
            BufferedReader br;
            if(responseCode == 200){ // * 정상
                InputStream is = conn.getInputStream();
                int read = 0;
                byte[] bytes = new byte[1024];
                // * 랜덤한 이름으로 파일 생성
                String tempname = Long.valueOf(new Date().getTime()).toString();
                File f = new File(tempname + ".jpg");
                f.createNewFile();
                OutputStream outputStream = new FileOutputStream(f);
                while ((read = is.read(bytes))!= -1){
                    outputStream.write(bytes, 0, read);
                }
                is.close();
            }else{
                br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                String inputLine;
                StringBuffer  response = new StringBuffer();
                while ((inputLine = br.readLine()) != null){
                    response.append(inputLine);
                }
                br.close();
                System.out.println(response.toString());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        String apiURL = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=";
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

            String x ="";
            String y ="";
            String z ="";
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
                // * 추가된 부분
                x=(String)temp.get("x");
                y=(String)temp.get("y");
                z=(String)temp.get("roadAddress");
            }
            // * 추가된 부분
            map_service(x,y,z);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
