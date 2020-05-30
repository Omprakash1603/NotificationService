package com.retail.platform.services;

import com.retail.platform.exception.ContentException;
import com.retail.platform.model.Content;

public interface ContentService {
	Content addContent(Content content) throws ContentException;
}
