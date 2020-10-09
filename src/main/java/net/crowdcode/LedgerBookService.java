package net.crowdcode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LedgerBookService {

	@Autowired
	private LedgerBookRepository repo;
	
	public List<LedgerBook> listAll() {
		return repo.findAll();
	}
	
	public void save(LedgerBook ledgerbook) {
		repo.save(ledgerbook);
	}
	
	public LedgerBook get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
