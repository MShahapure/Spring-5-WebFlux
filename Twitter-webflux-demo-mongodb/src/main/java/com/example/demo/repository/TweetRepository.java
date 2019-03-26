package com.example.demo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Tweet;

import reactor.core.publisher.Flux;

@Repository
public interface TweetRepository extends ReactiveMongoRepository<Tweet, String> {

	@Tailable
	Flux<Tweet> findWithTailableCursorBy();
}
