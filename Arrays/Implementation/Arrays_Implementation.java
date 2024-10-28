class ArrayImplementation1D{
	public static void main(String args[])
	{
		//Static implementation
		
		byte byte_array[] = {1};
		short short_array[] = {1,2};
		int integer_array[] = {1,2,3,4,5};
		long long_array[] = {1,2,3,4,5,6,7,8,9};
		
		float float_array[] = {1.2f, 2.4f, 4.5f};
		double double_array[] = {1.223d, 2.443d, 4.551d, 6.331d};
		
		boolean boolean_array[] = {true, false, false, true};
		char char_array[] = {'a', 'b', 'c'};
		
		String string_array[] = {"James", "Agatha", "Markus"};
		
		//Dynamic implementation
		
		int array_size = 5;
		
		byte[] byte_arrayD = new byte[array_size];
		short short_arrayD[] = new short[array_size];
		int int_arrayD[] = new int[array_size];
		long long_arrayD[] = new long[array_size];

		float float_arrayD[] = new float[array_size];
		double double_arrayD[] = new double[array_size];
		
		boolean boolean_arrayD[] = new boolean[array_size];
		char char_arrayD[] = new char[array_size];
		
		String string_arrayD[] = new String[array_size];
		
		System.out.println("Address of Statically Declared Arrays:");
		System.out.println("Byte" + byte_array);
		System.out.println("Short" + short_array);
		System.out.println("Integer" + integer_array);
		System.out.println("Long" + long_array);

		System.out.println("Float" + float_array);
		System.out.println("Double" + double_array);
		
		
		System.out.println("Boolean " + boolean_array);
		System.out.println("Character" + char_array.toString());
		System.out.println("String " + string_array);


		System.out.println("\nAddress of Dynamically Declaration of Arrays:");
		System.out.println("Byte" + byte_arrayD);
		System.out.println("Short" + short_arrayD);
		System.out.println("Integer" + int_arrayD);
		System.out.println("Long" + long_arrayD);

		System.out.println("Float" + float_arrayD);
		System.out.println("Double" + double_arrayD);
		
		
		System.out.println("Boolean " + boolean_arrayD);
		System.out.println("Character" + char_arrayD.toString());
		System.out.println("String " + string_arrayD);

		//2D and 3D arrays can be declared in the same way.
	}
}