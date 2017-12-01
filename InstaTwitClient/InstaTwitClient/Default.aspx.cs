using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace InstaTwitClient
{
    public partial class Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            //content.InnerHtml = "dasdsadasdas";
            InstaTwitWS.InstaTwit servis = new InstaTwitWS.InstaTwit();
            //string donenDeger = servis.hello("mehmet");
            //content.InnerHtml = donenDeger.ToString();


        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            InstaTwitWS.InstaTwit service = new InstaTwitWS.InstaTwit();
            if (DropDownList1.SelectedIndex == 0)
            {
                userImg.ImageUrl = service.picInsta(TextBox1.Text);
            }
            else
            {
                userImg.ImageUrl = service.picTwit(TextBox1.Text);
            }
        }
    }
}