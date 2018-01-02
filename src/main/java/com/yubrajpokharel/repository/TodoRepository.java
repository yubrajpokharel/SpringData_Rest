package com.yubrajpokharel.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yubrajpokharel.model.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {
	List<Todo> findByTitleAndDescription(String title, String description);

	List<Todo> findDistinctTodoByTitleOrDescription(String title,
			String description);

	List<Todo> findByTitleIgnoreCase(String title, String description);

	List<Todo> findByTitleOrderByIdDesc(String lastname);
	
	List<Todo> findByIsDoneTrue(String lastname);

}
