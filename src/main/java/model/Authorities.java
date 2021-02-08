package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Authorities {

    @Id
    @GeneratedValue
    private int authoritiesId;
    private String username;
    private Enum authority;

    public int getAuthoritiesId() {
        return authoritiesId;
    }

    public void setAuthoritiesId(int authoritiesId) {
        this.authoritiesId = authoritiesId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Enum getAuthority() {
        return authority;
    }

    public void setAuthority(Enum authority) {
        this.authority = authority;
    }
}

