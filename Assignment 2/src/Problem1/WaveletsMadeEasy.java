package Problem1;

public class WaveletsMadeEasy {

	public static void main(String[] args) {
		System.out.println("=====Example 1.11, p. 17=====");
		example_1_11_p16(1);
		example_1_11_p16(2);
		System.out.println();

		System.out.println("=====Example 1.12, p. 19=====");
		example_1_12_p19(1);
		example_1_12_p19(2);
		example_1_12_p19(3);
		System.out.println();

		System.out.println("=====Example 1.17, p. 25=====");
		example_1_17_p25(1);
		example_1_17_p25(2);
		System.out.println();

		System.out.println("=====Example 1.18, p. 25=====");
		example_1_18_p25(1);
		example_1_18_p25(2);
		example_1_18_p25(3);
		System.out.println();
		
		//Test cases
		ordFHWTTest01();
		inpFHWTTest01();
	}

	public static void displayArray(double[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
	}

	public static void example_1_11_p16(int num_iters) {
		final double[] signal = {5, 1, 2, 8};
		OneDHWT.orderedFastHaarWaveletTransformForNumIters(signal, num_iters);
		System.out.print(num_iters + "ordered sweep: ");
		displayArray(signal);
	}

	public static void example_1_12_p19(int num_iters) {
		final double[] signal = {3, 1, 0, 4, 8, 6, 9, 9};
		OneDHWT.orderedFastHaarWaveletTransformForNumIters(signal, num_iters);
		System.out.print(num_iters + " ordered sweep: ");
		displayArray(signal);
	}

	public static void example_1_17_p25(int num_iters) {
		final double[] signal = {5, 1, 2, 8};
		OneDHWT.inPlaceFastHaarWaveletTransformForNumIters(signal, num_iters);
		System.out.print(num_iters + " inplace sweep: ");
		displayArray(signal);
	}

	public static void example_1_18_p25(int num_iters) {
		final double[] signal = {3, 1, 0, 4, 8, 6, 9, 9};
		OneDHWT.inPlaceFastHaarWaveletTransformForNumIters(signal, num_iters);
		System.out.print(num_iters + " inplace sweep: ");
		displayArray(signal);
	}
	
	public static void ordFHWTTest01() {
		final double[] signal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		System.out.print("Original signal: ");
		displayArray(signal);
		final int num_iters = 4;
		OneDHWT.orderedFastHaarWaveletTransformForNumIters(signal, num_iters);
		System.out.print("Signal after " + num_iters + " ordered iters: ");
		displayArray(signal);
		System.out.println();
	}
	
	public static void inpFHWTTest01() {
		final double[] signal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		System.out.print("Original signal: ");
		displayArray(signal);
		final int num_iters = 4;
		OneDHWT.inPlaceFastHaarWaveletTransformForNumIters(signal, 4);
		System.out.print("Signal after " + num_iters + " ordered iters: ");
		displayArray(signal);
		System.out.println();
	} 
}
