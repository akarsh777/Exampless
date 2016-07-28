package com.training.apps;

package com.traininng.apps;

public class Application {

	public static void main(String[] args) {
      Book bk = new Book(101,"Head First Java","Zill",4500);
   Book bk2 = new Book(101,"Head First","Zillgeg",456);
   Book bk2 = new Book(101,"Head ","lgeg",456644);
   System.out.println(bk2.equals(bk3));
   
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Book bk=(Book)obj;
		return bk.bookNumber==this.bookNumber && bk.equals(obj)
				
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
   
}
