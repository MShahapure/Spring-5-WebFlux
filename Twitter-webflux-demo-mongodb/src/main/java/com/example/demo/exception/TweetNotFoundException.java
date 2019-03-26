package com.example.demo.exception;

public class TweetNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TweetNotFoundException(String tweetId) {
		super("Tweet not found with id " + tweetId);
	}
}
