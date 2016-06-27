package model;

public enum PetAvailabilityStatusEnum {
	
AVAILABLE("available"),
PENDING("pending"),
SOLD("sold");
	
private final String status;
PetAvailabilityStatusEnum(String status){
	this.status=status;
}

public String getPetAvailabilityStatus(){
	return status;
}

}
