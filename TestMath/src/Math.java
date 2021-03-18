
public class Math {
public int add(int... numbers) {
	int result=0;
	int counter=0;
	while(counter<numbers.length) {
		result+=numbers[counter++];
	}
	return result;
}
/**
 * takes two numbers and multiply them
 * @author Aishwarya 
 */
int Multiply(int... numbers) {
	int result=1;
	int counter=0;
	while(counter<numbers.length) {
		result*=numbers[counter++];
	}
	return result;
}

}
