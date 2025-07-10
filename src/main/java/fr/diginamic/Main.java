package fr.diginamic;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        String str = "Leroy Jenkins";
        try
        {
            String art = FigletFont.convertOneLine(str);
            System.out.println(art);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
