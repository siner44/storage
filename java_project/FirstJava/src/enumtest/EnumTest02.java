package enumtest;

enum Study{
	JAVA,JSP,SERVLET
}

public class EnumTest02 {
	public static void main(String[] args) {
		System.out.println(Study.JAVA);
		System.out.println(Study.JSP);
		System.out.println(Study.SERVLET);
		System.out.println();
		
		System.out.println(Study.JAVA.name());
		System.out.println(Study.JSP.name());
		System.out.println(Study.SERVLET.name());
		System.out.println();
		System.out.println(Study.JAVA.ordinal());
		System.out.println(Study.JSP.ordinal());
		System.out.println(Study.SERVLET.ordinal());
		
	}
}
