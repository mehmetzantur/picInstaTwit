<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="InstaTwitClient.Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">

        <div id="content" style="text-align:center;">
            <div id="banner" style="width:100%;">
                <h1>Get Profile Image From Instagram & Twitter</h1>
            </div>
            <br />

            <div id="center" style="width:100%;">
                <asp:Label ID="Label1" runat="server" Text="Username: "></asp:Label>
                <asp:TextBox ID="TextBox1" runat="server" Width="232px"></asp:TextBox>
                <asp:DropDownList ID="DropDownList1" runat="server" Width="159px">
                    <asp:ListItem Selected="True">Instagram</asp:ListItem>
                    <asp:ListItem>Twitter</asp:ListItem>
                </asp:DropDownList>
                <asp:Button ID="Button1" runat="server" Text="Get Image" OnClick="Button1_Click" Width="144px" />
                <br />
                <br />
            </div>
            

            <div id="divImg" style="width:100%;">
                <asp:Image ID="userImg" runat="server" Height="300" Width="300" />
            </div>


        </div>
    </form>
</body>
</html>
