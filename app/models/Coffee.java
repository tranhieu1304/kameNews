package models;

import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

@Entity
public class Coffee extends Model {

	@Id
	public Integer id;

	@Constraints.Required()
	@Constraints.MinLength(5)
	@Column(name = "tem02")
	public String name;

	public static Finder<Integer, Coffee> find =
			new Finder<Integer, Coffee>(Integer.class, Coffee.class);

}
