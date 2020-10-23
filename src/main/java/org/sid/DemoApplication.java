package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private ContactRepository contactRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		
		contactRepository.save(new Contact("hassani","mohamed",df.parse("12/01/1998"),"hasan@gmail.com",0666666666,"hasan.png"));

		contactRepository.save(new Contact("dahmani","ali",df.parse("12/01/1997"),"ali@gmail.com",0666666666,"hasan.png"));

		contactRepository.save(new Contact("fouami","khalid",df.parse("12/01/1994"),"khalid@gmail.com",0666666666,"hasan.png"));

		contactRepository.save(new Contact("hassani","mohamed",df.parse("12/01/1998"),"hasan@gmail.com",0666666666,"hasan.png"));

		contactRepository.save(new Contact("dahmani","ali",df.parse("12/01/1997"),"ali@gmail.com",0666666666,"hasan.png"));

		contactRepository.save(new Contact("fouami","khalid",df.parse("12/01/1994"),"khalid@gmail.com",0666666666,"hasan.png"));

		
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
	}

}
