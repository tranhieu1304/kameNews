/**
 *
 */
package models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;

/**
 * @author mac_thieu
 *
 */
@Entity
@Table(name = "comment")
public class Comment extends Model {
	@Id
	@GeneratedValue
	public Long id;

	@Column(name = "content", nullable = false, length = 255)
	public String content;

	@Column(name = "kame", length = 255)
	public String kame;

	@Column(name = "createDate")
	@CreatedTimestamp
	public Date createDate = new Date();

	@Column(name = "isDelete")
	public boolean isDelete = false;

	// Relationship
	@ManyToOne(cascade = CascadeType.ALL)
	public User user;

	@ManyToOne(cascade = CascadeType.ALL)
	public Post post;

	static Find<Long, Comment> find = new Find<Long, Comment>() {};

	public void save() {
		if (this.createDate == null) {
			this.createDate = new Date();
		}
		super.save();
	}

	public void update() {
		if (this.createDate == null) {
			this.createDate = new Date();
		}
		super.update();
	}

	public static Comment findById(long id) {
		return find.byId(id);
	}

	public void deletePost() {
		this.isDelete = true;
		super.update();
	}
}
