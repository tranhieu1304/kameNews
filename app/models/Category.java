/**
 *
 */
package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.avaje.ebean.Model;

/**
 * @author mac_thieu
 *
 */
@Entity
@Table(name = "category")
public class Category extends Model {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "name")
	public String name;


	@Column(name = "titleKa")
	public String title;

	// Relationship
	@ManyToMany(cascade = CascadeType.ALL)
	public List<Post> posts;

	public static Finder<Long, Category> find = new Finder<>(Category.class);

	public static Category findById(String id) {
		return find.where().eq("id", id).findUnique();
	}

	public void save() {

	}

	public void update() {

	}

	public void deletePost() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
