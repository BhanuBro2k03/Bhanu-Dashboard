package raven.drawer;

import java.lang.*;
import raven.drawer.component.SimpleDrawerBuilder;
import raven.drawer.component.footer.SimpleFooterData;
import raven.drawer.component.header.SimpleHeaderData;
import raven.drawer.component.menu.SimpleMenuOption;
import raven.swing.AvatarIcon;

public class MyDrawerBuilder extends SimpleDrawerBuilder{

    @Override
    public SimpleHeaderData getSimpleHeaderData() {
        return new SimpleHeaderData()
                .setIcon(new AvatarIcon(getClass().getResource("/raven/image/profile.jpg"), 60, 60, 999))
                .setTitle("Bhanu")
                .setDescription("Bhanuka123@gmail.com");
    }

    @Override
    public SimpleMenuOption getSimpleMenuOption() {
        String menus[][] = {
            {"~MAIN~"},
            {"Dashboard"},
            {"~WEB APP~"},
            {"Email", "Inbox", "Read", "Compost"},
            {"Chat"},
            {"Calendar"},
            {"~COMPONENT~"},
            {"Advanced UI", "Cropper", "Owl Carousel", "Sweet Alert"},
            {"Forms", "Basic Elements", "Advanced Elements", "SEditors", "Wizard"},
            {"~OTHER~"},
            {"Charts", "Apex", "Flot", "Sparkline"},
            {"Icons", "Feather Icons", "Flag Icons", "Mdi Icons"},
            {"Special Pages", "Blank page", "Faq", "Invoice", "Profile", "Pricing", "Timeline"},
        };
 
        
        
        return new SimpleMenuOption()
                .setMenus(menus);
    }
    
    @Override
    public SimpleFooterData getSimpleFooterData() {
       return new SimpleFooterData();
    }
    
}
