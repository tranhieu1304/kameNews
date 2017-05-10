package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avaje.ebean.Model;

import play.data.validation.Constraints;

@Entity
@Table(name = "contact")
public class Contact extends Model {

	@Id
	public Long id;

	@Constraints.Required
	public String name;

	@Column(name = "title")
	public String title;
	public String email;

	public static Model.Finder<Long, Contact> find = new Model.Finder(Long.class, Contact.class);

	public static List<Contact> findAll() {
		return find.all();
	}

	public String toString() {
		return name;
	}
}
