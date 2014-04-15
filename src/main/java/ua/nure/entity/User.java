package ua.nure.entity;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import ua.nure.entity.enums.Privilege;
import ua.nure.entity.enums.SocialNetwork;

import javax.persistence.*;

/**
 * Created by Dmitry on 14.04.2014.
 */
@Entity
@Table(name = "\"Users\"")
public class User {
    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "\"Users_userId_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @Column(name = "\"userId\"")
    private Integer userId;
    @Column(name = "\"socialId\"")
    private String socialId;
    @Column(name = "\"networkType\"")
    @Type(type = "ua.nure.entity.enums.PGEnumUserType",
            parameters = @Parameter(name = "enumClassName", value = "ua.nure.entity.enums.SocialNetwork"))
    private SocialNetwork network;
    @Column(name = "\"privilege\"")
    @Type(type = "ua.nure.entity.enums.PGEnumUserType",
            parameters = @Parameter(name = "enumClassName", value = "ua.nure.entity.enums.Privilege"))
    private Privilege privilege;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    public SocialNetwork getNetwork() {
        return network;
    }

    public void setNetwork(SocialNetwork network) {
        this.network = network;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege privilege) {
        this.privilege = privilege;
    }
}
