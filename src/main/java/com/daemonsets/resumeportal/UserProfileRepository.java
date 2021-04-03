package com.daemonsets.resumeportal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daemonsets.resumeportal.models.User;
import com.daemonsets.resumeportal.models.UserProfile;

import java.util.Optional;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {
    Optional<UserProfile> findByUserName(String userName);
}