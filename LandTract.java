package Lab4;


public class LandTract {
	
	//fields
	private int _length;
	private int _width;
	private int _area;
	
	public LandTract(int _length, int _width) {
		//using this reference
		this._length = _length;
		this._width = _width;
	}
	
	//constructor
	
	//methods
	public int getArea(){
		_area =  _length * _width;
		return _area;
	}
	
	//override equals method
	public boolean equals(LandTract obj2) {
		boolean status;
		
		if(this._area == obj2._area){
			status = true;
		}
		
		else
			status = false;
		
		return status;
	}
	//override toString
	public String toString() {
		return "Area: " + this.getArea();
	}
}
