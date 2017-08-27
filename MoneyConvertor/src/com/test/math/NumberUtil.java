package com.test.math;

import java.util.HashMap;
import java.util.Map;

public class NumberUtil {

	private static Map<Integer, String> map = new HashMap<>();

	static {
		map.put(0, "Zero");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(12, "twelve");
		map.put(13, "thirteen");
		map.put(14, "fourteen");
		map.put(15, "fifteen");
		map.put(16, "sixteen");
		map.put(17, "seventeen");
		map.put(18, "eighteen");
		map.put(19, "nineteen");

		map.put(20, "twenty");
		map.put(21, "twenty-one");
		map.put(22, "twenty-two");
		map.put(23, "twenty-three");
		map.put(24, "twenty-four");
		map.put(25, "twenty-five");
		map.put(26, "twenty-six");
		map.put(27, "twenty-seven");
		map.put(28, "twenty-eight");
		map.put(29, "twenty-nine");

		map.put(30, "thirty");
		map.put(31, "thirty-one");
		map.put(32, "thirty-two");
		map.put(33, "thirty-three");
		map.put(34, "thirty-four");
		map.put(35, "thirty-five");
		map.put(36, "thirty-six");
		map.put(37, "thirty-seven");
		map.put(38, "thirty-eight");
		map.put(39, "thirty-nine");
		map.put(40, "forty");

		map.put(41, "forty-one");
		map.put(42, "forty-two");
		map.put(43, "forty-three");
		map.put(44, "forty-four");
		map.put(45, "forty-five");
		map.put(46, "forty-six");
		map.put(47, "forty-seven");
		map.put(48, "forty-eight");
		map.put(49, "forty-nine");
		map.put(50, "fifty");

		map.put(51, "fifty-one");
		map.put(52, "fifty-two");
		map.put(53, "fifty-three");
		map.put(54, "fifty-four");
		map.put(55, "fifty-five");
		map.put(56, "fifty-six");
		map.put(57, "fifty-seven");
		map.put(58, "fifty-eight");
		map.put(59, "fifty-nine");

		map.put(60, "sixty");
		map.put(61, "sixty-one");
		map.put(62, "sixty-two");
		map.put(63, "sixty-three");
		map.put(64, "sixty-four");
		map.put(65, "sixty-five");
		map.put(66, "sixty-six");
		map.put(67, "sixty-seven");
		map.put(68, "sixty-eight");
		map.put(69, "sixty-nine");
		map.put(70, "seventy");
		map.put(71, "seventy-one");
		map.put(72, "seventy-two");
		map.put(73, "seventy-three");
		map.put(74, "seventy-four");
		map.put(75, "seventy-five");
		map.put(76, "seventy-six");
		map.put(77, "seventy-seven");
		map.put(78, "seventy-eight");
		map.put(79, "seventy-nine");
		map.put(80, "eighty");
		map.put(81, "eighty-one");
		map.put(82, "eighty-two");
		map.put(83, "eighty-three");
		map.put(84, "eighty-four");
		map.put(85, "eighty-five");
		map.put(86, "eighty-six");
		map.put(87, "eighty-seven");
		map.put(88, "eighty-eight");
		map.put(89, "eighty-nine");
		map.put(90, "ninety");
		map.put(91, "ninety-one");
		map.put(92, "ninety-two");
		map.put(93, "ninety-three");
		map.put(94, "ninety-four");
		map.put(95, "ninety-five");
		map.put(96, "ninety-six");
		map.put(97, "ninety-seven");
		map.put(98, "ninety-eight");
		map.put(99, "ninety-nine");
		map.put(100, "hundred");
	}

	public static String getNumToText(int num) {
		return map.get(num);
	}

}
