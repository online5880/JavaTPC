package Part3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kr.inflearn.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class Project01_1 {
    public static void main(String[] args) {
        // * Object(BookDTO) -> JSON(String)
        BookDTO dto = new BookDTO("자바",21000,"에이콘",670);
        Gson g = new Gson();
        String json = g.toJson(dto);
        System.out.println(json); // * {"title":"자바","price":21000,"company":"에이콘","page":670}

        BookDTO dto1 = g.fromJson(json,BookDTO.class);
        System.out.println(dto); // * BookDTO{title='자바', price=21000, company='에이콘', page=670}

        List<BookDTO> list = new ArrayList<BookDTO>();
        list.add(new BookDTO("자바1",21000,"에이콘1",570));
        list.add(new BookDTO("자바2",31000,"에이콘2",600));
        list.add(new BookDTO("자바3",11000,"에이콘3",370));

        String listJson =  g.toJson(list);
        System.out.println(listJson);

        List<BookDTO> list1 = g.fromJson(listJson,new TypeToken<List<BookDTO>>(){}.getType());
        for (BookDTO bookDTO : list1) {
            System.out.println(bookDTO);
        }
    }
}
