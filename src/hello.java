import br.eti.kinoshita.testlinkjavaapi.TestLinkAPI;
import br.eti.kinoshita.testlinkjavaapi.util.TestLinkAPIException;

import java.net.MalformedURLException;
import java.net.URL;

public class hello {

    public static void main(String args[]){
        String url = "http://10.120.1.156:888/testlink/lib/api/xmlrpc/v1/xmlrpc.php";
        String devKey = "";

        TestLinkAPI api = null;

        URL testlinkURL = null;

        try     {
            testlinkURL = new URL(url);
        } catch ( MalformedURLException mue )   {
            mue.printStackTrace( System.err );
            System.exit(-1);
        }

        try     {
            api = new TestLinkAPI(testlinkURL, devKey);
        } catch( TestLinkAPIException te) {
            te.printStackTrace( System.err );
            System.exit(-1);
        }

        System.out.println(api.ping());
    }

}
