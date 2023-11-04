package org.launchcode.techjobs.oo;

import com.sun.jdi.connect.Connector;

import java.lang.reflect.Parameter;
import java.util.Objects;

public class Job {

    private int id;

    public int getId() {
        return id;
    }
    private static int nextId = 1;
    //first constructor to initialize unique id
    public Job() {
        id = nextId;
        nextId++;
    }
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private Employer employer;
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    private Location location;
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    private PositionType positionType;
    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    private CoreCompetency coreCompetency;
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //second constructor to call first id field and has five parameters in specific order
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }
    //ToString
    @Override
    public String toString() {
        String result = "Default";
        if (id != 0 && (this.name == null && this.employer == null && this.location == null && this.positionType == null && this.coreCompetency == null)) {
            result = (System.lineSeparator() + "OOPS! This job does not seem to exist." + System.lineSeparator());
        }
    else if (this.name == null || this.employer == null || this.location == null || this.positionType == null || this.coreCompetency == null) {
        result = (System.lineSeparator() + "ID: " + id + "\n" + "Name: " + (this.name != null ? this.name : "Data not available") + "\n" + "Employer: " + (this.employer != null ? this.employer : "Data not available") + "\n" + "Location: " + (this.location != null ? this.location : "Data not available") + "\n" + "Position Type: " + (this.positionType != null ? this.positionType : "Data not available") + "\n" + "Core Competency: " + (this.coreCompetency != null ? this.coreCompetency : "Data not available") + System.lineSeparator());

    }
        else if (this.name != null || this.employer != null || this.location != null || this.positionType != null || this.coreCompetency != null) {
            result = (System.lineSeparator() + "ID: " + id + "\n" + "Name: " + (!this.name.isEmpty() ? this.name : "Data not available") + "\n" + "Employer: " + (!this.employer.getValue().isEmpty() ? this.employer : "Data not available") + "\n" + "Location: " + (!this.location.getValue().isEmpty() ? this.location : "Data not available") + "\n" + "Position Type: " + (!this.positionType.getValue().isEmpty() ? this.positionType : "Data not available") + "\n" + "Core Competency: " + (!this.coreCompetency.getValue().isEmpty() ? this.coreCompetency : "Data not available") + System.lineSeparator());

        }
        return result;
    }


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals (Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
