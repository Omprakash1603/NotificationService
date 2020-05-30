package com.retail.platform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.platform.dao.ContentRepository;
import com.retail.platform.exception.ContentException;
import com.retail.platform.model.Content;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	ContentRepository contentRepository;

	public Content addContent(Content content) throws ContentException {
		return contentRepository.save(content);
	}
}
