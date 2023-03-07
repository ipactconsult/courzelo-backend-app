package com.courzelo.courzelo_core.CourzeloCore.auth.controller;

import com.courzelo.courzelo_core.CourzeloCore.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.courzelo.courzelo_core.CourzeloCore.auth.config.CurrentUser;
import com.courzelo.courzelo_core.CourzeloCore.auth.dto.LocalUser;
import com.courzelo.courzelo_core.CourzeloCore.auth.dto.SignUpRequest;
import com.courzelo.courzelo_core.CourzeloCore.auth.entity.User;
import com.courzelo.courzelo_core.CourzeloCore.auth.util.GeneralUtils;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/user/me")
	@PreAuthorize("hasRole('ROLE_TRAINEE')")
	public ResponseEntity<?> getCurrentUser(@CurrentUser LocalUser user) {
		return ResponseEntity.ok(GeneralUtils.buildUserInfo(user));
	}

	@GetMapping("/all")
	public ResponseEntity<?> getContent() {
		return ResponseEntity.ok("Public content goes here");
	}

	@GetMapping("/user")
	@PreAuthorize("hasRole('ROLE_TRAINEE')")
	public ResponseEntity<?> getUserContent() {
		return ResponseEntity.ok("User content goes here");
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> getAdminContent() {
		return ResponseEntity.ok("Admin content goes here");
	}

	@GetMapping("/businessSpace")
	@PreAuthorize("hasRole('ROLE_SUPERADMIN') or hasRole('ROLE_RECRUITER')")
	public ResponseEntity<?> getCourzelloForBusinessContent() {
		return ResponseEntity.ok("Courzello Business content goes here");
	}




	@PostMapping("follow/{userId}/{currentUser}")
	public  ResponseEntity  followUser(@PathVariable long userId, @PathVariable long currentUser )
	{
		 userService.FollowUser(userId, currentUser);
		return new ResponseEntity(HttpStatus.OK);
	}
	@PostMapping("unfollow/{userId}/{currentUser}")
	public  ResponseEntity  unfollowUser(@PathVariable Long userId,@PathVariable long currentUser )
	{
	 	userService.UnFollowUser(userId,currentUser);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	@PostMapping("addUser")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') or hasRole('ROLE_ADMIN')")
	public long addUser(@RequestBody SignUpRequest request) {
		return userService.addUser(request);

	}
	
	@DeleteMapping("/delete/{id}")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') or hasRole('ROLE_ADMIN')")
	public ResponseEntity deleteUser(@PathVariable long id) {
		userService.deleteUser(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
}
