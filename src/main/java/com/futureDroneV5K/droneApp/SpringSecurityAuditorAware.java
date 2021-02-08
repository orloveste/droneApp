package com.futureDroneV5K.droneApp;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class SpringSecurityAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
//        sec context holder
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
//        return Optional.empty();
        return Optional.ofNullable(username).filter(s -> !s.isEmpty()); //return username if is not null

    }
}
