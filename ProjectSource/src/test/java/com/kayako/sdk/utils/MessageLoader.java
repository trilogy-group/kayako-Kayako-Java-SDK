package com.kayako.sdk.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MessageLoader {
    public static String readFile(String msgFile, String contentFile, int contentLength){
        String path = "mockedMessages/";
        String line;
        StringBuilder messageBuilder = new StringBuilder();
        int tabs;
        
        try(BufferedReader msgReader = 
                new BufferedReader(new FileReader(path + "message_" + msgFile + ".txt"))) {
            while((line = msgReader.readLine()) != null) {
                if((tabs = line.indexOf("*****")) > -1) {
                    for(int i = 0; i < contentLength; i++) {
                        try(BufferedReader contentReader = 
                                new BufferedReader(new FileReader(
                                        path + contentFile + "_" + (i + 1) + ".txt"))){
                            while((line = contentReader.readLine()) != null) {
                                for(int tab = 0; tab < tabs; tab++) {
                                    messageBuilder.append("\t");
                                }
                                messageBuilder.append(line + "\n");
                            }
                        } catch (IOException ioe) {
                            System.out.println(ioe.getMessage());
                        }
                        if(contentLength > 1 && i != (contentLength - 1)) {
                            messageBuilder.insert(messageBuilder.length() - 1, ",");
                        }
                    } // for i
                } // if tabs
                if(line != null) {
                    messageBuilder.append(line + "\n");                    
                }
            } // while readLine (from msgFile)
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return messageBuilder.toString();
    }
}
