package evolution.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Student {
	private int id;
	private String name;
	private String gender;
	private int age;
	private Date birthday;
	private byte[] document;
}
