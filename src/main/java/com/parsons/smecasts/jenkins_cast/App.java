package com.parsons.smecasts.jenkins_cast;

import java.io.IOException;

import org.jsoup.Jsoup;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	String html = Jsoup.connect("http://example.com").get().html();
    	System.out.println(html);
    }
}
