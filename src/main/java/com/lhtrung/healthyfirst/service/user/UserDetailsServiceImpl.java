//package com.lhtrung.healthyfirst.service.user;
//
//import com.lhtrung.healthyfirst.dao.AuthDao;
//import com.lhtrung.healthyfirst.dao.UserDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import javax.transaction.Transactional;
//import java.util.Set;
//
//@Component
//public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    private AuthDao auth;
//
//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Object user = auth.getUserByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//        Set<Role> roles = user.getRoles();
//        for (Role role : roles) {
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
//        }
//
//        return new org.springframework.security.core.userdetails.User(
//                user.getEmail(), user.getPassword(), grantedAuthorities);
//    }
//}
