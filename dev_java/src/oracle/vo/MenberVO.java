package oracle.vo;

public class MenberVO {
	private static final String String_name = null;
	private int mem_no  =0;//    
	private String mem_id  ="";//  
	private String mem_pw  ="";//  
	private String mem_name ="";//
	int mem_nos[] = new int[3];
    String mem_ids[] = new String[3];
    String mem_pws[] = new String[3];
    String mem_names[] = new String[3];
	private Object mem;
    // 전역변수는 초기화를 생략할 수 있다.
    // 왜> 생성자가 대신 해주니까 
    public MenberVO() { 
    }
    public MenberVO(int mem_no, String mem_id, String mem_pw, String_name) {
    	this.mem_no = mem_no;
        this.mem_id = mem_id;
        this.mem_pw = mem_pw;
        this.mem.name = mem.name;


	}
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
}

/*
 * MEM_NO,MEM_ID,MEM_PW,MEM_NAME
1,apple,123,애플
2,tomato,123,토마토
3,banana,123,바나나

