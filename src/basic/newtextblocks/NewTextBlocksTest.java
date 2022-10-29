package basic.newtextblocks;

public class NewTextBlocksTest {
    public static void main(String[] args) {
        //this feature added at java 15

        //old ways
        String templateHtml = "<html>"
                +"  <head>"
                +"  </head>"
                +"  <body>"
                +"  </body>"
                +"</html>";

        //new ways
        String templateHtmlNew = """
                <html>
                    <head>
                    </head>
                    <body>
                    </body>
                </html>
                """;

        System.out.println(templateHtml.toString());
        System.out.println();
        System.out.println(templateHtmlNew.toString());
    }
}
