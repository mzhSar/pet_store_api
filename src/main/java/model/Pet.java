package model;

import java.util.ArrayList;
import java.util.List;

public class Pet {
	
	private int id;
	private Category category;
	private String name;
	private List<String> photoUrls=new ArrayList<String>();
	private List<Tag> tags=new ArrayList<Tag>();
	private PetAvailabilityStatusEnum avaiabilityStatus;
	
	public Pet(int id, Category category, String name, List<String> photoUrls, List<Tag> tags,
			PetAvailabilityStatusEnum avaiabilityStatus) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.avaiabilityStatus = avaiabilityStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public PetAvailabilityStatusEnum getAvaiabilityStatus() {
		return avaiabilityStatus;
	}
	public void setAvaiabilityStatus(PetAvailabilityStatusEnum avaiabilityStatus) {
		this.avaiabilityStatus = avaiabilityStatus;
	}

}
