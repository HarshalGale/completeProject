package Onlinejava;

public class employee {
	private String emp_name;
	private int emp_id;
	private long cno;
	employee(String emp_name,int emp_id,long con)
	{
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.cno=cno;
	}
	public String getEmpName()
	{
		 return emp_name;
	}
	public void setEmpName(String emp_name)
	{
		 this.emp_name=emp_name;
	}
	public int getEmpId()
	{
		return emp_id;
		
	}

	public long getcon()
	{
		return cno;
		
	}
}

