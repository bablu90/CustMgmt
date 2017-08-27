package com.test.math;

import javax.xml.ws.Endpoint;

public class NumberToTextConvertor {

	// str place value constants
	private static String PLACE_CRORE = " Crore ";
	private static String PLACE_LAKH = " Lakh ";
	private static String PLACE_THOUSENT = " Thousent ";
	private static String PLACE_HUNDRED = " Hundred ";

	public String convert(String numberStr) {

		if (numberStr == null || numberStr.length() == 0)
			System.out.println("Passed argument is null/empty");

		System.out.println("Passed Input Is: " + numberStr);
		numberStr = new Long(numberStr) + "";

		String textStr = null;
		if (numberStr.length() > 0) {

			System.out.println("Amount length: " + numberStr.length());

			textStr = getText(numberStr);
			System.out.println("Final Result String: " + textStr);
		} else
			System.out.println("Passed Input Is Invalid: " + numberStr);

		return textStr;

	}

	private String getText(String numberStr) {

		return getPlaceValueString(numberStr);
	}

	private String getPlaceValueString(String numberStr) {

		StringBuilder sb = new StringBuilder();
		StringBuilder sourceSB = new StringBuilder(numberStr);
		while (sourceSB.length() != 0) {
			int length = sourceSB.length();
			System.out.println(length + "=" + sourceSB.toString());

			switch (length) {

			case 9:
				setValue(sourceSB, 0, 2, sb, PLACE_CRORE);
				break;
			case 8:
				setValue(sourceSB, 0, 1, sb, PLACE_CRORE);
				break;
			case 7:
				setValue(sourceSB, 0, 2, sb, PLACE_LAKH);
				break;
			case 6:
				setValue(sourceSB, 0, 1, sb, PLACE_LAKH);
				break;
			case 5:
				setValue(sourceSB, 0, 2, sb, PLACE_THOUSENT);
				break;
			case 4:
				setValue(sourceSB, 0, 1, sb, PLACE_THOUSENT);
				break;
			case 3:
				setValue(sourceSB, 0, 1, sb, PLACE_HUNDRED);
				break;
			case 2:
				setValue(sourceSB, 0, 2, sb, "");
				break;
			case 1:
				setValue(sourceSB, 0, 1, sb, "");
				break;
			}

		} // while
		return sb.toString();
	}

	private String getPhaseValueText(String numberStr) {
		numberStr = new Long(numberStr) + "";

		if (numberStr.equals("0"))
			return "";

		return NumberUtil.getNumToText(new Integer(numberStr));
	}

	private void setValue(StringBuilder sourceSB, int startIndex, int endIndex, StringBuilder sb, String placeString) {

		String temp = sourceSB.substring(startIndex, endIndex).toString();
		sourceSB.delete(startIndex, endIndex);

		String text = getPhaseValueText(temp);
		if (text != null && text.trim().length() != 0) {
			sb.append(text);
			if (placeString != null)
				sb.append(placeString);
		}
	}

}
