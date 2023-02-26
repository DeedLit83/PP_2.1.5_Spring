package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Island2 {

    private Wood3 wood3;

    public Island2(Wood3 wood3) {
        this.wood3 = wood3;
    }

    @Override
    public String toString() {
        return "на том острове дуб стоит, " + wood3.toString();
    }
}
