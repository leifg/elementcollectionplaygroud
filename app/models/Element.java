package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Element extends Model {

	public String name;
	
	@ManyToOne
	public CollectionHolder holder;
}
