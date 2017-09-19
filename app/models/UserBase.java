/**
 *
 */
package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.avaje.ebean.Model;

/**
 * @author mac_thieu
 *
 */
@MappedSuperclass
public class UserBase extends Model {
	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
