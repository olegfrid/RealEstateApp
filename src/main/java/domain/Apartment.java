package domain;

import java.io.FileOutputStream;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Apartment {

    @Id
    public String address;
    public String landLordID;
    public int price;
    public int floor;
    public boolean elevator;
    public int constructionYear;
    public boolean wareHouse;
    public String description;
    public double size;
    public double averageRank;
    public int numOfRankers;
    public boolean parking;
    public int numToilet;
    public int numRooms;
//    public byte[] image;
	public int views;
	public boolean isRent;
//	public FileOutputStream file;


    public Apartment(){}

    public Apartment(Integer price, Integer floor, Boolean elevator, Integer constructionYear,
    		Boolean wareHouse, String description, Double size, String address,
    		Boolean parking, Integer numToilet, Integer numRooms, String landLordID,boolean isRent) {
        this.setLandLordID(landLordID);
        this.setPrice(price);
        this.setFloor(floor);
        this.setElevator(elevator);
        this.setConstructionYear(constructionYear);
        this.setWareHouse(wareHouse);
        this.setDescription(description);
        this.setSize(size);
        this.setAddress(address);
        this.setParking(parking);
        this.setNumToilet(numToilet);
        this.setNumRooms(numRooms);
        averageRank = 0.0;
        numOfRankers = 0;
        views = 0;
        this.isRent = isRent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }
    
    public Boolean getIsRent() {
        return isRent;
    } public void setIsRent(boolean isRent) {
        this.isRent = isRent;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Boolean getElevator() {
        return elevator;
    }

    public void setElevator(Boolean elevator) {
        this.elevator = elevator;
    }

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }

    public Boolean getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(Boolean wareHouse) {
        this.wareHouse = wareHouse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getAverageRank() {
        return averageRank;
    }

    public void setAvergeRank(Double averageRank) {
    	numOfRankers++;
    	this.averageRank = ((numOfRankers - 1) * this.averageRank + averageRank) / (numOfRankers);
    }

    public Boolean getParking() {
        return parking;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    public Integer getNumToilet() {
        return numToilet;
    }

    public void setNumToilet(Integer numToilet) {
        this.numToilet = numToilet;
    }

    public Integer getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(Integer numRooms) {
        this.numRooms = numRooms;
    }

    public String getLandLordID() {
        return landLordID;
    }

    public void setLandLordID(String landLordID) {
        this.landLordID = landLordID;
    }



	public void addViews() {
		views++;
	}

	public int getViews() {
		return views;
	}

	public void setFile(FileOutputStream stream) {
		// TODO Auto-generated method stub
//		this.file = stream;
	}

	public int getNumOfRankers() {
		return numOfRankers;
	}
}


