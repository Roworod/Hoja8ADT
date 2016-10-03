import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class VectorHeapTest {
    
     //Test addNode 
     
    
     //Test findNode
     
    @Test
    public void add() {
        System.out.println("add");
        Object key = null;
        VectorHeap instance = new VectorHeap();
        Node param = null;
        Node result = instance.add(0);
        assertEquals(param, result);
    }

   
    //Test of findName     
   
    @Test
    public void remove() {
        System.out.println("remove");
        String key = "";
        VectorHeap instance = new VectorHeap();
        String param = null;
        String result = instance.remve(0);
        assertEquals(param, result);
    }
    
}