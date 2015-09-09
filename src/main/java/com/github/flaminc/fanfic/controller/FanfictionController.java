package com.github.flaminc.fanfic.controller;

import com.github.flaminc.fanfic.model.Author;
import com.github.flaminc.fanfic.model.Story;
import com.github.flaminc.fanfic.repository.AuthorRepository;
import com.github.flaminc.fanfic.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FanfictionController {

    @Autowired
    private StoryRepository stories;

    @Autowired
    private AuthorRepository authors;

    @RequestMapping(value = "/stories", method = RequestMethod.GET)
    public List<Story> listStories() {
        return stories.findAll();
    }

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public List<Author> listAuthors() {
        return authors.findAll();
    }
}
