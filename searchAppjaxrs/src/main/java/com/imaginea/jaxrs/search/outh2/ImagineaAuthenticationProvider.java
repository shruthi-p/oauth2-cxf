package com.imaginea.jaxrs.search.outh2;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by shruthip on 9/11/16.
 */
@Component
public class ImagineaAuthenticationProvider implements AuthenticationProvider {

    public Authentication authenticate(Authentication authentication){
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();
        // TODO db authentication
        if(name!=null && name.equalsIgnoreCase("admin") && password!=null && password.equalsIgnoreCase("password")){

            ArrayList<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            GrantedAuthority grantedAuthority  = new GrantedAuthority() {
                @Override
                public String getAuthority() {
                    return "ROLE_USER";
                }
            };
            authorities.add(grantedAuthority);
            return new UsernamePasswordAuthenticationToken(name, password, authorities);
        }

        return  null;
    }

    public boolean supports(Class<?> authentication){
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
