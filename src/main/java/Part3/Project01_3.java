package Part3;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;

public class Project01_3 {
    public static void main(String[] args) {
        String src = "info.json";
        // * IO -> Stream(스트림)
        InputStream is = Project01_3.class.getResourceAsStream(src);
        if(is == null){
            throw new NullPointerException("Cannot find resource file");
        }else{
            JSONTokener tokener = new JSONTokener(is);
            JSONObject object = new JSONObject(tokener);
            JSONArray students = object.getJSONArray("students");
            for(int i = 0; i<students.length(); i++){
                JSONObject student = (JSONObject)students.get(i);
                System.out.print(student.get("name")+"\t");
                System.out.print(student.get("address")+"\t");
                System.out.print(student.get("phone"));
            }
        }
    }
}
