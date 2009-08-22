package net.study;

public class Gugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			String printDan = printDan(i);
			System.out.println(printDan);
		}
		
	}

	/**
	 * @param dan
	 * @return 
	 */
	private static String printDan(int dan) {
		StringBuilder sb = new StringBuilder();
		sb.append(dan + Messages.getString("Gugudan.0")); //$NON-NLS-1$
		sb.append("\n"); //$NON-NLS-1$
		for (int j = 1; j <= 9; j++) {
			sb.append(dan + " x " + j + " = " + dan * j); //$NON-NLS-1$ //$NON-NLS-2$
			sb.append("\n"); //$NON-NLS-1$
		}
		sb.append("\n"); //$NON-NLS-1$
		
		return sb.toString();
	}

}
