package com.retail.platform.controler;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.retail.platform.model.Content;

@RestController
@RequestMapping("/content")

public class ContentControler {
	@Autowired
	ContentHandler contentHandler;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index() {
		return "Greetings from Message Producer!";
	}

	@RequestMapping(value = "/publish", method = RequestMethod.POST)
	public String publishContent(@Valid @RequestBody final Content content) {
		return contentHandler.publishContent(content);
	}

}
