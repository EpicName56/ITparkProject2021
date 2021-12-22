package lesson14;

import java.io.Serializable;

class Record implements Serializable, Cloneable {
    final long id;
    private String phone;
    private String name;
    private String location;

    Record(long id, String phone, String name, String location) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return name + " : " + phone + " , " + location;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Record other = (Record) obj;
        if ((this.phone == null) ? (other.phone != null) : !this.phone.equals(other.phone)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.location == null) ? (other.location != null) : !this.location.equals(other.location)) {
            return false;
        }
        return true;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public long getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
