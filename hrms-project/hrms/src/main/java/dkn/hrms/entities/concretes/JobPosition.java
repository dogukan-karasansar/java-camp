package dkn.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "job_positions")
public class JobPosition {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "position_name")
    private String positionName;

    public JobPosition() {}

    public JobPosition(int id, String positionName) {
        this.setId(id);
        this.setPositionName(positionName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
