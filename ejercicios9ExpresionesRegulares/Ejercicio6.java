package ejercicios9ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {

    public static void main(String[] args) {
	String cadena = "package ejercicio6;\r\n" + "\r\n" + "import java.util.Random;\r\n" + "\r\n"
		+ "public class CodigoJavaParaEjercicio6 {\r\n" + "\r\n"
		+ "    public static void main(String[] args) {\r\n" + "\r\n"
		+ "        Random random = new Random();\r\n" + "        int seasonCode, numLetters;\r\n"
		+ "        String seasonName;\r\n" + "\r\n" + "        seasonCode = random.nextInt(4);\r\n"
		+ "        seasonName=switch(seasonCode){\r\n" + "            case 0 -> \"Spring\";\r\n"
		+ "            case 1 -> \"Summer\";\r\n" + "            case 2 -> \"Fall\";\r\n"
		+ "            case 3 -> \"Winter\";\r\n" + "            default -> \"???\";\r\n" + "        };\r\n"
		+ "\r\n" + "        System.out.println(seasonName);\r\n" + "\r\n"
		+ "        numLetters=switch(seasonName){\r\n" + "        //Varias etiquetas separadas por comas:\r\n"
		+ "            case \"Spring\", \"Summer\", \"Winter\" -> 6;\r\n"
		+ "            case \"Fall\" -> 4;\r\n" + "            default -> -1;\r\n" + "        };\r\n" + "\r\n"
		+ "        System.out.println(numLetters);\r\n" + "\r\n" + "        seasonCode = random.nextInt(4);\r\n"
		+ "        seasonName=switch(seasonCode){\r\n" + "        /* El bloque debe salir a través de una \r\n"
		+ "         * sentencia yield que devuelva el valor\r\n" + "         * del bloque:\r\n"
		+ "         */\r\n" + "            case 0 -> {\r\n"
		+ "                System.out.println(\"spring time!\");\r\n" + "                yield \"Spring\";\r\n"
		+ "            }\r\n" + "            case 1 -> \"Summer\";\r\n" + "            case 2 -> \"Fall\";\r\n"
		+ "            case 3 -> \"Winter\";\r\n" + "            default -> \"???\";\r\n" + "        };\r\n"
		+ "\r\n" + "        System.out.println(seasonName);\r\n" + "        /*Switch erróneos:\r\n"
		+ "        Nombre de variable resultado erróneo\r\n" + "        Erroneo=switch(n){ \r\n"
		+ "            case 0 -> \"Hola\";\r\n" + "            case 1 -> \"Adiós\";\r\n"
		+ "            default -> \"Mañana\";\r\n" + "        };\r\n"
		+ "        Nombre de variable del switch erróneo\r\n" + "        var=switch($p){\r\n"
		+ "            case 0 -> 5;\r\n" + "            case 1 -> 9;\r\n" + "            default -> 11;\r\n"
		+ "        };\r\n" + "        */\r\n" + "    }\r\n" + "\r\n" + "}";

	Pattern pattern = Pattern.compile("\\w+\\s*=\\s*switch\\s*\\([^)]*\\)\\s*\\{\\s*"
		+ "(case\\s+[^-]+->\\s*[^;]+;\\s*)+" + "default\\s*->\\s*[^;]+;\\s*" + "\\}\\s*;", Pattern.MULTILINE);
	Matcher matcher = pattern.matcher(cadena);

	while (matcher.find()) {
	    System.out.println(matcher.group(0));
	}
    }
}
