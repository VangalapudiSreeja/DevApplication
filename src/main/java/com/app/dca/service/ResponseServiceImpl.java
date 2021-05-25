package com.app.dca.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dca.entity.Response;
import com.app.dca.exception.UnknownDeveloperException;
import com.app.dca.exception.UnknownFeedException;
import com.app.dca.exception.UnknownResponseException;
import com.app.dca.repository.IResponseRepository;

@Service
public class ResponseServiceImpl implements IResponseService {
	
	@Autowired
	private IResponseRepository repo;
	
	
	@Override
	@Transactional
	public Response addResponse(Response resp) {
		
		repo.save(resp);
		return resp;
	}

	
	@Override
	public Response editResponse(Response resp, Integer id) {
		// TODO Auto-generated method stub
		Optional<Response> up = repo.findById(id);
		Response response = null;

		if(up.isPresent())
		{
			 response = up.get();

			response.setRespId(resp.getRespId());
			response.setAnswer(resp.getAnswer());
			response.setRespDate(resp.getRespDate());
			response.setRespTime(resp.getRespTime());
			response.setAccuracy(resp.getAccuracy());
			response.setDev(resp.getDev());
			response.setFeed(resp.getFeed());
			return repo.save(response);
		}
		
		return response;
	}

	@Override
	public Response removeResponse(int respId) throws UnknownResponseException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Response likeResponse(int respId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Response> getResponseByFeed(int feedId) throws UnknownFeedException {

		return repo.fetchResponseByFeed(feedId);
	}

	@Override
	public List<Response> getResponseByDeveloper(int devId) throws UnknownDeveloperException {

		return repo.fetchResponseByDeveloper(devId);
	}


	@Override
	public Response editResponse(Response resp) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Response> getAllResponses() {

		System.out.println("Inside get all responses");
		return repo.findAll();
	}

} //end class
