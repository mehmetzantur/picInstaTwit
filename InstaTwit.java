package Serve;

import java.io.IOException;
import javax.jws.WebService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


//@author                                2013210217007 Mehmet ZANTUR
//@department							 Karabuk University Computer Engineering
//@project                               Get Profile Image From Instagram & Twitter    
//@github								 https://github.com/mehmetzantur/picInstaTwit
              
@WebService(serviceName = "InstaTwit")



//<a class="ProfileAvatar-container u-block js-tooltip profile-picture" href="https://pbs.twimg.com/profile_images/601796565498368000/vnfrmKrr_400x400.jpg" data-resolved-url-large="https://pbs.twimg.com/profile_images/601796565498368000/vnfrmKrr_400x400.jpg" data-url="https://pbs.twimg.com/profile_images/601796565498368000/vnfrmKrr_400x400.jpg" target="_blank" rel="noopener" data-original-title="Mehmet ZANTUR">
//    <img class="ProfileAvatar-image" src="https://pbs.twimg.com/profile_images/601796565498368000/vnfrmKrr_400x400.jpg" alt="Mehmet ZANTUR">
//</a>
public class InstaTwit {
  
     public String picTwit(String username){
         try{
            String url = "https://twitter.com/";
            url = url + username;
            Document doc = Jsoup.connect(url).get();
            Elements elements = doc.select("a.profile-picture img");
            return elements.attr("src");
         }
         catch(IOException ex){
             return ex.getMessage();
         }
         
            
     }
            
   //<meta property="og:image" content="http://wwww....." />
    public String picInsta(String username){
        try{
            String url = "https://www.instagram.com/";
            url = url + username;
            Document doc = Jsoup.connect(url).get();
            Elements metaImg = doc.select("meta[property=og:image]");
            return metaImg.attr("content");
        }
        catch(IOException ex){
            return ex.getMessage();
        }
    }
    
}
