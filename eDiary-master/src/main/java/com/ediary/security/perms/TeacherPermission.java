package com.ediary.security.perms;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasRole('TEACHER')" +
        " AND @teacherAuthenticationManager.teacherIdMatches(authentication, #teacherId)")
public @interface TeacherPermission {
}
