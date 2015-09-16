package br.com.vrosendo.securitytest.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by valdeci on 13/09/2015.
 */
@Entity
@Table(name = "USERS")
public class User implements Serializable {

    @Id
    private Integer id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private Boolean enabled;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    List<Authority> authorities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }
}
