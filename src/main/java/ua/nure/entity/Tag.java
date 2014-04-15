package ua.nure.entity;

import javax.persistence.*;

/**
 * Created by Dmitry on 15.04.2014.
 */
@Entity
@Table(name = "\"Tags\"")
public class Tag {
    @Id
    @SequenceGenerator(name = "tags_seq", sequenceName = "\"Tags_tagId_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tags_seq")
    @Column(name = "\"tagId\"")
    private Integer tagId;
    @Column(name = "\"name\"")
    private String name;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
