package Builder;
public class Robot {
	
int id;
static int counter = 1; // static to not begin from zero
String type;
int daman;
int price;
String headType;
String bodyType;
String legType;
	
Robot(String type,int daman,int price,String headType,String bodyType,String legType){ // constructor by default
    	 
	this.type = type;
	this.daman = daman;
	this.price = price;
	this.headType = headType;
	this.bodyType = bodyType;
	this.legType = legType;
	this.id = counter++;
                                  }

@Override
public String toString() {
	return "Robot [id=" + id + ", type=" + type + ", daman=" + daman + ", price=" + price + ", headType=" + headType
			+ ", bodyType=" + bodyType + ", legType=" + legType + "]";
}     
     
}
