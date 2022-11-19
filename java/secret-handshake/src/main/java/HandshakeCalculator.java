import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
    	String binary = Integer.toBinaryString(number);
    	List<Signal> handshake = new ArrayList<Signal>();
    	int binaryLength = binary.length();
    	for (int i=0; i < binaryLength; i++) {
    		int oneOrZero = Integer.valueOf(binary.substring(binaryLength-i-1, binaryLength-i));
    		if (oneOrZero == 1) {    			
    			if (i == 0) {    		
    				handshake.add(Signal.WINK);
    			} else if (i == 1) {
    				handshake.add(Signal.DOUBLE_BLINK);
    			} else if (i == 2) {
    				handshake.add(Signal.CLOSE_YOUR_EYES);
    			} else if (i == 3) {
    				handshake.add(Signal.JUMP);
    			} else if (i == 4) {
    				Collections.reverse(handshake);
    			}
    		}
    	}
    	return handshake;
    }

}
