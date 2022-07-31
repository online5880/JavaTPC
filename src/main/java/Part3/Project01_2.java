package Part3;

import org.json.JSONArray;
import org.json.JSONObject;

public class Project01_2 {
    public static void main(String[] args) {
        // * JSON-Java(org.json)
        JSONArray students = new JSONArray();

        JSONObject student = new JSONObject();
        student.put("name","홍길동");
        student.put("phone","010-1111-1111");
        student.put("address","서울");
        System.out.println(student); // * {"address":"서울","phone":"010-1111-1111","name":"홍길동"}
        students.put(student);

        JSONObject student1 = new JSONObject();
        student1.put("name","나길동");
        student1.put("phone","010-2222-2222");
        student1.put("address","광주");
        students.put(student1);

        JSONObject object = new JSONObject();
        object.put("students",students);

        System.out.println(object.toString(2));

    }
}
