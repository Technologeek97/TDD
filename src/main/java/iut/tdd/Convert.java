package iut.tdd;

public class Convert {



	public static String num2text(String input) {
		String rslt = "";

		switch(input)
		{
		case ("0"):
			rslt="zéro";
		break;
		case ("1"):
			rslt="un";
		break;
		case ("2"):
			rslt="deux";
		break;
		case ("3"):
			rslt="trois";
		break;
		case ("4"):
			rslt="quatre";
		break;
		case ("5"):
			rslt="cinq";
		break;
		case ("6"):
			rslt="six";
		break;
		case ("7"):
			rslt="sept";
		break;
		case ("8"):
			rslt="huit";
		break;
		case ("9"):
			rslt="neuf";
		break;
		case ("10"):
			rslt="dix";
		break;
		case ("11"):
			rslt="onze";
		break;
		case("12"):
			rslt="douze";
		break;
		case("13"):
			rslt="treize";
		break;
		case("14"):
			rslt="quatorze";
		break;
		case("15"):
			rslt="quinze";
		break;
		case("16"):
			rslt="seize";
		break;

	}
	return rslt;
}

public static String text2num(String input) {
	String rslt = "";

	switch(input)
	{
	case ("zéro"):
		rslt="0";
	break;
	case ("un"):
		rslt="1";
	break;
	case ("deux"):
		rslt="2";
	break;
	case ("trois"):
		rslt="3";
	break;
	case ("quatre"):
		rslt="4";
	break;
	case ("cinq"):
		rslt="5";
	break;
	case ("six"):
		rslt="6";
	break;
	case ("sept"):
		rslt="7";
	break;
	case ("huit"):
		rslt="8";
	break;
	case ("neuf"):
		rslt="9";
	break;
	case ("dix"):
		rslt="10";
	break;
	case ("onze"):
		rslt="11";
	break;
	case("douze"):
		rslt="12";
	break;
	case("treize"):
		rslt="13";
	break;
	case("quatorze"):
		rslt="14";
	break;
	case("quinze"):
		rslt="15";
	break;
	case("seize"):
		rslt="16";
	break;
	}
	return null;
}
}