package net.crowdcode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ledgerbook")
public class LedgerBook {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String issuedate;
	private String serialno;
	private String kunde;
	private String budget;
	private String submitdate;
	private String status;

	protected LedgerBook() {
	}

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getIssuedate() {
		return issuedate;
	}



	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}



	public String getSerialno() {
		return serialno;
	}



	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}



	public String getKunde() {
		return kunde;
	}



	public void setKunde(String kunde) {
		this.kunde = kunde;
	}



	public String getBudget() {
		return budget;
	}



	public void setBudget(String budget) {
		this.budget = budget;
	}



	public String getSubmitdate() {
		return submitdate;
	}



	public void setSubmitdate(String submitdate) {
		this.submitdate = submitdate;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public LedgerBook(Long id, String issuedate, String serialno, String kunde, String budget, String submitdate,
			String status) {
		super();
		this.id = id;
		this.issuedate = issuedate;
		this.serialno = serialno;
		this.kunde = kunde;
		this.budget = budget;
		this.submitdate = submitdate;
		this.status = status;
	}


	

}
