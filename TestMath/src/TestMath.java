import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class TestMath {
	Math math;
	@BeforeEach
	void init() {
		math=new Math();
	}
@Test
void testAdd() {
//	Math math=new Math();
	int result = math.add(1, 2,3);
	Assert.assertEquals(6,result);
}
@Test
void testMultiply() {
//	Math math=new Math();
	int result2=math.Multiply(1,3,4);
	Assert.assertEquals(12, result2);
}
}
