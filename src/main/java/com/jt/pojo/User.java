package com.jt.pojo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data     //sts .java lombok文件参与.java编译为.class 要装插件   
		 //服务器中只运行 .class
@Accessors(chain = true)
public class User {
	
	private Integer id;  //属性定义时，必须使用包装类型。
	private String name;
	
	/*
	 * public User setId(Integer id) {
	 * 
	 * this.id = id; return this; }
	 */
}
