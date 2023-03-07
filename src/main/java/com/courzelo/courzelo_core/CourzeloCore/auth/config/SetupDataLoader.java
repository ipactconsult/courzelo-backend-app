package com.courzelo.courzelo_core.CourzeloCore.auth.config;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.courzelo.courzelo_core.CourzeloCore.auth.dto.SocialProvider;
import com.courzelo.courzelo_core.CourzeloCore.auth.entity.Role;
import com.courzelo.courzelo_core.CourzeloCore.auth.entity.User;
import com.courzelo.courzelo_core.CourzeloCore.auth.repo.RoleRepository;
import com.courzelo.courzelo_core.CourzeloCore.auth.repo.UserRepository;
import com.courzelo.courzelo_core.CourzeloCore.auth.service.SequenceGeneratorService;

@Component
public class SetupDataLoader implements ApplicationListener<ContextRefreshedEvent> {

	private boolean alreadySetup = false;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;

	@Override
	@Transactional
	public void onApplicationEvent(final ContextRefreshedEvent event) {
		if (alreadySetup) {
			return;
		}
		// Create initial roles
		Role userRole = createRoleIfNotFound(Role.ROLE_USER);
		Role adminRole = createRoleIfNotFound(Role.ROLE_ADMIN);
		Role superadminRole = createRoleIfNotFound(Role.ROLE_SUPER_ADMIN);
		Role trainerRole = createRoleIfNotFound(Role.ROLE_TRAINER);
		Role traineeRole = createRoleIfNotFound(Role.ROLE_TRAINEE);
		Role RecruterRole = createRoleIfNotFound(Role.ROLE_RECRUITER);
		Set<Role> role = new HashSet<Role>() {{
		    add(userRole);
		    add(adminRole);
		    add(superadminRole);
		    add(trainerRole);
		    add(traineeRole);
		    add(RecruterRole);
		  
		}};
		createUserIfNotFound("admin@javachinna.com", role); //Set.of(userRole, adminRole));
		alreadySetup = true;
	}

	@Transactional
	private final User createUserIfNotFound(final String email, Set<Role> roles) {
		User user = userRepository.findByEmail(email);
		if (user == null) {
			user = new User();
			user.setId(sequenceGeneratorService.generateSequence(User.SEQUENCE_NAME));
			user.setDisplayName("Admin");
			user.setEmail(email);
			user.setPassword(passwordEncoder.encode("admin@"));
			user.setRoles(roles);
			user.setProvider(SocialProvider.LOCAL.getProviderType());
			user.setEnabled(true);
			Date now = Calendar.getInstance().getTime();
			user.setCreatedDate(now);
			user.setModifiedDate(now);
			user = userRepository.save(user);
		}
		return user;
	}

	@Transactional
	private final Role createRoleIfNotFound(final String name) {
		Role role = roleRepository.findByName(name);
		if (role == null) {
			//role.setRoleId(sequenceGeneratorService.generateSequence(Role.SEQUENCE_NAME));
			Long roleId = sequenceGeneratorService.generateSequence(Role.SEQUENCE_NAME);
			role = roleRepository.save(new Role(roleId, name));
		}
		return role;
	}
}