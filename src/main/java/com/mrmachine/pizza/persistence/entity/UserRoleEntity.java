package com.mrmachine.pizza.persistence.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_role")
public class UserRoleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 20)
	private String role;
	
	@Column(name = "granted_date", nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDateTime grantedDate;
	
	@ManyToOne
	@JoinColumn(name = "user_id_username", referencedColumnName = "username", insertable = false, updatable = false)
	private UserEntity user;

}
