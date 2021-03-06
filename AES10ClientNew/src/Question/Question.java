package Question;

import java.io.Serializable;

public class Question implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id ;
	private String  ques;
	private String author;
	private int corrent_ans;
	private String[] pos_ans = new String [4];
	
	/**
	 * Constructor for a question
	 * @param id- Question id
	 * @param ques - The question itself
	 * @param author - Question author
	 * @param pos_ans - - 4 Possible answers
	 * @param corrent_ans - - 1 Correct answer
	 */
	public Question (int id, String ques, String author, String[] pos_ans, int corrent_ans) {
		this.id = id;
		this.ques = ques;
		this.author = author;
		this.pos_ans = pos_ans;
		this.corrent_ans = corrent_ans;
	}
	// Geters and Setters
	
	public int getid()
	{
		return id;
	}
	
	public String[] getpos_ans()
	{
		
		return pos_ans;
	}
	
	public String getques() {
		return ques;
	}
	
	public void setques(String ques) {
		this.ques = ques;
	}
	
	public String getauthor() {
		return author;
	}
	
	public void setauthor(String author) {
		this.author = author;
	}
	
	public int getcurrent_ans() {
		return corrent_ans ;
	}
	
	public void setTcurrent_ans(int corrent_ans) {
		this.corrent_ans = corrent_ans;
	}

	//The format inside the combobox : ID Question
	@Override
	public String toString() {
		return String.format("(%d) %s",id,ques);
	}

}
