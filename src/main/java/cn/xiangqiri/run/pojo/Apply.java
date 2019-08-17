package cn.xiangqiri.run.pojo;

import lombok.Data;

@Data
public class Apply {
    private String color;
    private Integer windet;

    public Apply(String color, Integer windet) {
        this.color = color;
        this.windet = windet;
    }
}
