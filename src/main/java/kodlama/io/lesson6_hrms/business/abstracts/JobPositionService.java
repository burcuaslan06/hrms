package kodlama.io.lesson6_hrms.business.abstracts;

import java.util.List;

import kodlama.io.lesson6_hrms.entities.concretes.JobPosition;


public interface JobPositionService {
	
	List<JobPosition> getAll();

}
