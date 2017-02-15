package evolution.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.IOUtils;
import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Student;
import evolution.util.AnyUtil;

public class FileStorage {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Session session = AnySession.getSession();
		Student student = new Student();
		student.setId(AnyUtil.randomInt());
		student.setBirthday(new Date());
		student.setDocument(IOUtils.toByteArray(new FileInputStream(new File("D:/document.txt"))));
		session.save(student);
		session.getTransaction().commit();
	}
}
