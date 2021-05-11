package kodlama.io.lesson6_hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.lesson6_hrms.business.abstracts.JobPositionService;
import kodlama.io.lesson6_hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.io.lesson6_hrms.entities.concretes.JobPosition;


@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}
	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

}
