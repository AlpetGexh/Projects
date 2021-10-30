package Challange;

import java.util.*;

public class SistemetNumerike {

	public static void shfaqOpsionet() {

		System.out.print("\n>\n>\n>\n>\n" + "\nShtyp 1 për numra binar \n" + "Shtyp 2 për numra oktal \n"
				+ "Shtyp 3 për numra decimal \n" + "Shtyp 4 për numra hexadecimal \n" + "Shtyp 5 për IP Address \n"
				+ "Shtyp 6 për te gjeneruar \n" + "Shtyp 7 për te gjeneruar IP address \n"
				+ "Shtyp 8 për te gjeneruar MAC address \n" + "Shtyp 0 për të perfunduar Aplikacionin \n"
				+ "\n>\n>\n>\n>\n"
				+"Jep numrin: ");

	}

	// Decimal
	public static void binarMath(int num, int baseNum, String base) {
		int binar[] = new int[1000];
		int index = 0;

		while (num > 0) {
			binar[index++] = num % baseNum;
			num /= baseNum;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binar[i]);
		}
		System.out.print("(" + base + ")" + baseNum + "\n");
	}

	public static void decToBinar(int decimal) {
		binarMath(decimal, 2, "Binar");
	}

	public static void decToOktal(int decimal) {
		binarMath(decimal, 8, "Oktal");
	}

	public static void decToHex(int decimal) {

		int index;
		String hex = "";
		char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (decimal > 0) {
			index = decimal % 16;

			hex = hexchars[index] + hex;
			decimal /= 16;
		}
		System.out.print(hex + " (Hexadecimal)16 \n");
	}

	// Binar

	public static int binarToDec(String binar) {

		int decimal = Integer.parseInt(binar, 2);
		System.out.print(decimal + " (Decimal)10 \n");
		return decimal;

	}

	public static void binarToOktal(String binar) {

		int num = Integer.parseInt(binar, 2);
		String oktal = Integer.toOctalString(num);
		System.out.print(oktal + " (Oktal)8 \n");

	}

	public static void binarToHex(String binar) {
		String hexadecimal = "";
		char[] hexchars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		int decimal = binarToDec(binar);
		while (decimal > 0) {

			hexadecimal = hexchars[decimal % 16] + hexadecimal;
			decimal /= 16;
		}

		System.out.println(hexadecimal + " (Hexadecimal)16 \n");

	}

//   Oktal
	public static int oktalToDecimal(int num) {
		int base = 1;
		int index = 0;

		while (num > 0) {
			int oktalSum = num % 10;
			num /= 10;

			index += oktalSum * base;
			base *= 8;
		}

		return index;
	}

	public static void oktalToBinar(int num) {

		int[] oktal = { 0, 1, 10, 11, 100, 101, 110, 111 };
		long base = 1;
		long binarNum = 0;
		int index;

		while (num > 0) {
			index = (int) (num % 10);
			binarNum = oktal[index] * base + binarNum;
			num /= 10;
			base *= 1000;
		}
		System.out.print(binarNum + " (Binar)2 \n");

	}

	public static void oktalToHex(int oktal) {

		String hexadecimal = "";
		char[] hexchars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		int decimal = oktalToDecimal(oktal);
		while (decimal > 0) {

			hexadecimal = hexchars[decimal % 16] + hexadecimal;
			decimal /= 16;
		}

		System.out.println(hexadecimal + " (Hexadecimal)16 \n");

	}

//  Hexadecimal
	public static int hexToDecimal(String hex) {
		int num = Integer.parseInt(hex, 16);
		return num;
	}

	public static void hexToBinar(String hex) {

		long longs = Long.parseLong(hex, 16);
		String binary = Long.toBinaryString(longs);

		System.out.print(binary + " (Binar)2 \n");

	}

	public static void hexToOktal(String hex) {

		int decimalNumber, index = 1, i;
		int[] octalNumber = new int[100];

		decimalNumber = hexToDecimal(hex);
		while (decimalNumber > 0) {
			octalNumber[index++] = decimalNumber % 8;
			decimalNumber = decimalNumber / 8;
		}
		for (i = index - 1; i > 0; i--) {
			System.out.print(octalNumber[i]);
		}

		System.out.print(" (Oktal)8 \n");
	}

	public static void getBinar(String binar) {
//		binarToDec(binar);
		binarToOktal(binar);
		binarToHex(binar);
	}

	public static void getOktal(int oktal) {
		System.out.print(oktalToDecimal(oktal));
		System.out.println(" (Deciamal)10");
		oktalToBinar(oktal);
		oktalToHex(oktal);
	}

	public static void getDecimal(int decimal) {
		decToBinar(decimal);
		decToOktal(decimal);
		decToHex(decimal);
	}

	public static void getHexa(String hex) {
		hexToBinar(hex);
		hexToOktal(hex);
		System.out.print(hexToDecimal(hex));
		System.out.println("(Decimal)10");
	}

	public static int getDecimalGenerator() {
		Random rand = new Random();
		int decimal = rand.nextInt(255);
		return decimal;
	}

	public static String getHexaGenerator() {
		Random rand = new Random();
		String hexa = Integer.toHexString(rand.nextInt(0xff));
		return hexa;
	}

