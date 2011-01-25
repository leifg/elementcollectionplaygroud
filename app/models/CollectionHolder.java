package models;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class CollectionHolder extends Model {
	
	public String name;
	
	@ElementCollection
	public Map<String, String> genericParameters;
	
	@OneToMany
	public List<Element> elements;
}
