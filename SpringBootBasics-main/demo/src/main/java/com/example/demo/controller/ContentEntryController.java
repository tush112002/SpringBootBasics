package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ContentEntry;

@RestController
public class ContentEntryController {

	public Map<Long, ContentEntry> contentEntries = new HashMap<>();
	
	@GetMapping()
	public List<ContentEntry> getAll(){
		return new ArrayList<>(contentEntries.values());
	}
	
	@PostMapping()
	public boolean createEntry(@RequestBody ContentEntry myContent) {
		contentEntries.put(myContent.getId(), myContent);
		return true;
	}
	
	@GetMapping("id/{myId}")
	public ContentEntry getContentById(@PathVariable Long myId) {
		return contentEntries.get(myId);
	}
	
	@DeleteMapping("id/{myId}")
	public ContentEntry deleteContentById(@PathVariable Long myId) {
		return contentEntries.remove(myId);
	}
	
	@PutMapping("id/{myId}")
	public ContentEntry updateContentById(@PathVariable Long myId, @RequestBody ContentEntry myContent) {
		return contentEntries.put(myId, myContent);
	}
}
