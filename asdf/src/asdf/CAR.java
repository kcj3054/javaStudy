package asdf;



public class CAR {
//car에 tire, engine, super_Engine. break_,  handle,
	int tire;
	String engine;
	Boolean super_Engine;
	String break_ ;
	String handle ;
	
	public CAR(int tire,String engine, String break_,String handle ) {
			
		this.tire = tire;
		this.engine = engine;
		this.break_ = break_;
		this.handle = handle;
	}
	public CAR(int tire,String engine, String break_,String handle,Boolean super_Engine ) {
		this.super_Engine = super_Engine;
		this.tire = tire;
		this.engine = engine;
		this.break_ = break_;
		this.handle = handle;
	}
	
	public void go() {
		System.out.println("직진합니다.");
	}
	public void back() {
		System.out.println("후진합니다.");
	}
	public void is_super(boolean super_Engine)
	{
		if(super_Engine ==true)
			System.out.println("슈퍼카입니다");
	}
}
