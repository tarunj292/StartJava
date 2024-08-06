class Candidate
{
	private long rno;
	private String name;
	private float score;
	private String remark;
	private void assignRem()
	{
		if(score>=50)
			remark = "Selected";
		else if(score<50)
			remark = "Not Selected";
	}
	void enter(long rno, String name, float score)
	{
		this.rno = rno;
		this.name = name;
		this.score = score;
		assignRem();
	}
	void display()
	{
		System.out.println(rno + name + score + remark);
	}
}
class CandidateDemo
{
	public static void main(String [] args)
	{
		Candidate c = new Candidate();
		c.enter(20, "Sejal Joshi", 85);
		c.display();
	}
}