//ip generor

	public static void IPMath(int num, int baseNum) {
		int binar[] = new int[1000];
		int index = 0;

		while (num > 0) {
			binar[index++] = num % baseNum;
			num /= baseNum;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binar[i]);
		}
	}

	public static void IPToBinar(int decimal) {
		IPMath(decimal, 2);

	}

	public static void IPToOktal(int decimal) {
		IPMath(decimal, 8);
	}

	public static void IPToHex(int decimal) {

		int index;
		String hex = "";
		char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (decimal > 0) {
			index = decimal % 16;

			hex = hexchars[index] + hex;
			decimal /= 16;
		}
		System.out.print(hex);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("> Aplikacioni për Sistemin e Numrave");
		shfaqOpsionet();
		int choise;
		while ((choise = s.nextInt()) > 0) {
			if (choise == 1) {

				System.out.print("Shruani Numrin Binar: ");
				String binar = s.next().replaceAll("\\s+", "");
				getBinar(binar);

			} else if (choise == 2) {
				System.out.print("Shruani Numrin Oktal: ");
				int oktal = s.nextInt();
				getOktal(oktal);

			} else if (choise == 3) {
				System.out.print("Shruani Numrin Decimal: ");
				int decimal = s.nextInt();
				getDecimal(decimal);

			} else if (choise == 4) {
				// hexadecimal
				System.out.print("Shruani numrin Hexadeximla: ");
				String hexa = s.next();
				getHexa(hexa);

			} else if (choise == 5) {
				System.out.print("Shruani numrin IP: ");
				String IpAddress = s.next();
				String IPRules = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

				String IPRulesResult = IPRules + "\\." + IPRules + "\\." + IPRules + "\\." + IPRules;
				if (IpAddress.matches(IPRulesResult)) {
					String[] IPSplit = IpAddress.split("\\.");
					System.out.print("Binar: \t     ");
					for (String string : IPSplit) {
						int octet = Integer.parseInt(string);
						String binaryOctet = Integer.toBinaryString(octet);
						System.out.print(binaryOctet);
						System.out.print(".");
					}
					System.out.println("");
					System.out.print("Oktal: \t     ");
					for (String string : IPSplit) {
						int octet = Integer.parseInt(string);
						String octalString = Integer.toOctalString(octet);
						System.out.print(octalString);

						System.out.print(".");
					}
					System.out.println("");
					System.out.print("Hexadecimal: ");
					for (String string : IPSplit) {
						int octet = Integer.parseInt(string);
						String binaryOctet = Integer.toHexString(octet);
						System.out.print(binaryOctet);
						System.out.print(".");
					}
					System.out.println("");
				} else {
					System.out.println("Invalid IP");
				}
			} else if (choise == 6) {
				// Binar
				// max //min //min
				String binar = Integer.toBinaryString(rand.nextInt((1023 - 16) + 1) + 16);
				System.out.println("Binar: \t\t" + binar);

				// Oktal
				int oktal = rand.nextInt(6 * 100) - 1;
				System.out.println("Oktal: \t\t" + oktal);

				// decimal
				int decimal = rand.nextInt(1023) + 1;
				System.out.println("Deciml: \t" + decimal);

				// Hexadeciaml
				String hexadecimal = Integer.toHexString(rand.nextInt(16383)); // 16*1024 - 1
				System.out.println("Hexadecimal:    " + hexadecimal);

				int choise2;
				System.out.print("\nShtyp 0 për rezultatet: ");
				choise2 = s.nextInt();
				if (choise2 == 0) {
					System.out.println("\n" + binar + " Binar");
					getBinar(binar);

					System.out.println("\n" + oktal + " Oktal");
					getOktal(oktal);

					System.out.println("\n" + decimal + " Decimal");
					getDecimal(decimal);

					System.out.println("\n" + hexadecimal + " Hexadecimal");
					getHexa(hexadecimal);

				}

			} else if (choise == 7) {
				int[] num = new int[4];

				num[0] = getDecimalGenerator();
				num[1] = getDecimalGenerator();
				num[2] = getDecimalGenerator();
				num[3] = getDecimalGenerator();

				for (int i = 0; i < num.length; i++) {
					System.out.print(num[i]);
					if (i != num.length - 1) {
						System.out.print(".");
					}
				}
				System.out.print("\nShtyp 0 për rezultatet: ");
				int choise1 = s.nextInt();// replaceAll("\\s+", "");

				if (choise1 == 0) {
					for (int i = 0; i < num.length; i++) {
						IPToBinar(num[i]);
						if (i != num.length - 1) {
							System.out.print(".");
						}
					}
					System.out.println("");

					for (int i = 0; i < num.length; i++) {
						IPToOktal(num[i]);
						if (i != num.length - 1) {
							System.out.print(".");
						}
					}
					System.out.println("");
					for (int i = 0; i < num.length; i++) {
						IPToHex(num[i]);
						if (i != num.length - 1) {
							System.out.print(".");
						}
					}
					System.out.println("");
				}

			} else if (choise == 8) {

				for (int i = 0; i < 10; i++) {
					System.out.println(getHexaGenerator() + "-" + getHexaGenerator() + "-" + getHexaGenerator() + "-"
							+ getHexaGenerator() + "-" + getHexaGenerator() + "-" + getHexaGenerator());

				}
			}

			System.out.println("\n>\n>\n>\n>\n");
			System.out.println("> Për të vazhduar shtypni numrin Nente (9)");
			System.out.print("Jep numrin: ");
			if (s.nextInt() == 9)
				shfaqOpsionet();
			
			else
				break;
		}

		s.close();

		{
			System.out.println("> Aplikacioni përfundoi");
			System.exit(1);
		}
	}

}
