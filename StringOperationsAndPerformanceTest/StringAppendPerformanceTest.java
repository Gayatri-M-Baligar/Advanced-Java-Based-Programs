package lab_2;

public class StringAppendPerformanceTest {

	
	    public static void main(String[] args) {
	        int iterations = 10000;
	        String text = "AIET";

	        // Test with StringBuffer
	        StringBuffer stringBuffer = new StringBuffer();
	        long startTime1 = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(text);
	        }
	        long endTime1 = System.nanoTime();
	        long durationBuffer = endTime1 - startTime1;
	        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

	        // Test with StringBuilder
	        StringBuilder stringBuilder = new StringBuilder();
	        long startTime2 = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(text);
	        }
	        long endTime2 = System.nanoTime();
	        long durationBuilder = endTime2 - startTime2;
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

	        // Summary
	        if (durationBuffer > durationBuilder) {
	            System.out.println("👉 StringBuilder is faster than StringBuffer.");
	        } else if (durationBuffer < durationBuilder) {
	            System.out.println("👉 StringBuffer is faster than StringBuilder.");
	        } else {
	            System.out.println("👉 Both performed equally.");
	        }
	    }
	
}