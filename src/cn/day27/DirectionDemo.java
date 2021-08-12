package cn.day27;

public enum  DirectionDemo {
	FRONT("前"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("前");
			
		}},BEHIND("后"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("后");
		}},LEFT("左") {
		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}
	},RIGHT("右") {
		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}
	};
	
	private String name;
	
	private DirectionDemo(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public abstract void show();
}
