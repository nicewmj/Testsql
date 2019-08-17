package cn.xiangqiri.run.pojo;

import lombok.Data;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String name;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    private String address;
    private String status;


}
