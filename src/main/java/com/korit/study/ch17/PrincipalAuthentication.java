package com.korit.study.ch17;

import java.util.Arrays;

public class PrincipalAuthentication extends AbstractAuthentication {

    public PrincipalAuthentication(User user) {
        super(user);
    }

    public boolean containsAuthority(String role) {
        for (GrantedAuthority authority : getAuthorities()) {
            if (authority.getAuthority().equalsIgnoreCase(role)) {
                return true;
            }
            if (authority.getAuthority().replaceAll("ROLE_", "").equalsIgnoreCase(role)) {
                return true;
            }
        }
        return false;
    }

    // CTRL + I
    @Override
    public void checkAuthority() {
        System.out.print("권한: [ ");
        for (GrantedAuthority authority : getAuthorities()) {
            System.out.print(authority.getAuthority() + " ");
        }
        System.out.println("]");
    }

    @Override
    public String getUsername() {
        return super.getUser().getUsername();
    }

    @Override
    public String getPassword() {
        return getUser().getPassword();
    }

    @Override
    public GrantedAuthority[] getAuthorities() {
        GrantedAuthority[] authorities = new GrantedAuthority[super.getUser().getRoles().length];
        for (int i = 0; i < super.getUser().getRoles().length; i++) {
            authorities[i] = new SimpleGrantedAuthority(super.getUser().getRoles()[i]);
            // super.getUser().getRoles()[i] 자체로는 String임
            // SimpleGrantedAuthority를 생성해야 한다
        }
        return authorities;
    }

}
