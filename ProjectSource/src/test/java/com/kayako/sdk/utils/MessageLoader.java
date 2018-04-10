package com.kayako.sdk.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class MessageLoader {

  private static final String PATH = "resources/mockedMessages/";
  private static final String MSG_PREFIX = "message_";
  private static final String TXT_EXTENSION = ".txt";
  private static final String CONTENT_MARK = "*****";
  private static final String TAB = "\t";

  private MessageLoader() {
    throw new AssertionError("This class cannot be instantiated");
  }

  public static String readFile(String msgFile, String contentFile, int contentLength){

		String line;
		StringBuilder messageBuilder = new StringBuilder();
		int tabs;

    try (BufferedReader msgReader = Files.newBufferedReader(
        Paths.get(PATH + MSG_PREFIX + msgFile + TXT_EXTENSION), StandardCharsets.UTF_8)) {
      while ((line = msgReader.readLine()) != null) {
        if ((tabs = line.indexOf(CONTENT_MARK)) > -1) {
          for (int i = 0; i < contentLength; i++) {
            try (BufferedReader contentReader = Files.newBufferedReader(
                Paths.get(PATH + contentFile + "_" + (i + 1) + TXT_EXTENSION),
                StandardCharsets.UTF_8)) {
              while ((line = contentReader.readLine()) != null) {
                for (int tab = 0; tab < tabs; tab++) {
                  messageBuilder.append(TAB);
                }
                messageBuilder.append(line).append(System.lineSeparator());
              }
            } catch (IOException ioe) {
              LogUtils.logError(MessageLoader.class, ioe.getMessage());
            }
            if (contentLength > 1 && i != (contentLength - 1)) {
              messageBuilder.insert(messageBuilder.length() - 1, ",");
            }
          }
        }
        if (line != null) {
          messageBuilder.append(line).append(System.lineSeparator());
        }
      }
    } catch (IOException ioe) {
      LogUtils.logError(MessageLoader.class, ioe.getMessage());
    }
    return messageBuilder.toString();
  }
}
