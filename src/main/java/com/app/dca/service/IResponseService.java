package com.app.dca.service;

import java.util.List;

import com.app.dca.entity.Response;
import com.app.dca.exception.UnknownDeveloperException;
import com.app.dca.exception.UnknownFeedException;
import com.app.dca.exception.UnknownResponseException;

public interface IResponseService {
	
	Response addResponse(Response resp);
	
	Response editResponse(Response resp);
	
	Response removeResponse(int respId) throws UnknownResponseException;
	
	Response likeResponse(int respId);
	
	List<Response> getResponseByFeed(int feedId) throws UnknownFeedException;
	
	List<Response> getResponseByDeveloper(int devId) throws UnknownDeveloperException;

	Response editResponse(Response resp, Integer id);

	List<Response> getAllResponses();
	
}
