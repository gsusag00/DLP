package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

    public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
    }

    public static char lexemeToChar(String text) {
		if(text.length() == 4){
			String sinCommas = text.substring(1,text.length()-1);
			switch(sinCommas.charAt(1)) {
				case 'n':
					return '\n';
				case 't':
					return '\t';
				case 'r':
					return '\r';
			}
		}
		if(text.length() == 3){
			return text.charAt(1);
		}
		return ' ';
    }

    public static boolean lexemeToBool(String text) {
		return text.equals("true");
	}
	
}
