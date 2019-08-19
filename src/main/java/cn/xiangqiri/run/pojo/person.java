package cn.xiangqiri.run.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class person {

    private Integer id;
    private Integer age;
    private String name;


    public person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
