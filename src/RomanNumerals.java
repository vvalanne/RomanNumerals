public class RomanNumerals {
 	public int convertToInteger(String romanNum) {
		
		if (romanNum.isEmpty())
			return 0;
		else
			switch (romanNum.charAt(0)) {
			case 'M':
				return 1000 + convertToInteger(romanNum.substring(1));
			case 'D':
				return 500 + convertToInteger(romanNum.substring(1));
			case 'C':
				if (romanNum.length() == 1)
					return 100;
				else
					switch (romanNum.charAt(1)) {
					case 'M':
						return 900 + convertToInteger(romanNum.substring(2));
					case 'D':
						return 400 + convertToInteger(romanNum.substring(2));
					default:
						return 100 + convertToInteger(romanNum.substring(1));
					}
			case 'L':
				return 50 + convertToInteger(romanNum.substring(1));
			case 'X':
				if (romanNum.length() == 1)
					return 10;
				else
					switch (romanNum.charAt(1)) {
					case 'C':
						return 90 + convertToInteger(romanNum.substring(2));
					case 'L':
						return 40 + convertToInteger(romanNum.substring(2));
					default:
						return 10 + convertToInteger(romanNum.substring(1));
					}
			case 'V':
				return 5 + convertToInteger(romanNum.substring(1));
			default:
				if (romanNum.length() == 1)
					return 1;
				else
					switch (romanNum.charAt(1)) {
					case 'X':
						return 9;
					case 'V':
						return 4;
					default:
						return romanNum.length();
					}
			}
	}
}