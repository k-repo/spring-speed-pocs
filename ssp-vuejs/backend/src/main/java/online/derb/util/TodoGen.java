package online.derb.util;

import online.derb.model.Todo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jacky on 07/04/2017.
 */
public class TodoGen {


    public static List<Todo> TodoListcreate() {

        List<Todo> list = new ArrayList<Todo>();

        for (int i = 0; i < 10; i++) {
            list.add(Todo.Builder.aTodo().withText(i+" hihihi").build());
        }
        return list;

    }


}
